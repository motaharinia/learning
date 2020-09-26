package com.motaharinia.presentation.adminuser;


import com.fasterxml.jackson.core.JsonProcessingException;
import com.motaharinia.business.service.adminuser.AdminUserService;
import com.motaharinia.business.service.adminuser.SearchFilterParameterModeEnum;
import com.motaharinia.business.service.adminuser.SearchRowViewAdminUserBrief;
import com.motaharinia.msutility.customexception.BusinessException;
import com.motaharinia.msutility.customexception.UtilityException;
import com.motaharinia.msutility.json.CustomObjectMapper;
import com.motaharinia.msutility.search.data.SearchDataModel;
import com.motaharinia.msutility.search.filter.SearchFilterModel;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.util.ObjectUtils;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;

import java.lang.reflect.InvocationTargetException;
import java.util.List;
import java.util.Optional;

/**
 * User: https://github.com/motaharinia<br>
 * Date: 2020-06-12<br>
 * Time: 01:05:58<br>
 * Description:<br>
 * کلاس کنترلر ادمین
 */
@RestController
public class AdminUserController {

    private final AdminUserService adminUserService;

    @Autowired
    public AdminUserController(AdminUserService adminUserService) {
        this.adminUserService = adminUserService;
    }


    /**
     * متد ثبت
     *
     * @param adminUserModel مدل ثبت
     * @return خروجی: مدل ثبت حاوی شناسه
     */
    @PostMapping("/adminUser")
    public AdminUserModel create(@RequestBody @Validated AdminUserModel adminUserModel) throws Exception {
        return adminUserService.create(adminUserModel);
    }

    /**
     * متد جستجوی با شناسه
     *
     * @param id شناسه
     * @return خروجی: مدل جستجو شده
     */
    @GetMapping("/adminUser/{id}")
    public AdminUserModel readById(@PathVariable Integer id) throws UtilityException {
        return adminUserService.readById(id);
    }

    /**
     * متد جستجو با مدل فیلتر جستجو
     *
     * @param searchFilterModelJson رشته جیسون مدل فیلتر جستجو
     * @return خروجی: مدل داده جستجو
     * @throws UtilityException
     */
    @GetMapping("/adminUser")
    public SearchDataModel readGrid(@RequestParam(name = "searchFilterModel") Optional<String> searchFilterModelJson, @RequestParam(name = "parameterModeEnum") SearchFilterParameterModeEnum parameterModeEnum,@RequestParam(name = "parameterValueList")  List<Object> parameterValueList) throws JsonProcessingException, UtilityException, ClassNotFoundException {
        CustomObjectMapper customObjectMapper = new CustomObjectMapper();
        SearchFilterModel searchFilterModel = customObjectMapper.readValue(searchFilterModelJson.get(), SearchFilterModel.class);
        if (!ObjectUtils.isEmpty(searchFilterModel.getRestrictionList())) {
            searchFilterModel.getRestrictionList().stream().forEach((item) -> {
                System.out.println("AdminUserController.readGrid searchFilterModel.getRestrictionList() loop item.getFieldValue():" + item.getFieldValue() + " item.getFieldValue().getClass():" + item.getFieldValue().getClass());
            });
        }


        Class viewInterface = SearchRowViewAdminUserBrief.class;
        if (!ObjectUtils.isEmpty(parameterModeEnum)) {
            viewInterface = Class.forName(parameterModeEnum.getValue());
        }
        SearchDataModel searchDataModel = adminUserService.readGrid(searchFilterModel, viewInterface);
        return searchDataModel;
    }

    /**
     * متد ویرایش
     *
     * @param adminUserModel مدل ویرایش
     * @return خروجی: مدل ویرایش شده
     */
    @PutMapping("/adminUser")
    public AdminUserModel update(@RequestBody @Validated AdminUserModel adminUserModel) throws Exception {
        return adminUserService.update(adminUserModel);
    }

    /**
     * متد حذف با شناسه
     *
     * @param id شناسه
     * @return خروجی: مدل حذف شده
     */
    @DeleteMapping("/adminUser/{id}")
    public AdminUserModel delete(@PathVariable Integer id) throws UtilityException {
        return adminUserService.delete(id);
    }


}

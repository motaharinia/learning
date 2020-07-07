package ir.micser.geo.presentation.city;


import com.fasterxml.jackson.core.JsonProcessingException;
import com.motaharinia.msutility.customexception.BusinessException;
import com.motaharinia.msutility.customexception.UtilityException;
import com.motaharinia.msutility.json.CustomObjectMapper;
import com.motaharinia.msutility.search.data.SearchDataModel;
import com.motaharinia.msutility.search.filter.SearchFilterModel;
import ir.micser.geo.business.service.city.CityService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.util.ObjectUtils;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;

import java.lang.reflect.InvocationTargetException;
import java.util.Optional;

/**
 * User: https://github.com/motaharinia<br>
 * Date: 2020-06-12<br>
 * Time: 01:05:58<br>
 * Description:<br>
 *  کلاس کنترلر شهر
 */
@RestController
public class CityController {

    private final CityService cityService;

    @Autowired
    public CityController(CityService cityService) {
        this.cityService = cityService;
    }


    /**
     * متد ثبت
     *
     * @param cityModel مدل ثبت
     * @return خروجی: مدل ثبت حاوی شناسه
     */
    @PostMapping("/v1/city")
    public CityModel create(@RequestBody @Validated CityModel cityModel) throws UtilityException, IllegalAccessException, BusinessException, InvocationTargetException {
        return cityService.create(cityModel);
    }

    /**
     * متد جستجوی با شناسه
     *
     * @param id شناسه
     * @return خروجی: مدل جستجو شده
     */
    @GetMapping("/v1/city/{id}")
    public CityModel readById(@PathVariable Integer id) throws UtilityException {
        return cityService.readById(id);
    }

    /**
     * متد جستجو با مدل فیلتر جستجو
     *
     * @param searchFilterModelJson رشته جیسون مدل فیلتر جستجو
     * @return خروجی: مدل داده جستجو
     * @throws UtilityException
     */
    @GetMapping("/v1/city")
    public SearchDataModel readGrid(@RequestParam(name = "searchFilterModel") Optional<String> searchFilterModelJson) throws JsonProcessingException, UtilityException {
        CustomObjectMapper customObjectMapper = new CustomObjectMapper();
        SearchFilterModel searchFilterModel = customObjectMapper.readValue(searchFilterModelJson.get(), SearchFilterModel.class);
        if (!ObjectUtils.isEmpty(searchFilterModel.getRestrictionList())) {
            searchFilterModel.getRestrictionList().stream().forEach((item) -> {
                System.out.println("CityController.readGrid searchFilterModel.getRestrictionList() loop item.getFieldValue():" + item.getFieldValue() + " item.getFieldValue().getClass():" + item.getFieldValue().getClass());
            });
        }
        SearchDataModel searchDataModel = cityService.readGrid(searchFilterModel);
        return searchDataModel;
    }

    /**
     * متد ویرایش
     *
     * @param cityModel مدل ویرایش
     * @return خروجی: مدل ویرایش شده
     */
    @PutMapping("/v1/city")
    public CityModel update(@RequestBody @Validated CityModel cityModel) throws UtilityException, IllegalAccessException, BusinessException, InvocationTargetException {
        return cityService.update(cityModel);
    }

    /**
     * متد حذف با شناسه
     *
     * @param id شناسه
     * @return خروجی: مدل حذف شده
     */
    @DeleteMapping("/v1/city/{id}")
    public CityModel delete(@PathVariable Integer id) throws UtilityException {
        return cityService.delete(id);
    }


}

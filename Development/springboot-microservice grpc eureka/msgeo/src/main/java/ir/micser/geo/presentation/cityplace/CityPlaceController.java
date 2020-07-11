package ir.micser.geo.presentation.cityplace;


import com.fasterxml.jackson.core.JsonProcessingException;
import com.motaharinia.msutility.customexception.BusinessException;
import com.motaharinia.msutility.customexception.UtilityException;
import com.motaharinia.msutility.json.CustomObjectMapper;
import com.motaharinia.msutility.search.data.SearchDataModel;
import com.motaharinia.msutility.search.filter.SearchFilterModel;
import ir.micser.geo.business.service.cityplace.CityPlaceService;
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
 *  کلاس کنترلر لوکیشن شهری
 */
@RestController
public class CityPlaceController {

    private final CityPlaceService cityPlaceService;

    @Autowired
    public CityPlaceController(CityPlaceService cityPlaceService) {
        this.cityPlaceService = cityPlaceService;
    }


    /**
     * متد ثبت
     *
     * @param cityPlaceModel مدل ثبت
     * @return خروجی: مدل ثبت حاوی شناسه
     */
    @PostMapping("/v1/cityPlace")
    public CityPlaceModel create(@RequestBody @Validated CityPlaceModel cityPlaceModel) throws UtilityException, IllegalAccessException, BusinessException, InvocationTargetException {
        return cityPlaceService.create(cityPlaceModel);
    }

    /**
     * متد جستجوی با شناسه
     *
     * @param id شناسه
     * @return خروجی: مدل جستجو شده
     */
    @GetMapping("/v1/cityPlace/{id}")
    public CityPlaceModel readById(@PathVariable Integer id) throws UtilityException {
        return cityPlaceService.readById(id);
    }

    /**
     * متد جستجو با مدل فیلتر جستجو
     *
     * @param searchFilterModelJson رشته جیسون مدل فیلتر جستجو
     * @return خروجی: مدل داده جستجو
     * @throws UtilityException
     */
    @GetMapping("/v1/cityPlace")
    public SearchDataModel readGrid(@RequestParam(name = "searchFilterModel") Optional<String> searchFilterModelJson) throws JsonProcessingException, UtilityException {
        CustomObjectMapper customObjectMapper = new CustomObjectMapper();
        SearchFilterModel searchFilterModel = customObjectMapper.readValue(searchFilterModelJson.get(), SearchFilterModel.class);
        if (!ObjectUtils.isEmpty(searchFilterModel.getRestrictionList())) {
            searchFilterModel.getRestrictionList().stream().forEach((item) -> {
                System.out.println("CityController.readGrid searchFilterModel.getRestrictionList() loop item.getFieldValue():" + item.getFieldValue() + " item.getFieldValue().getClass():" + item.getFieldValue().getClass());
            });
        }
        SearchDataModel searchDataModel = cityPlaceService.readGrid(searchFilterModel);
        return searchDataModel;
    }

    /**
     * متد ویرایش
     *
     * @param cityPlaceModel مدل ویرایش
     * @return خروجی: مدل ویرایش شده
     */
    @PutMapping("/v1/cityPlace")
    public CityPlaceModel update(@RequestBody @Validated CityPlaceModel cityPlaceModel) throws UtilityException, IllegalAccessException, BusinessException, InvocationTargetException {
        return cityPlaceService.update(cityPlaceModel);
    }

    /**
     * متد حذف با شناسه
     *
     * @param id شناسه
     * @return خروجی: مدل حذف شده
     */
    @DeleteMapping("/v1/cityPlace/{id}")
    public CityPlaceModel delete(@PathVariable Integer id) throws UtilityException {
        return cityPlaceService.delete(id);
    }


}

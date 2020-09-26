package com.motaharinia.business.service.adminuser;

import com.motaharinia.msutility.customexception.UtilityException;
import com.motaharinia.msutility.search.data.SearchDataModel;
import com.motaharinia.msutility.search.filter.SearchFilterModel;
import com.motaharinia.presentation.adminuser.AdminUserModel;
import org.jetbrains.annotations.NotNull;


/**
 * User: https://github.com/motaharinia<br>
 * Date: 2020-06-12<br>
 * Time: 01:05:58<br>
 * Description:<br>
 *  اینترفیس مدیریت ادمین ها
 */
public interface AdminUserService {
    /**
     * متد ثبت
     *
     * @param adminUserModel مدل ثبت
     * @return خروجی: مدل ثبت حاوی شناسه
     */
    @NotNull
    AdminUserModel create(@NotNull  AdminUserModel adminUserModel) throws Exception;

    /**
     * متد جستجوی با شناسه
     *
     * @param id شناسه
     * @return خروجی: مدل جستجو شده
     */
    @NotNull
    AdminUserModel readById(@NotNull Integer id) throws UtilityException;

    /**
     * متد جستجو با مدل فیلتر جستجو
     *
     * @param searchFilterModel مدل فیلتر جستجو
     * @return خروجی: مدل داده جستجو
     * @throws UtilityException
     */
    @NotNull
    SearchDataModel readGrid(@NotNull SearchFilterModel searchFilterModel,Class viewInterface) throws UtilityException;

    /**
     * متد ویرایش
     *
     * @param adminUserModel مدل ویرایش
     * @return خروجی: مدل ویرایش شده
     */
    @NotNull
    AdminUserModel update(@NotNull AdminUserModel adminUserModel) throws Exception;

    /**
     * متد حذف با شناسه
     *
     * @param id شناسه
     * @return خروجی: مدل حذف شده
     */
    @NotNull
    AdminUserModel delete(@NotNull Integer id) throws UtilityException;

}

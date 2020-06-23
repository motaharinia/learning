package com.motaharinia.business.service.adminuserskill;

import com.motaharinia.persistence.orm.adminuser.AdminUser;
import com.motaharinia.presentation.adminuserskill.AdminUserSkillModel;

import java.util.List;

/**
 * کلاس سرویس مدیریت مهارتها
 */
public interface AdminUserSkillService {
    /**
     * متد ثبت مهارت برای ادمین
     *
     * @param adminUser انتیتی ادمین
     * @param adminUserSkillModelList لیست مدلهای ثبت
     * @return خروجی: انتیتی ادمین تکمیل شده
     */
    AdminUser createByAdminUser(AdminUser adminUser, List<AdminUserSkillModel> adminUserSkillModelList);

    /**
     * متد جستجوی با شناسه
     *
     * @param id شناسه
     * @return خروجی: مدل جستجو شده
     */
    AdminUserSkillModel readById(Integer id);


    /**
     * متد ویرایش مهارت برای ادمین
     *
     * @param adminUser انتیتی ادمین
     * @param adminUserSkillModelList لیست مدلهای ویرایش
     * @return خروجی: انتیتی ادمین تکمیل شده
     */
    AdminUser updateByAdminUser(AdminUser adminUser, List<AdminUserSkillModel> adminUserSkillModelList);


    /**
     * متد حذف با شناسه
     *
     * @param id شناسه
     * @return خروجی: مدل حذف شده
     */
    AdminUser deleteByAdminUser(AdminUser adminUser) ;

}

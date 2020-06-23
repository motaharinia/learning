package com.motaharinia.business.service.adminuserskill;

import com.motaharinia.presentation.adminuserskill.AdminUserSkillModel;

/**
 * کلاس سرویس مدیریت مهارتها
 */
public interface AdminUserSkillService {
    /**
     * متد ثبت
     *
     * @param adminUserSkillModel مدل ثبت
     * @return خروجی: مدل ثبت حاوی شناسه
     */
    AdminUserSkillModel create(AdminUserSkillModel adminUserSkillModel);

    /**
     * متد جستجوی با شناسه
     *
     * @param id شناسه
     * @return خروجی: مدل جستجو شده
     */
    AdminUserSkillModel readById(Integer id);


    /**
     * متد حذف با شناسه
     *
     * @param id شناسه
     * @return خروجی: مدل حذف شده
     */
    AdminUserSkillModel delete(Integer id);

}

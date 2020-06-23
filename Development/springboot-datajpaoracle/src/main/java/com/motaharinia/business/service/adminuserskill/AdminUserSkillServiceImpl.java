package com.motaharinia.business.service.adminuserskill;


import com.motaharinia.persistence.orm.adminuser.AdminUser;
import com.motaharinia.persistence.orm.adminuserskill.AdminUserSkill;
import com.motaharinia.persistence.orm.adminuserskill.AdminUserSkillRepository;
import com.motaharinia.presentation.adminuser.AdminUserModel;
import com.motaharinia.presentation.adminuserskill.AdminUserSkillModel;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.util.ObjectUtils;

import javax.transaction.Transactional;

//https://www.baeldung.com/spring-data-jpa-projections
//https://walczak.it/blog/spring-data-jpa-projection-dynamic-queries

/**
 * کلاس پیاده سازی سرویس مدیریت مهارتها
 */
@Service
@Transactional
public class AdminUserSkillServiceImpl implements AdminUserSkillService {


    /**
     * ریپازیتوری مهارت
     */
    private AdminUserSkillRepository adminUserSkillRepository;

    /**
     * تبدیل کننده مدل
     */
    private ModelMapper modelMapper;


    /**
     * متد سازنده پیش فرض
     */
    public AdminUserSkillServiceImpl() {
    }

    /**
     * متد سازنده
     */
    @Autowired
    public AdminUserSkillServiceImpl(AdminUserSkillRepository adminUserSkillRepository, ModelMapper modelMapper) {
        this.adminUserSkillRepository = adminUserSkillRepository;
        this.modelMapper = modelMapper;
    }

    /**
     * متد ثبت
     *
     * @param adminUserSkillModel مدل ثبت
     * @return خروجی: مدل ثبت حاوی شناسه
     */
    @Override
    public AdminUserSkillModel create(AdminUserSkillModel adminUserSkillModel) {
        //ثبت
        AdminUserSkill adminUserSkill =adminUserSkillRepository.findByTitle(adminUserSkillModel.getTitle());
        if(ObjectUtils.isEmpty(adminUserSkill) ){
            adminUserSkill = new AdminUserSkill();
            adminUserSkill.setTitle(adminUserSkillModel.getTitle());
            adminUserSkill = adminUserSkillRepository.save(adminUserSkill);
            adminUserSkillModel.setId(adminUserSkill.getId());
        }else{
            adminUserSkillModel.setId(adminUserSkill.getId());
        }
        return adminUserSkillModel;
    }

    /**
     * متد جستجوی با شناسه
     *
     * @param id شناسه
     * @return خروجی: مدل جستجو شده
     */
    @Override
    public AdminUserSkillModel readById(Integer id) {
        AdminUserSkill adminUserSkill = adminUserSkillRepository.findById(id).get();
        AdminUserSkillModel adminUserSkillModel = new AdminUserSkillModel();
        adminUserSkillModel.setId(adminUserSkill.getId());
        adminUserSkillModel.setTitle(adminUserSkill.getTitle());
//    UserModel  userModel= (UserModel) SerializationUtils.clone(adminuser);
        return adminUserSkillModel;
    }


    /**
     * متد حذف با شناسه
     *
     * @param id شناسه
     * @return خروجی: مدل حذف شده
     */
    @Override
    public AdminUserSkillModel delete(Integer id) {
        AdminUserSkillModel adminUserSkillModel = this.readById(id);
        adminUserSkillRepository.deleteById(id);
        return adminUserSkillModel;
    }


    private AdminUserModel convertToDto(AdminUser adminUser) {
        AdminUserModel adminUserModel = modelMapper.map(adminUser, AdminUserModel.class);
//        userModel.setSubmissionDate(adminuser.getSubmissionDate(), userService.getCurrentUser().getPreference().getTimezone());
        return adminUserModel;
    }
}

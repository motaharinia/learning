package com.motaharinia.business.service.adminuser;


import com.motaharinia.msutility.customexception.UtilityException;
import com.motaharinia.msutility.search.data.SearchDataModel;
import com.motaharinia.msutility.search.filter.SearchFilterModel;
import com.motaharinia.persistence.orm.adminuser.AdminUser;
import com.motaharinia.persistence.orm.adminuser.AdminUserRepository;
import com.motaharinia.persistence.orm.adminuser.AdminUserSpecification;
import com.motaharinia.persistence.orm.adminusercontact.AdminUserContact;
import com.motaharinia.persistence.orm.adminusercontact.AdminUserContactRepository;
import com.motaharinia.presentation.adminuser.AdminUserModel;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.stereotype.Service;
import org.springframework.util.ObjectUtils;

import javax.transaction.Transactional;

//https://www.baeldung.com/spring-data-jpa-projections
//https://walczak.it/blog/spring-data-jpa-projection-dynamic-queries

/**
 * کلاس پیاده سازی سرویس مدیریت ادمین ها
 */
@Service
@Transactional
public class AdminUserServiceImpl implements AdminUserService {


    /**
     * ریپازیتوری ادمین
     */
    private AdminUserRepository adminUserRepository;
    /**
     * ریپازیتوری اطلاعات تماس ادمین
     */
    private AdminUserContactRepository adminUserContactRepository;
    /**
     * مشخصات جستجوی ادمین
     */
    private AdminUserSpecification adminUserSpecification;
    /**
     * تبدیل کننده مدل
     */
    private ModelMapper modelMapper;

    /**
     * متد سازنده پیش فرض
     */
    public AdminUserServiceImpl() {
    }

    /**
     * متد سازنده
     */
    @Autowired
    public AdminUserServiceImpl(AdminUserRepository adminUserRepository, AdminUserContactRepository adminUserContactRepository, AdminUserSpecification adminUserSpecification, ModelMapper modelMapper) {
        this.adminUserRepository = adminUserRepository;
        this.adminUserContactRepository = adminUserContactRepository;
        this.modelMapper = modelMapper;
        this.adminUserSpecification = adminUserSpecification;
    }

    /**
     * متد ثبت
     *
     * @param adminUserModel مدل ثبت
     * @return خروجی: مدل ثبت حاوی شناسه
     */
    @Override
    public AdminUserModel create(AdminUserModel adminUserModel) {

        //ثبت اطلاعات تماس ادمین
        AdminUserContact adminUserContact = new AdminUserContact();
        adminUserContact.setAddress(adminUserModel.getDefaultAdminUserContact_address());
        adminUserContact = adminUserContactRepository.save(adminUserContact);
        //ثبت ادمین
        AdminUser adminUser = new AdminUser();
        adminUser.setFirstName(adminUserModel.getFirstName());
        adminUser.setLastName(adminUserModel.getLastName());
        adminUser.setPassword(adminUserModel.getPassword());
        adminUser.setUsername(adminUserModel.getUsername());
        adminUser = adminUserRepository.save(adminUser);
        adminUser.setDefaultAdminUserContact(adminUserContact);
        adminUserModel.setId(adminUser.getId());
        return adminUserModel;
    }

    /**
     * متد جستجوی با شناسه
     *
     * @param id شناسه
     * @return خروجی: مدل جستجو شده
     */
    @Override
    public AdminUserModel readById(Integer id) {
        AdminUser adminUser = adminUserRepository.findById(id).get();
        AdminUserModel adminUserModel = new AdminUserModel();
        adminUserModel.setId(adminUser.getId());
        adminUserModel.setUsername(adminUser.getUsername());
        adminUserModel.setFirstName(adminUser.getFirstName());
        adminUserModel.setLastName(adminUser.getLastName());
        if (!ObjectUtils.isEmpty(adminUser.getDefaultAdminUserContact())) {
            adminUserModel.setPassword(adminUser.getDefaultAdminUserContact().getAddress());
        }
        adminUserModel.setDefaultAdminUserContact_address(adminUser.getPassword());
//    UserModel  userModel= (UserModel) SerializationUtils.clone(adminuser);
        return adminUserModel;
    }

    /**
     * متد جستجو با مدل فیلتر جستجو
     *
     * @param searchFilterModel مدل فیلتر جستجو
     * @return خروجی: مدل داده جستجو
     * @throws UtilityException
     */
    @Override
    public SearchDataModel readGrid(SearchFilterModel searchFilterModel) throws UtilityException {
        adminUserSpecification = (AdminUserSpecification) searchFilterModel.makeSpecification(adminUserSpecification);
        Page<SearchRowViewAdminUserBrief> viewPage = adminUserRepository.findAll(adminUserSpecification, SearchRowViewAdminUserBrief.class, searchFilterModel.makePageable());
        SearchDataModel searchDataModel = new SearchDataModel(viewPage, searchFilterModel, "");
        return searchDataModel;
    }

    /**
     * متد ویرایش
     *
     * @param adminUserModel مدل ویرایش
     * @return خروجی: مدل ویرایش شده
     */
    @Override
    public AdminUserModel update(AdminUserModel adminUserModel) {
        AdminUser adminUser = adminUserRepository.findById(adminUserModel.getId()).get();
        adminUser.setFirstName(adminUserModel.getFirstName());
        adminUser.setLastName(adminUserModel.getLastName());
        adminUser.setPassword(adminUserModel.getPassword());
        adminUser.setUsername(adminUserModel.getUsername());
        if(ObjectUtils.isEmpty(adminUser.getDefaultAdminUserContact())){
            AdminUserContact adminUserContact = new AdminUserContact();
            adminUserContact.setAddress(adminUserModel.getDefaultAdminUserContact_address());
            adminUserContact = adminUserContactRepository.save(adminUserContact);
            adminUser.setDefaultAdminUserContact(adminUserContact);
        }else{
            adminUser.getDefaultAdminUserContact().setAddress(adminUserModel.getDefaultAdminUserContact_address());
        }

        adminUserRepository.save(adminUser);
        return adminUserModel;
    }

    /**
     * متد حذف با شناسه
     *
     * @param id شناسه
     * @return خروجی: مدل حذف شده
     */
    @Override
    public AdminUserModel delete(Integer id) {
        AdminUserModel adminUserModel = this.readById(id);
        adminUserRepository.deleteById(id);
        return adminUserModel;
    }


    private AdminUserModel convertToDto(AdminUser adminUser) {
        AdminUserModel adminUserModel = modelMapper.map(adminUser, AdminUserModel.class);
//        userModel.setSubmissionDate(adminuser.getSubmissionDate(), userService.getCurrentUser().getPreference().getTimezone());
        return adminUserModel;
    }
}

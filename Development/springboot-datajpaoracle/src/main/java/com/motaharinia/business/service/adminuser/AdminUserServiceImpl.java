package com.motaharinia.business.service.adminuser;


import com.motaharinia.msutility.search.data.SearchDataModel;
import com.motaharinia.msutility.search.filter.SearchFilterModel;
import com.motaharinia.persistence.orm.adminuser.AdminUser;
import com.motaharinia.persistence.orm.adminuser.AdminUserRepository;
import com.motaharinia.persistence.orm.adminuser.AdminUserRepository2;
import com.motaharinia.persistence.orm.adminuser.AdminUserSpecification;
import com.motaharinia.presentation.adminuser.AdminUserModel;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;

//https://www.baeldung.com/spring-data-jpa-projections
//https://walczak.it/blog/spring-data-jpa-projection-dynamic-queries

@Service
@Transactional
public class AdminUserServiceImpl implements AdminUserService {


    private ModelMapper modelMapper;
    private AdminUserRepository adminUserRepository;
    private AdminUserRepository2 adminUserRepository2;
    private AdminUserSpecification adminUserSpecification;

    /**
     * Constructors
     */
    public AdminUserServiceImpl() {
    }

    @Autowired
    public AdminUserServiceImpl(AdminUserRepository adminUserRepository, AdminUserRepository2 adminUserRepository2, ModelMapper modelMapper, AdminUserSpecification adminUserSpecification) {
        this.adminUserRepository = adminUserRepository;
        this.adminUserRepository2 = adminUserRepository2;
        this.modelMapper = modelMapper;
        this.adminUserSpecification = adminUserSpecification;
    }

    @Override
    public AdminUserModel create(AdminUserModel adminUserModel) {
        AdminUser adminUser = new AdminUser();
        adminUser.setFirstName(adminUserModel.getFirstName());
        adminUser.setLastName(adminUserModel.getLastName());
        adminUser.setPassword(adminUserModel.getPassword());
        adminUser.setUsername(adminUserModel.getUsername());
        adminUser = adminUserRepository.save(adminUser);
        adminUserModel.setId(adminUser.getId());
        return adminUserModel;
    }

    @Override
    public AdminUserModel readOne(Integer id) {
        AdminUser adminUser = adminUserRepository.findById(id).get();
        AdminUserModel adminUserModel = new AdminUserModel();
        adminUserModel.setId(adminUser.getId());
        adminUserModel.setUsername(adminUser.getUsername());
        adminUserModel.setFirstName(adminUser.getFirstName());
        adminUserModel.setLastName(adminUser.getLastName());
        adminUserModel.setPassword(adminUser.getPassword());
//    UserModel  userModel= (UserModel) SerializationUtils.clone(adminuser);
        return adminUserModel;
    }

    @Override
    public AdminUserModel update(AdminUserModel adminUserModel) {
        AdminUser adminUser = adminUserRepository.findById(adminUserModel.getId()).get();
        adminUser.setFirstName(adminUserModel.getFirstName());
        adminUser.setLastName(adminUserModel.getLastName());
        adminUser.setPassword(adminUserModel.getPassword());
        adminUser.setUsername(adminUserModel.getUsername());
        adminUserRepository.save(adminUser);
        return adminUserModel;
    }

    @Override
    public AdminUserModel delete(Integer id) {
        AdminUserModel adminUserModel = this.readOne(id);
        adminUserRepository.deleteById(id);
        return adminUserModel;
    }

    @Override
    public SearchDataModel readGrid(SearchFilterModel searchFilterModel) {
        adminUserSpecification = (AdminUserSpecification) searchFilterModel.makeSpecification(adminUserSpecification);
        Page<SearchRowViewAdminUserBrief> viewPage = adminUserRepository2.findAll(adminUserSpecification, SearchRowViewAdminUserBrief.class, PageRequest.of(searchFilterModel.getPage(), searchFilterModel.getRows()));
        SearchDataModel searchDataModel = new SearchDataModel(viewPage, searchFilterModel, null);
        return searchDataModel;
    }


    private AdminUserModel convertToDto(AdminUser adminUser) {
        AdminUserModel adminUserModel = modelMapper.map(adminUser, AdminUserModel.class);
//        userModel.setSubmissionDate(adminuser.getSubmissionDate(), userService.getCurrentUser().getPreference().getTimezone());
        return adminUserModel;
    }
}

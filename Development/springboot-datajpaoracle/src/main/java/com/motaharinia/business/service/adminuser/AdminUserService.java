package com.motaharinia.business.service.adminuser;

import com.motaharinia.msutility.search.data.SearchDataModel;
import com.motaharinia.msutility.search.filter.SearchFilterModel;
import com.motaharinia.presentation.adminuser.AdminUserModel;


public interface AdminUserService {
    AdminUserModel create(AdminUserModel adminUserModel);

    AdminUserModel readOne(Integer id);

    //    Page<UserModel> readGrid(GridFilterModel gridFilterModel);
    SearchDataModel readGrid(SearchFilterModel searchFilterModel);

    AdminUserModel update(AdminUserModel adminUserModel);

    AdminUserModel delete(Integer id);


//    GridDataModel listGrid(String  firstName);
}

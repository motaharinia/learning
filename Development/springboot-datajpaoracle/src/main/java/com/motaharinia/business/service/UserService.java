package com.motaharinia.business.service;

import com.motaharinia.msutility.search.data.SearchDataModel;
import com.motaharinia.msutility.search.filter.SearchFilterModel;
import com.motaharinia.presentation.model.UserModel;

import java.util.List;


public interface UserService {
    UserModel create(UserModel userModel);

    UserModel readOne(Integer id);

    //    Page<UserModel> readGrid(GridFilterModel gridFilterModel);
    SearchDataModel readGrid(SearchFilterModel searchFilterModel);

    UserModel update(UserModel userModel);

    UserModel delete(Integer id);


//    GridDataModel listGrid(String  firstName);
}

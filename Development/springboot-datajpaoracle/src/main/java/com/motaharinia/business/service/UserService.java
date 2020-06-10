package com.motaharinia.business.service;

import com.motaharinia.base.presentation.model.GridDataModel;
import com.motaharinia.base.presentation.model.GridFilterModel;
import com.motaharinia.presentation.model.UserModel;
import org.springframework.data.domain.Page;

import java.util.List;


public interface UserService {
    UserModel create(UserModel userModel);
    UserModel readOne(Integer  id);
    Page<UserModel> readGrid(GridFilterModel gridFilterModel);
    List<GridViewUser1> readView1(String  firstName);
    UserModel update(UserModel userModel);
    UserModel delete(Integer  id);



    GridDataModel listGrid(String  firstName);
}

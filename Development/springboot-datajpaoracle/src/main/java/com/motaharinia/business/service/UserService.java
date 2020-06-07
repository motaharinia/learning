package com.motaharinia.business.service;

import com.motaharinia.base.presentation.model.GridDataModel;
import com.motaharinia.base.presentation.model.GridFilterModel;
import com.motaharinia.presentation.model.UserModel;
import org.springframework.data.domain.Page;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;
import java.util.List;


public interface UserService {
    UserModel create(UserModel userModel);
    Page<UserModel> findAll(GridFilterModel gridFilterModel);
    UserModel findOne(Integer  id);
    UserModel update(UserModel userModel);
    UserModel delete(Integer  id);


    List<UserGrid1View> view1(String  firstName);
    GridDataModel listGrid(String  firstName);
}

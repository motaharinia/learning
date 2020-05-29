package com.motaharinia.business.service;

import com.motaharinia.presentation.model.UserModel;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;
import java.util.List;


public interface UserService {
    UserModel create(UserModel userModel);
    List<UserModel> findAll();
    UserModel findOne(Long  id);
    UserModel delete(Long  id);
}

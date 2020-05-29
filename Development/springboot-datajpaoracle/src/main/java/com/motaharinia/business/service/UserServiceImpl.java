package com.motaharinia.business.service;

import com.motaharinia.persistence.orm.user.User;
import com.motaharinia.persistence.orm.user.UserRepository;
import com.motaharinia.presentation.model.UserModel;
import org.apache.commons.lang.SerializationUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;
import java.util.List;
import java.util.Optional;

@Service
@Transactional
public class UserServiceImpl implements  UserService {

    @Autowired
    UserRepository userRepository;

    @Override
    public List<UserModel> findAll() {
        userRepository.findAll();
        return null;
    }
    
    @Override
    public UserModel findOne(Long  id) {
    User user=     userRepository.findById(id).get();
    UserModel  userModel= (UserModel) SerializationUtils.clone(user);
        return userModel;
    }

    @Override
    public UserModel delete(Long id) {
        return null;
    }

    @Override
    public UserModel create(UserModel userModel) {
        User user=new User();
        user.setFirstName(userModel.getFirstName());
        user.setLastName(userModel.getLastName());
        user.setPassword(userModel.getPassword());
        user.setUsername(userModel.getUsername());
        user=userRepository.save(user);
        userModel.setId(user.getId());
        return userModel;
    }
}

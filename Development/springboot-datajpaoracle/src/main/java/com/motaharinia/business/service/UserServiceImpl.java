package com.motaharinia.business.service;

import com.motaharinia.base.presentation.model.GridFilterModel;
import com.motaharinia.persistence.orm.user.User;
import com.motaharinia.persistence.orm.user.UserRepository;
import com.motaharinia.presentation.model.UserModel;
import org.apache.commons.lang.SerializationUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;
import java.util.ArrayList;
import java.util.List;
import java.util.function.Function;

//https://www.baeldung.com/spring-data-jpa-projections

@Service
@Transactional
public class UserServiceImpl implements  UserService {


    private UserRepository userRepository;

    public UserServiceImpl() {
    }

    @Autowired
    public UserServiceImpl(UserRepository userRepository) {
        this.userRepository=userRepository;
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

    @Override
    public Page<UserModel> findAll(GridFilterModel gridFilterModel) {
       Page<User> userPage= userRepository.findAll(gridFilterModel.getPageable());
       List<UserModel> userModelList = new ArrayList<>();
        Page<UserModel> userModelPage = userPage.map(new Function<User, UserModel>() {
            @Override
            public UserModel apply(User entity) {
                UserModel model = (UserModel) SerializationUtils.clone(entity);
                return model;
            }
        });
        return userModelPage;
    }
    
    @Override
    public UserModel findOne(Long  id) {
    User user= userRepository.findById(id).get();
    UserModel  userModel= (UserModel) SerializationUtils.clone(user);
        return userModel;
    }

    @Override
    public UserModel update(UserModel userModel) {
        User user= userRepository.findById(userModel.getId()).get();
        user.setFirstName(userModel.getFirstName());
        user.setLastName(userModel.getLastName());
        user.setPassword(userModel.getPassword());
        user.setUsername(userModel.getUsername());
        userRepository.save(user);
        return userModel;
    }

    @Override
    public UserModel delete(Long id) {
        UserModel  userModel=this.findOne(id);
        userRepository.deleteById(id);
        return userModel;
    }

    @Override
    public List<Object[]> findUserByFirstName(String firstName) {
        System.out.println("findUserByFirstName firstName:" + firstName);
        List<Object[]> result = userRepository.findUserListByFirstName(firstName);
        System.out.println("findUserByFirstName result:" + result);
        return result;
    }


}

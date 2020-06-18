package com.motaharinia.business.service;


import com.motaharinia.msutility.search.data.SearchDataModel;
import com.motaharinia.msutility.search.filter.SearchFilterModel;
import com.motaharinia.persistence.orm.user.User;
import com.motaharinia.persistence.orm.user.UserRepository;
import com.motaharinia.persistence.orm.user.UserRepository2;
import com.motaharinia.persistence.orm.user.UserSpecification;
import com.motaharinia.presentation.model.UserModel;
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
public class UserServiceImpl implements UserService {


    private ModelMapper modelMapper;
    private UserRepository userRepository;
    private UserRepository2 userRepository2;
    private UserSpecification userSpecification;

    /**
     * Constructors
     */
    public UserServiceImpl() {
    }

    @Autowired
    public UserServiceImpl(UserRepository userRepository, UserRepository2 userRepository2, ModelMapper modelMapper, UserSpecification userSpecification) {
        this.userRepository = userRepository;
        this.userRepository2 = userRepository2;
        this.modelMapper = modelMapper;
        this.userSpecification = userSpecification;
    }

    @Override
    public UserModel create(UserModel userModel) {
        User user = new User();
        user.setFirstName(userModel.getFirstName());
        user.setLastName(userModel.getLastName());
        user.setPassword(userModel.getPassword());
        user.setUsername(userModel.getUsername());
        user = userRepository.save(user);
        userModel.setId(user.getId());
        return userModel;
    }

    @Override
    public UserModel readOne(Integer id) {
        User user = userRepository.findById(id).get();
        UserModel userModel = new UserModel();
        userModel.setId(user.getId());
        userModel.setUsername(user.getUsername());
        userModel.setFirstName(user.getFirstName());
        userModel.setLastName(user.getLastName());
        userModel.setPassword(user.getPassword());
//    UserModel  userModel= (UserModel) SerializationUtils.clone(user);
        return userModel;
    }

    @Override
    public UserModel update(UserModel userModel) {
        User user = userRepository.findById(userModel.getId()).get();
        user.setFirstName(userModel.getFirstName());
        user.setLastName(userModel.getLastName());
        user.setPassword(userModel.getPassword());
        user.setUsername(userModel.getUsername());
        userRepository.save(user);
        return userModel;
    }

    @Override
    public UserModel delete(Integer id) {
        UserModel userModel = this.readOne(id);
        userRepository.deleteById(id);
        return userModel;
    }

    @Override
    public SearchDataModel readGrid(SearchFilterModel searchFilterModel) {
        userSpecification = (UserSpecification) searchFilterModel.makeSpecification(userSpecification);
        Page<SearchRowViewUserBrief> viewPage = userRepository2.findAll(userSpecification, SearchRowViewUserBrief.class, PageRequest.of(searchFilterModel.getPage(), searchFilterModel.getRows()));
        SearchDataModel searchDataModel = new SearchDataModel(viewPage, searchFilterModel, null);
        return searchDataModel;
    }


    private UserModel convertToDto(User user) {
        UserModel userModel = modelMapper.map(user, UserModel.class);
//        userModel.setSubmissionDate(user.getSubmissionDate(), userService.getCurrentUser().getPreference().getTimezone());
        return userModel;
    }
}

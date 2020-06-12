package com.motaharinia.business.service;

import com.motaharinia.persistence.orm.user.User;
import com.motaharinia.persistence.orm.user.UserRepository;
import com.motaharinia.presentation.model.UserModel;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;
import java.util.List;
import java.util.stream.Collectors;

//https://www.baeldung.com/spring-data-jpa-projections

@Service
@Transactional
public class UserServiceImpl implements  UserService {


    private ModelMapper modelMapper;
    private UserRepository userRepository;

    /**
     * Constructors
     */
    public UserServiceImpl() {
    }
    @Autowired
    public UserServiceImpl(UserRepository userRepository,ModelMapper modelMapper) {
        this.userRepository=userRepository;
        this.modelMapper=modelMapper;
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
    public UserModel readOne(Integer  id) {
        User user= userRepository.findById(id).get();
        UserModel  userModel= new UserModel();
        userModel.setId(user.getId());
        userModel.setUsername(user.getUsername());
        userModel.setFirstName(user.getFirstName());
        userModel.setLastName(user.getLastName());
        userModel.setPassword(user.getPassword());
//    UserModel  userModel= (UserModel) SerializationUtils.clone(user);
        return userModel;
    }
//
//    @Override
//    public Page<UserModel> readGrid(GridFilterModel gridFilterModel) {
//       Page<User> userPage= userRepository.findAll(gridFilterModel.getPageable());
////       List<UserModel> userModelList = new ArrayList<>();
//
//        List<UserModel> userModelList = userPage.getContent().stream().map(this::convertToDto).collect(Collectors.toList());
//
////        Page<UserModel> userModelPage = userPage.map(new Function<User, UserModel>() {
////            @Override
////            public UserModel apply(User entity) {
////                UserModel model = (UserModel) SerializationUtils.clone(entity);
////                return model;
////            }
////        });
////        return userModelPage;
//        return null;
//    }
    


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
    public UserModel delete(Integer id) {
        UserModel  userModel=this.readOne(id);
        userRepository.deleteById(id);
        return userModel;
    }

    @Override
    public List<GridViewUser1> readView1(String firstName) {
        List<GridViewUser1> viewList= userRepository.findAllUserByFirstName(firstName);
        viewList.stream().forEach(item-> System.out.println(item.getFirstName()));
        return viewList;
    }

//    @Override
//    public GridDataModel listGrid(String firstName) {
//        System.out.println("findUserByFirstName firstName:" + firstName);
//        List<Object[]> result = userRepository.listGrid(firstName);
//        System.out.println("findUserByFirstName result:" + result);
//        return new GridDataModel(result);
//    }


    private UserModel convertToDto(User user) {
        UserModel userModel = modelMapper.map(user, UserModel.class);
//        userModel.setSubmissionDate(user.getSubmissionDate(), userService.getCurrentUser().getPreference().getTimezone());
        return userModel;
    }
}

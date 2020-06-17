package com.motaharinia.business.service;


import com.motaharinia.msutility.search.data.SearchDataModel;
import com.motaharinia.msutility.search.data.SearchDataRowModel;
import com.motaharinia.msutility.search.filter.SearchFilterModel;
import com.motaharinia.msutility.search.filter.SearchFilterOperationEnum;
import com.motaharinia.msutility.search.filter.SearchFilterRestrictionModel;
import com.motaharinia.persistence.orm.user.User;
import com.motaharinia.persistence.orm.user.UserRepository;
import com.motaharinia.persistence.orm.user.UserRepository2;
import com.motaharinia.persistence.orm.user.UserSpecification;
import com.motaharinia.presentation.model.UserModel;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;
import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

//https://www.baeldung.com/spring-data-jpa-projections
//https://walczak.it/blog/spring-data-jpa-projection-dynamic-queries

@Service
@Transactional
public class UserServiceImpl implements  UserService {


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
    public UserServiceImpl(UserRepository userRepository,UserRepository2 userRepository2,ModelMapper modelMapper,UserSpecification userSpecification) {
        this.userRepository=userRepository;
        this.userRepository2=userRepository2;
        this.modelMapper=modelMapper;
        this.userSpecification=userSpecification;
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
//        UserSpecification userSpecification=new UserSpecification();
//        userSpecification.add(new SearchFilterRestrictionModel("id", SearchFilterOperationEnum.EQUAL,id));
//        Optional<SearchRowViewUserBrief> userModelOptional=userRepository2.findOne(userSpecification,SearchRowViewUserBrief.class);
//        System.out.println("userModel:" + userModelOptional.get().toString());
//

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
    public SearchDataModel readGrid(SearchFilterModel searchFilterModel) {
        System.out.println("UserServiceImpl.readGrid userSpecification:"+userSpecification);

        userSpecification= (UserSpecification) searchFilterModel.makeSpecification(userSpecification);
        System.out.println("UserServiceImpl.readGrid searchFilterModel:" + searchFilterModel.toString());

        Page<SearchRowViewUserBrief> viewPage = userRepository2.findAll(userSpecification, SearchRowViewUserBrief.class, PageRequest.of(searchFilterModel.getPage(), searchFilterModel.getRows()));
        SearchDataModel searchDataModel =new SearchDataModel(viewPage,searchFilterModel,null);




//        viewPage.stream().forEach(item-> System.out.println("item.toOut() :" + item.toOut() ));
//        List<SearchDataRowModel> gridRowModelList = new ArrayList<>();
//        viewPage.stream().forEach(item->gridRowModelList.add(new SearchDataRowModel(item.getId(), item)));
//        SearchDataModel searchDataModel=new SearchDataModel(searchFilterModel.getPage(),viewPage.getTotalElements(),(long)viewPage.getTotalPages(),gridRowModelList,null);
//
        return searchDataModel;

//        Long allRowsCount= userRepository.count(userSpecification);
//        List<SearchRowViewUserBrief> viewList= userRepository.findAll(userSpecification);
//        List<SearchDataRow2Model> gridRowModelList = new ArrayList<>();
//        SearchRowView searchRowView = null;
//        viewList.stream().forEach(item->gridRowModelList.add(new SearchDataRow2Model((int)Math.random() * 1000, item)));
//        Double total = Math.ceil(allRowsCount / (searchFilterModel.getRows() / 1d));
//        SearchDataModel searchDataModel=new SearchDataModel(searchFilterModel.getPage(),allRowsCount,total.longValue(),gridRowModelList,null);
//        return searchDataModel;
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

package com.motaharinia.base.presentation.model;

import com.motaharinia.persistence.orm.user.User;
import com.motaharinia.presentation.model.UserModel;
import org.apache.commons.lang.SerializationUtils;
import org.springframework.data.domain.Page;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Function;

public class GridDataModel {
    List<Object[]> modelList=new ArrayList<>();
    Long totalPageCount;
    Long totalRowCount;

    public GridDataModel() {
    }

    public GridDataModel(Page page) {
        List<Object> userModelList = new ArrayList<>();
        Page<UserModel> userModelPage = page.map(new Function<User, UserModel>() {
            @Override
            public UserModel apply(User entity) {
                UserModel model = (UserModel) SerializationUtils.clone(entity);
                return model;
            }
        });
    }

    public GridDataModel(Page page) {
        List<Object> userModelList = new ArrayList<>();
        Page<UserModel> userModelPage = page.map(new Function<User, UserModel>() {
            @Override
            public UserModel apply(User entity) {
                UserModel model = (UserModel) SerializationUtils.clone(entity);
                return model;
            }
        });
    }

    //getter-setter:


    public Long getTotalPageCount() {
        return totalPageCount;
    }

    public void setTotalPageCount(Long totalPageCount) {
        this.totalPageCount = totalPageCount;
    }

    public Long getTotalRowCount() {
        return totalRowCount;
    }

    public void setTotalRowCount(Long totalRowCount) {
        this.totalRowCount = totalRowCount;
    }

    public List<Object[]> getModelList() {
        return modelList;
    }

    public void setModelList(List<Object[]> modelList) {
        this.modelList = modelList;
    }
}

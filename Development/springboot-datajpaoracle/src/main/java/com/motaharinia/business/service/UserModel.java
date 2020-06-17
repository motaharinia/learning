package com.motaharinia.business.service;

import javax.persistence.Column;

/**
 * Created by IntelliJ IDEA.
 * User: https://github.com/motaharinia
 * Date: 2020-06-17
 * Time: 09:57:48
 * Description:
 */
public class UserModel {
    private Integer  id;
    private String firstName;
    private String lastName;



    //getter-setter
    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }
}

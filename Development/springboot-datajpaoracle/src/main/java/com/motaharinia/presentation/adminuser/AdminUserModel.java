package com.motaharinia.presentation.adminuser;

import com.motaharinia.presentation.adminuserskill.AdminUserSkillModel;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class AdminUserModel {
    /**
     * شناسه
     */
    private Integer id;

    /**
     * نام کاربری
     */
    private String username;

    /**
     * رمز عبور
     */
    private String password;

    /**
     * نام
     */
    private String firstName;

    /**
     * نام خانوادگی
     */
    private String lastName;

    /**
     * نشانی اطلاعات تماس پیش فرض
     */
    private String defaultAdminUserContact_address;

    /**
     * لیست مهارتها
     */
    private List<AdminUserSkillModel> skillList = new ArrayList<>();


    @Override
    public String toString() {
        return "AdminUserModel{" +
                "id=" + id +
                ", username='" + username + '\'' +
                ", password='" + password + '\'' +
                ", firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", defaultAdminUserContact_address='" + defaultAdminUserContact_address + '\'' +
                ", skillList=[" + skillList.stream().map(item->item.toString()).collect(Collectors.joining(",")) + "]" +
                '}';
    }


    //getter-setter:

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
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

    public String getDefaultAdminUserContact_address() {
        return defaultAdminUserContact_address;
    }

    public void setDefaultAdminUserContact_address(String defaultAdminUserContact_address) {
        this.defaultAdminUserContact_address = defaultAdminUserContact_address;
    }


    public List<AdminUserSkillModel> getSkillList() {
        return skillList;
    }

    public void setSkillList(List<AdminUserSkillModel> skillList) {
        this.skillList = skillList;
    }
}

package com.motaharinia.presentation.adminuser;

public class AdminUserModel {
    private Integer  id;

    private String username;

    private String password;

    private String firstName;

    private String lastName;

    private String defaultAdminUserContact_address;

    //getter-setter:

    public Integer  getId() {
        return id;
    }

    public void setId(Integer  id) {
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

    @Override
    public String toString() {
        return "AdminUserModel{" +
                "id=" + id +
                ", username='" + username + '\'' +
                ", password='" + password + '\'' +
                ", firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", defaultAdminUserContact_address='" + defaultAdminUserContact_address + '\'' +
                '}';
    }
}

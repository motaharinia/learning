package com.motaharinia.persistence.orm.adminusercontact;


import com.motaharinia.msutility.entity.GenericEntity;

import javax.persistence.*;
import java.io.Serializable;

@Entity
@Table(name = "admin_user_contact")
public class AdminUserContact extends GenericEntity implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private Integer  id;

    @Column(name = "address")
    private String address;

    @Override
    public String toString() {
        return "AdminUserContact{" +
                "id=" + id +
                ", address='" + address + '\'' +
                '}';
    }

    //getter-setter:
    public Integer  getId() {
        return id;
    }

    public void setId(Integer  id) {
        this.id = id;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }
}


package com.motaharinia.msutility.base.persistence.genericentity;


import java.io.Serializable;
import java.util.Date;
import javax.persistence.Column;
import javax.persistence.MappedSuperclass;
import javax.persistence.Transient;

import com.motaharinia.base.persistence.OracleUtility;
import org.hibernate.search.annotations.Field;
import org.springframework.data.annotation.CreatedBy;
import org.springframework.data.annotation.CreatedDate;

/** 
 *
 * @author myuser
 */
@MappedSuperclass
public class GenericEntity implements Serializable {

    private static final long serialVersionUID = 1L;

    public static long getSerialVersionUID() {
        return serialVersionUID;
    }

//    @CustomEntityDeleteArchive
    @Column(name = "create_user_ip")
    private String createUserIp;
//    @CustomEntityDeleteArchive
    @Column(name = "update_user_ip")
    private String updateUserIp;

    @Transient
    public Boolean displayHidden = true;
    @Transient
    public Boolean displayInvalid = true;
    
    @Field
//    @CustomEntityDeleteArchive
    @Column(name = "hidden")
    private Boolean hidden = false;
    @Field
//    @CustomEntityDeleteArchive
    @Column(name = "invalid")
    private Boolean invalid = false;

//    @CustomEntityDeleteArchive
    @CreatedDate
    @Column(name = "create_at", columnDefinition = OracleUtility.COLUMN_DEFINITION_DATE)
    private Date createAt;
//    @CustomEntityDeleteArchive
    @Column(name = "update_at", columnDefinition = OracleUtility.COLUMN_DEFINITION_DATE)
    private Date updateAt;

    @CreatedBy
    @Column(name = "create_user_id")
    private Integer createUserId;
    @Column(name = "update_user_id")
    private Integer updateUserId;

    //getter-setter:  
    public Boolean getDisplayHidden() {
        return displayHidden;
    }

    public void setDisplayHidden(Boolean displayHidden) {
        this.displayHidden = displayHidden;
    }

    public Boolean getDisplayInvalid() {
        return displayInvalid;
    }

    public void setDisplayInvalid(Boolean displayInvalid) {
        this.displayInvalid = displayInvalid;
    }

    public Boolean getHidden() {
        return hidden;
    }

    public void setHidden(Boolean hidden) {
        this.hidden = hidden;
    }

    public Boolean getInvalid() {
        return invalid;
    }

    public void setInvalid(Boolean invalid) {
        this.invalid = invalid;
    }

    public Date getCreateAt() {
        return createAt;
    }

    public void setCreateAt(Date createAt) {
        this.createAt = createAt;
    }

    public Date getUpdateAt() {
        return updateAt;
    }

    public void setUpdateAt(Date updateAt) {
        this.updateAt = updateAt;
    }



    public String getCreateUserIp() {
        return createUserIp;
    }

    public void setCreateUserIp(String createUserIp) {
        this.createUserIp = createUserIp;
    }

    public String getUpdateUserIp() {
        return updateUserIp;
    }

    public void setUpdateUserIp(String updateUserIp) {
        this.updateUserIp = updateUserIp;
    }

    public Integer getCreateUserId() {
        return createUserId;
    }

    public void setCreateUserId(Integer createUserId) {
        this.createUserId = createUserId;
    }

    public Integer getUpdateUserId() {
        return updateUserId;
    }

    public void setUpdateUserId(Integer updateUserId) {
        this.updateUserId = updateUserId;
    }


}

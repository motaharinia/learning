package com.motaharinia.business.service.adminuser;


import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import com.motaharinia.msutility.search.SearchRowView;
import com.motaharinia.msutility.search.annotation.SearchDataColumn;
import com.motaharinia.persistence.orm.adminuser.AdminUser;

@JsonDeserialize(as= AdminUser.class)
public interface SearchRowViewAdminUserBrief extends SearchRowView {

    @SearchDataColumn(index = 1,name = "id")
    Integer getId();


    @SearchDataColumn(index = 2,name = "firstName")
    String getFirstName();


    @SearchDataColumn(index = 3,name = "lastName")
    String getLastName();


    @SearchDataColumn(index = -1,name = "defaultAdminUserContact")
    DefaultAdminUserContact getDefaultAdminUserContact();

    interface DefaultAdminUserContact {
        @SearchDataColumn(index = 4,name = "address")
        String getAddress();
    }

    @Override
    default String toOut() {
        return this.getId() + "," + this.getFirstName() + "," + this.getLastName()+ "," + this.getDefaultAdminUserContact().getAddress();
    }
}

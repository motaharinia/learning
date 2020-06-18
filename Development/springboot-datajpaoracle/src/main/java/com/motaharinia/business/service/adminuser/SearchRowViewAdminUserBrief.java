package com.motaharinia.business.service.adminuser;


import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import com.motaharinia.msutility.search.SearchRowView;
import com.motaharinia.msutility.search.annotation.SearchDataColumn;
import com.motaharinia.persistence.orm.adminuser.AdminUser;

@JsonDeserialize(as= AdminUser.class)
public interface SearchRowViewAdminUserBrief extends SearchRowView {
    @JsonProperty(value = "id")
    @SearchDataColumn(index = 1,name = "id")
    Integer getId();

    @JsonProperty(value = "firstName")
    @SearchDataColumn(index = 2,name = "firstName")
    String getFirstName();

    @JsonProperty(value = "lastName")
    @SearchDataColumn(index = 3,name = "lastName")
    String getLastName();

    @Override
    default String toOut() {
        return this.getId() + "," + this.getFirstName() + "," + this.getLastName();
    }
}

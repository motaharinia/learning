package com.motaharinia.business.service;


import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonSubTypes;
import com.fasterxml.jackson.annotation.JsonTypeInfo;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import com.motaharinia.msutility.annotation.SpringDataColumn;
import com.motaharinia.msutility.search.SearchRowView;
import com.motaharinia.persistence.orm.user.User;

@JsonDeserialize(as=User.class)
public interface SearchRowViewUserBrief extends SearchRowView {
    @JsonProperty(value = "id")
    @SpringDataColumn(index = 1,name = "id")
    Integer getId();

    @JsonProperty(value = "firstName")
    @SpringDataColumn(index = 2,name = "firstName")
    String getFirstName();

    @JsonProperty(value = "lastName")
    @SpringDataColumn(index = 3,name = "lastName")
    String getLastName();

    @Override
    default String toOut() {
        return this.getId() + "," + this.getFirstName() + "," + this.getLastName();
    }
}

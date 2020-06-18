package com.motaharinia.msutility.search.sample;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import com.motaharinia.msutility.search.SearchRowView;
import com.motaharinia.msutility.search.annotation.CustomSearchDataColumn;

/**
 * User: https://github.com/motaharinia<br>
 * Date: 2020-06-14<br>
 * Time: 20:49:58<br>
 * Description:<br>
 *     اینترفیس نمونه جهت تست SearchDataModelTests
 */
@JsonDeserialize
public interface SearchRowViewUserBrief extends SearchRowView {
    @JsonProperty(value = "id")
    @CustomSearchDataColumn(index = 1,name = "id")
    Integer getId();

    @JsonProperty(value = "firstName")
    @CustomSearchDataColumn(index = 2,name = "firstName")
    String getFirstName();

    @JsonProperty(value = "lastName")
    @CustomSearchDataColumn(index = 3,name = "lastName")
    String getLastName();

    @Override
    default String toOut() {
        return this.getId() + "," + this.getFirstName() + "," + this.getLastName();
    }
}

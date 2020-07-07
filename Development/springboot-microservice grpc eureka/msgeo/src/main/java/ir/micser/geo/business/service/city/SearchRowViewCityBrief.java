package ir.micser.geo.business.service.city;


import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import com.motaharinia.msutility.search.SearchRowView;
import com.motaharinia.msutility.search.annotation.SearchDataColumn;
import ir.micser.geo.persistence.orm.city.City;



@JsonDeserialize(as = City.class)
public interface SearchRowViewCityBrief extends SearchRowView {

    @SearchDataColumn(index = 1, name = "id")
    Integer getId();


    @SearchDataColumn(index = 2, name = "title")
    String getTitle();


    @Override
    default String toOut() {
        return this.getId() + "," + this.getTitle();
    }
}

package com.motaharinia.msutility.search.data;

import com.fasterxml.jackson.databind.annotation.JsonSerialize;

import java.io.Serializable;
import java.util.Arrays;

/**
 * https://www.baeldung.com/jackson-field-serializable-deserializable-or-not
 *
 * we can control if a field is serialized / deserialized by Jackson or not:
 *
 * 1. A Public Field:
 * The simplest way to make sure a field is both serializable and deserializable is to make it public.
 *
 * 2. A Getter Makes a Non-Public Field Serializable and Deserializable and A Setter Makes a Non-Public Field Deserializable Only:
 *
 * 3. Make All Fields Globally Serializable :
 * That kind of global configuration can be done at the ObjectMapper level, by turning on the AutoDetect function to use either public fields or getter/setter methods for serialization, or maybe turn on serialization for all fields:
 * ObjectMapper mapper = new ObjectMapper();
 * mapper.setVisibility(PropertyAccessor.ALL, Visibility.NONE);
 * mapper.setVisibility(PropertyAccessor.FIELD, Visibility.ANY);
 *
 *4. Change the Name of a Property on Serialization/Deserialization :
 * @ JsonProperty("strVal")
 * public String getStringValue() {
 *     return stringValue;
 * }
 *
 * 5. Ignore a Field on Serialization or Deserialization:
 * @ JsonIgnore
 * public String getPassword() {
 *     return password;
 * }
 * @ JsonProperty
 * public void setPassword(String password) {
 *     this.password = password;
 * }
 *
 */


/**
 * Created by IntelliJ IDEA.
 * User: https://github.com/motaharinia
 * Date: 2020-06-12
 * Time: 01:05:58
 * Description: این کلاس اطلاعاتی از هر یک از سطرهای گرید ارائه میکند
 */
@JsonSerialize
//@JsonDeserialize
public class SearchDataRowModel implements Serializable {

    private Integer id;
    private Object[] rowCellArray;
//    private SearchRowView searchRowView;

    public SearchDataRowModel() {
    }


    public SearchDataRowModel(Integer id, Object[] rowCellArray) {
        this.id = id;
        this.rowCellArray = rowCellArray;
    }

    @Override
    public String toString() {
        return "SearchDataRowModel{" +
                "id=" + id +
                ", rowCellArray=" + Arrays.toString(rowCellArray) +
                '}';
    }

//    @Override
//    public String toString() {
//        if(!ObjectUtils.isEmpty(searchRowView)){
//            return "SearchDataRowModel{" +
//                    "id=" + id +
//                    ", searchRowView=" + searchRowView.toOut() +
//                    '}';
//        }else{
//            return "SearchDataRowModel{" +
//                    "id=" + id +
//                    ", searchRowView=Empty" +
//                    '}';
//        }
//    }

    //    public GridRowModel(Integer id,Object[] cell) {
//        this.id = id;
//        this.cell = cell;
//    }

//    @Override
//    public String toString() {
//        return "GridRowModel{" + "id=" + id.toString() + ", cell=" + Arrays.asList(cell).toString() + '}';
//    }


    //getter-setter:
    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }




//    @JsonSerialize(using = JsonSerializerClass.class)
//    public SearchRowView getSearchRowView() {
//        return searchRowView;
//    }
//
//    public void setSearchRowView(SearchRowView searchRowView) {
//        this.searchRowView = searchRowView;
//    }


    public Object[] getRowCellArray() {
        return rowCellArray;
    }

    public void setRowCellArray(Object[] rowCellArray) {
        this.rowCellArray = rowCellArray;
    }
}

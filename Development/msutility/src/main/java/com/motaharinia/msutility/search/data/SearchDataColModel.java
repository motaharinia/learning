package com.motaharinia.msutility.search.data;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.motaharinia.msutility.search.filter.SearchFilterOperationEnum;

import java.io.Serializable;
import java.util.List;

/**
 * Created by IntelliJ IDEA.
 * User: https://github.com/motaharinia
 * Date: 2020-06-17
 * Time: 15:51:26
 * Description:
 */
public class SearchDataColModel implements Serializable {
    //نام فیلد ستون
    private String name;
    //اندیس و ترتیب قرارگیری ستون
    private String index;
    //جهت نمایش افقی
    private SearchDataColAlignEnum align = SearchDataColAlignEnum.CENTER;
    //عرض ستون
    private Integer width;
    //نوع مرتب سازی ستون که عددی یا متنی است
    private SearchDataColSortTypeEnum sortType;
    //نوع جستجوی ستون
    @JsonProperty("stype")
    private SearchDataColSearchTypeEnum searchType;
    //مدل آپشنهای جستجوی پیشرفته گریدهای بک پنل برای هر ستون
    @JsonProperty(value = "searchoptions")
    private List<SearchFilterOperationEnum> searchFilterOperationList;
    //فرمت کننده ستون
    //مثلا میخواهیم برای مقادیر صفر در ستون کلمه خیر بیاریم و برای مقادیر یک در ستون کلمه بلی بیاریم
    private String formatter;
    //جستجوی پیشرفته دارد یا خیر
    @JsonProperty("search")
    private Boolean searchable;
    //ستون قابل مرتب سازی داده هست یا خیر
    private Boolean sortable;

    public SearchDataColModel() {
    }

    public SearchDataColModel(String name, String index, SearchDataColAlignEnum align, Integer width, SearchDataColSortTypeEnum sortType, SearchDataColSearchTypeEnum searchType, List<SearchFilterOperationEnum> searchFilterOperationList, String formatter, Boolean searchable, Boolean sortable) {
        this.name = name;
        this.index = index;
        this.align = align;
        this.width = width;
        this.sortType = sortType;
        this.searchType = searchType;
        this.searchFilterOperationList = searchFilterOperationList;
        this.formatter = formatter;
        this.searchable = searchable;
        this.sortable = sortable;
    }

    @Override
    public String toString() {
        return "SearchDataColModel{" +
                "name='" + name + '\'' +
                ", index='" + index + '\'' +
                ", align=" + align +
                ", width=" + width +
                ", sortType=" + sortType +
                ", searchType=" + searchType +
                ", searchFilterOperationList=" + searchFilterOperationList +
                ", formatter='" + formatter + '\'' +
                ", searchable=" + searchable +
                ", sortable=" + sortable +
                '}';
    }

    //getter-setter:
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getIndex() {
        return index;
    }

    public void setIndex(String index) {
        this.index = index;
    }

    public SearchDataColAlignEnum getAlign() {
        return align;
    }

    public void setAlign(SearchDataColAlignEnum align) {
        this.align = align;
    }

    public Integer getWidth() {
        return width;
    }

    public void setWidth(Integer width) {
        this.width = width;
    }

    public SearchDataColSortTypeEnum getSortType() {
        return sortType;
    }

    public void setSortType(SearchDataColSortTypeEnum sortType) {
        this.sortType = sortType;
    }

    public SearchDataColSearchTypeEnum getSearchType() {
        return searchType;
    }

    public void setSearchType(SearchDataColSearchTypeEnum searchType) {
        this.searchType = searchType;
    }

    public List<SearchFilterOperationEnum> getSearchFilterOperationList() {
        return searchFilterOperationList;
    }

    public void setSearchFilterOperationList(List<SearchFilterOperationEnum> searchFilterOperationList) {
        this.searchFilterOperationList = searchFilterOperationList;
    }

    public String getFormatter() {
        return formatter;
    }

    public void setFormatter(String formatter) {
        this.formatter = formatter;
    }

    public Boolean getSearchable() {
        return searchable;
    }

    public void setSearchable(Boolean searchable) {
        this.searchable = searchable;
    }

    public Boolean getSortable() {
        return sortable;
    }

    public void setSortable(Boolean sortable) {
        this.sortable = sortable;
    }
}

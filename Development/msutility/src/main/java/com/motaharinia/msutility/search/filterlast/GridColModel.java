package com.motaharinia.msutility.search.filterlast;

import com.fasterxml.jackson.annotation.JsonProperty;

import java.io.Serializable;

/**
 * Created by IntelliJ IDEA.
 * User: https://github.com/motaharinia
 * Date: 2020-06-12
 * Time: 01:05:58
 * Description: این کلاس اطلاعاتی از هر یک از ستونهای گرید ارائه میکند
 */
public class GridColModel implements Serializable {

    //نام فیلد ستون
    private String name;
    //اندیس و ترتیب قرارگیری ستون
    private String index;
    //جهت متن ستون
    private String align = "center";
    //عرض ستون
    private Integer width;
    //نوع مرتب سازی ستون که عددی یا متنی است
    private String sortType;
    //نوع جستجوی ستون
    @JsonProperty("stype")
    private String searchType;
    //مدل آپشنهای جستجوی پیشرفته گریدهای بک پنل برای هر ستون
    @JsonProperty(value = "searchoptions")
    private GridSearchOptionsModel pageGridSearchOptions;
    //فرمت کننده ستون
    //مثلا میخواهیم برای مقادیر صفر در ستون کلمه خیر بیاریم و برای مقادیر یک در ستون کلمه بلی بیاریم
    private String formatter;
    //جستجوی پیشرفته دارد یا خیر
    private Boolean search;
    //ستون قابل مرتب سازی داده هست یا خیر
    private Boolean sortable;

    //Hidden in Grid
    private boolean hidden;

    //Hidden in Search
    private boolean hiddenlg;

    private String classes;

    public GridColModel(String name, String index, Integer width, String sortType, String searchType, boolean hidden, boolean hiddenlg, GridSearchOptionsModel pageGridSearchOptions) {
        this.sortable = true;
        this.name = name;
        this.index = index;
        this.width = width;
        this.sortType = sortType;
        this.searchType = searchType;
        this.hidden = hidden;
        this.hiddenlg = hiddenlg;
        this.pageGridSearchOptions = pageGridSearchOptions;
    }

    //This constructor used when you need to Formatter
    public GridColModel(String name, String index, Integer width, String sortType, String searchType, boolean hidden, boolean hiddenlg, GridSearchOptionsModel pageGridSearchOptions, String formatter) {
        this.sortable = true;
        this.name = name;
        this.index = index;
        this.width = width;
        this.sortType = sortType;
        this.searchType = searchType;
        this.hidden = hidden;
        this.hiddenlg = hiddenlg;
        this.pageGridSearchOptions = pageGridSearchOptions;
        this.formatter = formatter;
    }

    public GridColModel() {
        this.sortable = true;
    }

    public GridColModel(String name, String index) {
        this.sortable = true;
        this.name = name;
        this.index = index;
    }

    public GridColModel(String name, String index, String sortType) {
        this.sortable = true;
        this.name = name;
        this.index = index;
        this.sortType = sortType;
    }

    @Override
    public String toString() {
        return "GridColModel{" + "name=" + name + ", index=" + index + ", align=" + align + ", width=" + width + ", sortType=" + sortType + ", searchType=" + searchType + ", pageGridSearchOptions=" + pageGridSearchOptions + ", formatter=" + formatter + ", search=" + search + ", sortable=" + sortable + ", hidden=" + hidden + ", hiddenlg=" + hiddenlg + ", classes=" + classes + '}';
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

    public Integer getWidth() {
        return width;
    }

    public void setWidth(Integer width) {
        this.width = width;
    }

    public String getSortType() {
        return sortType;
    }

    public void setSortType(String sortType) {
        this.sortType = sortType;
    }

    public boolean isHidden() {
        return hidden;
    }

    public void setHidden(boolean hidden) {
        this.hidden = hidden;
    }

    public boolean isHiddenlg() {
        return hiddenlg;
    }

    public void setHiddenlg(boolean hiddenlg) {
        this.hiddenlg = hiddenlg;
    }

    public GridSearchOptionsModel getPageGridSearchOptions() {
        return pageGridSearchOptions;
    }

    public void setPageGridSearchOptions(GridSearchOptionsModel pageGridSearchOptions) {
        this.pageGridSearchOptions = pageGridSearchOptions;
    }

    public String getSearchType() {
        return searchType;
    }

    public void setSearchType(String searchType) {
        this.searchType = searchType;
    }

    public String getFormatter() {
        return formatter;
    }

    public void setFormatter(String formatter) {
        this.formatter = formatter;
    }

    public String getAlign() {
        return align;
    }

    public void setAlign(String align) {
        this.align = align;
    }

    public Boolean getSortable() {
        return sortable;
    }

    public void setSortable(Boolean sortable) {
        this.sortable = sortable;
    }

    public Boolean getSearch() {
        return search;
    }

    public void setSearch(Boolean search) {
        this.search = search;
    }

    public String getClasses() {
        return classes;
    }

    public void setClasses(String classes) {
        this.classes = classes;
    }

}

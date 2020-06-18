package com.motaharinia.msutility.search.filter;


import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import com.motaharinia.msutility.json.deserializer.JsonDeserializerClass;
import com.motaharinia.msutility.jparepository.GenericSpecification;
import org.springframework.util.CollectionUtils;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

/**
 * Created by IntelliJ IDEA.
 * User: https://github.com/motaharinia
 * Date: 2020-06-16
 * Time: 23:07:01
 * Description: این کلاس برای جستجوی پیشرفته داده ها از کلاینت به سرور استفاده میگردد
 */
public class SearchFilterModel implements Serializable {
    /**
     * نام نمای جستجو
     */
    private Class searchRowView;
    /**
     * لیستی از شرطهای جستجو
     */
    private List<SearchFilterRestrictionModel> restrictionList = new ArrayList<>();
    ;
    /**
     * لیستی از ترتیبهای صعودی/نزولی دلخواه
     */
    private List<SearchFilterSortModel> sortList = new ArrayList<>();
    ;
    /**
     * صفحه مورد نظر برای دریافت در حالت صفحه بندی و اسمارت رندرینگ
     */
    private Integer page;
    /**
     * تعداد سطر مورد نیاز در هر صفحه
     */
    private Integer rows;


    public SearchFilterModel() {
    }

    public GenericSpecification makeSpecification(GenericSpecification genericSpecification) {
        if (!CollectionUtils.isEmpty(this.restrictionList)) {
            restrictionList.stream().forEach(item -> genericSpecification.add(item));
        }
        return genericSpecification;
    }


    @Override
    public String toString() {
        return "SearchFilterModel{" +
                "searchRowView=" + searchRowView.toString() +
                ", restrictionList=" + restrictionList.stream().map(item -> item.toString()).collect(Collectors.joining("\n")) +
                ", sortList=" + sortList.stream().map(item -> item.toString()).collect(Collectors.joining("\n")) +
                ", page=" + page +
                ", rows=" + rows +
                '}';
    }

    //getter-setter:
    public List<SearchFilterRestrictionModel> getRestrictionList() {
        return restrictionList;
    }

    public void setRestrictionList(List<SearchFilterRestrictionModel> restrictionList) {
        this.restrictionList = restrictionList;
    }

    public List<SearchFilterSortModel> getSortList() {
        return sortList;
    }

    public void setSortList(List<SearchFilterSortModel> sortList) {
        this.sortList = sortList;
    }

    public Integer getPage() {
        return page;
    }

    public void setPage(Integer page) {
        this.page = page;
    }

    public Integer getRows() {
        return rows;
    }

    public void setRows(Integer rows) {
        this.rows = rows;
    }

    public Class getSearchRowView() {
        return searchRowView;
    }

    //    @JsonDeserialize(as = SearchRowView.class)
    @JsonDeserialize(using = JsonDeserializerClass.class)
    public void setSearchRowView(Class searchRowView) {
        this.searchRowView = searchRowView;
    }
}

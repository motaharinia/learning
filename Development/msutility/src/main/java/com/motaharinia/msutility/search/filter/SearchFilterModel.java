package com.motaharinia.msutility.search.filter;

import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import com.motaharinia.msutility.json.deserializer.JsonDeserializerClass;
import com.motaharinia.msutility.jparepository.GenericSpecification;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;
import org.springframework.util.ObjectUtils;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

/**
 * User: https://github.com/motaharinia<br>
 * Date: 2020-06-16<br>
 * Time: 23:07:01<br>
 * Description:<br>
 * این کلاس برای جستجوی پیشرفته داده ها از کلاینت به سرور استفاده میگردد
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


    /**
     * متد سازنده پیش فرض
     */
    public SearchFilterModel() {
    }

    /**
     * متدی که مشخصات جستجو  ریپازیتوری مورد نظر را از ورودی دریافت میکند و تمام موارد لیست شرطهای جستجو را به آن اضافه میکند
     * تا در مرحله بعد این مشخصات جستجو به سمت ریپازیتوری برای جستجو در دیتابیس ارسال گردد
     *
     * @param genericSpecification مشخصات جستجو ریپازیتوری مورد نظر
     * @return خروجی: مشخصات جستجوی ریپازیتوری حاوی شرایط جستجو
     */
    public GenericSpecification makeSpecification(GenericSpecification genericSpecification) {
        if (!ObjectUtils.isEmpty(this.restrictionList)) {
            restrictionList.stream().forEach(item -> genericSpecification.add(item));
        }
        return genericSpecification;
    }

    /**
     * این متد شیی صفحه بندی-مرتب سازی را مطابق اطلاعات دریافتی مدل جستجو تولید میکند
     * تا در مرحله بعد این شیی به سمت ریپازیتوری برای جستجو در دیتابیس ارسال گردد
     *
     * @return خروجی: شیی صفحه بندی-مرتب سازی جهت استفاده در ریپازیتوری
     */
    public Pageable makePageable() {
        Sort allSort = null;
        for (SearchFilterSortModel searchFilterSortModel : this.getSortList()) {
            Sort newSort = null;
            if (searchFilterSortModel.getType().equals(SearchFilterSortTypeEnum.ASC)) {
                newSort = Sort.by(searchFilterSortModel.getFieldName()).ascending();
            }
            if (searchFilterSortModel.getType().equals(SearchFilterSortTypeEnum.DSC)) {
                newSort = Sort.by(searchFilterSortModel.getFieldName()).descending();
            }
            if (ObjectUtils.isEmpty(allSort)) {
                allSort = newSort;
            } else {
                allSort = allSort.and(newSort);
            }
        }
        if (ObjectUtils.isEmpty(allSort)) {
            return PageRequest.of(this.getPage(), this.getRows());
        } else {
            return PageRequest.of(this.getPage(), this.getRows(), allSort);
        }
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

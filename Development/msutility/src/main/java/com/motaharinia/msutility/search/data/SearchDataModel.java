package com.motaharinia.msutility.search.data;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.motaharinia.msutility.annotation.SpringDataColumn;
import com.motaharinia.msutility.search.SearchRowView;
import com.motaharinia.msutility.search.SearchRowViewTest;
import com.motaharinia.msutility.search.filter.SearchFilterModel;
import com.motaharinia.msutility.search.filter.SearchFilterOperationEnum;
import org.apache.commons.lang3.StringUtils;
import org.apache.lucene.util.CollectionUtil;
import org.reflections.ReflectionUtils;
import org.springframework.context.MessageSource;
import org.springframework.context.i18n.LocaleContextHolder;
import org.springframework.data.domain.Page;
import org.springframework.util.CollectionUtils;
import org.springframework.util.ObjectUtils;

import java.beans.IntrospectionException;
import java.beans.Introspector;
import java.beans.PropertyDescriptor;
import java.io.Serializable;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.lang.reflect.Modifier;
import java.text.SimpleDateFormat;
import java.util.*;
import java.util.stream.Collectors;

/**
 * Created by IntelliJ IDEA.
 * User: https://github.com/motaharinia
 * Date: 2020-06-12
 * Time: 01:05:58
 * Description: این کلاس مدل حاوی نتیجه جستجوی اطلاعات میباشد
 */

public class SearchDataModel implements Serializable {
    private static final SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd", Locale.ENGLISH);
    private static final SimpleDateFormat dateTimeFormat = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss", Locale.ENGLISH);

    /**
     * شماره صفحه فعلی
     */
    public Integer page;

    /**
     * تعداد کل سطرهای قابل نمایش که صفحه بندی شده اند و به صفحات کوچکتر تبدیل شده اند
     */
    public Long records;


    /**
     * لیست سطرهای داده
     */
    @JsonProperty(value = "rows")
    private List<SearchDataRowModel> searchDataRowModelList = new ArrayList<>();

    /**
     * لیست اطلاعات ستونها
     */
    @JsonProperty(value = "columns")
    private List<SearchDataColModel> searchDataColModelList = new ArrayList<>();

    /**
     * تعداد صفحات در صفحه بندی اطلاعات
     */
    public Long total;

    /**
     * اطلاعات اضافی
     */
    @JsonProperty(value = "userdata")
    public Object userData;


    public SearchDataModel() {
    }


    public SearchDataModel(Page<?> viewPage, SearchFilterModel searchFilterModel, Object userData) {
        this.userData = userData;
        this.page = searchFilterModel.getPage();
        this.total = (long) viewPage.getTotalPages();
        this.records = viewPage.getTotalElements();


        //searchDataColModelList:
        HashMap<Integer, SpringDataColumn> indexAnnotationHashMap = new HashMap<>();
        List<SearchDataColModel> searchDataColModelList = new ArrayList<>();
        Set<Method> getterMethodSet1 = ReflectionUtils.getAllMethods(searchFilterModel.getSearchRowView(), ReflectionUtils.withModifier(Modifier.PUBLIC), ReflectionUtils.withPrefix("get"));
        getterMethodSet1.stream().forEach(getterMethod -> {
            if (!ObjectUtils.isEmpty(getterMethod.getAnnotation(SpringDataColumn.class))) {
                indexAnnotationHashMap.put(getterMethod.getAnnotation(SpringDataColumn.class).index(), getterMethod.getAnnotation(SpringDataColumn.class));
            }
        });
        indexAnnotationHashMap.entrySet().stream().sorted(Map.Entry.comparingByKey()).forEach(entry -> {
            try {
                SearchDataColModel searchDataColModel = new SearchDataColModel();
                searchDataColModel.setAlign(entry.getValue().align());
                searchDataColModel.setFormatter(entry.getValue().formatter());
                searchDataColModel.setIndex(String.valueOf(entry.getValue().index()));
                searchDataColModel.setName(entry.getValue().name());
                searchDataColModel.setSearchable(entry.getValue().searchable());
                searchDataColModel.setSearchType(entry.getValue().searchType());
                searchDataColModel.setSortable(entry.getValue().sortable());
                searchDataColModel.setSortType(entry.getValue().sortType());
                searchDataColModel.setWidth(entry.getValue().width());
                if (searchDataColModel.getSortType().equals(SearchDataColSortTypeEnum.TEXT)) {
                    searchDataColModel.setSearchFilterOperationList(Arrays.asList(new SearchFilterOperationEnum[]{SearchFilterOperationEnum.EQUAL, SearchFilterOperationEnum.MATCH, SearchFilterOperationEnum.MATCH_END, SearchFilterOperationEnum.MATCH_START, SearchFilterOperationEnum.IN, SearchFilterOperationEnum.NOT_IN}));
                } else {
                    searchDataColModel.setSearchFilterOperationList(Arrays.asList(new SearchFilterOperationEnum[]{SearchFilterOperationEnum.EQUAL, SearchFilterOperationEnum.GREATER_THAN, SearchFilterOperationEnum.GREATER_THAN_EQUAL, SearchFilterOperationEnum.LESS_THAN, SearchFilterOperationEnum.LESS_THAN_EQUAL, SearchFilterOperationEnum.IN, SearchFilterOperationEnum.NOT_IN}));
                }
                searchDataColModelList.add(searchDataColModel);
            } catch (Exception e) {
                e.printStackTrace();
            }
        });
        this.searchDataColModelList = searchDataColModelList;
        this.searchDataColModelList.stream().forEach(item-> System.out.println(item.toString()));

        //searchDataRowModelList:
        HashMap<Integer, Method> indexMethodHashMap = new HashMap<>();
        List<SearchDataRowModel> searchDataRowModelList = new ArrayList<>();
        viewPage.stream().forEach(item -> {
            indexMethodHashMap.clear();
            Set<Method> getterMethodSet = ReflectionUtils.getAllMethods(searchFilterModel.getSearchRowView(), ReflectionUtils.withModifier(Modifier.PUBLIC), ReflectionUtils.withPrefix("get"));
            getterMethodSet.stream().forEach(getterMethod -> {
                try {
                    if (!ObjectUtils.isEmpty(getterMethod.getAnnotation(SpringDataColumn.class))) {
                        indexMethodHashMap.put(getterMethod.getAnnotation(SpringDataColumn.class).index(), getterMethod);
                    }
                } catch (Exception e) {
                    e.printStackTrace();
                }
            });
            List<Object> rowCellList = new ArrayList<>();
            indexMethodHashMap.entrySet().stream().sorted(Map.Entry.comparingByKey()).forEach(entry -> {
                try {
                    rowCellList.add(entry.getValue().invoke(item));
                } catch (Exception e) {
                    e.printStackTrace();
                }
            });

            try {
                searchDataRowModelList.add(new SearchDataRowModel((Integer) item.getClass().getDeclaredMethod("getId",null).invoke(item), rowCellList.toArray()));
            } catch (Exception e) {
                e.printStackTrace();
            }

        });
        this.searchDataRowModelList = searchDataRowModelList;
        this.searchDataRowModelList.stream().forEach(item->System.out.println(item.toString()));
    }

    /**
     * متد سازنده
     *
     * @param page                   شماره صفحه فعلی
     * @param records                تعداد کل سطرهای قابل نمایش که صفحه بندی شده اند و به صفحات کوچکتر تبدیل شده اند
     * @param total                  تعداد صفحات در صفحه بندی اطلاعات
     * @param searchDataRowModelList لیست سطرهای داده
     * @param userData               اطلاعات اضافی
     */
    public SearchDataModel(Integer page, Long records, Long total, List<SearchDataRowModel> searchDataRowModelList, Object userData) {
        this.userData = userData;
        this.page = page;
        this.total = total;
        this.records = records;
        this.searchDataRowModelList = (ObjectUtils.isEmpty(searchDataRowModelList)) ? new ArrayList<>() : searchDataRowModelList;
    }
//    public GridDataModel(Integer page, Long records, Long total, List<Object[]> rows, Object userData) {
//        this.userData = userData;
//        this.page = page;
//        this.total = total;
//        this.records = records;
//        this.rows = (ObjectUtils.isEmpty(rows)) ? new ArrayList<>() : rows;
//    }


//    public SearchDataModel GridDataFixForExcel(@NotNull SearchDataModel gridData, @NotNull List<GridColModel> pageGridColModelList, @NotNull MessageSource messageSource, @NotNull  HashMap<String, List<Object[]>> formatters) throws Exception {
//        if (ObjectUtils.isEmpty(gridData) || ObjectUtils.isEmpty(pageGridColModelList)) {
//            throw new UtilityException(CalDateTime.class, UtilityExceptionKeyEnum.METHOD_PARAMETER_IS_NULL_OR_EMPTY, "");
//        }
//        List<Object[]> objectArrayList = gridData.getRows();
//        Object[] objectArray;
//        String colModelName = "";
//        if (objectArrayList != null) {
//            for (int i = 0; i < objectArrayList.size(); i++) {
//                objectArray = objectArrayList.get(i);
//                for (int j = 0; j < pageGridColModelList.size(); j++) {
//                    colModelName = pageGridColModelList.get(j).getName();
//                    if (formatters != null && formatters.containsKey(colModelName)) {
//                        List<Object[]> formatterArrayList = formatters.get(colModelName);
//                        objectArray[j] = fixFormatter(formatterArrayList, objectArray[j]);
//                    } else {
//                        if (".langKey".equals(colModelName.substring(Math.max(colModelName.length() - 8, 0)))) {
//                            objectArray[j] = fixLangKey((String) objectArray[j], messageSource);
//                        } else {
//                            switch (pageGridColModelList.get(j).getSortType()) {
//                                case "date":
//                                    objectArray[j] = CalDateTime.fixToLocaleDate((Date) objectArray[j], "/", LocaleContextHolder.getLocale());
//                                    break;
//                                case "dateTime":
//                                    objectArray[j] = CalDateTime.fixToLocaleDateTime((Date) objectArray[j], "/", LocaleContextHolder.getLocale());
//                                    break;
//                            }
//                        }
//                    }
//                    objectArrayList.set(i, objectArray);
//                }
//            }
//        }
//        return gridData;
//    }


    //لیستی از فرمترهای گرید و یک داده را دریافت میکند و اگر آن داده ورودی با یکی از داده های لیست فرمترها بخواند مقدار فرمت شده فرمتر را بجای داده خروجی میدهد
    public String fixFormatter(List<Object[]> formatterArrayList, Object object) {
        for (int i = 0; i < formatterArrayList.size(); i++) {
            if (formatterArrayList.get(i)[0].toString().equals(object + "")) {
                return formatterArrayList.get(i)[1].toString();
            }
        }
        return "";
    }

    //مطابق با زبان سیستم در صورت نیاز کلید لاتین را به متن فارسی معادل آن ترجمه میکند و خروجی میدهد
    public String fixLangKey(String langKey, MessageSource messageSource) {
        if (!StringUtils.isEmpty(langKey)) {
            return messageSource.getMessage(langKey, new Object[]{}, LocaleContextHolder.getLocale());
        } else {
            return "";
        }
    }


    @Override
    public String toString() {
        return "SearchDataModel{" +
                "page=" + page +
                ", records=" + records +
                ", gridRowModelList=[" + searchDataRowModelList.stream().map(item -> item.toString()).collect(Collectors.joining(",")) + "]" +
                ", total=" + total +
                ", userData=" + userData +
                '}';
    }

    //getter-setter
    public Integer getPage() {
        return page;
    }

    public void setPage(Integer page) {
        this.page = page;
    }

    public Long getRecords() {
        return records;
    }

    public void setRecords(Long records) {
        this.records = records;
    }


    public List<SearchDataRowModel> getSearchDataRowModelList() {
        return searchDataRowModelList;
    }

    public void setSearchDataRowModelList(List<SearchDataRowModel> searchDataRowModelList) {
        this.searchDataRowModelList = searchDataRowModelList;
    }

    public Long getTotal() {
        return total;
    }

    public void setTotal(Long total) {
        this.total = total;
    }

    public Object getUserData() {
        return userData;
    }

    public void setUserData(Object userData) {
        this.userData = userData;
    }


    public List<SearchDataColModel> getSearchDataColModelList() {
        return searchDataColModelList;
    }

    public void setSearchDataColModelList(List<SearchDataColModel> searchDataColModelList) {
        this.searchDataColModelList = searchDataColModelList;
    }
}

//package com.motaharinia.msutility.base.presentation.model.griddata;
//
//import org.apache.commons.collections4.CollectionUtils;
//import org.springframework.data.domain.PageRequest;
//import org.springframework.data.domain.Pageable;
//import org.springframework.data.domain.Sort;
//
//
//import java.util.ArrayList;
//import java.util.List;
//
//public class GridFilterModel {
//    List<String> projectionList=new ArrayList<>();
//    Integer pageNo=0;
//    Integer pageSize=10;
//    List<GridFilterSortModel> gridFilterSortModelList;
//
//
//    public Pageable getPageable(){
//        Pageable pageable;
//        if(CollectionUtils.isNotEmpty(gridFilterSortModelList)){
//            List<Sort.Order> orderList=new ArrayList<>();
//            gridFilterSortModelList.stream().forEach(gridFilterSortModel-> orderList.add(new Sort.Order(gridFilterSortModel.getSortTypeEnum(),gridFilterSortModel.getSortFieldName())));
//            Sort sort=Sort.by(orderList);
//             pageable= PageRequest.of(this.pageNo,this.pageSize,sort);
//        }else{
//             pageable= PageRequest.of(this.pageNo,this.pageSize);
//        }
//        return pageable;
//    }
//
//    //getter-setter:
//    public Integer getPageNo() {
//        return pageNo;
//    }
//
//    public void setPageNo(Integer pageNo) {
//        this.pageNo = pageNo;
//    }
//
//    public Integer getPageSize() {
//        return pageSize;
//    }
//
//    public void setPageSize(Integer pageSize) {
//        this.pageSize = pageSize;
//    }
//
//    public List<GridFilterSortModel> getGridFilterSortModelList() {
//        return gridFilterSortModelList;
//    }
//
//    public void setGridFilterSortModelList(List<GridFilterSortModel> gridFilterSortModelList) {
//        this.gridFilterSortModelList = gridFilterSortModelList;
//    }
//
//    public List<String> getProjectionList() {
//        return projectionList;
//    }
//
//    public void setProjectionList(List<String> projectionList) {
//        this.projectionList = projectionList;
//    }
//}

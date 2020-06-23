package com.motaharinia.persistence.orm.jparepository;

import com.motaharinia.msutility.search.filter.SearchFilterRestrictionModel;
import org.springframework.data.jpa.domain.Specification;

import javax.persistence.criteria.*;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;


//https://en.wikibooks.org/wiki/Java_Persistence/Criteria
//https://www.codota.com/code/java/methods/javax.persistence.criteria.CriteriaBuilder/isMember
//https://www.logicbig.com/tutorials/java-ee-tutorial/jpa/criteria-api-is-member-restriction.html
//https://www.objectdb.com/java/jpa/query/jpql/collection


/**
 * User: https://github.com/motaharinia<br>
 * Date: 2020-06-16<br>
 * Time: 23:27:46<br>
 * Description:<br>
 * این کلاس جنریک بیلدر لازم برای تمام کلاسهای مربوط به انجام کوئری های پیشرفته دیتابیس را دارا میباشد
 */
public class GenericSpecification<T> implements Specification<T> {
    private List<SearchFilterRestrictionModel> searchFilterRestrictionModelList;

    public GenericSpecification() {
        this.searchFilterRestrictionModelList = new ArrayList<>();
    }

    public void add(SearchFilterRestrictionModel searchFilterRestrictionModel) {
        searchFilterRestrictionModelList.add(searchFilterRestrictionModel);
    }

    @Override
    public Predicate toPredicate(Root<T> root, CriteriaQuery<?> query, CriteriaBuilder builder) {

        //create a new predicate list
        List<Predicate> predicates = new ArrayList<>();


//        System.out.println("##########################################################################################################################");
//        System.out.println("root.getJavaType():"+root.getJavaType());
//        System.out.println("root.getAlias():"+root.getAlias());
//        System.out.println("root.getModel().toString():"+root.getModel());
//        for (SearchFilterRestrictionModel searchFilterRestrictionModel : searchFilterRestrictionModelList) {
//            System.out.println( "searchFilterRestrictionModel.getFieldName():"+searchFilterRestrictionModel.getFieldName()+" root.get( searchFilterRestrictionModel.getFieldName()).getJavaType():"+     root.get( searchFilterRestrictionModel.getFieldName()).getJavaType());
//        }
//        System.out.println("##########################################################################################################################");

        //add add criteria to predicates
        for (SearchFilterRestrictionModel searchFilterRestrictionModel : searchFilterRestrictionModelList) {


            Path path = this.getPath(root, searchFilterRestrictionModel.getFieldName());

            switch (searchFilterRestrictionModel.getFieldOperation()) {
                case GREATER_THAN:
                    predicates.add(builder.greaterThan(path, searchFilterRestrictionModel.getFieldValue().toString()));
                    break;
                case LESS_THAN:
                    predicates.add(builder.lessThan(path, searchFilterRestrictionModel.getFieldValue().toString()));
                    break;
                case GREATER_THAN_EQUAL:
                    predicates.add(builder.greaterThanOrEqualTo(path, searchFilterRestrictionModel.getFieldValue().toString()));
                    break;
                case LESS_THAN_EQUAL:
                    predicates.add(builder.lessThanOrEqualTo(path, searchFilterRestrictionModel.getFieldValue().toString()));
                    break;
                case NOT_EQUAL:
                    predicates.add(builder.notEqual(path, searchFilterRestrictionModel.getFieldValue().toString()));
                    break;
                case EQUAL:
                    predicates.add(builder.equal(path, searchFilterRestrictionModel.getFieldValue().toString()));
                    break;
                case MATCH:
                    predicates.add(builder.like(builder.lower(path), "%" + searchFilterRestrictionModel.getFieldValue().toString().toLowerCase() + "%"));
                    break;
                case MATCH_START:
                    predicates.add(builder.like(builder.lower(path), searchFilterRestrictionModel.getFieldValue().toString().toLowerCase() + "%"));
                    break;
                case MATCH_END:
                    predicates.add(builder.like(builder.lower(path), "%" + searchFilterRestrictionModel.getFieldValue().toString().toLowerCase()));
                    break;
                case IN:
                    predicates.add(builder.in(path).value(searchFilterRestrictionModel.getFieldValue()));
                    break;
                case NOT_IN:
                    predicates.add(builder.not(path).in(searchFilterRestrictionModel.getFieldValue()));
                    break;
                default:
                    predicates.add(builder.isMember(searchFilterRestrictionModel.getFieldValue(),path));
            }
        }
        return builder.and(predicates.toArray(new Predicate[0]));
    }


    private Path getPath(Root root, String path) {
        String[] pathArray = path.split("\\.");
        if (pathArray.length > 1) {
            //اگر داخل نام فیلد نقطه وجود داشته باشد باید به تعداد یکی کمتر از فیلدهای نقطه خورده جوین بزنیم تا بتوانیم روی آخرین جوین path فیلد نهایی را خروجی بدهیم
            Join join = null;
            for (int i = 0; i < pathArray.length - 1; i++) {
                join = root.join(pathArray[i], JoinType.LEFT);
            }
            return join.get(pathArray[pathArray.length - 1]);
        } else {
            //اگر داخل نام فیلد نقطه وجود نداشته باشد فقط path همان فیلد در root انتیتی را خروجی میدهیم
            return root.get(path);
        }
    }


    private Path getPathFrom(Path path,String fieldName){
        return null;
    }


    /**
     * این متد برای به دست آوردن مسیر فیلد مورد نظر برای اضافه شدن شرایط میباشد. اگر این متد و path استفاده نشود در اینترفیسهای projection که میخواهیم فیلدی با جنس انتیتی را بخوانیم null pointer خواهیم گرفت
     * https://stackoverflow.com/questions/13246959/jpa-specification-with-onetoone-relation
     *
     * @param resultType نوع کلاس خروجی متد
     * @param root       ریشه
     * @param path       نام فیلد
     * @param <T>        نوع  مسیر ریشه
     * @param <R>        نوع کلاس خروجی
     * @return خروجی: مسیر فیلد مورد نظر
     */
    private <T, R> Path<R> getPath2(Class<R> resultType, Path<T> root, String path) {
        String[] pathElements = path.split("\\.");
        Path<?> retVal = root;
        for (String pathEl : pathElements) {
            retVal = (Path<R>) retVal.get(pathEl);
        }
        return (Path<R>) retVal;


//        String[] pathElements = path.split("\\.");
//        Path<?> retVal = root;
//        if (!path.contains("Collection")) {
//
//            for (String key : pathElements) {
//                retVal = (retVal != null) ? retVal.get(key) : root.get(key);
//                // verify all the mappings are done correctly or this mapping is not supported
//                if (retVal == null) {
//                    //throw exception
//                }
//            }
//        } else {
//            Integer i = 0;
//            for (; i < pathElements.length - 1; i++) {
//                //path = (path != null) ? path.get(keys[i]) : root.get(keys[i]);
//            }
//            Join<Object, Object> roles = root.join(pathElements[pathElements.length-2], JoinType.LEFT);
//            retVal = roles.get(pathElements[pathElements.length-1]);
//
//        }
//        // verify all the mappings are done correctly or this mapping is not supported
//        if (retVal == null) {
//            //throw exception
//        }
//        return  (Path<R>) retVal;


    }
}

package com.motaharinia.msutility.jparepository;

import com.motaharinia.msutility.search.filter.SearchFilterRestrictionModel;
import org.springframework.data.jpa.domain.Specification;

import javax.persistence.criteria.*;
import java.util.ArrayList;
import java.util.List;

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

        //add add criteria to predicates
        for (SearchFilterRestrictionModel searchFilterRestrictionModel : searchFilterRestrictionModelList) {
            Path path = this.getPath(String.class, root, searchFilterRestrictionModel.getFieldName());

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
            }
        }
        return builder.and(predicates.toArray(new Predicate[0]));
    }


    /**
     * این متد برای به دست آوردن مسیر فیلد مورد نظر برای اضافه شدن شرایط میباشد. اگر این متد و path استفاده نشود در اینترفیسهای projection که میخواهیم فیلدی با جنس انتیتی را بخوانیم null pointer خواهیم گرفت
     * https://stackoverflow.com/questions/13246959/jpa-specification-with-onetoone-relation
     *
     * @param resultType نوع کلاس خروجی متد
     * @param root ریشه
     * @param path نام فیلد
     * @param <T> نوع  مسیر ریشه
     * @param <R> نوع کلاس خروجی
     * @return خروجی: مسیر فیلد مورد نظر
     */
    private <T, R> Path<R> getPath(Class<R> resultType, Path<T> root, String path) {
        String[] pathElements = path.split("\\.");
        Path<?> retVal = root;
        for (String pathEl : pathElements) {
            retVal = (Path<R>) retVal.get(pathEl);
        }
        return (Path<R>) retVal;
    }
}

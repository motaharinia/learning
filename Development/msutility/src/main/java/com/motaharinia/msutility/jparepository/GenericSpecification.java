package com.motaharinia.msutility.jparepository;

import com.motaharinia.msutility.search.filter.SearchFilterRestrictionModel;
import org.springframework.data.jpa.domain.Specification;

import javax.persistence.criteria.CriteriaBuilder;
import javax.persistence.criteria.CriteriaQuery;
import javax.persistence.criteria.Predicate;
import javax.persistence.criteria.Root;
import java.util.ArrayList;
import java.util.List;

/**
 * User: https://github.com/motaharinia<br>
 * Date: 2020-06-16<br>
 * Time: 23:27:46<br>
 * Description:<br>
 *     این کلاس جنریک بیلدر لازم برای تمام کلاسهای مربوط به انجام کوئری های پیشرفته دیتابیس را دارا میباشد
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
            System.out.println("GenericSpecification.toPredicate loop searchFilterRestrictionModel:" + searchFilterRestrictionModel.toString());
            switch (searchFilterRestrictionModel.getFieldOperation()) {
                case GREATER_THAN:
                    predicates.add(builder.greaterThan(root.get(searchFilterRestrictionModel.getFieldName()), searchFilterRestrictionModel.getFieldValue().toString()));
                    break;
                case LESS_THAN:
                    predicates.add(builder.lessThan(root.get(searchFilterRestrictionModel.getFieldName()), searchFilterRestrictionModel.getFieldValue().toString()));
                    break;
                case GREATER_THAN_EQUAL:
                    predicates.add(builder.greaterThanOrEqualTo(root.get(searchFilterRestrictionModel.getFieldName()), searchFilterRestrictionModel.getFieldValue().toString()));
                    break;
                case LESS_THAN_EQUAL:
                    predicates.add(builder.lessThanOrEqualTo(root.get(searchFilterRestrictionModel.getFieldName()), searchFilterRestrictionModel.getFieldValue().toString()));
                    break;
                case NOT_EQUAL:
                    predicates.add(builder.notEqual(root.get(searchFilterRestrictionModel.getFieldName()), searchFilterRestrictionModel.getFieldValue().toString()));
                    break;
                case EQUAL:
                    predicates.add(builder.equal(root.get(searchFilterRestrictionModel.getFieldName()), searchFilterRestrictionModel.getFieldValue().toString()));
                    break;
                case MATCH:
                    predicates.add(builder.like(builder.lower(root.get(searchFilterRestrictionModel.getFieldName())), "%" + searchFilterRestrictionModel.getFieldValue().toString().toLowerCase() + "%"));
                    break;
                case MATCH_START:
                    predicates.add(builder.like(builder.lower(root.get(searchFilterRestrictionModel.getFieldName())), searchFilterRestrictionModel.getFieldValue().toString().toLowerCase() + "%"));
                    break;
                case MATCH_END:
                    predicates.add(builder.like(builder.lower(root.get(searchFilterRestrictionModel.getFieldName())), "%" + searchFilterRestrictionModel.getFieldValue().toString().toLowerCase()));
                    break;
                case IN:
                    predicates.add(builder.in(root.get(searchFilterRestrictionModel.getFieldName())).value(searchFilterRestrictionModel.getFieldValue()));
                    break;
                case NOT_IN:
                    predicates.add(builder.not(root.get(searchFilterRestrictionModel.getFieldName())).in(searchFilterRestrictionModel.getFieldValue()));
                    break;
            }
        }
        return builder.and(predicates.toArray(new Predicate[0]));
    }
}

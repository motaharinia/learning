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
            }
        }
        return builder.and(predicates.toArray(new Predicate[0]));
    }


    /**
     * این متد برای به دست آوردن Path فیلد مورد نظر برای اضافه شدن شرایط میباشد. اگر این متد و path استفاده نشود در اینترفیسهای projection که میخواهیم فیلدی با جنس انتیتی را بخوانیم null pointer خواهیم گرفت
     * @param root ریشه انتیتی
     * @param path نام فیلد (در صورت نیاز میتواند چند فیلد درون هم با نقطه از هم جدا شوند)
     * @return خروجی: مقدار path مورد نیاز برای استفاده در شرطها
     */
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

}

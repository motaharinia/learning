package com.motaharinia.msutility.search;

/**
 * Created by IntelliJ IDEA.
 * User: https://github.com/motaharinia
 * Date: 2020-06-16
 * Time: 23:14:13
 * Description: اینترفیس پدر تمامی اینترفیسهای جستجوی پیشرفته دیتابیس که حکم میکند تمام آنها باید متد گتر آی دی را داشته باشند
 * تمام اینترفیسهای جستجوی پیشرفته دیتابیس باید از این اینترفیس گسترش یابند
 */
public interface SearchRowView {

    Integer getId();
    String toOut();

}

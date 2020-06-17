package com.motaharinia.msutility.search;

/**
 * Created by IntelliJ IDEA.
 * User: https://github.com/motaharinia
 * Date: 2020-06-17
 * Time: 12:42:35
 * Description:
 */
public class SearchRowViewTest implements SearchRowView {
Integer id;


    public SearchRowViewTest() {
    }

    public SearchRowViewTest(Integer id) {
        this.id=id;
    }

    @Override
    public String toOut() {
        return "SearchRowViewTest.toOut";
    }

    @Override
    public Integer getId() {
        return this.id;
    }

    String getFirstName() {
        return "Mostafa" + this.id;
    }

    String getLastName() {
        return "Motaharinia"+ this.id;
    }
}

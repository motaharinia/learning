package com.motaharinia.msutility.search.data;

/**
 * User: https://github.com/motaharinia<br>
 * Date: 2020-06-14<br>
 * Time: 20:49:58<br>
 * Description:<br>
 *     کلاس نمونه جهت تست SearchDataModelTests
 */
public class SearchRowViewUserBriefImpl implements SearchRowViewUserBrief {

    private Integer id;

    public SearchRowViewUserBriefImpl(Integer id) {
        this.id=id;
    }


    public SearchRowViewUserBriefImpl() {
    }

    @Override
    public Integer getId() {
        return this.id;
    }

    @Override
    public String getFirstName() {
        return "Mostafa"+this.id;
    }

    @Override
    public String getLastName() {
        return "Motaharinia"+this.id;
    }
}

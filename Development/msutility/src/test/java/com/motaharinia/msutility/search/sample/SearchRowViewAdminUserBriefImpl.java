package com.motaharinia.msutility.search.sample;

/**
 * User: https://github.com/motaharinia<br>
 * Date: 2020-06-14<br>
 * Time: 20:49:58<br>
 * Description:<br>
 *     کلاس نمونه جهت تست SearchDataModelTests
 */
public class SearchRowViewAdminUserBriefImpl implements SearchRowViewAdminUserBrief {

    private Integer id;

    public SearchRowViewAdminUserBriefImpl(Integer id) {
        this.id=id;
    }


    public SearchRowViewAdminUserBriefImpl() {
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

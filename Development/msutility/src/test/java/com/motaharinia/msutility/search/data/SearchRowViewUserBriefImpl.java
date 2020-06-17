package com.motaharinia.msutility.search.data;

/**
 * Created by IntelliJ IDEA.
 * User: https://github.com/motaharinia
 * Date: 2020-06-17
 * Time: 18:09:23
 * Description:
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

package com.motaharinia.presentation.adminuserskill;

public class AdminUserSkillModel {
    /**
     * شناسه
     */
    private Integer id;

    /**
     * عنوان
     */
    private String title;


    /**
     * متد سازنده پیش فرض
     */
    public AdminUserSkillModel() {
    }

    /**
     * متد سازنده که با پارمترهای ورودی مدل را می سازد
     *
     * @param id    شناسه
     * @param title عنوان
     */
    public AdminUserSkillModel(Integer id, String title) {
        this.id = id;
        this.title = title;
    }

    @Override
    public String toString() {
        return "AdminUserSkillModel{" +
                "id=" + id +
                ", title='" + title + '\'' +
                '}';
    }


//getter-setter:

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }
}

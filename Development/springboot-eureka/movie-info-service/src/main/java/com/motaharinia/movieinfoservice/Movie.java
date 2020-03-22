package com.motaharinia.movieinfoservice;

public class Movie {
    private Integer id;
    private String name;
    private String catalog;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getCatalog() {
        return catalog;
    }

    public void setCatalog(String catalog) {
        this.catalog = catalog;
    }

    public Movie(Integer id, String name, String catalog) {
        this.id = id;
        this.name = name;
        this.catalog=catalog;
    }

    public Movie() {
    }
}

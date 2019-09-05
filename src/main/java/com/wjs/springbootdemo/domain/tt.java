package com.wjs.springbootdemo.domain;

import java.util.Date;

public class tt {
    private Integer id;

    private String name;

    private Double pass;

    private Date date;

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
        this.name = name == null ? null : name.trim();
    }

    public Double getPass() {
        return pass;
    }

    public void setPass(Double pass) {
        this.pass = pass;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }
}
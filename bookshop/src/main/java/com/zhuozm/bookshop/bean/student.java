package com.zhuozm.bookshop.bean;

import javafx.scene.chart.Chart;

public class student {
    private String name;
    private Integer age;
    private Chart sex;
    private Long id;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    public Chart getSex() {
        return sex;
    }

    public void setSex(Chart sex) {
        this.sex = sex;
    }
}

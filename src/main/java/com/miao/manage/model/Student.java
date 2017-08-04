package com.miao.manage.model;

import com.miao.manage.common.base.model.Entity;

/**
 * 学生模型
 *
 * @author miaodc
 * @create 2017-07-28 11:33
 */
public class Student extends Entity{

    private Integer id;

    private String name;

    private Integer age;

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

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }
}

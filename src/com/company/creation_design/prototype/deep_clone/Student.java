package com.company.creation_design.prototype.deep_clone;

import java.io.Serializable;

/**
 * @Author zj
 * @Date 2022/4/14
 */
public class Student implements Serializable {
    private String name;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                '}';
    }
}

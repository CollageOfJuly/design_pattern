package com.company.creation_design.prototype.deep_clone;

import java.io.Serializable;

/**
 * @Author zj
 * @Date 2022/4/14
 */
public class School implements Serializable {
    public School() {
        System.out.println("执行了无参构造方法");
    }

    private String name;

    private String address;

    private Student student;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public Student getStudent() {
        return student;
    }

    public void setStudent(Student student) {
        this.student = student;
    }

    @Override
    public String toString() {
        return "School{" +
                "name='" + name + '\'' +
                ", address='" + address + '\'' +
                ", student=" + student +
                '}';
    }
}

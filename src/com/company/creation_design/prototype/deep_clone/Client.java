package com.company.creation_design.prototype.deep_clone;

import com.company.creation_design.prototype.deep_clone.utils.FileUtils;

import java.io.IOException;

/**
 * @Author zj
 * @Date 2022/4/14
 */
public class Client {
    public static void main(String[] args) throws IOException, ClassNotFoundException {
        School school = new School();
        Student student = new Student();
        student.setName("张三");
        school.setStudent(student);
        school.setName("实验中学");
        school.setAddress("鼓楼路12号");
        School copySchool = FileUtils.deepCopy(school);
        copySchool.getStudent().setName("李四");
        System.out.println(school);
        System.out.println(copySchool);
        System.out.println("对象是否一样：" + (school == copySchool)); // false
        System.out.println("对象引用类型变量是否一样：" + (school.getStudent() == copySchool.getStudent())); // false
    }
}

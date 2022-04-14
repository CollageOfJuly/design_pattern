package com.company.creation_design.prototype.shallow_clone;

/**
 * @Author zj
 * @Date 2022/4/14
 */
public class Client {
    public static void main(String[] args) throws CloneNotSupportedException {
        School school = new School();
        Student student = new Student();
        student.setName("张三");
        school.setStudent(student);
        school.setName("实验中学");
        school.setAddress("鼓楼路12号");
        School copySchool = school.clone(); // 克隆方法不执行无参构造方法创建实例
        copySchool.getStudent().setName("李四");
        System.out.println(school);
        System.out.println(copySchool);
        System.out.println("对象是否一样：" + (school == copySchool)); // false
        System.out.println("对象引用类型变量是否一样：" + (school.getStudent() == copySchool.getStudent())); // true
    }
}

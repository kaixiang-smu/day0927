package com.qf.homework7;

public class Teacher {

    private int age;
    private String name;

    // 在老师类定义属性存数多个学生
    private Student[] stuArr;

    public Teacher() {
    }

    public Teacher(int age, String name) {
        this.age = age;
        this.name = name;
    }

    public Teacher(int age, String name, Student[] stuArr) {
        this.age = age;
        this.name = name;
        this.stuArr = stuArr;
    }

    // ----------------------------
    public Student[] getStuArr() {
        return stuArr;
    }

    public void setStuArr(Student[] stuArr) {
        this.stuArr = stuArr;
    }
    // ----------------------------
    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
    // ----------------------------
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }


}

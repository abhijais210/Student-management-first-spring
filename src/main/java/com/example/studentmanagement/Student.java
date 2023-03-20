package com.example.studentmanagement;

public class Student {
    private String name;
    private int rollNo;
    private String age;
    private String mobNo;

    public Student(String name, int rollNo, String age, String mobNo) {
        this.name = name;
        this.rollNo = rollNo;
        this.age = age;
        this.mobNo = mobNo;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getRollNo() {
        return rollNo;
    }

    public void setRollNo(int rollNo) {
        this.rollNo = rollNo;
    }

    public String getAge() {
        return age;
    }

    public void setAge(String age) {
        this.age = age;
    }

    public String getMobNo() {
        return mobNo;
    }

    public void setMobNo(String mobNo) {
        this.mobNo = mobNo;
    }
}

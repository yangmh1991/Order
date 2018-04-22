package com.sort;

public class Student2age2grade {
    int id;
    int age;
    double grade;

    Student2age2grade(int id,int age,double grade){
        this.id=id;
        this.age=age;
        this.grade=grade;
    }

    //id设置与访问
    public void setId(int id){
        this.id = id;
    }
    public int getId(){
        return id;
    }

    //age设置与访问
    public void setAge(int age){
        this.age = age;
    }
    public int getAge(){
        return age;
    }

    //grade设置与访问
    public void setGrade(double grade){
        this.grade = grade;
    }
    public double getGrade(){
        return grade;
    }

    @Override
    public String toString() {
        return ""+id+","+age+","+grade;
    }
}

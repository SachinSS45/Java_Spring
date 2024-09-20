package com.bean;
//Java Bean Class
public class StudentBean implements java.io.Serializable {

    //member variables should be private so that anyone can't access directly
    private String name;
    private int id;
    private String course;
    private int roll;
    //No Arg Constructor

    public StudentBean() { }

    //setter method to set the value
    public void setName(String name){
        this.name = name;
    }

    //getter method to use the value
    public String getName(){
        return name;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getCourse() {
        return course;
    }

    public void setCourse(String course) {
        this.course = course;
    }

    public int getRoll() {
        return roll;
    }

    public void setRoll(int roll) {
        this.roll = roll;
    }
}

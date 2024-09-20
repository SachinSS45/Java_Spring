package com.sachin;

public class Student {
    int roll;
    int id;
    String name;
    String course;

    void registerStudent(int roll,int id,String name,String course){
        this.course = course;
        this.name = name;
        this.id = id;
        this.roll = roll;
        //register code
    }

    @Override
    public String toString() {
        return "Student{" +
                "roll=" + roll +
                ", id=" + id +
                ", name='" + name + '\'' +
                ", course='" + course + '\'' +
                '}';
    }

    public static void main(String[] args) {
        Student s = new Student();
        s.registerStudent(01,1001,"Sachin","Spring Framework");
        //Here it is very hard if we miss any argument to pass it will give problem to us so if we are having more than 3
        //Another if you don't know for example id then it will create problem how you will resolve here no option present
        //You have data more 10 12 then you will not put this much tightly coupled
        //it is very hard to remember index(Order) of variables)
        //for that we have solution i.e Bean class
        System.out.println(s);
    }
}

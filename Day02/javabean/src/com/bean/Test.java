package com.bean;
//client application we will use StudentBean
public class Test {

    void registerStudent(StudentBean studentBean){
        System.out.println(studentBean.getName());
        int i = studentBean.getId();
        System.out.println(i);
    }

    public static void main(String[] args) {
        StudentBean student = new StudentBean();
        student.setName("Sachin");
        student.setId(45);
        Test t = new Test();
        t.registerStudent(student);
    }

}

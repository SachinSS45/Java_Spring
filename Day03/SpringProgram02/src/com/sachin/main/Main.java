package com.sachin.main;

import com.sachin.beans.Student;
import com.sachin.resources.SpringConfigFile;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Main {
    public static void main(String[] args) {

        ApplicationContext context = new AnnotationConfigApplicationContext(SpringConfigFile.class);

        Student std1 = (Student) context.getBean("stdId1");
        std1.display();
        Student std2 = (Student) context.getBean("std2");
        std2.display();
        
    }
}

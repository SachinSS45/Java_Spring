package com.sachin.main;

import com.sachin.beans.Student;
import com.sachin.resources.SpringConfigFile;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {
    public static void main(String[] args) {
        String resource_file_path = "/com/sachin/resources/applicationContext.xml";
        ApplicationContext context = new ClassPathXmlApplicationContext(resource_file_path);

        Student std1 = (Student) context.getBean("student");
        std1.display();

        ApplicationContext context1 = new AnnotationConfigApplicationContext(SpringConfigFile.class);
        Student std2 = (Student) context1.getBean("student");
        std2.display();
    }
}

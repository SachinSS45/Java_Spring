package com.sachin.main;

import com.sachin.beans.Student;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
//ApplicationContext : Interface
//ClassPathXmlApplicationContext : class : it will need xml file location
//getBean method to access object from container
public class Main {
    public static void main(String[] args) {
        String config_loc = "/com/sachin/resources/applicationContext.xml";
        ApplicationContext context = new ClassPathXmlApplicationContext(config_loc);

        Student std1 =(Student) context.getBean("stdID");
        std1.display();
    }
}

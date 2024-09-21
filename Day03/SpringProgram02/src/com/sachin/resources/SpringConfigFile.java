package com.sachin.resources;

import com.sachin.beans.Student;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class SpringConfigFile {
    @Bean
    public Student stdId1(){
        Student std = new Student();
        std.setName("Subramanyam");
        std.setEmail("sbjadhav9028@gmail.com");
        std.setRollno(39);

        return std;
    }

    @Bean("std2")
    public Student setData(){
        Student std = new Student();
        std.setName("Shubham");
        std.setEmail("sgiram2024@gmail.com");
        std.setRollno(27);

        return std;
    }
}

package com.gurjeet.springlearning;

import com.gurjeet.springlearning.config.SpringConfig;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {
    public static void main(String[] args) {

        ApplicationContext context = new AnnotationConfigApplicationContext(SpringConfig.class);

//        Desktop desktop = (Desktop) context.getBean("desktop");
//        desktop.computing();

        Alien alien = (Alien) context.getBean("alien");
        alien.code();

//        ApplicationContext context = new ClassPathXmlApplicationContext("SpringConfg.xml");
//
//        Alien alien = context.getBean("alien", Alien.class);
//        alien.code();
    }
}
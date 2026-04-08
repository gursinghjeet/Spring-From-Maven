package com.gurjeet.springlearning;

import org.springframework.beans.BeansException;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {
    public static void main(String[] args) {

        ApplicationContext context = new ClassPathXmlApplicationContext("SpringConfg.xml");

        Alien alien = context.getBean("alien", Alien.class);
        alien.code();
    }
}
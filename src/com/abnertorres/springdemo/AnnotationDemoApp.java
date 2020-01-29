package com.abnertorres.springdemo;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class AnnotationDemoApp {

    public static void main(String[] args) {

        //Read the spring config
        ClassPathXmlApplicationContext context =
                new ClassPathXmlApplicationContext("applicationContext.xml");

        //Retrieve the beans from a container
        Coach theCoach = context.getBean("thatSillyCoach", Coach.class);

        //Call a method on a bean
        System.out.println(theCoach.getDailyWorkout());

        //Close the context
        context.close();


    }
}

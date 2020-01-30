package com.abnertorres.springdemo;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class AnnotationDemoApp {

    public static void main(String[] args) {

        //Read the spring config
        ClassPathXmlApplicationContext context =
                new ClassPathXmlApplicationContext("applicationContext.xml");

        //Retrieve the beans from a container
        Coach theCoach = context.getBean("tennisCoach", Coach.class);

        //Call a method on a bean
        System.out.println(theCoach.getDailyWorkout());

        //Call the method to get a daily fortune
        System.out.println(theCoach.getDailyFortune());

        //Close the context
        context.close();


    }
}

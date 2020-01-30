package com.abnertorres.springdemo;

import org.springframework.stereotype.Component;

@Component
public class SoccerCoach implements Coach{

    //define a default constructor


    public SoccerCoach() {
        System.out.println(">> SoccerCoach: Inside default constructor");
    }

    @Override
    public String getDailyWorkout() {
        return "Keep the ball close to the body running faster for 10 minutes";
    }

    @Override
    public String getDailyFortune() {
        return null;
    }
}

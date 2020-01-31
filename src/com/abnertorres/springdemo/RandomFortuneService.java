package com.abnertorres.springdemo;

import org.springframework.stereotype.Component;

import java.util.Random;

@Component
public class RandomFortuneService implements FortuneService {

    //create an array of strings
    private String[] data = {
            "Beware of the wolf in sheep's clothing",
            "Diligence is the Mother of good luck",
            "The journey is the reward"
    };

    //Create a number generator
    private Random myRandom = new Random();

    @Override
    public String getFortune() {
        //pick a random string from the array
        int index = myRandom.nextInt(data.length);

        String theFortune = data[index];

        return theFortune;
    }
}

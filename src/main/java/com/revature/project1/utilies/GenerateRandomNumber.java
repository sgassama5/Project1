package com.revature.project1.utilies;

import org.springframework.stereotype.Component;

@Component
public class GenerateRandomNumber {

    public double getRandomNumber(){
        return  Math.random();
    }
}

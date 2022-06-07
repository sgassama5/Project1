package com.revature.project1.utilies;

import org.springframework.stereotype.Component;

@Component
public class CheckNumber {
    public boolean checkNegativeInt(double price) {
        if (price< 0) {
            return false;
        } else {
            return true;
        }
    }
}


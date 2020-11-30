package com.company;

import java.time.*;
import java.util.*;

public class Programmer {
    public String getProgrammerName() {
        return programmerName;
    }
    //default Name
    String programmerName="Josh";

    public String getPreferredLanguage() {
        return preferredLanguage;
    }

    public void setPreferredLanguage(String preferredLanguage) {
        this.preferredLanguage = preferredLanguage;
    }
    //default Programming Language
    String preferredLanguage="Java";

    public void drink(CoffeeMug coffeeMug) {
        Random random = new Random();
        int drinkAmount = random.nextInt(5 - 1) + 1;
        coffeeMug.getMugCoffee().coffeeInOz -= drinkAmount;
        if(coffeeMug.getMugCoffee().coffeeInOz < 0){
            coffeeMug.getMugCoffee().coffeeInOz = 0;
        }
    }

    public Programmer(String programmerName, String preferredLanguage){
        this.programmerName=programmerName;
        this.preferredLanguage=preferredLanguage;
    }
}

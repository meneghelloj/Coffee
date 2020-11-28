package com.company;
import java.util.*;
import java.lang.*;
import java.time.*;

public class Main {

    public static void main(String[] args) {
	// write your code here
        Instant dateNow = Instant.now();
        Instant endOfShift = dateNow.plus(Duration.ofHours(8));
        int coffeeCount = 0;
        Programmer josh = new Programmer("Josh", "Java");
        System.out.println("Hi, I'm " + josh.getProgrammerName() + " and my favorite language is " + josh.getPreferredLanguage());

        CoffeeMug joshsMug = new CoffeeMug(new Coffee(20,0,0));
        while(dateNow.isBefore(endOfShift)){
            dateNow = Instant.now();

            if(!joshsMug.hasCoffee()){
                System.out.println(josh.getProgrammerName() + " sees the cup is empty and makes more coffee.");
                joshsMug.pourCoffee(20);
                coffeeCount++;
                System.out.println(joshsMug.getMugCoffee().getCoffeeInOz() + " oz added!");
                System.out.println("Coffee count: " + coffeeCount);
            }

            Random random = new Random();
            int randomNumber = random.nextInt(40000 - 1000) + 1000;


            try{
                Thread.sleep(randomNumber);
            }catch(Exception e){
            }
            josh.drink(joshsMug);
            System.out.println(josh.getProgrammerName() + " drinks some coffee. It was tasty! Coffee remaining: " + joshsMug.getMugCoffee().getCoffeeInOz() + " oz");
        }
        System.out.println("Shift is over!");
    }
}

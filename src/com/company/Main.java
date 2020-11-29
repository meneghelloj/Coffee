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
        Scanner read = new Scanner(System.in);
        System.out.println("What's your name?");
        String name = read.nextLine();
        System.out.println("What's your favorite programming language?");
        String lang = read.nextLine();
        Programmer programmer = new Programmer(name, lang);
        read.close();

        System.out.println("Hi, I'm " + programmer.getProgrammerName() + " and my favorite language is " + programmer.getPreferredLanguage());

        CoffeeMug programmersMug = new CoffeeMug(new Coffee(20,0,0));
        while(dateNow.isBefore(endOfShift)){
            dateNow = Instant.now();

            if(!programmersMug.hasCoffee()){
                System.out.println(programmer.getProgrammerName() + " sees the cup is empty and makes more coffee.");
                programmersMug.pourCoffee(20);
                coffeeCount++;
                System.out.println(programmersMug.getMugCoffee().getCoffeeInOz() + " oz added!");
                System.out.println("Coffee count: " + coffeeCount);
            }

            Random random = new Random();
            //drinking at random intervals between 1 second and 40 seconds
            int randomNumber = random.nextInt(40000 - 1000) + 1000;


            try{
                //waiting the random interval before drinking another sip of coffee
                Thread.sleep(randomNumber);
            }catch(Exception e){
                System.out.println(e);
            }

            //drinking a random amount of coffee between 1 to 5 oz
            programmer.drink(programmersMug);
            System.out.println(programmer.getProgrammerName() + " drinks some coffee. It was tasty! Coffee remaining: " + programmersMug.getMugCoffee().getCoffeeInOz() + " oz");
        }
        System.out.println("Shift is over! " + programmer.getProgrammerName() + " drank " + coffeeCount + "while working on " + programmer.getPreferredLanguage());
    }
}

package com.company;

public class CoffeeMug {

    Coffee mugCoffee;
    public CoffeeMug(Coffee mugCoffee) {
        this.mugCoffee = mugCoffee;
    }

    public boolean hasCoffee() {
        if (mugCoffee.coffeeInOz > 0) {
            return true;
        } else {
            return false;
        }
    }

    public void pourCoffee(int addedOzOfCoffee) {
        this.mugCoffee.coffeeInOz += addedOzOfCoffee;
    }

    public Coffee getMugCoffee() {
    return mugCoffee;
    }


}

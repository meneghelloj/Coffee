package com.company;

public class Coffee {
    public int getCoffeeInOz() {
        return coffeeInOz;
    }

    public void setCoffeeInOz(int coffeeInOz) {
        this.coffeeInOz = coffeeInOz;
    }

    int coffeeInOz=0;

    public int getSugarPacketCount() {
        return sugarPacketCount;
    }

    public void setSugarPacketCount(int sugarPacketCount) {
        this.sugarPacketCount = sugarPacketCount;
    }

    int sugarPacketCount=0;

    public int getCreamerCount() {
        return creamerCount;
    }

    public void setCreamerCount(int creamerCount) {
        this.creamerCount = creamerCount;
    }

    int creamerCount=0;
    public Coffee(int coffeeInOz, int sugarPacketCount, int creamerCount){
        this.coffeeInOz=coffeeInOz;
        this.sugarPacketCount=sugarPacketCount;
        this.creamerCount=creamerCount;
    }

}

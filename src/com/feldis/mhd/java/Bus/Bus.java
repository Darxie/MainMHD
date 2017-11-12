package com.feldis.mhd.java.bus;

import com.feldis.mhd.java.person.Passenger;
import com.feldis.mhd.java.utils.RandomizeNumberOfPeople;

public class Bus {

    boolean hasEnoughFreeSpace = true;
    public int freeSpace = 100;
    int speed;

    public void moveNextStop(){
        System.out.println("Number of passengers is: " + (100 - freeSpace));
        System.out.println("Moving");
        this.speed = 45;
    }

    public void stop(){
        this.speed = 0;
        System.out.println("Not moving");
    }

    public void getIn(Passenger passenger){
        if (freeSpace < 1){
            this.hasEnoughFreeSpace = false;
            System.out.println("Cannot take more nOfPeople");
            return;
        }
        this.freeSpace--;
    }

    public int getOff() {
        int gettingOff = RandomizeNumberOfPeople.main();
        this.freeSpace += gettingOff;
        if (freeSpace > 100) {
            freeSpace = 100;
        }
        if (freeSpace >= 1) {
            this.hasEnoughFreeSpace = true;
            System.out.println("There are " + freeSpace + " places free in the bus");
        }
        return gettingOff;
    }


}

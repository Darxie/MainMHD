package com.feldis.mhd.java.Bus;

import com.feldis.mhd.java.Person.Passenger;
import com.feldis.mhd.java.utils.RandomizeNumberOfPeople;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;

public class Bus {

    boolean hasEnoughFreeSpace = true;
    public int freeSpace = 100;
    int speed;
    List<Passenger> passengers = new ArrayList<>();

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
        passengers.add(passenger);
    }

    public int getOff() {
        int gettingOff = RandomizeNumberOfPeople.randomTo(100 - freeSpace);
        Iterator<Passenger> iterator = passengers.iterator();
        for (int i = 0; i < gettingOff - 1; i++) {
            iterator.next();
            iterator.remove();
        }
        this.freeSpace += gettingOff;
        if (freeSpace > 100) {
            freeSpace = 100;
        }
        if (freeSpace >= 1) {
            this.hasEnoughFreeSpace = true;
//            System.out.println("There are " + freeSpace + " places free in the bus");
        }
        return gettingOff;
    }


}

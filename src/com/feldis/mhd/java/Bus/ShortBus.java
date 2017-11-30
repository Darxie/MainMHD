package com.feldis.mhd.java.Bus;

import com.feldis.mhd.java.Person.Passenger;
import com.feldis.mhd.java.utils.RandomizeNumberOfPeople;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class ShortBus extends Bus {
    public static List<Passenger> passengers = new ArrayList<>();
    public int freeSpace = 50;

    public int getOff() {
        int gettingOff = RandomizeNumberOfPeople.randomTo(50 - freeSpace);
        Iterator<Passenger> iterator = passengers.iterator();
        for (int i = 0; i < gettingOff - 1; i++) {
            iterator.next();
            iterator.remove();
        }
        this.freeSpace += gettingOff;
        if (freeSpace > 50) {
            freeSpace = 50;
        }
        if (freeSpace >= 1) {
            this.hasEnoughFreeSpace = true;
//            System.out.println("There are " + freeSpace + " places free in the bus");
        }
        return gettingOff;
    }
}
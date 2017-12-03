package com.feldis.mhd.java.Bus;

import com.feldis.mhd.java.Person.Passenger;
import com.feldis.mhd.java.Person.Person;
import com.feldis.mhd.java.utils.RandomizeNumberOfPeople;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Bus {

    public int freeSpace;
    public static List<Person> passengers = new ArrayList<>();
    public int tank;
    public int counter;
    private boolean hasEnoughFreeSpace;
    private int speed;

    public Bus() {
        this.freeSpace = 80;
        this.hasEnoughFreeSpace = true;
        this.tank = 50;
    }

    public Bus(String string) {
        System.out.println("ja som " + string);
        this.freeSpace = 80;
        this.hasEnoughFreeSpace = true;
        this.tank = 50;
    }

    public Bus(boolean isShort) {
        if (isShort) {
            this.freeSpace = 40;
            this.hasEnoughFreeSpace = true;
            this.tank = 40;
        }
    }

    public void moveNextStop(int i) {
        //System.out.println("Number of passengers is: " + (100 - freeSpace));

        this.speed = 45;
        this.tank -= 2;
        if (i == 0) {
            System.out.println("Welcome to the bus, moving to the next stop");
        } else {
            System.out.println("People got off and in, moving to the next stop");
        }
    }

    public void stop() {
        this.speed = 0;
        System.out.println("Stopping");
    }

    //pretazenie metody
    public void stop(boolean isLastStop) {
        if (isLastStop)
            System.out.println("This is the last stop");
        this.speed = 0;
    }

    public void getIn(Passenger passenger) {
        if (freeSpace < 1) {
            this.hasEnoughFreeSpace = false;
            System.out.println("Cannot take more people");
            counter++;
            return;
        }
        this.freeSpace--;
        passengers.add(passenger);
    }

    public int getOff(boolean isShort) {
        int gettingOff = RandomizeNumberOfPeople.randomTo(40 - freeSpace);
        Iterator<Person> iterator = passengers.iterator();
        for (int i = 0; i < gettingOff - 1; i++) {
            iterator.next();
            iterator.remove();
        }
        this.freeSpace += gettingOff;
        if (this.freeSpace > 40) {
            this.freeSpace = 40;
        }
        if (freeSpace > 0) {
            this.hasEnoughFreeSpace = true;
//            System.out.println("There are " + freeSpace + " places free in the bus");
        }
        return gettingOff;
    }

    public int getOff() {
        int gettingOff = RandomizeNumberOfPeople.randomTo(80 - freeSpace);
        Iterator<Person> iterator = passengers.iterator();
        for (int i = 0; i < gettingOff - 1; i++) {
            iterator.next();
            iterator.remove();
        }
        this.freeSpace += gettingOff;
        if (freeSpace > 80) {
            freeSpace = 80;
        }
        if (freeSpace >= 1) {
            this.hasEnoughFreeSpace = true;
//            System.out.println("There are " + freeSpace + " places free in the bus");
        }
        return gettingOff;
    }
}

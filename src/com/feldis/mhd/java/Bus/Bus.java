package com.feldis.mhd.java.Bus;

import com.feldis.mhd.java.Person.Passenger;
import com.feldis.mhd.java.Person.Person;

public class Bus {

    boolean hasEnoughFreeSpace = true;
    int freeSpace = 50;
    int speed;

    public void moveNextStop(){
        System.out.println("Number of passengers is: " + (50-freeSpace));
        System.out.println("");
        this.speed = 45;
    }

    public void stop(){
        this.speed = 0;
    }

    public void getIn(Passenger passenger){
        this.freeSpace--;
        if (freeSpace < 1){
            this.hasEnoughFreeSpace = false;
            System.out.println("Cannot take more nOfPeople");
        }
    }

    public void getOff(Passenger passenger){

    }


}

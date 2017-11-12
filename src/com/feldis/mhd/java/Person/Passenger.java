package com.feldis.mhd.java.person;

import com.feldis.mhd.java.bus.Bus;
import com.feldis.mhd.java.nameList.RandomNameGenerator;

public class Passenger extends Person {
    public String name;

    public Passenger(){
        this.name = RandomNameGenerator.funkcia();
    }

    public static void createPassengers(int number, Bus bus) {
        for(int i=0; i<number;i++){
            //Passenger passenger = new Passenger();
            bus.getIn(new Passenger());
        }
    }
}

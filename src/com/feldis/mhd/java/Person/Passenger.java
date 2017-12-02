package com.feldis.mhd.java.Person;

import com.feldis.mhd.java.Bus.Bus;
import com.feldis.mhd.java.NameList.RandomNameGenerator;

public class Passenger extends Person {

    public Passenger() {
        this.nameOfPerson = RandomNameGenerator.funkcia();
    }

    public static void createPassengers(int number, Bus bus) {
        for (int i = 0; i < number; i++) {
            //Passenger passenger = new Passenger();
            bus.getIn(new Passenger());
        }
    }
}

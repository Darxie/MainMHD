package com.feldis.mhd.java.Person;

import com.feldis.mhd.java.NameList.RandomNameGenerator;

public class BusDriver extends Person {

    private static int counter = 0;

    public BusDriver() {
        boolean isBusDriver = true;
        counter++;
        this.nameOfPerson = RandomNameGenerator.funkcia();
    }

    public static int numberOfAvailableDrivers() {
        return counter;
    }


}
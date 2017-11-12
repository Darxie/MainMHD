package com.feldis.mhd.java.person;

import com.feldis.mhd.java.nameList.RandomNameGenerator;

public class BusDriver extends Person{

    private boolean isBusDriver;
    private static int counter = 0;
    private String name;

    public BusDriver() {
        super();
        isBusDriver = true;
        counter++;
        this.name = RandomNameGenerator.funkcia();
    }

    public static int numberOfAvailableDrivers() {
        return counter;
    }

    public static void main(String[] args) {

        BusDriver prvy = new BusDriver();
        BusDriver druhy = new BusDriver();
        BusDriver treti = new BusDriver();
        System.out.println(prvy.name);
        System.out.println(druhy.isBusDriver + " " + druhy.name);
        System.out.println(numberOfAvailableDrivers());
    }
}
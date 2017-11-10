package com.feldis.mhd.java.Person;

public class BusDriver extends Person{

    private boolean isBusDriver;
    private static int counter = 0;

    private BusDriver(){
        isBusDriver = true;
        counter++;
    }

    public static int numberOfAvailableDrivers() {
        return counter;
    }

    public static void main(String[] args) {

        BusDriver prvy = new BusDriver();
        BusDriver druhy = new BusDriver();
    }
}
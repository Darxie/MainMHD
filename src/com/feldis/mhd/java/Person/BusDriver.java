package com.feldis.mhd.java.Person;

public class BusDriver extends Person{

    boolean isBusDriver = true;
    private static int counter;

    private BusDriver(){
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
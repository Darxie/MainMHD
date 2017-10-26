package com.feldis.mhd.java.Person;

public class BusDriver {


    private String name;

    public static void main(String[] args) {

        BusDriver prvy = new BusDriver();
        prvy.name = Person.nameOfPerson;
        System.out.println(prvy.name);

    }
}
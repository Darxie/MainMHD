package com.feldis.mhd.java.Person;

import com.feldis.mhd.java.NameList.RandomNameGenerator;

public class Passenger extends Person {
    public String name;

    public Passenger(){
        this.name = RandomNameGenerator.funkcia();
    }

    public static void createPassengers(int number){
        for(int i=0; i<number;i++){
            Passenger passenger = new Passenger();
        }
    }
}

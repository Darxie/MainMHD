package com.feldis.mhd.java.utils;

import com.feldis.mhd.java.BusStop.BusStop;

public class CreateBusStops {

    public static void main(String[] args) {

        BusStop Karadzicova = new BusStop(10,20, RandomizeNumberOfPeople.main());
        BusStop Slovnaftska = new BusStop(35,-40, RandomizeNumberOfPeople.main());
        BusStop Botanicka = new BusStop(100,72, RandomizeNumberOfPeople.main());
        BusStop Gagarinova = new BusStop(39,153, RandomizeNumberOfPeople.main());
        BusStop Tovarenska = new BusStop(-77,12, RandomizeNumberOfPeople.main());
        BusStop Mudronova = new BusStop(84,44, RandomizeNumberOfPeople.main());
        BusStop Lafranconi = new BusStop(243,142, RandomizeNumberOfPeople.main());
        BusStop Kuliskova = new BusStop(96,22, RandomizeNumberOfPeople.main());
        BusStop Alexyho = new BusStop(2, 10, RandomizeNumberOfPeople.main());
        BusStop Vysoka = new BusStop(-46,-23, RandomizeNumberOfPeople.main());
        BusStop Postova = new BusStop(51,40, RandomizeNumberOfPeople.main());

        System.out.println(Lafranconi.posX + " " + Lafranconi.posY + " " + Lafranconi.people);
        System.out.println(Gagarinova.posX + " " + Gagarinova.posY + " " + Gagarinova.people);
        System.out.println(Kuliskova.posX + " " + Kuliskova.posY + " " + Kuliskova.people);
        System.out.println(Slovnaftska.posX + " " + Slovnaftska.posY + " " + Slovnaftska.people);
    }
}

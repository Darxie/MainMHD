package com.feldis.mhd.java.utils;

import com.feldis.mhd.java.BusStop.BusStop;

import static com.feldis.mhd.java.utils.CalculateDistance.distance;

public class CreateBusStops {

    public static BusStop[] CreateBusStops(int linka) {

        BusStop Karadzicova = new BusStop(10,20, RandomizeNumberOfPeople.main(), "Karadzicova");
        BusStop Slovnaftska = new BusStop(35,-40, RandomizeNumberOfPeople.main(), "Slovnaftska");
        BusStop Botanicka = new BusStop(100,72, RandomizeNumberOfPeople.main(), "Botanicka");
        BusStop Gagarinova = new BusStop(39,153, RandomizeNumberOfPeople.main(), "Gagarinova");
        BusStop Tovarenska = new BusStop(-77,12, RandomizeNumberOfPeople.main(), "Tovarenska");
        BusStop Mudronova = new BusStop(84,44, RandomizeNumberOfPeople.main(), "Mudronova");
        BusStop Lafranconi = new BusStop(243,142, RandomizeNumberOfPeople.main(), "Lafranconi");
        BusStop Kuliskova = new BusStop(96,22, RandomizeNumberOfPeople.main(), "Kuliskova");
        BusStop Alexyho = new BusStop(2, 10, RandomizeNumberOfPeople.main(), "Alexyho");
        BusStop Vysoka = new BusStop(-46,-23, RandomizeNumberOfPeople.main(), "Vysoka");
        BusStop Postova = new BusStop(51,40, RandomizeNumberOfPeople.main(), "Postova");

        if (linka == 30) {
            return new BusStop[]{Gagarinova, Karadzicova, Mudronova, Botanicka, Slovnaftska};
        }

        if (linka == 50) {
            return new BusStop[]{Postova, Vysoka, Alexyho, Tovarenska, Kuliskova};
        }


        //System.out.println(Lafranconi.posX + " " + Lafranconi.posY + " " + Lafranconi.nOfPeople);
        //System.out.println(Gagarinova.posX + " " + Gagarinova.posY + " " + Gagarinova.nOfPeople);

        System.out.println(distance(Kuliskova.posX,Kuliskova.posY,Lafranconi.posX,Lafranconi.posY));

        //System.out.println(new Timer(Kuliskova,Lafranconi).time);

        return new BusStop[]{};
    }
}
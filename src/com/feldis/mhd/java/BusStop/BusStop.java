package com.feldis.mhd.java.BusStop;

import com.feldis.mhd.java.BusLines.BusLine;
import com.feldis.mhd.java.BusLines.Line;

public class BusStop {
    //bus stops are created using the CreateBusStops() method

    public int posX;
    public int posY;
    public int people;
    public String name;

    public BusStop(int x, int y, int nOfPeople, String name) {

        this.posX = x;
        this.posY = y;
        this.people = nOfPeople;
        this.name = name;
    }

    public String toString(){
        return name;
    }

}

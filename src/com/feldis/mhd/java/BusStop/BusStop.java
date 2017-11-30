package com.feldis.mhd.java.BusStop;

public class BusStop {
    //bus stops are created using the CreateBusStops() method

    public int posX;
    public int posY;
    public int nOfPeople;
    public String name;

    public BusStop(int x, int y, int nOfPeople, String name) {

        this.posX = x;
        this.posY = y;
        this.nOfPeople = nOfPeople;
        this.name = name;
    }

    public String toString() {
        return name;
    }

}

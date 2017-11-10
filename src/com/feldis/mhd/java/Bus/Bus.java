package com.feldis.mhd.java.Bus;

import com.feldis.mhd.java.BusStop.BusStop;

public class Bus {

    boolean hasEnoughFreeSpace;
    int freeSpace = 50;
    int speed;

    public void moveNextStop(){
        System.out.println("Pocet ludi v autobuse je: " + (50-freeSpace));
        System.out.println("");
        this.speed = 45;
    }

    public void stop(){

    }



}

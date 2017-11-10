package com.feldis.mhd.java.Timer;

import com.feldis.mhd.java.BusStop.BusStop;

import static com.feldis.mhd.java.utils.CalculateDistance.distance;

public class Timer {
    //todo create a timer which will add time according to the distance between the bus stops.
    public double time = 0;

    public Timer(BusStop stop, BusStop busStop){
        this.time += distance(stop.posX, stop.posY, busStop.posX, busStop.posY)*1.5;
    }
}

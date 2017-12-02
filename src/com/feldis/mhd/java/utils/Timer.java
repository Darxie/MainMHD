package com.feldis.mhd.java.utils;

import com.feldis.mhd.java.BusStop.BusStop;

import static com.feldis.mhd.java.utils.CalculateDistance.distance;

public class Timer {

    public double time = 0;
    private final double c = 3.5; //final

    public Timer() {

    }

    public void addTime(int time) {
        this.time += time;
    }

    public void addTime(BusStop stop, BusStop busStop) {
        this.time += distance(stop.posX, stop.posY, busStop.posX, busStop.posY) * c;
    }
}

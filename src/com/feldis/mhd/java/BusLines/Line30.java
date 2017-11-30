package com.feldis.mhd.java.BusLines;

import com.feldis.mhd.java.BusStop.BusStop;
import com.feldis.mhd.java.utils.CreateBusStops;

import java.util.Arrays;

public class Line30 extends BusLine {

    public Line30() {
        BusStop[] busStops = CreateBusStops.CreateBusStops(30);
        createLine30(busStops);
        //System.out.println(Arrays.toString(Line30.line.toArray()));
        //System.out.println(getFirstStop());
    }

    public void createLine30(BusStop... busStop) {
        line.addAll(Arrays.asList(busStop));
    }
}
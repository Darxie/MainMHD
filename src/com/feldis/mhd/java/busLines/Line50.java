package com.feldis.mhd.java.busLines;

import com.feldis.mhd.java.busStop.BusStop;
import com.feldis.mhd.java.utils.CreateBusStops;

import java.util.Arrays;

public class Line50 extends BusLine {

    public Line50() {
        BusStop[] busStops = CreateBusStops.CreateBusStops(50);
        createLine50(busStops);

        System.out.println(Arrays.toString(Line30.line.toArray()));
        System.out.println(getFirstStop());
    }

    public void createLine50(BusStop... busStop) {
        line.addAll(Arrays.asList(busStop));
    }
}

package com.feldis.mhd.java.BusLines;

import com.feldis.mhd.java.BusStop.BusStop;
import com.feldis.mhd.java.utils.CreateBusStops;

import java.util.ArrayList;
import java.util.Arrays;

public class Line30 extends BusLine{


    public void createLine30(BusStop... busStop){
        this.line.addAll(Arrays.asList(busStop));
    }

    public Line30() {
        Line30 line30 = new Line30();
        CreateBusStops.main(".");
        line30.createLine30(Gagarinova, Karadzicova, Mudronova, Botanicka, Slovnaftska);

        System.out.println(Arrays.toString(Line30.line.toArray()));
        System.out.println(line30.getFirstStop());
    }
}
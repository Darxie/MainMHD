package com.feldis.mhd.java.busLines;

import com.feldis.mhd.java.busStop.BusStop;

import java.util.ArrayList;
import java.util.Arrays;

public class BusLine {

    public static ArrayList<BusStop> line = new ArrayList<>();

    public void createLine(BusStop... busStop){
        line.addAll(Arrays.asList(busStop));
    }
    public BusStop getFirstStop(){
        return line.get(0);
    }
}

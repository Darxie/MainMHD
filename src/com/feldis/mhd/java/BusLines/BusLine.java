package com.feldis.mhd.java.BusLines;

import com.feldis.mhd.java.BusStop.BusStop;

import java.util.ArrayList;
import java.util.Arrays;

public class BusLine {

    public static ArrayList<BusStop> line = new ArrayList<>();

    public void createLine(BusStop... busStop) {
        line.addAll(Arrays.asList(busStop));
    }

    public BusStop getFirstStop() {
        return line.get(0);
    }
}

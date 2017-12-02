package com.feldis.mhd.java.Events;

import com.feldis.mhd.java.utils.EventOccurrenceRandomizer;
import com.feldis.mhd.java.utils.Timer;

public class TrafficJam {
    //ToDo add time if jam occurs, make event occurrence randomizer

    public static void Traffic(Timer timer) {

        int t = EventOccurrenceRandomizer.randomizer() * 20;
        if (EventOccurrenceRandomizer.randomizer() == 4) {
            timer.addTime(t);
            System.out.println("-----------------------------");
            System.out.println("There is a traffic jam. " + t + " seconds have been added to the total time");
            System.out.println("-----------------------------");
        }
    }
}

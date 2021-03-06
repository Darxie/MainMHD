package com.feldis.mhd.java.Events;

import com.feldis.mhd.java.Person.BusDriver;
import com.feldis.mhd.java.Person.Person;
import com.feldis.mhd.java.utils.EventOccurrenceRandomizer;
import com.feldis.mhd.java.utils.Timer;

import java.util.List;

/* Invokes the random accident event. The chance of accident is 1:6 atm.
    Iterates the polymorphic people that are in the bus and adds time.
 */

public class Accident {

    public static void accident(Timer timer, List<Person> list, BusDriver busDriver) {
        int t = EventOccurrenceRandomizer.randomizer() * 20;
        if (EventOccurrenceRandomizer.randomizer() == 3) {
            for (Person p : list) {
                p.die();
            }
            timer.addTime(t);
            System.out.println("The bus has crashed! Wait for our bees to repair it and then it will continue");
            busDriver.die();
        }
    }
}

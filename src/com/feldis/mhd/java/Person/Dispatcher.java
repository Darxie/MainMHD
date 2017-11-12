package com.feldis.mhd.java.Person;

import com.feldis.mhd.java.Bus.Bus;
import com.feldis.mhd.java.BusLines.Line30;
import com.feldis.mhd.java.Timer.Timer;

import java.util.Scanner;

public class Dispatcher {

    public Dispatcher() {
        System.out.println("Choose (type) the line you want to follow : 30 or 50");
        Scanner in = new Scanner(System.in);
        int num = in.nextInt();
        if (num == 30) {
            new Line30();
            Bus bus = new Bus();
            BusDriver jozi = new BusDriver();
            Timer timer = new Timer();
            for (int i = 0; i < Line30.line.size(); i++) {
                //todo EVERYTHING flow
                if (i < Line30.line.size() - 1) {
                    timer.addTime(Line30.line.get(i), Line30.line.get(i + 1));
                }
                int getOff = 0;
                if (i > 0) {
                    bus.stop();
                    getOff = bus.getOff();
                }
                System.out.println("Stojim na zastavke: " + Line30.line.get(i).name);
                Passenger.createPassengers(Line30.line.get(i).nOfPeople, bus);
                System.out.println("Nastupilo " + Line30.line.get(i).nOfPeople + " ludi");
                System.out.println("Vystupilo " + getOff + " ludi");
                System.out.println("V autobuse je este volnych: " + bus.freeSpace + " miest");
                if (i == Line30.line.size() - 1) {
                    System.out.println("Posledna zastavka");
                    return;
                }
                bus.moveNextStop();
                System.out.println("elapsed time " + timer.time);
                System.out.println("--------------------");

            }
        }
    }

}

package com.feldis.mhd.java.person;

import com.feldis.mhd.java.bus.Bus;
import com.feldis.mhd.java.busLines.Line30;

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
            for (int i = 0; i < Line30.line.size(); i++) {
                //todo EVERYTHING flow
                if (i > 0) {
                    bus.stop();
                    bus.getOff();
                }
                System.out.println("Stojim na zastavke: " + Line30.line.get(i).name);
                Passenger.createPassengers(Line30.line.get(i).nOfPeople, bus);
                System.out.println("Nastupilo " + Line30.line.get(i).nOfPeople + " ludi");
                System.out.println("Vystupilo " + bus.getOff() + " ludi");
                System.out.println("V autobuse je este volnych: " + bus.freeSpace + " miest");
                if (i == Line30.line.size() - 1) {
                    System.out.println("Posledna zastavka");
                    return;
                }
                bus.moveNextStop();
                System.out.println("--------------------");
            }
        }
    }

}

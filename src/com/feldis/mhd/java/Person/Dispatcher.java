package com.feldis.mhd.java.Person;

import com.feldis.mhd.java.Bus.Bus;
import com.feldis.mhd.java.Bus.ShortBus;
import com.feldis.mhd.java.BusLines.Line30;
import com.feldis.mhd.java.BusLines.Line50;
import com.feldis.mhd.java.BusStop.BusStop;
import com.feldis.mhd.java.Timer.Timer;

import java.util.ArrayList;
import java.util.Objects;
import java.util.Scanner;

public class Dispatcher extends Person {

    public Dispatcher() throws InterruptedException {
        System.out.println("Choose (type) the line you want to follow : 30 or 50");
        Scanner in = new Scanner(System.in);
        int num = in.nextInt();
        if (num == 30) {
            new Line30();
            //todo let user select bus
            Bus bus = new Bus("autobus linky 30");
            BusDriver jozi = new BusDriver();
            Timer timer = new Timer();
            flow(Line30.line, timer, bus);
        }
        if (num == 50) {
            new Line50();
            Bus bus = new ShortBus();
            BusDriver busDriver = new BusDriver();
            Timer timer = new Timer();
            flow(Line50.line, timer, bus);
        }
                /*if (i < Line30.line.size() - 1) {
                    useTimer(timer, i);
                }
                int getOff = 0;
                if (i > 0) {
                    bus.stop();
                    getOff = bus.getOff();
                }
                flow(Line30.line, i, timer, bus);

                System.out.println("Stojim na zastavke: " + Line30.line.get(i).name);
                Passenger.createPassengers(Line30.line.get(i).nOfPeople, bus);
                sleep();
                System.out.println("Nastupilo " + Line30.line.get(i).nOfPeople + " ludi");
                sleep();
                /*if (i > 0) {
                    System.out.println("Vystupilo " + getOff + " ludi");
                }
                sleep();
                System.out.println("V autobuse je este volnych: " + bus.freeSpace + " miest");
                if (i == Line30.line.size() - 1) {
                    System.out.println("Posledna zastavka");
                    return;
                }
                bus.moveNextStop();
                sleep();
                System.out.println("elapsed time " + timer.time);
                System.out.println("Do you want to print the names of the people in the bus?");
                Scanner scanner = new Scanner(System.in);
                String anonie = in.next();
                if (Objects.equals(anonie, "yes")) {
                    for (Passenger p : Bus.passengers) {
                        System.out.println(p.name);
                    }
                } else continue;

                System.out.println("--------------------");

            }*/
                /*if (num == 50) {
                new Line50();
                Bus buss = new Bus();
                BusDriver pista = new BusDriver();
                Timer timer = new Timer();
                for (int i = 0; i < Line50.line.size(); i++) {
                    //todo EVERYTHING flow
                    if (i < Line50.line.size() - 1) {
                        timer.addTime(Line50.line.get(i), Line50.line.get(i + 1));
                    }
                    int getOff = 0;
                    if (i > 0) {
                        buss.stop();
                        getOff = buss.getOff();
                    }
                    System.out.println("Stojim na zastavke: " + Line50.line.get(i).name);
                    Passenger.createPassengers(Line50.line.get(i).nOfPeople, buss);
                    System.out.println("Nastupilo " + Line50.line.get(i).nOfPeople + " ludi");
                    System.out.println("Vystupilo " + getOff + " ludi");
                    System.out.println("V autobuse je este volnych: " + buss.freeSpace + " miest");
                    if (i == Line50.line.size() - 1) {
                        System.out.println("Posledna zastavka");
                        return;
                    }
                    buss.moveNextStop();
                    System.out.println("elapsed time " + timer.time);
                    System.out.println("--------------------");

                }
            }*/


    }

    public static void useTimer(Timer timer, int i) {
        timer.addTime(Line30.line.get(i), Line30.line.get(i + 1));
    }

    void sleep() throws InterruptedException {
        Thread.sleep(1000);
    }

    void flow(ArrayList<BusStop> line, Timer timer, Bus bus) throws InterruptedException {
        for (int i = 0; i < Line30.line.size(); i++) {
            if (i < Line30.line.size() - 1) {
                useTimer(timer, i);
            }
            if (i == Line30.line.size() - 1) {
                System.out.println(" Nasleduje posledna zastavka");
            }
            System.out.println("Stojim na zastavke: " + Line30.line.get(i).name);
            int getOff;
            if (i > 0) {
                bus.stop();
                getOff = bus.getOff();
                System.out.println("Vystupilo " + getOff + " ludi");
            }
            sleep();
            Passenger.createPassengers(Line30.line.get(i).nOfPeople, bus);
            sleep();
            System.out.println("Nastupilo " + Line30.line.get(i).nOfPeople + " ludi");
            sleep();
            System.out.println("V autobuse je este volnych: " + bus.freeSpace + " miest");
            sleep();
            System.out.println("elapsed time " + timer.time);
            Scanner scanner = new Scanner(System.in);
            System.out.println("Do you want to print the names of the people in the bus?");
            String anonie = scanner.next();
            if (Objects.equals(anonie, "yes")) {
                for (Passenger p : Bus.passengers) {
                    System.out.println(p.name);
                }
            }
            sleep();
            bus.moveNextStop();
            System.out.println("--------------------");
            sleep();

        }
    }
}
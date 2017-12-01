package com.feldis.mhd.java.Person;

import com.feldis.mhd.java.Bus.Bus;
import com.feldis.mhd.java.Bus.ShortBus;
import com.feldis.mhd.java.BusLines.Line30;
import com.feldis.mhd.java.BusLines.Line50;
import com.feldis.mhd.java.BusStop.BusStop;
import com.feldis.mhd.java.NameList.RandomNameGenerator;
import com.feldis.mhd.java.utils.Timer;

import java.util.ArrayList;
import java.util.Objects;
import java.util.Scanner;

public class Dispatcher extends Person {
    //public String name = nameOfPerson;

    public Dispatcher() throws InterruptedException {
        this.nameOfPerson = RandomNameGenerator.funkcia();
        System.out.println("Choose (type in) the line you want to follow : 30 or 50");
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
    }

    private static void useTimer(Timer timer, int i) {
        timer.addTime(Line30.line.get(i), Line30.line.get(i + 1));
    }

    private String refactorTime(double totalSecs) {
        int hours = (int) (totalSecs / 3600);
        int minutes = (int) ((totalSecs % 3600) / 60);
        int seconds = (int) (totalSecs % 60);

        return String.format("%02dh %02dmin %02ds", hours, minutes, seconds);
    }

    private void sleep() throws InterruptedException {
        Thread.sleep(1000);
    }

    private void flow(ArrayList<BusStop> line, Timer timer, Bus bus) throws InterruptedException {
        for (int i = 0; i < Line30.line.size(); i++) {
            for (int j = 1; j < Line30.line.size() - 1; j++) {
                useTimer(timer, j);
            }
            //if (i < Line30.line.size() - 1) {
            //  useTimer(timer, i);
            //}
            if (i == Line30.line.size() - 1) {
                //System.out.println("The next stop is the terminal");
                bus.stop(true);
                sleep();
            }
            System.out.println("The actual stop is: " + Line30.line.get(i).name);
            sleep();
            int getOff;
            if (i > 0) {
                bus.stop();
                getOff = bus.getOff();
                System.out.println(getOff + " People got off the bus");
            }
            sleep();
            Passenger.createPassengers(Line30.line.get(i).nOfPeople, bus);
            sleep();
            System.out.println(Line30.line.get(i).nOfPeople + " people got into the bus");
            sleep();
            System.out.println("Free space in the bus: " + bus.freeSpace + " places");
            sleep();
            System.out.println("elapsed time " + refactorTime(Math.round(timer.time * 100) / 100));
            Scanner scanner = new Scanner(System.in);
            System.out.println("Do you want to print the names of the people in the bus? yes/no");
            String anonie = scanner.next();
            if (Objects.equals(anonie, "yes")) {
                for (Passenger p : Bus.passengers) {
                    System.out.println(p.name);
                }
            }
            sleep();
            if (i < Line30.line.size() - 1)
                bus.moveNextStop();
            System.out.println("--------------------");
            sleep();

        }
    }
}
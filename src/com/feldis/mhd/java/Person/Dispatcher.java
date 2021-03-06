package com.feldis.mhd.java.Person;

import com.feldis.mhd.java.Bus.Bus;
import com.feldis.mhd.java.BusLines.BusLine;
import com.feldis.mhd.java.BusLines.Line30;
import com.feldis.mhd.java.BusLines.Line50;
import com.feldis.mhd.java.BusStop.BusStop;
import com.feldis.mhd.java.Events.Accident;
import com.feldis.mhd.java.Events.TrafficJam;
import com.feldis.mhd.java.NameList.RandomNameGenerator;
import com.feldis.mhd.java.utils.Timer;

import java.util.ArrayList;
import java.util.Objects;
import java.util.Scanner;

import static com.feldis.mhd.java.Bus.Bus.passengers;

public class Dispatcher extends Person {
    //public String name = nameOfPerson;

    public Dispatcher() throws InterruptedException {
        this.nameOfPerson = RandomNameGenerator.funkcia();
        System.out.println("Name of dispatcher: " + this.nameOfPerson);
        System.out.println("Dispatcher says: Choose (type in) the line you want to follow : 30 or 50");
        Scanner in = new Scanner(System.in);
        int num = in.nextInt();
        if (num == 30) {
            new Line30();
            //todo let user select bus
            Bus bus = new Bus("autobus linky 30");
            BusDriver bd = new BusDriver();
            System.out.println("Name of bus driver: " + bd.nameOfPerson);
            System.out.println("--------------------");
            Timer timer = new Timer();
            flow(Line30.line, timer, bus, 30, bd);
        }
        if (num == 50) {
            new Line50();
            Bus bus = new Bus(true);
            Person busDriver = new BusDriver();
            System.out.println("Name of bus driver: " + busDriver.nameOfPerson);
            System.out.println("--------------------");
            Timer timer = new Timer();
            flow(Line50.line, timer, bus, 50, (BusDriver) busDriver); //downcast
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

    private void flow(ArrayList<BusStop> line, Timer timer, Bus bus, int num, BusDriver busDriver) throws InterruptedException {
        for (int i = 0; i < BusLine.line.size(); i++) {
            for (int j = 1; j < BusLine.line.size() - 1; j++) {
                useTimer(timer, j);
            }
            TrafficJam.Traffic(timer);
            Accident.accident(timer, Bus.passengers, busDriver);
            //if (i < Line30.line.size() - 1) {
            //  useTimer(timer, i);
            //}
            if (i == BusLine.line.size() - 1) {
                //System.out.println("The next stop is the terminal");
                bus.stop(true);
                sleep();
            }
            System.out.println("The actual stop is: " + Line30.line.get(i).name);
            sleep();
            int getOff;
            if (passengers.size() != 0)
                if ((i > 0) && (num == 30)) {
                    bus.stop();
                    getOff = bus.getOff();
                    System.out.println(getOff + " People got off the bus");
                }
            if (passengers.size() != 0)
                if ((i > 0) && (num == 50)) {
                    bus.stop();
                    getOff = bus.getOff(true);
                    System.out.println(getOff + " People got off the bus");
                }
            sleep();
            if (i < BusLine.line.size() - 1) {
                Passenger.createPassengers(BusLine.line.get(i).nOfPeople, bus);
            }
            Accountant.addMoneyToChest(BusLine.line.get(i).nOfPeople);
            sleep();
            System.out.println((BusLine.line.get(i).nOfPeople - bus.counter) + " people got into the bus");
            sleep();
            System.out.println("Free space in the bus: " + bus.freeSpace + " places");
            sleep();
            System.out.println("elapsed time " + refactorTime(Math.round(timer.time * 100) / 100));
            Scanner scanner = new Scanner(System.in);
            System.out.println("Do you want to print the names of the people in the bus? yes/no");
            String anonie = scanner.next();
            if (Objects.equals(anonie, "yes")) {
                for (Person p : Bus.passengers) {
                    System.out.print(p.nameOfPerson + " ");
                }
                System.out.println("");
            }
            sleep();
            if (i < BusLine.line.size() - 1)
                bus.moveNextStop(i);

            System.out.println("--------------------");
            sleep();
            bus.counter = 0;
        }
        System.out.println("Thank you for using our services.");
        System.out.println("STATUS:");
        System.out.println("Money from passengers: " + Math.round((Accountant.chest * 100 / 100)) + "eur");
        System.out.println("Final status of tank: " + bus.tank);
    }

    @Override
    public void die() {
        System.out.println("The person" + this.nameOfPerson + "died");
    }
}
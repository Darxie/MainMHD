package com.feldis.mhd.java.Person;

import com.feldis.mhd.java.NameList.RandomNameGenerator;

public class Accountant extends Person {

    private static final double ticketPrice = 0.70;
    public static double chest;


    public Accountant() {
        this.nameOfPerson = RandomNameGenerator.funkcia();
    }

    public static void addMoneyToChest(int number) {
        for (int i = 0; i < number; i++) {
            chest += ticketPrice;
        }
    }

    @Override
    public void die() {
        System.out.println("The person" + this.nameOfPerson + "died");
    }
}

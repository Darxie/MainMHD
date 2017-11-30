package com.feldis.mhd.java.utils;

import java.util.Random;

public class RandomizeNumberOfPeople {

    public static int main() {
        int r = (int) (Math.random() * (45 - 4)) + 4; //random number of nOfPeople between 4 and 45
        return r;
    }

    public static int randomTo(int max) {
        Random random = new Random();
        return random.nextInt(max);
    }
}

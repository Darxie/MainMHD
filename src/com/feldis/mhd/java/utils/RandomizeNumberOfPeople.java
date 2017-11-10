package com.feldis.mhd.java.utils;

public class RandomizeNumberOfPeople {

    public static int main() {
            int r = (int) (Math.random() * (45 - 4)) + 4; //random number of nOfPeople between 4 and 45
            return r;
        }
    }

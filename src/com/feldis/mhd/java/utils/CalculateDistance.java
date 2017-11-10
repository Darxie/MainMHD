package com.feldis.mhd.java.utils;

import static java.lang.Math.sqrt;

public class CalculateDistance {

    public static double distance(int posX1, int posY1, int posX2, int posY2){
        return sqrt((posX2-posX1)*(posX2-posX1) + (posY2-posY1)*(posY2-posY1));
    }
}
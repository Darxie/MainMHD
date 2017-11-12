package com.feldis.mhd.java.nameList;

public class RandomNameGenerator {

    public static String funkcia() {

        int index = (int) (Math.random() * NameList.names.length);
        return NameList.names[index];
    }
}

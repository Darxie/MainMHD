package com.feldis.mhd.java.Person;

import com.feldis.mhd.java.NameList.RandomNameGenerator;

public abstract class Person implements Die {

    String nameOfPerson;

    public Person() {
        this.nameOfPerson = RandomNameGenerator.funkcia();

        //System.out.println(nameOfPerson);
    }
}
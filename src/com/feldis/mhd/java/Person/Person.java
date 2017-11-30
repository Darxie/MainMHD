package com.feldis.mhd.java.Person;

import com.feldis.mhd.java.NameList.RandomNameGenerator;

public class Person {

    String nameOfPerson;

    public Person() {
        nameOfPerson = RandomNameGenerator.funkcia();

        //System.out.println(nameOfPerson);
    }


}
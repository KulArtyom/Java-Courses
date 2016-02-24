package com.kulart05gmail.homework_10.File.City;

import java.util.regex.Matcher;

/**
 * Created by KulArtyom on 24.02.2016.
 */
public class Minsk extends City {

    public Minsk() {
        Street s1 = new Street();
        s1.setStreet("Sukharevskaya");
        this.street = s1;
        Prospects p1 = new Prospects();
        p1.setProspeets("Rokosovskogo");
        this.prospects = p1;
        Areas a1 = new Areas();
        a1.setAreas("Kupalovskaya");
        this.areas = a1;
    }
}

package com.kulart05gmail.homework_10.File.City;

/**
 * Created by KulArtyom on 24.02.2016.
 */
public class main {
    public static void main(String[] args) {

        City city = new Minsk();
        System.out.print(city.street.getStreet() + city.areas.getAreas() + city.prospects.getProspeets());

    }
}

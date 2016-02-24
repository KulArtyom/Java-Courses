package com.kulart05gmail.homework_10.File.City;

import java.text.ParseException;

/**
 * Created by KulArtyom on 24.02.2016.
 */
public class City {

    protected Street street;
    protected Prospects prospects;
    protected Areas areas;


    public class Street {
        String street;

        public String getStreet() {
            return street;
        }

        public void setStreet(String street) {
            this.street = street;
        }
    }

    public class Prospects {
        String prospeets;

        public String getProspeets() {
            return prospeets;
        }

        public void setProspeets(String prospeets) {
            this.prospeets = prospeets;
        }
    }

    public class Areas {

        String areas;

        public String getAreas() {
            return areas;
        }

        public void setAreas(String areas) {
            this.areas = areas;
        }
    }


}

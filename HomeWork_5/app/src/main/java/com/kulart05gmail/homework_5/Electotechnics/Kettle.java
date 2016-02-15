package com.kulart05gmail.homework_5.Electotechnics;

/**
 * Created by KulArtyom on 12.02.2016.
 */
public class Kettle extends KitchenTechnics {

    private String speed_heating;

    public String getSpeed_heating() {
        return speed_heating;
    }

    public void setSpeed_heating(String speed_heating) {
        this.speed_heating = speed_heating;
    }

    @Override
    public String toString() {
        return "Kettle{" +
                "speed_heating='" + speed_heating + '\'' +
                '}';
    }
}

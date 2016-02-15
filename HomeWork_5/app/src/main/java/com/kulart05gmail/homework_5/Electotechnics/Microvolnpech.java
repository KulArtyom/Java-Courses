package com.kulart05gmail.homework_5.Electotechnics;

/**
 * Created by KulArtyom on 12.02.2016.
 */
public class Microvolnpech extends KitchenTechnics {

    private String type;

    public Microvolnpech(String type) {
        this.type = type;
    }

    public Microvolnpech() {

    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    @Override
    public String toString() {
        return "Microvolnpech{" +
                "type='" + type + '\'' +
                '}';
    }
}

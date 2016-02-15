package com.kulart05gmail.homework_5.Electotechnics;

/**
 * Created by KulArtyom on 12.02.2016.
 */
public class Apliences {

    public String name;
    public String serial_nubmer;
    public String color;
    public static final String ELECTRIC_ON = "Включен в розетку";



    public Apliences(String name, String serial_nubmer, String color) {
        super();
        this.name = name;
        this.serial_nubmer = serial_nubmer;
        this.color = color;

    }

    public Apliences() {

    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSerial_nubmer() {
        return serial_nubmer;
    }

    public void setSerial_nubmer(String serial_nubmer) {
        this.serial_nubmer = serial_nubmer;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    @Override
    public String toString() {
        return "Apliences{" +
                "name='" + name + '\'' +
                ", serial_nubmer='" + serial_nubmer + '\'' +
                ", color='" + color + '\'' +
                '}';
    }
    private String v;

    public String getV() {
        return v;
    }

    public void setV(String v) {
        this.v = v;
    }
}

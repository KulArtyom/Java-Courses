package com.kulart05gmail.homework_5.Electotechnics;

/**
 * Created by KulArtyom on 12.02.2016.
 */
public class Electronics {
    public static void main (String[] args){


        Microvolnpech microvolnpech_1 = new Microvolnpech();
        microvolnpech_1.setName("Magic Power");
        microvolnpech_1.setSerial_nubmer("SGN19093");
        microvolnpech_1.setColor("white");
        microvolnpech_1.setSizekichen("All types Kitchen");
        microvolnpech_1.setType("PowerGrill");
        microvolnpech_1.setV(Apliences.ELECTRIC_ON);

        Kettle kettle_1 = new Kettle();
        kettle_1.setName("Super Kettle");
        kettle_1.setSerial_nubmer("GT44221");
        kettle_1.setColor("Grey");
        kettle_1.setSizekichen("All types kitchen");
        kettle_1.setSpeed_heating("Very fast");

        Fridge fridge_1 = new Fridge();
        fridge_1.setName("Atlant superpuper");
        fridge_1.setSerial_nubmer("SN09382");
        fridge_1.setColor("Black");
        fridge_1.setSizekichen("Big kitchen");
        fridge_1.getPower_colding("36 кг за сутки");
        fridge_1.setV(Apliences.ELECTRIC_ON);
    }
}

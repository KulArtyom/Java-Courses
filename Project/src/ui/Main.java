package ui;

import GSON.ParseGSON;
import JSON.JSON;
import Jackson.ParseJackson;

/**
 * Created by KulArtyom on 29.02.2016.
 */
public class Main {

    public static void main(String[] args) {


        /*Паттерн Singleton гарантирует, что у класса есть только один экземпляр, и предоставляет к нему глобальную точку доступа.*/
        Manager manager = Manager.getInstance();
        manager.addCustomers();


        //ParseJackson.parseJackson();

//        System.out.println("==============================");
//        JSON.parseJson();
//        ParseGSON.parseGSON();

//        manager_1.getIstance();






    }
}

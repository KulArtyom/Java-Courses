package ui;

import GSON.ParseGSON;
import JSON.JSON;

/**
 * Created by KulArtyom on 29.02.2016.
 */
public class Main {

    public static void main(String[] args) {

        JSON.parseJson();
        ParseGSON.parseGSON();
        Manager.addCustomers();
    }
}

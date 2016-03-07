package Jackson;


import ui.Customers;

import java.util.ArrayList;

public class ParseJackson {

    public static void parseJackson() {

        try {

            //Создаем объект JSONjacksonParser
            JSONjacksonParser jp = new JSONjacksonParser();

            ArrayList<Customers> cust = jp.parse("service_station.json");

            System.out.println(cust.toString());

//            //Вывод клиентов на консоль
//            for (int i = 0; i < cust.size(); i++) {
//                System.out.println(cust.get(i));
//            }
        } catch (Exception e) {
            System.out.println("ParseJackson e:" + e.toString());
        }


    }
}
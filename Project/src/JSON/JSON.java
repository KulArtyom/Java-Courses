package JSON;

import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;

import java.io.FileReader;
import java.util.ArrayList;

/**
 * Created by KulArtyom on 02.03.2016.
 */
public class JSON {

    public static void parseJson() {

        //создаем объект Jsonparser
        JSONParser jsonParser = new JSONParser();


        try {

            //инициализируем парсер
            JSONObject object = (JSONObject) jsonParser.parse(new FileReader("service_station.json"));

            //получаем переменную name
            String name = (String) object.get("name");
            System.out.println("NAME = " + name);

            String location = (String) object.get("location");
            System.out.println("location = " + location);


            //получаем массив объектов находящихся в переменной people
            JSONArray jsonArray = (JSONArray) object.get("customers");

            for (int i = 0; i < jsonArray.size(); i++) {

                System.out.println("===================");

                JSONObject jsonObject = (JSONObject) jsonArray.get(i);

                long id = (long) jsonObject.get("id");
                System.out.println("id = " + id);

                String nameI = (String) jsonObject.get("name");
                System.out.println("name = " + nameI);

                String surname = (String) jsonObject.get("surname");
                System.out.println("surName = " + surname);

                String second_name = (String) jsonObject.get("second_name");
                System.out.println("surName = " + second_name);

                String lastOrder = (String) jsonObject.get("lastOrder");
                System.out.println("lastOrder = " + lastOrder);

                String dateOfBirth = (String) jsonObject.get("dateOfBirth");
                System.out.println("dateOfBirth = " + dateOfBirth);

                ArrayList car = (ArrayList) jsonObject.get("car");
                System.out.println("car = " + car);

                boolean discount = (boolean) jsonObject.get("discount");
                System.out.println("discount = " + discount);

            }

        } catch (Exception e) {
            System.out.println("JSON error: " + e.getMessage());
        }

    }
}

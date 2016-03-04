package GSON;

import com.google.gson.Gson;

import java.io.BufferedReader;
import java.io.FileReader;

/**
 * Created by KulArtyom on 02.03.2016.
 */
public class ParseGSON {

    public static void parseGSON() {

        try {

            BufferedReader bufferedReader = new BufferedReader(new FileReader("service_station.json"));

            Gson gson = new Gson();

            //конвертируем файл json в объект Root
            Root root = gson.fromJson(bufferedReader, Root.class);
            System.out.println(root.toString());

        }catch (Exception e){
            System.out.println("GSON = " + e.toString());
        }
    }
}

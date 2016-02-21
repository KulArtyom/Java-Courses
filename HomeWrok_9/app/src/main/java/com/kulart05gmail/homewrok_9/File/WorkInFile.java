package com.kulart05gmail.homewrok_9.File;

import java.io.FileNotFoundException;
import java.util.Scanner;

/**
 * Created by KulArtyom on 21.02.2016.
 */
public class WorkInFile {

    private static String text;
    private static String fileName = "D://a.txt";

    public static void main(String[] args) throws FileNotFoundException {
        //Запись в файл
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите текст: ");
        text = scanner.next();
        FileWorker.write(fileName, text);

        //Попытка прочитать не существующий файл
        //FileWorker.read("no_file.txt");

        //Обновление файла
        FileWorker.update(fileName, " Update v.1");

        //Чтение файл
        String textFromFile = FileWorker.read(fileName);
        System.out.println(textFromFile);

        //Удаление файла
        //FileWorker.delete(fileName);

    }
}

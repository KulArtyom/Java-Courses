package com.kulart05gmail.homework_10.File;

import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;

/**
 * Created by KulArtyom on 21.02.2016.
 */
public class WorkInFile {


    private static ArrayList<Student> studentarray = new ArrayList<>();
    private static String fileName = "D://a.txt";

    public static void main(String[] args) throws FileNotFoundException {

        Student student = new Student();
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите имя студента: ");
        student.setName(scanner.next());
        System.out.println("Введите фамилию студента: ");
        student.setSurname(scanner.next());
        System.out.println("Введите дату рождения студента: ");
        student.setB_day(scanner.next());
        studentarray.add(student);

        Student student2 = new Student();
        System.out.println("Введите имя студента: ");
        student2.setName(scanner.next());
        System.out.println("Введите фамилию студента: ");
        student2.setSurname(scanner.next());
        System.out.println("Введите дату рождения студента: ");
        student2.setB_day(scanner.next());
        studentarray.add(student2);
        String s = student.getName() + " " + student.getSurname() + " | " + student.getB_day();
        String s2 = student2.getName() + " " + student2.getSurname() + " | " + student2.getB_day();


        //Запись в файл
        FileWorker.write(fileName, s, s2);

        //Попытка прочитать не существующий файл
        //FileWorker.read("no_file.txt");

        //Обновление файла
        // FileWorker.update(fileName, s2);

        //Чтение файл
        String textFromFile = FileWorker.read(fileName);
        System.out.println(textFromFile);

        //Удаление файла
        //FileWorker.delete(fileName);

    }
}

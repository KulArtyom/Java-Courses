package com.kulart05gmail.homework_4;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 * Created by KulArtyom on 09.02.2016.
 */
public class HomeWork_4 {


    private static List<Pacient> pacientsarray = new ArrayList<>();


    public static void main(String[] args) {

        java.util.Scanner scanner = new java.util.Scanner(System.in);

        Pacient pacient_1 = new Pacient();
        System.out.println("Введите имя паациента: ");
        pacient_1.setName(scanner.next());
        System.out.println("Введите фамилию пациента: ");
        pacient_1.setSurname(scanner.next());
        System.out.println("Введите отчество пациента: ");
        pacient_1.setMiddlename(scanner.next());
        System.out.println("Введите пол пациента: ");
        pacient_1.setSex(scanner.next());
        System.out.println("Введите семейное положение: ");
        pacient_1.setWed(scanner.next());
        System.out.println("Введите возвраст пациента: ");
        pacient_1.setAge(scanner.nextInt());
        System.out.println("Введите диагноз пациента: ");
        pacient_1.setDisease(scanner.next());

        System.out.println("ФИО: " + pacient_1.getSurname() + " " + pacient_1.getName() + " " +
                pacient_1.getMiddlename() + ". " + "Возвраст - " + "''" + pacient_1.getAge() + "''");

        pacientsarray.add(pacient_1);


        Pacient pacient_2 = new Pacient();
        System.out.println("Введите имя паациента: ");
        pacient_2.setName(scanner.next());
        System.out.println("Введите фамилию пациента: ");
        pacient_2.setSurname(scanner.next());
        System.out.println("Введите отчество пациента: ");
        pacient_2.setMiddlename(scanner.next());
        System.out.println("Введите пол пациента: ");
        pacient_2.setSex(scanner.next());
        System.out.println("Введите семейное положение: ");
        pacient_2.setWed(scanner.next());
        System.out.println("Введите возвраст пациента: ");
        pacient_2.setAge(scanner.nextInt());
        System.out.println("Введите диагноз пациента: ");
        pacient_2.setDisease(scanner.next());

        System.out.println("ФИО: " + pacient_2.getSurname() + " " + pacient_2.getName() + " " +
                pacient_2.getMiddlename() + ". " + "Возвраст - " + "''" + pacient_2.getAge() + "''");

        pacientsarray.add(pacient_2);

        Pacient pacient_3 = new Pacient();
        System.out.println("Введите имя паациента: ");
        pacient_3.setName(scanner.next());
        System.out.println("Введите фамилию пациента: ");
        pacient_3.setSurname(scanner.next());
        System.out.println("Введите отчество пациента: ");
        pacient_3.setMiddlename(scanner.next());
        System.out.println("Введите пол пациента: ");
        pacient_3.setSex(scanner.next());
        System.out.println("Введите семейное положение: ");
        pacient_3.setWed(scanner.next());
        System.out.println("Введите возвраст пациента: ");
        pacient_3.setAge(scanner.nextInt());
        System.out.println("Введите диагноз пациента: ");
        pacient_3.setDisease(scanner.next());

        System.out.println("ФИО: " + pacient_3.getSurname() + " " + pacient_3.getName() + " " +
                pacient_3.getMiddlename() + ". " + "Возвраст - " + "''" + pacient_3.getAge() + "''");

        pacientsarray.add(pacient_3);


        Pacient pacient_4 = new Pacient();
        System.out.println("Введите имя паациента: ");
        pacient_4.setName(scanner.next());
        System.out.println("Введите фамилию пациента: ");
        pacient_4.setSurname(scanner.next());
        System.out.println("Введите отчество пациента: ");
        pacient_4.setMiddlename(scanner.next());
        System.out.println("Введите пол пациента: ");
        pacient_4.setSex(scanner.next());
        System.out.println("Введите семейное положение: ");
        pacient_4.setWed(scanner.next());
        System.out.println("Введите возвраст пациента: ");
        pacient_4.setAge(scanner.nextInt());
        System.out.println("Введите диагноз пациента: ");
        pacient_4.setDisease(scanner.next());

        System.out.println("ФИО: " + pacient_4.getSurname() + " " + pacient_4.getName() + " " +
                pacient_4.getMiddlename() + ". " + "Возвраст - " + "''" + pacient_4.getAge() + "''");

        pacientsarray.add(pacient_4);

        Scanner myScanner = new Scanner(System.in);
        System.out.println("Найти пациента по ФИО и возрасту");
        System.out.print("Введите Имя: ");
        String name = myScanner.next();

        System.out.print("Введите возраст: ");
        int age = myScanner.nextInt();

        boolean isFound = false;
        for (Pacient pacient : pacientsarray) {
            if (pacient.getName().equals(name) && pacient.getAge() == age) {
                isFound = true;
                System.out.println("Найден: " + "ФИО: "+ pacient.name + "Возраст - " + pacient.age);
            }
        }

        if (!isFound) System.out.println("Не найдено.");

    }
}





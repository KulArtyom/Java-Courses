package com.kulart05gmail.homewrok_9.Student;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;
import java.util.Scanner;

/**
 * Created by KulArtyom on 21.02.2016.
 */
public class Main {

    private static ArrayList<Student> studentarray = new ArrayList<>();

    public static void main(String[]args){

        Scanner scanner = new java.util.Scanner(System.in);

        Student s1 = new Student();
        System.out.println("Введите имя студента");
        s1.setName(scanner.next());
        System.out.println("Введите фамилию студента");
        s1.setSurname(scanner.next());
        System.out.println("Введите дату рождения студента");
        String date = scanner.next();
        SimpleDateFormat format = new SimpleDateFormat("dd.MM.yyyy");
        try {
            Date d = format.parse(date);
            s1.setBirthday(d);
        } catch (ParseException ex) {
            System.out.println("Это не должно произойти");
        }
        studentarray.add(s1);
        System.out.println(s1.toString());

        Student s2 = new Student();
        System.out.println("Введите имя студента");
        s2.setName(scanner.next());
        System.out.println("Введите фамилию студента");
        s2.setSurname(scanner.next());
        System.out.println("Введите дату рождения студента");
        String date1 = scanner.next();
        SimpleDateFormat format1 = new SimpleDateFormat("dd.MM.yyyy");
        try {
            Date d1 = format.parse(date1);
            s2.setBirthday(d1);
        } catch (ParseException ex) {
            System.out.println("Это не должно произойти");
        }
        studentarray.add(s2);
        System.out.println(s2.toString());

        Student s3 = new Student();
        System.out.println("Введите имя студента");
        s3.setName(scanner.next());
        System.out.println("Введите фамилию студента");
        s3.setSurname(scanner.next());
        System.out.println("Введите дату рождения студента");
        String date2 = scanner.next();
        SimpleDateFormat format2 = new SimpleDateFormat("dd.MM.yyyy");
        try {
            Date d2 = format.parse(date2);
            s3.setBirthday(d2);
        } catch (ParseException ex) {
            System.out.println("Это не должно произойти");
        }
        studentarray.add(s3);
        System.out.println(s3.toString());


        int a1 = calculateAge(s1.getBirthday());
        int a2 = calculateAge(s2.getBirthday());
        int a3 = calculateAge(s3.getBirthday());
        int s = (a1 + a2 + a3)/3;

        System.out.println(s);
    }
    public static Integer calculateAge(final Date birthday)
    {
        Calendar dob = Calendar.getInstance();
        Calendar today = Calendar.getInstance();

        dob.setTime(birthday);
        // include day of birth
        dob.add(Calendar.DAY_OF_MONTH, -1);

        int age = today.get(Calendar.YEAR) - dob.get(Calendar.YEAR);
        if (today.get(Calendar.DAY_OF_YEAR) <= dob.get(Calendar.DAY_OF_YEAR)) {
            age--;
        }
        return age;
    }
}

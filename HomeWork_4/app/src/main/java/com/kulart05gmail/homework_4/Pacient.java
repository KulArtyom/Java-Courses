package com.kulart05gmail.homework_4;

/**
 * Created by KulArtyom on 09.02.2016.
 */
public class Pacient {

    public static final String SEX_M = "M";
    public static final String SEX_W = "W";
    public static final String MINSK = "Minsk";

    public String name;
    public String surname;
    public int age;
    private String middlename;
    private String disease;
    private String wed;
    private String sex;



    public Pacient(String name, String surname) {
        this.name = name;
        this.surname = surname;

    }

    public Pacient() {

    }


    public String getWed() {
        return wed;
    }

    public void setWed(String wed) {
        this.wed = wed;
    }


    public String getSex() {
        return sex;
    }

    public void setSex(String sex) {
        this.sex = sex;
    }

    public String getDisease() {
        return disease;
    }

    public void setDisease(String disease) {
        this.disease = disease;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getMiddlename() {
        return middlename;
    }

    public void setMiddlename(String middlename) {
        this.middlename = middlename;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

}

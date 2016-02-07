package com.kulart05gmail.homework_3;


import java.util.Arrays;

/**
 * Created by KulArtyom on 07.02.2016.
 */
public class HomeWork_3 {


    public static void main(String[] args) {

        int[] array = new int[10];

        fillmassive(array);
        showmassive(array);
        sortmassive(array);
        chmassive(array);


    }

    public static int[] fillmassive(int[] fillarray) {

        java.util.Scanner scanner = new java.util.Scanner(System.in);

        System.out.println("введите  число");
        for (int i = 0; i < fillarray.length; i++) {
            if (scanner.hasNext()) {
                fillarray[i] = scanner.nextInt();
                System.out.println("значение " + fillarray[i]);
            }

        }

        return fillarray;
    }

    public static void showmassive(int[] showarray) {
        for (int i = 0; i < showarray.length; i++) {
            System.out.print("''" + "значение " + showarray[i] + "''" + " | ");
        }

    }

    public static void sortmassive(int[] sortarray) {
        System.out.println("Sorted:");
        Arrays.sort(sortarray);
        for (int i = 0; i < sortarray.length; i++) {
            System.out.print("''" + "значение " + sortarray[i] + "''" + " | ");
        }

    }

    public static void chmassive(int[] charray) {

        System.out.println("Even:");

        for (int i = 0; i < charray.length; i++) {
            if (charray[i] % 2 == 0){
                System.out.print("''" + "значение " + charray[i] + "''" + " | ");}

        }

    }

}


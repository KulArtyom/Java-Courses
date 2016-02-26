package com.kulart05gmail.homework_11;

import java.util.Scanner;

/**
 * Created by KulArtyom on 26.02.2016.
 */
public class Calculator {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int a;
        int b;
        boolean ex = false;


        do {
            System.out.println(Constans.s1);
            a = scanner.nextInt();
            System.out.println(Constans.s2);
            b = scanner.nextInt();
            if (a > Constans.maxValue || b > Constans.maxValue) {
                System.out.println(Constans.s3);
            } else {
                break;
            }
        } while (ex == false);

        do {
            System.out.println("Выберите операцию для вычислений: " + "\n" +
                    "Введите 1, чтобы cложить (\"+\")" + "\n" +
                    "Введите 2, чтобы умножить (\"*\")" + "\n" +
                    "Введите 3, чтобы разделить (\":\")" + "\n");
            int c = scanner.nextInt();
            switch (c) {
                case 1:
                    System.out.println(Constans.s7 + sum(a, b));
                    break;

                case 2:
                    System.out.println(Constans.s7 + mult(a, b));
                    break;
                case 3:
                    try {
                        System.out.println(Constans.s7 + div(a, b));
                    } catch (DivToNull e) {
                        System.out.println("main() e: " + e.getRussianMessage());
                    }
                    break;
                default:
                    System.out.println("Введена неверная цифра!!! Введите цифру от 1-3" + "\n");
            }
            break;

        }

        while (ex == false);


    }

    public static int sum(int a, int b) {
        return Math.abs(a + b);
    }

    public static int div(int a, int b) throws DivToNull {
        if (a == 0 || b == 0) {
            throw new DivToNull();
        }
        return Math.abs(a / b);
    }

    public static int mult(int a, int b) {
        return Math.abs(a * b);
    }


}

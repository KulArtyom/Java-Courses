package com.kulart05gmail.hometask_1;


/**
 * Created by Artyom Kul  on 02.02.2016.
 */
public class HomeWork_01 {

    public static void main(String[] args) {
//
//        char symb1 = 1067;
//        char symb2 = 'Ы';
//
//        System.out.println("symb1 contains " + symb1);
//        System.out.println("symb2 contains " + symb2);
//
//        int a = 5;
//        int b = 2;
//        int c = a - b;
//
//        System.out.println(c);
//
//        char ch = 'J';
//        int intCh = (int) ch;
//
//        System.out.println("J corresponds with " + intCh);
//
//        if (a != 5) {
//            System.out.println("It's true");
//        }
//        if (a > c) {
//            System.out.println("It's true");
//        } else {
//            System.out.println("It's false");
//        }
//
//        String text1 = new String("Can touch my talala");
//        String text2 = "Labuten";
//        int num = 3;
//        String text3 = text1 + num + text2;
//        System.out.println(text3);
//
//        String text4 = "Californication";
//
//        try {
//            Integer b1 = Integer.valueOf(text4);
//            System.out.println(b1);
//        } catch (NumberFormatException e) {
//            System.out.println("Неверный формат строки!");
//        }N
//
//        //Перевод строки в массив байтов и обратно из массива байтов в строку
//        String str3 = "20150";
//        byte[] b3 = str3.getBytes();
//        System.out.println(b3);
//
//        //массив байтов переводим обратно в строку
//        try {
//            String s = new String(b3, "cp1251");
//            System.out.println(s);
//        } catch (UnsupportedEncodingException e) {
//            e.printStackTrace();
//        }
//
//        String str1 = "59";
//        try {
//            Long s2 = Long.valueOf(str1);
//            System.out.println(s2);
//        } catch (NumberFormatException e) {
//            System.out.println("Неверный формат строки!");
//        }
//
//        try {
//            Integer i1 = new Integer("Cantukeq");
//        } catch (NumberFormatException e) {
//            System.out.println("Неверный формат строки!");
//        }
//
//        int i2 = 11553;
//        String str = Integer.toString(i2);
//        System.out.println(str);
//
//
//        //вывод наименьшего числа
//        int c1 = 2;
//        int c2 = 3;
//        int c3 = 4;
//        int c4 = 5;
//
//        int min = Math.min(Math.min(c1, c2), Math.min(c3, c4));
//        int max = Math.max(Math.max(c1, c2), Math.max(c3, c4));
//        System.out.println("Наименьшее число: " + min);
//        //вывод наиибольшего числа
//        System.out.println("Наибольшее число: " + max);
//
//
//        //Даны 5 чисел (тип int). Вывести вначале наименьшее, а затем наибольшее из данных чисел.
//        int q1 = 2;
//        int q2 = 3;
//        int q3 = 4;
//        int q4 = 5;
//        int q5 = 6;
//
//        int qmin = Math.min(Math.min(q1, q2), Math.min(q3, q4));
//        int qmins = Math.min(q5, qmin);
//        int qmax = Math.max(Math.max(q1, q2), Math.max(q3, q4));
//        int qmaxs = Math.max(q5, qmax);
//        System.out.println("Result: " + qmins);
//
//        System.out.println("Result: " + qmaxs);
//
//        //Даны имена 2х человек (тип String). Если имена равны, то вывести сообщение о том, что люди являются тезками.
//        String name1 = new String("Vasiliy");
//        String name2 = new String("Vasiliy");
//
//        if (name1.equals(name2)) {
//            System.out.println("Люди являются тезками");
//        } else {
//            System.out.println("Люди не яляются тезками");
//        }
//
//        //Дано число месяца (тип int). Необходимо определить время года (зима, весна, лето, осень) и вывести на консоль.
//        int month = 1;
//
//
//        if (month >= 3 && month <= 5) {
//            System.out.println("Весна");
//        }
//
//        if (month >= 6 && month <= 8) {
//            System.out.println("Лето");
//        }
//
//        if (month >= 9 && month <= 11) {
//            System.out.println("Осень");
//        }
//
//        if (month <= 12 && month <= 2) {
//            System.out.println("Зима");
//        }
//
//
//        int count = 0;
//        for (int i = 0; i <= 10; i++) {
//            count = count + 2;
//            System.out.println(count);
//        }
//        //факториал числа 7
//
//        int n = 7;
//        int result = 1;
//        for (int i = 1; i <= n; i++) {
//            result *= i;
//        }
//        System.out.print(result);
//
//        //Дан массив целых чисел, найти среди элементов массива числа, которые делятся на 3 и на 6
//        int[] intArray = {2, 4, 6, 8, 9, 10, 12, 15};
//        for (int i = 0; i < intArray.length; i++) {
//            if (intArray[i] % 3 == 0) {
//                System.out.println(String.valueOf(intArray[i]));
//            }
//            if (intArray[i] % 6 == 0) {
//                System.out.println(String.valueOf(intArray[i]));
//            }

        //Среднее арифметическое массива
//        int[] numbers = {2, 4, 322, 11, 24, 54, 25, 89, 9};
//
//        double average = 0;d
//
//        if (numbers.length > 0) {
//            double sum = 0;
//            for (int j = 0; j < numbers.length; j++) {
//                sum += numbers[j];
//            }
//            average = sum / numbers.length;
//
//            System.out.println(String.valueOf(average));
//        }

//        String str1 = "Мама ";
//        String str2 = "ама ";
//        String str3 = "Криминал";
//
//        String result = str1 + str2 + str3;
//        System.out.println(result);d

//        String[] animals = {"Хаски","Морж"};// массив строк 1
//        String[] food = {"колбаски","корж"}; // массив строк 2
//
//        //составляем строки из элементов массивов и связующего слова
//        String result1 = animals[0].concat(" ест ").concat(food[0]);
//        String result2 = animals[1].concat(" ест ").concat(food[1]);
//
//        //выводим на консоль
//        System.out.println(result1);
//        System.out.println(result2);
//
//        String str = "Строка из букв, цифр 492 и специальных символов %*;№?";
//        int length = str.length();
//        String str2 = "Длина строки = ";
//        String num = str2 + length;
//        System.out.println(num);
//
//        String str5 = "Последний символ в этой строке - о";
//        int last = str5.length()-1;//длина строки - 1, так как отсчет начинается с 0
//        char ch = str.charAt(last);
//        System.out.println(ch);

        //создание и инициализация массива
        int[] numberArray = new int[10];
        for (int i = 0; i < 10; i++) {
            numberArray[i] = i;
        }

        //вывод значений на консоль
        for (int i = 0; i < 10; i++) {
            String str = "-й элемент массива = ";
            String result = ((i + 1) + str + numberArray[i]);

            System.out.println(result);
        }

        int[] array = new int[25];
        int min = array[0];

        for (int i = 0; i < array.length; i++) {
            if (min > array[i]) {
                min = array[i];
            }

            System.out.println(array[i]);
        }


    }
}








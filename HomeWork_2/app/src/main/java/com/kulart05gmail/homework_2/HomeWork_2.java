package com.kulart05gmail.homework_2;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;

/**
 * Created by Artyom on 04.02.2016.
 */
public class HomeWork_2 {

    public static void main(String[] args) {

     /*Создайте массив с 10-ю переменными типа int. Используя оператор "for" найдите и выведите на экран наименьшее и наибольшее значение в массиве.
       min value =  "значение которое у вас получилось".
       max value =  "значение которое у вас получилось".
       Далее замените наименьшее значение на 0, а наибольшее значение на 99 и выведите получившийся массив на экран в виде:
       [23, 0, 34, 99, 43534].*/

        int[] array = {9, 2, 1, 59, 54, 33, 22, 11, 23, 55};

        int min = array[0];
        int max = array[0];

        String maxvalue = "max value = ";
        String minvalue = "min value = ";

        for (int i = 0; i < array.length; i++) {
            //находим минимальное значение массива
            if (min > array[i])
                min = array[i];
            //находим максимальное значение массива
            if (max < array[i])
                max = array[i];


        }
        System.out.println(minvalue + min);
        System.out.println(maxvalue + max);

        for (int i = 0; i < array.length; i++) {
            //заменяем наименьшее и наибольшее значения массива
            if (array[i] == min)
                array[i] = 0;
            if (array[i] == max)
                array[i] = 99;
        }
        System.out.print(Arrays.toString(array));


    /*2. Создайте массив с 10-ю переменными типа float. Далее найдите дубликаты и выведите их количество.
      Пример: есть массив {2, 3, 5, 7, 6, 5, 7, 3, 7, 20} - в данном массиве цифра 3 и 7 повторяются.
      В результате выполнения программы на экран должно вывести:
     [3] - повторений 2
     [7] - повторений 3*/
      //


        float[] numbers = {23, 22, 33, 2, 66, 33, 22, 1, 7, 7};



        final boolean[] booleans = new boolean[numbers.length];

        for (int i = 0; i < numbers.length - 1; i++) {

            while (booleans[i]) i++;

            System.out.print(numbers[i] + " is repeat in: " + i + " ");

            for (int j = i + 1; j < numbers.length; j++) {

                if (numbers[i] == numbers[j]) {
                    booleans[j] = true;

                    System.out.print(j + " ");
                }
            }

            System.out.println();
        }


        /*3. Напишите программу, которая печатает массив, затем инвертирует (то есть меняет местами первый элемент с последним,
        второй — с предпоследним и т.д.), и вновь печатает.*/


        int[] array3 = {5, 4, 3, 2, 1};
        ;

        for (int i = 0; i < array3.length / 2; i++) {

            int hold = array3[(array3.length - 1) - i];
            array3[(array3.length - 1) - i] = array3[i];
            array3[i] = hold;
        }

        for (int i = 0; i < array3.length; i++) {

        }
        System.out.print(Arrays.toString(array3));



        /*4. Задание не обязательное, для тех кто все сделал и все понимает:
            Создайте массив типа int. Отсортируйте массив любым слособом
            (по убыванию либо по возрастанию). Результат вывести на экран.*/

        int[] array10 = {24, 7, 26, 32, 20, 1};

        for (int i = array10.length - 1; i > 0; i--) {
            for (int j = 0; j < i; j++) {
                if (array10[j] > array10[j + 1]) {
                    int temp = array10[j];
                    array10[j] = array10[j + 1];
                    array10[j + 1] = temp;
                }
            }
        }
        for (int i = 0; i < array10.length; i++) {
        }
        System.out.println(Arrays.toString(array10));



        int arr[] = {14,2,33,55,22,55,16,62,83};
        for(int i = 0; i <  arr.length; i++) {
        }
        System.out.print("\nSorted: \n");
        //Сортируем массив
        Arrays.sort(arr);

        for(int i = 0; i <  arr.length; i++) {
            System.out.print(arr[i] + "  ");
        }
    }

}

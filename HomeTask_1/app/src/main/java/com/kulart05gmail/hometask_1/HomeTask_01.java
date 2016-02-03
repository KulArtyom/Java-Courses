package com.kulart05gmail.hometask_1;

/**
 * Created by Artyom Kul on 02.02.2016.
 */
public class HomeTask_01 {
    public static void main(String[] args) {

        /*1.  Создайте переменную типа String c любым текстом (не сильно короткое).
        Далее выведите на экран количество символов в данной строке. Далее разделите строку пополам
        (если ровно поделить не выходит то +-1 не страшно), в результате у вас должно быть 2-е новых переменных
        типа String с частями из изначальной строки. Полученные строки выведите на экран.*/

        String str1 = "Nikita, Stas, Gena, Turbo, Diusha Metelkin";

        int length = str1.length();
        String str2 = new String("Длина строки = ");
        String result1 = str2 + length;
        System.out.println(result1);

        String s1 = str1.substring(0, str1.length() / 2);
        String s2 = str1.substring(str1.length() / 2, str1.length());

        System.out.println(s1);
        System.out.println(s2);

        /*2. Создайте любое число. Определите, является ли последняя цифра числа семеркой.*/

        int num = 142523677;

        if (num % 10 == 7) {
            System.out.println("true");
        } else {
            System.out.println("false");
        }

        /*3. Имеется прямоугольное отверстие размерами a и b (размеры задать любые),
        определить, можно ли его полностью закрыть круглой картонкой радиусом r (тоже подставляем любое значение).
         */

        int height = 10;
        int width = 20;
        int r = 25;

        int max = Math.max(height,width);
        int ds = r*2;

        if (ds >= max){
            System.out.println("true");
        }else {
            System.out.println("false");
        }

        /*5. Имеется строка, которая содержит символы ? и символы #.
        Замените все символы ? на HELLO, а # - удалите. Результат вывести на экран.*/

        String text = new String("#Paramparam?Paramparam?Paramparam#");

        String s5 = "?";
        String s6 = "hello";

        String text2 = text.replace(s5, s6);

        String s7 = "#";
        String text3 = text2.replaceAll(s7, "");

        System.out.println(text3);

        /*4. Имеется целое число (любое), это число — сумма денег в рублях.
         Вывести это число, добавив к нему слово «рублей» в правильном падеже.
          */

        int money = 3587;

        Util util = new Util();
        String result = "У вас есть " + Integer.toString(money) + " ";

        switch (util.getLastNum(money)) {
            case 0:
                result += "рублей";
                break;
            case 1:
                result += "рубль";
                break;
            case 2:
                result += "рубля";
                break;
            case 3:
                result += "рубля";
                break;
            case 4:
                result += "рубля";
                break;
            case 5:
                result += "рублей";
                break;
            case 6:
                result += "рублей";
                break;
            case 7:
                result += "рублей";
                break;
            case 8:
                result += "рублей";
                break;
            case 9:
                result += "рублей";
                break;
        }

        System.out.println(result);
    }
}

    class Util {
    public int getLastNum(int num) {
        for (int i = 0; i < Integer.toString(num).length(); i++) {
            if (Integer.toString(num).indexOf(Integer.toString(num).charAt(i)) == (Integer.toString(num).length() - 1)) {
                return Integer.toString(num).charAt(i) - '0';
            }
        }
        return -1;
    }
}


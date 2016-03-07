import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.Scanner;

/**
 * Created by KulArtyom on 07.03.2016.
 */
public class Main {

    public static void main(String[] args) {

        luckynumber();
        singleNumber();
        sortText();
    }
    /*Задача:
    Есть N переменных типа int в массиве A. Все числа в массиве кроме одного имеют пару
    (тоесть одно и тоже число встречается в массиве дважды). Ваша задача найти число, которое не имеет пары (не повторяется).

    Ввод данных должен быть следующим:
    Первой строкой юзер вводит число N, следующей строкой - вводит числа для заполнения массива разделенные пробелом.
    Можно забить все в коде (Scanner можно не использовать).*/

    public static void singleNumber() {

        int[] array = {1, 1, 2, 2, 4, 4, 5, 5, 7};
        int result = 0;
        for (int i = 0; i < array.length; i++) {
            result = result ^ array[i];
        }

        System.out.println(result);
    }

    /*На вход программе поступает трёхзначное число (от 100 до 999), которое генерируется случайным образом либо вводиться из консоли
    (на своё усмотрение). Необходимо определить является ли число счастливым.
    Счастливое число, это число у которого все цифры совпадают (например 777), либо число у которого каждая последующая цифра
    на 1 больше предыдущей (123 или 456). */

    public static void luckynumber() {

        boolean exit = false;
        Scanner scanner = new Scanner(System.in);
        int maxvalue = 999;
        int[] array = {111, 222, 333, 444, 555, 666, 777, 888, 999, 123, 234, 345, 456, 567, 678, 789};
        int s1 = 0;
        do {
            System.out.println("Введите любое число от 100 - 999");
                s1 = scanner.nextInt();
                if (s1 > maxvalue) {
                    System.out.println("Вы ввелии недопустимое значение");
                } else {
                    break;
                }

        } while (exit == false);

        for (int i = 0; i < array.length; i++) {
            if (s1 == array[i]) {
                System.out.println("Это счастливое число: " + s1);
            }else {
                System.out.println("Это несчастливое числое");
            }

        }
    }
    /*Вывести все слова из заданного текста в порядке возрастания количества букв в каждом из них.
    Текст выбрать произвольный, но не менее 300 символов.*/

    public static void sortText(){

        //создаем компоратор для сортировки текста
        Comparator<String> compareLength = new Comparator<String>() {
            @Override
            public int compare(String o1, String o2) {
                if (o1.length() > o2.length())
                    return 1;
                else if (o1.length() < o2.length())
                    return -1;
                else return 0;
            }
        };

        String text = "The British Museum has one of the largest libraries in the world. It has a copy of every book that is printed in the English language, so that there are more than six million books there. They receive nearly two thousand books and papers daily.\n" +
                "The British Museum Library has a very big collection of printed books and manuscripts, both old and new. You can see beautifully illustrated old manuscripts which they keep in glass cases.\n" +
                "You can also find there some of the first English books printed by Caxton. Caxton was a printer who lived in the fifteenth century. He made the first printing-press in England.\n" +
                "In the reading-room of the British Museum many famous men have read and studied.\n" +
                "Charles Dickens, a very popular English writer and the author of 'David Copperfield', 'Oliver Twist', 'Dombey and Son' and other books, spent a lot of time in the British Museum Library.";

        //убираем из текста знаки препинания
        text = text.replaceAll("[?!,\\.)(\"']", "");

        String[] words = text.split("\\s+");//Рубим на строки по пробелам

        //Сортируем с помощью компаратора
        Arrays.sort(words, compareLength);

        //выводим отсортированную коллекцию
        for (int i = 0; i < words.length; i++) {
            System.out.print("\t" + words[i]);
        }
    }


}

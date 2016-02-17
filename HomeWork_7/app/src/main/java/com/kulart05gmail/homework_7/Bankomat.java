package com.kulart05gmail.homework_7;


import java.util.Scanner;

public class Bankomat {

    private static CheckMoneyListener listener;
    public static void main(String[] args) {

        boolean b;
        boolean success = false;
        int sum = 0;

        Money bankomat = new Money(0, 0, 0);

        Money cash = new Money(0, 0, 0);
        Scanner scanner = new Scanner(System.in);
        listener = cash;


        do {
            System.out.println("Введите:\n\"1\" - для просмотра доступной суммы\n\"2\" - для зачисления денег"
                    + "\n\"3\" - для снятия денег\nИли любую другую клавишу для выхода из программы");

            if (scanner.hasNextInt()) {
                int fnd = scanner.nextInt();
                switch (fnd) {
                    case 1:
                        System.out.print("Доступная ");
                        bankomat.getMoney();
                        break;
                    case 2:
                        do {
                            System.out.println("Введите сумму для зачисления");
                            if (scanner.hasNextInt()) {
                                int sumplus = scanner.nextInt();
                                b = true;
                                bankomat.addMoney(sumplus);
                                System.out.println("Успешно зачислено");
                            } else {
                                String s = scanner.next();
                                System.out.println("Допустимо вводить только целые числа, вы ввели - \"" + s + "\"");
                                b = false;
                            }
                        }
                        while (b == false);
                        break;
                    case 3:
                        do {
                            System.out.println("Введите сумму для снятия)");
                            if (scanner.hasNextInt()) {
                                sum = scanner.nextInt();
                                b = true;
                                listener.withdrawMoney();
                                cash.checkMoney();
                                if (sum <= bankomat.checkMoney() && sum >= 0)
                                    success = true;
                                else
                                    success = false;

                            } else {
                                String s = scanner.next();
                                System.out.println("Введено не целое число, вы ввели - \"" + s + "\"");
                                b = false;
                            }
                        }
                        while (b == false);

                        if (success) {
                            cash.reset();
                            listener.addMoney(sum);
                            if (bankomat.getK_100() - cash.getK_100() < 0 ||
                                    bankomat.getK_50() - cash.getK_50() < 0 ||
                                    bankomat.getK_20() - cash.getK_20() < 0) {
                                System.out.println("Операция невозможна, не хватает купюр нужного номинала\n"
                                        + " Попробуйте ввести другую сумму");
                                cash.reset();
                            } else {
                                bankomat.setK_100(bankomat.getK_100() - cash.getK_100());
                                bankomat.setK_50(bankomat.getK_50() - cash.getK_50());
                                bankomat.setK_20(bankomat.getK_20() - cash.getK_20());
                                System.out.print("Выдана ");
                                cash.getMoney();
                            }


                        } else System.out.println("Error");
                        break;


                    default:
                        System.exit(0);
                }
            } else System.exit(0);
        }
        while (true);


    }
}








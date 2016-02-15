package com.kulart05gmail.homework_5.Bankomat;

/**
 * Created by KulArtyom on 12.02.2016.
 */
public class Money {

    private int k_20;
    private int k_50;
    private int k_100;

    public Money(int k_100, int k_50, int k_20)
    {
        this.k_100 = k_100;
        this.k_50 = k_50;
        this.k_20 = k_20;
    }


    public void getMoney(){
        int b = 100* k_100 + 50* k_50 + 20* k_20;
        System.out.println(" Сумма " + b + " BYR\n \nКупюр [100] - " + k_100 +
                " шт\nКупюр [50] - " + k_50 + " шт\nКупюр [20] - " + k_20 + " шт");
    }

    public void addMoney(int a)
    {
        a=a/10;
        while (a >= 2)
        {
            if ((a>=17 && a != 20) || (a%2 == 0 && a>=10 && a<17))
            {
                k_100++;
                a-=10;
            }
            if (a == 15)
            {
                k_100++;
                k_50++;
                a-=15;
            }
            if (a>=9 || a == 7 || a == 5)
            {
                k_50++;
                a-=5;
            }
            if (a>=2)
            {
                k_20++;
                a-=2;
            }
        }
    }

    public int checkMoney()
    {
        int b = 100* k_100 + 50* k_50 + 20* k_20;
        return b;
    }

    public void reset()
    {
        k_100 = k_50 = k_20 = 0;
    }


    public int getK_100() {
        return k_100;
    }


    public void setK_100(int k_100) {
        this.k_100 = k_100;
    }


    public int getK_50() {
        return k_50;
    }


    public void setK_50(int k_50) {
        this.k_50 = k_50;
    }


    public int getK_20() {
        return k_20;
    }


    public void setK_20(int k_20) {
        this.k_20 = k_20;
    }
}

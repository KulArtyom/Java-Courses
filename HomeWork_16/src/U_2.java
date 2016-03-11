import java.util.Scanner;

/**
 * Created by KulArtyom on 11.03.2016.
 */
public class U_2 {
        public static void main(String[] args)
        {
            System.out.println("Введите \"start\"");
            Scanner s = new Scanner(System.in);
            switch (s.next())
            {
                case "start":
                {
                    MySThread thread = new MySThread();
                    thread.setName("Первый поток");
                    thread.start();
                    MyThread thread2 = new MyThread();
                    thread2.setName("Второй поток");
                    thread2.start();
                }
                break;
                default:
                    System.exit(0);
            }

        }


    public static synchronized void print10()
    {
        System.out.print(Thread.currentThread().getName());
        for (int i = 0; i<10; i++)
        {
            int a = (int) (Math.random()*100);
            System.out.print(" " + a);
        }
        System.out.println();

    }

}

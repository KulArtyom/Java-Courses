/**
 * Created by KulArtyom on 11.03.2016.
 */
public class MySThread extends Thread {

    public void run() {
        for (int i = 0; i < 10; i++) {
            U_2.print10();
            try {
                Thread.sleep(1500);
            } catch (InterruptedException e) {
                System.out.println("sleep error " + e.getMessage());
            }
        }
    }
}

/**
 * Created by KulArtyom on 11.03.2016.
 */
public class MyThread extends Thread {

    public void run() {
        for (int i = 0; i < 13; i++) {
            U_1.print10();
            try {
                Thread.sleep(1050);
            } catch (InterruptedException e) {
                System.out.println("sleep error " + e.getMessage());
            }
        }
    }

}


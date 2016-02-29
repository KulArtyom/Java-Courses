package Ex_1;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Scanner;

/**
 * Created by KulArtyom on 29.02.2016.
 */
public class HomeWork_12 {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        String yes = null;
        String no = null;

        ArrayList<String> arrayList = new ArrayList<>();

        do {
            System.out.println(Constans.STRING_ENTER);
            if (scanner.hasNext()) {
                yes = scanner.next();
            }
            arrayList.add(yes);
            System.out.println(Constans.STRING_DOUBLE_ENTER);
            if (scanner.hasNext()) {
                no = scanner.next();
            }
        } while (!no.equalsIgnoreCase(Constans.NO));
        System.out.println(Constans.YOUR_COLLECTION + arrayList.toString());
        for (int i = 0; i < arrayList.size(); i++) {
            String s = arrayList.get(i);
            s = s.replaceAll("a", "");
            arrayList.set(i, s);
        }


        System.out.println(Constans.TREATMENT_COLLECTION + arrayList.toString());
        HashSet<String> hashSet = new HashSet<>(arrayList);
        arrayList.clear();
        arrayList.addAll(hashSet);
        System.out.println(Constans.WITHOUT_DOUBLECHAR + arrayList.toString());


    }
}

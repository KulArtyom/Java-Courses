import Ex_1.Constans;

import java.util.*;

/**
 * Created by KulArtyom on 29.02.2016.
 */
public class Ex2 {

    public static void main(String[] args) {

        ArrayList<Human> man = new ArrayList<>();
        man.add(new Human("Gena", "Suvorov"));
        man.add(new Human("Artyom", "Andropov"));
        man.add(new Human("Petro", "Popov"));
        man.add(new Human("Vasil", "Suhadol"));
        man.add(new Human("Egor", "Perkakov"));
        man.add(new Human("Kirill", "Slovrentsiy"));
        man.add(new Human("Anton", "Antipov"));
        man.add(new Human("Petya", "Kurnosov"));
        man.add(new Human("Antonio", "Zapashnyi"));
        man.add(new Human("Gena", "Debalcev"));

        ArrayList<Human> woman = new ArrayList<>();
        woman.add(new Human("Larisa", "Strezanova"));
        woman.add(new Human("Lubov", "Popova"));
        woman.add(new Human("Julia", "Golovach"));
        woman.add(new Human("Marina", "Vasilkova"));
        woman.add(new Human("Vika", "Disman"));
        woman.add(new Human("Zoya", "Piterskaya"));
        woman.add(new Human("Elena", "Gorbacevich"));
        woman.add(new Human("Tatyana", "Jerdetskaya"));
        woman.add(new Human("Larisa", "Strezanovskaya"));

        HashMap<String, ArrayList<Human>> humanHashMap = new HashMap<>();
        humanHashMap.put("man", man);
        humanHashMap.put("woman", woman);

        Scanner scanner = new Scanner(System.in);

        do {
            System.out.println(Constans.ENTER_NAME);


            String s = scanner.nextLine();
            s = s.toUpperCase();
            s = s.trim();

            switch (s) {
                case "MAN": {
                    System.out.println(humanHashMap.get("man").get((int) ((humanHashMap.get("man").size()) * Math.random())));
                    break;
                }
                case "WOMAN": {
                    System.out.println(humanHashMap.get("woman").get((int) ((humanHashMap.get("woman").size()) * Math.random())));
                    break;
                }
                default:
                    System.exit(0);
            }
        }
        while (true);
    }


}

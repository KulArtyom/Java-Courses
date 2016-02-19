package com.kulart05gmail.homework_8;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * Created by KulArtyom on 19.02.2016.
 */
public class HomeWork {

    public static void main(String[] args) {
        GosCarNumber("1276 IO-7");
        TelephoneNumber("+375 29 1124780");
        DoubleSymbols("Keeeentuukey");
        FileFormat("asdwwweq.pgn");
        InspectionsFileFormat("asdw.exe");
    }

    public static void GosCarNumber(String gosnumber) {

        Pattern p = Pattern.compile("^\\d{4}\\s[A-Z]{2}\\-[1-7]{1}$");
        Matcher m = p.matcher(gosnumber);
        if (m.find()) {
            System.out.println("It's autonumber");
        } else {
            System.out.println("It's not autonumber");
        }
    }

    public static void TelephoneNumber(String telnumber) {

        Pattern p = Pattern.compile("^\\+375\\s(29|33|25)\\s\\d{7}$");
        Matcher m = p.matcher(telnumber);
        if (m.find()) {
            System.out.println("It's telnumber");
        } else {
            System.out.println("It's not telnumber");
        }
    }

    public static void DoubleSymbols(String doublesimbols) {

        Matcher m;
        Pattern p = Pattern.compile("([a-z])\\1");

        do {
            m = p.matcher(doublesimbols);
            if (m.find()) {
                String symbols = m.group(1);
                int a = m.end(1);
                int b = 1;
                while (a < doublesimbols.length() && symbols.toCharArray()[0] == doublesimbols.charAt(a)) {
                    a++;
                    b += 1;
                }
                String symbgoup = "[" + symbols + "]{" + b + "}";
                doublesimbols = doublesimbols.replaceFirst(symbgoup, symbols + b);
            }
        }
        while (m.find());
        System.out.println(doublesimbols);
    }


    private static void FileFormat(String fileformat) {
        Pattern p = Pattern.compile(".+\\.([a-z]+)$");
        Matcher m = p.matcher(fileformat);
        if (m.find()) {
            String s = m.group(1);
            System.out.println(s);
        } else {
            System.out.println("Incorrectly format");
        }

    }

    private static void InspectionsFileFormat(String insfileformat) {
        Pattern p = Pattern.compile(".+\\.(xml|json)$");
        Matcher m = p.matcher(insfileformat);
        if (m.find()) {
            System.out.println("It's correctly format");
        } else {
            System.out.println("It's incorrectly formmat");
        }

    }
}

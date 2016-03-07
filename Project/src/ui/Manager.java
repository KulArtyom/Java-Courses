package ui;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;

/**
 * Created by KulArtyom on 02.03.2016.
 */
public class Manager {

    private SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");

    //реализация паттерна Singlton
    private final static Manager instance = new Manager();

    private Manager(){
    }

    public static Manager getInstance(){
        return instance;
    }

    //заполняем ArrayList
    public void addCustomers() {

        ArrayList<Customers> customers = new ArrayList<>();
        Manager manager = new Manager();

        Customers customer = new Customers(0, "Ivan", "Ivanov", "Ivanovich",
                new String[]{"BMW 5", "Opel"}, true);

        customer.setLastOrder(manager.parseDate("25-09-2015"));
        customer.setDateOfBirth(manager.parseDate("2004-10-25"));
        customers.add(customer);


        Customers customer_1 = new Customers(1, "Alex", "Petrov", "Petrovich",
                new String[]{"Audi", "Citroen", "Toyota"},
                false);
        customer_1.setLastOrder(manager.parseDate("2015-01-12"));
        customer_1.setDateOfBirth(manager.parseDate("1998-03-24"));
        customers.add(customer_1);

        Customers customer_2 = new Customers(2, "Elena", "Golovach", "Vladimirovna",
                new String[]{"Peugeot"},
                true);
        customer_2.setLastOrder(manager.parseDate("2015-05-12"));
        customer_2.setDateOfBirth(manager.parseDate("1999-05-02"));
        customers.add(customer_2);

        Customers customer_3 = new Customers(3, "Olga", "Vanilova", "Ivanovna",
                new String[]{"Peugeot", "Opel"},
                false);
        customer_3.setLastOrder(manager.parseDate("2015-08-12"));
        customer_3.setDateOfBirth(manager.parseDate("1995-12-10"));
        customers.add(customer_3);

        Customers customer_4 = new Customers(4, "Sergei", "Bagrov", "Alexandrovich",
                new String[]{"Lada"}, true);

        customer_4.setLastOrder(manager.parseDate("2015-09-15"));
        customer_4.setDateOfBirth(manager.parseDate("2005-05-04"));
        customers.add(customer_4);

        System.out.println(customers.toString());


    }

    public Date parseDate(String s) {
        Date date = null;
        try {
            date = sdf.parse(s);
        } catch (ParseException e) {
            System.out.println("ParseException clients: " + e.getMessage());
        }
        return date;
    }




}

package GSON;


import ui.Customers;

import java.util.ArrayList;

/**
 * Created by KulArtyom on 02.03.2016.
 */
public class Root {

    private String name;
    private String location;
    private ArrayList<Customers> customers;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    public ArrayList<Customers> getCustomers() {
        return customers;
    }

    public void setCustomers(ArrayList<Customers> customers) {
        this.customers = customers;
    }

    @Override
    public String toString() {
        return "Root{" +
                "name='" + name + '\'' +
                ", location='" + location + '\'' +
                ", customers=" + customers +
                '}';
    }

    public Root(String name, String location, ArrayList<Customers> customers) {
        this.name = name;
        this.location = location;
        this.customers = customers;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Root root = (Root) o;

        if (name != null ? !name.equals(root.name) : root.name != null) return false;
        if (location != null ? !location.equals(root.location) : root.location != null) return false;
        return customers != null ? customers.equals(root.customers) : root.customers == null;

    }

    @Override
    public int hashCode() {
        int result = name != null ? name.hashCode() : 0;
        result = 31 * result + (location != null ? location.hashCode() : 0);
        result = 31 * result + (customers != null ? customers.hashCode() : 0);
        return result;
    }
}



package Jackson;


import ui.Customers;

import java.util.ArrayList;

class Root {

    private String  name;

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


}

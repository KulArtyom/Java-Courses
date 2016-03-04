package ui;


import com.google.gson.annotations.SerializedName;

import java.util.Arrays;
import java.util.Date;

/**
 * Created by KulArtyom on 29.02.2016.
 */
public class Customers {

    private long id;
    private String name;
    private String surname;
    private String second_name;
    @SerializedName("yyyy-MM-dd")
    private Date lastOrder;
    @SerializedName("yyyy-MM-dd")
    private Date dateOfBirth;
    private String[] car;
    private boolean discount;


    public Customers(long id, String name, String surname, String second_name, String[] car, boolean discount) {
        this.id = id;
        this.name = name;
        this.surname = surname;
        this.second_name = second_name;
        this.car = car;
        this.discount = discount;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;

        Customers customers = (Customers) o;

        if (id != customers.id) return false;
        if (discount != customers.discount) return false;
        if (name != null ? !name.equals(customers.name) : customers.name != null) return false;
        if (surname != null ? !surname.equals(customers.surname) : customers.surname != null) return false;
        if (second_name != null ? !second_name.equals(customers.second_name) : customers.second_name != null)
            return false;
        if (lastOrder != null ? !lastOrder.equals(customers.lastOrder) : customers.lastOrder != null) return false;
        if (dateOfBirth != null ? !dateOfBirth.equals(customers.dateOfBirth) : customers.dateOfBirth != null)
            return false;
        // Probably incorrect - comparing Object[] arrays with Arrays.equals
        return Arrays.equals(car, customers.car);

    }

    @Override
    public int hashCode() {
        int result = super.hashCode();
        result = 31 * result + (int) (id ^ (id >>> 32));
        result = 31 * result + (name != null ? name.hashCode() : 0);
        result = 31 * result + (surname != null ? surname.hashCode() : 0);
        result = 31 * result + (second_name != null ? second_name.hashCode() : 0);
        result = 31 * result + (lastOrder != null ? lastOrder.hashCode() : 0);
        result = 31 * result + (dateOfBirth != null ? dateOfBirth.hashCode() : 0);
        result = 31 * result + Arrays.hashCode(car);
        result = 31 * result + (discount ? 1 : 0);
        return result;
    }

    @Override
    public String toString() {
        return "Customers{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", surname='" + surname + '\'' +
                ", second_name='" + second_name + '\'' +
                ", lastOrder=" + lastOrder +
                ", dateOfBirth=" + dateOfBirth +
                ", car=" + Arrays.toString(car) +
                ", discount=" + discount +
                '}';
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSecond_name() {
        return second_name;
    }

    public void setSecond_name(String second_name) {
        this.second_name = second_name;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public Date getLastOrder() {
        return lastOrder;
    }

    public void setLastOrder(Date lastOrder) {
        this.lastOrder = lastOrder;
    }

    public Date getDateOfBirth() {
        return dateOfBirth;
    }

    public void setDateOfBirth(Date dateOfBirth) {
        this.dateOfBirth = dateOfBirth;
    }

    public String[] getCar() {
        return car;
    }

    public void setCar(String[] car) {
        this.car = car;
    }

    public boolean isDiscount() {
        return discount;
    }

    public void setDiscount(boolean discount) {
        this.discount = discount;
    }


}

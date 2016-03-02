package record;

/**
 * Created by KulArtyom on 02.03.2016.
 */
public class Car {
    String model_auto;
    String color;
    String year;

    public String getModel_auto() {
        return model_auto;
    }

    public void setModel_auto(String model_auto) {
        this.model_auto = model_auto;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getYear() {
        return year;
    }

    public void setYear(String year) {
        this.year = year;
    }



    @Override
    public String toString() {
        return "Car{" +
                "model_auto='" + model_auto + '\'' +
                ", color='" + color + '\'' +
                ", year='" + year + '\'' +
                '}';
    }
}

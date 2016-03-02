/**
 * Created by KulArtyom on 02.03.2016.
 */
public class ElementMy {

    private int age;
    private long iD;
    private boolean Degree;
    private String name;
    private String surname;

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public long getiD() {
        return iD;
    }

    public void setiD(long iD) {
        this.iD = iD;
    }

    public boolean isDegree() {
        return Degree;
    }

    public void setDegree(boolean degree) {
        Degree = degree;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    @Override
    public String toString() {
        return "ElementMy{" +
                "age=" + age +
                ", iD=" + iD +
                ", Degree=" + Degree +
                ", name='" + name + '\'' +
                ", surname='" + surname + '\'' +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        ElementMy elementMy = (ElementMy) o;

        if (age != elementMy.age) return false;
        if (iD != elementMy.iD) return false;
        if (Degree != elementMy.Degree) return false;
        if (name != null ? !name.equals(elementMy.name) : elementMy.name != null) return false;
        return surname != null ? surname.equals(elementMy.surname) : elementMy.surname == null;

    }

    @Override
    public int hashCode() {
        int result = age;
        result = 31 * result + (int) (iD ^ (iD >>> 32));
        result = 31 * result + (Degree ? 1 : 0);
        result = 31 * result + (name != null ? name.hashCode() : 0);
        result = 31 * result + (surname != null ? surname.hashCode() : 0);
        return result;
    }
}

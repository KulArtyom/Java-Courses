package Observer;

/**
 * Created by KulArtyom on 16.03.2016.
 */
public class Subject {
    Observers observers = new Observers();

    private Object field;

    public void setField(Object o) {
        field = o;
        observers.notifyObjectModified(this);
    }
}

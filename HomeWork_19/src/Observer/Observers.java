package Observer;

import java.util.ArrayList;
import java.util.Iterator;

/**
 * Created by KulArtyom on 16.03.2016.
 */
public class Observers <T extends Observer> extends ArrayList<T> {
    public void notifyObjectCreated(Object obj) {
        for (Iterator<T> iter = (Iterator<T>) iterator(); iter.hasNext();)
            iter.next().objectCreated(obj);
    }
    public void notifyObjectModified(Object obj) {
        for (Iterator<T> iter = (Iterator<T>) iterator(); iter.hasNext();)
            iter.next().objectModified(obj);
    }
}
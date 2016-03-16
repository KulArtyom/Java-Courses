package Observer; /**
 * Created by KulArtyom on 16.03.2016.
 */

/**
 * Класс mptyObserver может быть полезен в случае если у Наблюдателя достаточно большое количество notify методов.
 */
public class EmptyObserver {
    public void objectCreated(Object obj) {
    }

    public void objectModified(Object obj) {
    }
}

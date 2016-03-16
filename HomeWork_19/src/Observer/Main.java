package Observer;

/**
 * Created by KulArtyom on 16.03.2016.
 */
public class Main {

    /** Паттерн Observer на Java - Наблюдатель
     * Реализация данного паттерна используется для наблюдения за состоянием объектов в системе.
     * Если состояние объектов изменяется в процессе их жизненного цикла, то Наблюдатель оповещает другие части системы об этих событиях.*/

    public static void main (String[]args){
        Observers observers = new Observers();
        observers.add(new EmptyObserver() {
            public void objectCreated(Object obj) { /* реализация */ }
        });

    }
}

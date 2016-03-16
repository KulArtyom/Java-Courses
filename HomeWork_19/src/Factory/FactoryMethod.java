package Factory;

import javax.swing.text.Document;
import java.io.File;

/**
 * Created by KulArtyom on 16.03.2016.
 */
public class FactoryMethod {

    /**
     * Factory Method - это паттерн создания объектов (creational pattern). Данный шаблон проектирования предоставляет интерфейс
     * для создания экземпляров некоторого класса. В момент создания наследники могут определить, какой класс инстанциировать.
     * <p/>
     * Иными словами, Фабрика делегирует создание объектов наследникам родительского класса. Это позволяет использовать в коде
     * программы не специфические классы, а манипулировать абстрактными объектами на более высоком уровне.
     */
    /**
     * В тексте программы при создании отчета нужно передать в функцию getWriter
     * объект File или DOM документ. В результате выполнения метода мы получим нужный объект необходимого уровня абстракции.
     */
    public AbstractWriter getWriter(Object object) {
        AbstractWriter writer = null;
        if (object instanceof File) {
            writer = new ConcreteFileWriter();
        } else if (object instanceof Document) {
            writer = new ConcreteXmlWriter();
        }
        return writer;
    }

    /**
     Используйте паттерн Factory в следующих случаях:
     класс не имеет информации о том, какой тип объекта он должен создать;
     класс передает ответственность по созданию объектов наследникам;
     необходимо создать объект в зависимости от входящих данных.*/
}

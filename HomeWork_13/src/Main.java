import org.xml.sax.SAXException;

import javax.xml.parsers.ParserConfigurationException;
import javax.xml.parsers.SAXParser;
import javax.xml.parsers.SAXParserFactory;
import java.io.File;
import java.io.IOException;

/**
 * Created by KulArtyom on 02.03.2016.
 */
public class Main {
    public static void main(String[] args) {

        SAXParserFactory factory = SAXParserFactory.newInstance();
        SAXParser parser = null;
        try {
            parser = factory.newSAXParser();
        } catch (ParserConfigurationException e1) {
            System.out.println("ParserConfigurationException" + e1.getMessage());
        } catch (SAXException e1) {
            System.out.println("SAXException" + e1.getMessage());
        }

        // Создаем объект класса SAXPars в котором переопределены методы DefaultHandler'а для парсинга нашего файла
        SAXPars saxp = new SAXPars();

        //парсинг файла
        try {
            parser.parse(new File("test.xml"), saxp);
        } catch (SAXException e) {
            System.out.println("SAXException" + e.getMessage());
        } catch (IOException e) {
            System.out.println("IOException" + e.getMessage());
        }
        // Выводим в консоль содержимое коллекции List<ElementMy>
        for (ElementMy eee : saxp.getResult()) {
            System.out.println(eee.toString());
        }
    }

}

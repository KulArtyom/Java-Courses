package record;

import org.w3c.dom.Document;
import org.w3c.dom.Element;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.ParserConfigurationException;
import javax.xml.transform.Transformer;
import javax.xml.transform.TransformerConfigurationException;
import javax.xml.transform.TransformerException;
import javax.xml.transform.TransformerFactory;
import javax.xml.transform.dom.DOMSource;
import javax.xml.transform.stream.StreamResult;
import java.io.File;
import java.util.ArrayList;

/**
 * Created by KulArtyom on 02.03.2016.
 */
public class Main {
    public static void main(String[] args) {

        ArrayList<Car> cars = new ArrayList<>();

        DocumentBuilderFactory dbf = DocumentBuilderFactory.newInstance();
        DocumentBuilder builder = null;
        try {
            builder = dbf.newDocumentBuilder();
        } catch (ParserConfigurationException e3) {
            System.out.println("ParserConfigurationException" + e3.getMessage());
        }
        Document document = builder.newDocument();


        Element rootElement = document.createElement("root");
        document.appendChild(rootElement);


        Element name = document.createElement("auto");
        name.appendChild(document.createTextNode("Cars File"));
        rootElement.appendChild(name);


        Element cars_array = document.createElement("cars_array");
        rootElement.appendChild(cars_array);


        for (Car car : cars) {
            Element auto = document.createElement("auto");
            cars_array.appendChild(auto);

            Element model_auto = document.createElement("model_auto");
            model_auto.appendChild(document.createTextNode(car.getModel_auto()));
            auto.appendChild(model_auto);

            Element color = document.createElement("color");
            color.appendChild(document.createTextNode(car.getColor()));
            auto.appendChild(color);

            Element year = document.createElement("year");
            year.appendChild(document.createTextNode(car.getYear()));
            auto.appendChild(year);
        }

        TransformerFactory transformerFactory = TransformerFactory.newInstance();
        Transformer transformer = null;
        try {
            transformer = transformerFactory.newTransformer();
        } catch (TransformerConfigurationException e2) {
            System.out.println("TransformerConfigurationException: " + e2.getMessage());
        }
        DOMSource source = new DOMSource(document);
        StreamResult result = new StreamResult(new File("cars.xml"));
        try {
            transformer.transform(source, result);
        } catch (TransformerException e1) {
            System.out.println("TransformerException: " + e1.getMessage());
        }


    }
}

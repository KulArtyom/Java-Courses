package Jackson;

import com.fasterxml.jackson.databind.ObjectMapper;
import ui.Customers;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;


public class JSONjacksonParser {


    private Root root;

    public ArrayList<Customers> parse(String jsonFile) throws IOException {

        ObjectMapper om = new ObjectMapper();

        this.root = om.readValue(new File(jsonFile), Root.class);

        return root.getCustomers();
    }


}

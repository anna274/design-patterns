import org.xml.sax.SAXException;
import parsers.Parser;
import parsers.ParserType;

import javax.xml.parsers.ParserConfigurationException;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class App {
    private static final String FILE_NAME = "hospital.xml";

    public static void main(String[] args) throws IOException, SAXException, ParserConfigurationException {
        BufferedReader cin = new BufferedReader(new InputStreamReader(System.in));
        String name = cin.readLine();
        Parser parser = ParserType.getParserByName(name);
        parser.parse(FILE_NAME);
    }
}

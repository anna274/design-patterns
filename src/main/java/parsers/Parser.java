package parsers;

import org.xml.sax.SAXException;

import javax.xml.parsers.ParserConfigurationException;
import java.io.IOException;

public interface Parser {
    void parse(String fileName) throws ParserConfigurationException, SAXException, IOException;
}

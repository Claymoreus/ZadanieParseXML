package zadanieKovsh;

import javax.xml.namespace.QName;
import javax.xml.stream.*;

import java.io.*;
import java.util.Map;
import java.util.TreeMap;


public class StAXparser {

    public Map<String, String> StaxParserMap() throws IOException, XMLStreamException {
        Map<String, String> listArtCitizenship = new TreeMap<>();
        String filePath = "resource/People.xml";
        Reader fileReader = new FileReader(filePath);
        XMLInputFactory xmlInputFactory = XMLInputFactory.newInstance();
        XMLStreamReader xmlStreamReader = xmlInputFactory.createXMLStreamReader(fileReader);
        while (xmlStreamReader.hasNext()) {
            int xmlEvent = xmlStreamReader.next();
            if (xmlEvent == XMLStreamConstants.START_ELEMENT && xmlStreamReader.getLocalName().equals("par")) {
                int attributes = xmlStreamReader.getAttributeCount();
                for (int i = 0; i < attributes; i++) {
                    if (xmlStreamReader.getAttributeValue(i).equals("ГРАЖДАНСТВО")) {
                        for (int j = 0; j < attributes; j++) {
                            xmlStreamReader.hasNext();
                            QName name = xmlStreamReader.getAttributeName(j);
                            String value = xmlStreamReader.getAttributeValue(j);
                            listArtCitizenship.put(name.toString(), value );
                        }
                    }
                }
            }
        }
        return listArtCitizenship;
    }
}

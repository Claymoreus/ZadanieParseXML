package zadanieKovsh;

import org.w3c.dom.*;
import org.xml.sax.SAXException;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.ParserConfigurationException;
import java.io.File;
import java.io.IOException;
import java.util.Set;
import java.util.TreeSet;

public class DOMparser {
    private String idPars = "1";
    private String vidDocPars = "ВИД_ДОК";
    public Set<String> getCollectionDoc() throws ParserConfigurationException, SAXException, IOException {
        Set<String> typeOfDocs = new TreeSet<>();
        DocumentBuilderFactory factory = DocumentBuilderFactory.newInstance();
        DocumentBuilder builder = factory.newDocumentBuilder();
        Document document = builder.parse(new File("resource/People.xml"));
        document.getDocumentElement().normalize();
        NodeList parElements = document.getDocumentElement().getElementsByTagName("par");
        for (int i = 0; i < parElements.getLength(); i++) {
            String parName = parElements.item(i).getAttributes().getNamedItem("name").getNodeValue();
            String parId = parElements.item(i).getAttributes().getNamedItem("step").getNodeValue();
            if (parId.equals(idPars) && parName.equals(vidDocPars)) {
                NodeList parListNode = parElements.item(i).getChildNodes();
                for (int j = 0; j < parListNode.getLength(); j++) {
                    if (parListNode.item(j).getNodeType() == Node.ELEMENT_NODE) {
                        Node parListAttributes = parListNode.item(j).getAttributes().getNamedItem("value");
                        typeOfDocs.add(parListAttributes.getNodeValue());
                    }
                }
            }
        }
        return typeOfDocs;
    }
}

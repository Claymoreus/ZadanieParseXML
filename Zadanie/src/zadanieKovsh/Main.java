package zadanieKovsh;

import org.xml.sax.SAXException;

import javax.xml.parsers.ParserConfigurationException;
import javax.xml.stream.XMLStreamException;
import java.io.IOException;
import java.sql.SQLException;
import java.util.Map;
import java.util.Set;

public class Main {
    public static void main(String[] args) throws IOException, SAXException, ParserConfigurationException, XMLStreamException, SQLException, ClassNotFoundException {
        System.out.println("Задание 1");
        System.out.println("Необходимо сформировать коллекцию, содержащую все виды документов в отсортированном порядке.");
        Set<String> stringSet = null;
        try {
            DOMparser domParser = new DOMparser();
            stringSet = domParser.getCollectionDoc();
            System.out.println(stringSet);
        } catch (Exception e) {
            e.printStackTrace();
        }
        //**********************************************************************
        System.out.println("Задание 2");
        System.out.println("Вывести имена и значения всех атрибутов для par step=\"1\" name=\"ГРАЖДАНСТВО\"");
        try {
            StAXparser stAXParser = new StAXparser();
            Map<String, String> stringStringMap = stAXParser.StaxParserMap();
            System.out.println(stringStringMap.get("step"));
            System.out.println(stringStringMap.get("name"));
            System.out.println(stringStringMap);
        }catch (Exception e) {
            e.printStackTrace();
        }
        //**********************************************************************
        System.out.println("Задание 3");
        System.out.println("создать в базе таблицу-справочник со значениями из первой части");
        try {
            ConnectSqlLite connectorToSql = new ConnectSqlLite();
            connectorToSql.ConectSql();
            connectorToSql.CreateTab();
            connectorToSql.WriteDB(stringSet);
            connectorToSql.ReadDB();
            connectorToSql.CloseDB();
        }catch (Exception e) {
            e.printStackTrace();
        }
    }
}

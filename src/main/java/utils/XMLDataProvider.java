package utils;


import org.apache.commons.lang3.RandomStringUtils;
import org.testng.log4testng.Logger;
import org.w3c.dom.Document;
import org.w3c.dom.Element;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import java.io.File;
import java.util.ArrayList;
import java.util.List;

public class XMLDataProvider {
    private static final Logger log = Logger.getLogger(XMLDataProvider.class);

    public static Object[][] xmlParser(String param) {
        List<Object[]> data = new ArrayList<Object[]>();


        try {
            File xmlDataFile = new File("src/test/resources/testData.xml");


            DocumentBuilderFactory builderFactory = DocumentBuilderFactory.newInstance();

            DocumentBuilder documentBuilder = builderFactory.newDocumentBuilder();

            Document document = documentBuilder.parse(xmlDataFile);


            document.getDocumentElement().normalize();

            NodeList nodeList = document.getElementsByTagName("test");

            for (int i = 0; i < nodeList.getLength(); i++) {
                Node node = nodeList.item(i);

                if (node.getNodeType() == Node.ELEMENT_NODE) {

                    Element element = (Element) node;

                    List<Object> testData = new ArrayList<Object>();

                    if (param.equals("login")) {
                        testData.add(element.getElementsByTagName("login").item(0).getTextContent());
                        testData.add(element.getElementsByTagName("password").item(0).getTextContent());
                        data.add(testData.toArray());
                    } else if (param.equals("message")) {
                        testData.add(element.getElementsByTagName("address").item(0).getTextContent());
                        testData.add(RandomStringUtils.randomAlphanumeric(8) + element.getElementsByTagName("subject").item(0).getTextContent());
                        testData.add(element.getElementsByTagName("message").item(0).getTextContent());
                        data.add(testData.toArray());
                    }



                }

            }


        } catch (Exception e) {
            System.out.println("Reading XML file error!");
            log.error("Reading XML file error!", e);
        }

        Object[][] objectArray = new Object[data.size()][];

        for (int i = 0; i < data.size(); i++) {
            objectArray[i] = data.get(i);
        }


        return objectArray;
    }
}

package ParseXMLDOM;

import org.w3c.dom.Document;
import org.w3c.dom.Element;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;

/**
 * The following Java program ParseXMLDOM.java reads the XML feed, goes through each “item”, and prints out its “title” and "pubDate".
 * @AUTHOR: saxad från netet! hHAHAAHAHA!!!
 */
public class ParseXMLDOM {
    public static void main(String[] args) {
        String url = args[0];

        try {

            /* the SAX way:
            XMLReader myReader = XMLReaderFactory.createXMLReader();
            myReader.setContentHandler(handler);
            myReader.parse(new InputSource(new URL(url).openStream()));*/

            //DOM:
            DocumentBuilderFactory f = DocumentBuilderFactory.newInstance();
            DocumentBuilder b = f.newDocumentBuilder();
            Document doc = b.parse(url);

            doc.getDocumentElement().normalize();
            System.out.println("Root element: " + doc.getDocumentElement().getNodeName());
            System.out.println("RSS URL: " + args[0]);

            //loop through each <item> tag
            NodeList items = doc.getElementsByTagName("item");
            for (int i = 0; i < items.getLength(); i++) {
                Node n = items.item(i);
                if (n.getNodeType() != Node.ELEMENT_NODE)
                    continue;
                Element e = (Element) n;


                //get the "title elem" in this item (only one)
                NodeList titleList = e.getElementsByTagName("title");
                Element titleElem = (Element) titleList.item(0);
                //get the "text node" in the title (only one)
                Node titleNode = titleElem.getChildNodes().item(0);
                //System.out.print(titleNode.getNodeValue());

                //get pubDate element in this item
                NodeList pubDateList = e.getElementsByTagName("pubDate");
                Element pubDateElem =  (Element) pubDateList.item(0);
                //get text node in pubDate
                Node pubDateNode = pubDateElem.getChildNodes().item(0);

                System.out.println("--------\n" + "Title: " + titleNode.getNodeValue() + "\nPublication date: " + pubDateNode.getNodeValue());

            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}

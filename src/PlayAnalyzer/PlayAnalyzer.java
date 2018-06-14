package PlayAnalyzer;


import org.xml.sax.XMLReader;

import javax.xml.parsers.SAXParser;
import javax.xml.parsers.SAXParserFactory;

import static PlayAnalyzer.SAXLocalNameCount.convertToFileURL;
import static PlayAnalyzer.SAXLocalNameCount.usage;


public class PlayAnalyzer {
    public static void main(String[] args) throws Exception{
        String fileName = null;
        System.out.println("File path: " + args[0]);

        for (int i = 0; i < args.length; i++) {
            fileName = args[i];
            if (i != args.length - 1) {
                System.out.println("lel");
                usage();
            }
        }

        if (fileName == null) {
            usage();
        }
        //set up SAX parser with factory
        SAXParserFactory spf = SAXParserFactory.newInstance();
        spf.setNamespaceAware(true);
        SAXParser saxParser = spf.newSAXParser();

        XMLReader xmlReader = saxParser.getXMLReader();
        xmlReader.setContentHandler(new SAXLocalNameCount());
        xmlReader.parse(convertToFileURL(fileName));
        xmlReader.setErrorHandler(new MyErrorHandler(System.err));
    }
}

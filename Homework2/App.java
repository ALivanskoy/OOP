
import javax.xml.crypto.dsig.XMLObject;
import javax.xml.crypto.dsig.XMLSignatureFactory;

import com.github.cliftonlabs.json_simple.JsonObject;

public class App {

    public static void main(String[] args) {

        
        String str = "текст";
        
        JsonObject jsonObj = new JsonObject();
        
        XMLSignatureFactory fac = XMLSignatureFactory.getInstance();
        XMLObject xmlObj = fac.newXMLObject(null,null,null,null);

        WriterInFile writerText = new TextWriteInFile(str);
        WriterInFile writerJson = new JsonWriterInFile(jsonObj);
        WriterInFile writerXml = new XmlWriterInFile(xmlObj);

        writerText.write();
        writerJson.write();
        writerXml.write();


    };

}
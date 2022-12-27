import javax.xml.crypto.dsig.XMLObject;

public class XmlWriterInFile implements WriterInFile {

    private XMLObject xmlObj;

    XmlWriterInFile(XMLObject xmlObj) {

        this.xmlObj = xmlObj;

    }

    @Override
    public void write() {
        
        System.out.println("Запись в файл Xml");

    }

}

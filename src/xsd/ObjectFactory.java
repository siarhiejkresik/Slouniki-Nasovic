//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.8-b130911.1802 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2020.11.01 at 12:57:22 PM MSK 
//


package xsd;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the xsd package. 
 * <p>An ObjectFactory allows you to programatically 
 * construct new instances of the Java representation 
 * for XML content. The Java representation of XML 
 * content can consist of schema derived interfaces 
 * and classes representing the binding of schema 
 * type definitions, element declarations and model 
 * groups.  Factory methods for each of these are 
 * provided in this class.
 * 
 */
@XmlRegistry
public class ObjectFactory {

    private final static QName _Zah_QNAME = new QName("", "zah");
    private final static QName _Rtf_QNAME = new QName("", "rtf");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: xsd
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link Tlum }
     * 
     */
    public Tlum createTlum() {
        return new Tlum();
    }

    /**
     * Create an instance of {@link Root }
     * 
     */
    public Root createRoot() {
        return new Root();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "zah")
    public JAXBElement<String> createZah(String value) {
        return new JAXBElement<String>(_Zah_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "rtf")
    public JAXBElement<String> createRtf(String value) {
        return new JAXBElement<String>(_Rtf_QNAME, String.class, null, value);
    }

}
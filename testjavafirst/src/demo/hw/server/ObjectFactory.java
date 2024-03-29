
package demo.hw.server;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the demo.hw.server package. 
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

    private final static QName _SayHiResponseReturn_QNAME = new QName("http://server.hw.demo", "return");
    private final static QName _SayHiText_QNAME = new QName("http://server.hw.demo", "text");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: demo.hw.server
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link SayHiResponse }
     * 
     */
    public SayHiResponse createSayHiResponse() {
        return new SayHiResponse();
    }

    /**
     * Create an instance of {@link SayHi }
     * 
     */
    public SayHi createSayHi() {
        return new SayHi();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://server.hw.demo", name = "return", scope = SayHiResponse.class)
    public JAXBElement<String> createSayHiResponseReturn(String value) {
        return new JAXBElement<String>(_SayHiResponseReturn_QNAME, String.class, SayHiResponse.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://server.hw.demo", name = "text", scope = SayHi.class)
    public JAXBElement<String> createSayHiText(String value) {
        return new JAXBElement<String>(_SayHiText_QNAME, String.class, SayHi.class, value);
    }

}

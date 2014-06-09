
package demo.hw.server;

import java.net.MalformedURLException;
import java.net.URL;
import java.util.logging.Logger;
import javax.xml.namespace.QName;
import javax.xml.ws.Service;
import javax.xml.ws.WebEndpoint;
import javax.xml.ws.WebServiceClient;
import javax.xml.ws.WebServiceFeature;


/**
 * This class was generated by the JAX-WS RI.
 * JAX-WS RI 2.1.6 in JDK 6
 * Generated source version: 2.1
 * 
 */
@WebServiceClient(name = "HelloWorld", targetNamespace = "http://server.hw.demo/", wsdlLocation = "file:/C:/Axis2Workspace/testjavafirst/src/HelloWorld.wsdl")
public class HelloWorld
    extends Service
{

    private final static URL HELLOWORLD_WSDL_LOCATION;
    private final static Logger logger = Logger.getLogger(demo.hw.server.HelloWorld.class.getName());

    static {
        URL url = null;
        try {
            URL baseUrl;
            baseUrl = demo.hw.server.HelloWorld.class.getResource(".");
            url = new URL(baseUrl, "file:/C:/Axis2Workspace/testjavafirst/src/HelloWorld.wsdl");
        } catch (MalformedURLException e) {
            logger.warning("Failed to create URL for the wsdl Location: 'file:/C:/Axis2Workspace/testjavafirst/src/HelloWorld.wsdl', retrying as a local file");
            logger.warning(e.getMessage());
        }
        HELLOWORLD_WSDL_LOCATION = url;
    }

    public HelloWorld(URL wsdlLocation, QName serviceName) {
        super(wsdlLocation, serviceName);
    }

    public HelloWorld() {
        super(HELLOWORLD_WSDL_LOCATION, new QName("http://server.hw.demo/", "HelloWorld"));
    }

    /**
     * 
     * @return
     *     returns HelloWorldPortType
     */
    @WebEndpoint(name = "HelloWorldHttpSoap11Endpoint")
    public HelloWorldPortType getHelloWorldHttpSoap11Endpoint() {
        return super.getPort(new QName("http://server.hw.demo/", "HelloWorldHttpSoap11Endpoint"), HelloWorldPortType.class);
    }

    /**
     * 
     * @param features
     *     A list of {@link javax.xml.ws.WebServiceFeature} to configure on the proxy.  Supported features not in the <code>features</code> parameter will have their default values.
     * @return
     *     returns HelloWorldPortType
     */
    @WebEndpoint(name = "HelloWorldHttpSoap11Endpoint")
    public HelloWorldPortType getHelloWorldHttpSoap11Endpoint(WebServiceFeature... features) {
        return super.getPort(new QName("http://server.hw.demo/", "HelloWorldHttpSoap11Endpoint"), HelloWorldPortType.class, features);
    }

}

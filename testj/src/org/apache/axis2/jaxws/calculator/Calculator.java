
package org.apache.axis2.jaxws.calculator;

import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebResult;
import javax.jws.WebService;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.ws.RequestWrapper;
import javax.xml.ws.ResponseWrapper;
import javax.xml.ws.wsaddressing.W3CEndpointReference;


/**
 * This class was generated by the JAX-WS RI.
 * JAX-WS RI 2.1.6 in JDK 6
 * Generated source version: 2.1
 * 
 */
@WebService(name = "Calculator", targetNamespace = "http://calculator.jaxws.axis2.apache.org")
@XmlSeeAlso({
    ObjectFactory.class
})
public interface Calculator {


    /**
     * 
     * @return
     *     returns javax.xml.ws.wsaddressing.W3CEndpointReference
     */
    @WebMethod
    @WebResult(targetNamespace = "http://calculator.jaxws.axis2.apache.org")
    @RequestWrapper(localName = "getTicket", targetNamespace = "http://calculator.jaxws.axis2.apache.org", className = "org.apache.axis2.jaxws.calculator.GetTicket")
    @ResponseWrapper(localName = "getTicketResponse", targetNamespace = "http://calculator.jaxws.axis2.apache.org", className = "org.apache.axis2.jaxws.calculator.GetTicketResponse")
    public W3CEndpointReference getTicket();

    /**
     * 
     * @param value1
     * @param value2
     * @return
     *     returns int
     * @throws AddNumbersException_Exception
     */
    @WebMethod
    @WebResult(targetNamespace = "http://calculator.jaxws.axis2.apache.org")
    @RequestWrapper(localName = "add", targetNamespace = "http://calculator.jaxws.axis2.apache.org", className = "org.apache.axis2.jaxws.calculator.Add")
    @ResponseWrapper(localName = "addResponse", targetNamespace = "http://calculator.jaxws.axis2.apache.org", className = "org.apache.axis2.jaxws.calculator.AddResponse")
    public int add(
        @WebParam(name = "value1", targetNamespace = "http://calculator.jaxws.axis2.apache.org")
        int value1,
        @WebParam(name = "value2", targetNamespace = "http://calculator.jaxws.axis2.apache.org")
        int value2)
        throws AddNumbersException_Exception
    ;

}

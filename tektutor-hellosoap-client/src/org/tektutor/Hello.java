
package org.tektutor;

import javax.jws.WebMethod;
import javax.jws.WebResult;
import javax.jws.WebService;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.ws.RequestWrapper;
import javax.xml.ws.ResponseWrapper;


/**
 * This class was generated by the JAX-WS RI.
 * JAX-WS RI 2.2.9-b130926.1035
 * Generated source version: 2.2
 * 
 */
@WebService(name = "Hello", targetNamespace = "http://tektutor.org")
@XmlSeeAlso({
    ObjectFactory.class
})
public interface Hello {


    /**
     * 
     * @return
     *     returns java.lang.String
     */
    @WebMethod
    @WebResult(name = "sayHelloReturn", targetNamespace = "http://tektutor.org")
    @RequestWrapper(localName = "sayHello", targetNamespace = "http://tektutor.org", className = "org.tektutor.SayHello")
    @ResponseWrapper(localName = "sayHelloResponse", targetNamespace = "http://tektutor.org", className = "org.tektutor.SayHelloResponse")
    public String sayHello();

}
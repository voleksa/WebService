
package com.epam.lab.soapClient.service;

import com.epam.lab.model.Copter;
import com.epam.lab.webmodel.Response;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the com.epam.lab.soapClient.service package.
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

    private final static QName _Copter_QNAME = new QName("http://service.soapService.lab.epam.com/", "Copter");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: com.epam.lab.soapClient.service
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link Copter }
     * 
     */
    public Copter createCopter() {
        return new Copter();
    }

    /**
     * Create an instance of {@link Response }
     * 
     */
    public Response createResponse() {
        return new Response();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Copter }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://service.soapService.lab.epam.com/", name = "Copter")
    public JAXBElement<Copter> createCopter(Copter value) {
        return new JAXBElement<Copter>(_Copter_QNAME, Copter.class, null, value);
    }

}

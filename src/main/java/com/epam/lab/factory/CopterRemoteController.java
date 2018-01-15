package com.epam.lab.factory;

import com.epam.lab.soapClient.service.ObjectFactory;
import com.epam.lab.webmodel.Response;

import javax.jws.WebMethod;
import javax.jws.WebResult;
import javax.jws.WebService;
import javax.jws.soap.SOAPBinding;
import javax.xml.bind.annotation.XmlSeeAlso;

/**
 * This class was generated by Apache CXF 3.1.12
 * 2017-08-23T17:15:45.437+03:00
 * Generated source version: 3.1.12
 * 
 */
@WebService(targetNamespace = "http://service.soapService.lab.epam.com/", name = "CopterRemoteController")
@XmlSeeAlso({ObjectFactory.class})
@SOAPBinding(style = SOAPBinding.Style.RPC)
public interface CopterRemoteController {

    @WebMethod
    @WebResult(name = "return", targetNamespace = "http://service.soapService.lab.epam.com/", partName = "return")
    public Response moveForward();

    @WebMethod
    @WebResult(name = "return", targetNamespace = "http://service.soapService.lab.epam.com/", partName = "return")
    public Response stop();

    @WebMethod
    @WebResult(name = "return", targetNamespace = "http://service.soapService.lab.epam.com/", partName = "return")
    public Response moveBack();

    @WebMethod
    @WebResult(name = "return", targetNamespace = "http://service.soapService.lab.epam.com/", partName = "return")
    public Response getCurrentPosition();

    @WebMethod
    @WebResult(name = "return", targetNamespace = "http://service.soapService.lab.epam.com/", partName = "return")
    public Response moveDown();

    @WebMethod
    @WebResult(name = "return", targetNamespace = "http://service.soapService.lab.epam.com/", partName = "return")
    public Response moveUp();
}
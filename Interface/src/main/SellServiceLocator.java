/**
 * SellServiceLocator.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package main;

public class SellServiceLocator extends org.apache.axis.client.Service implements main.SellService {

    public SellServiceLocator() {
    }


    public SellServiceLocator(org.apache.axis.EngineConfiguration config) {
        super(config);
    }

    public SellServiceLocator(java.lang.String wsdlLoc, javax.xml.namespace.QName sName) throws javax.xml.rpc.ServiceException {
        super(wsdlLoc, sName);
    }

    // Use to get a proxy class for Sell
    private java.lang.String Sell_address = "http://localhost:8080/Wheels-project/services/Sell";

    public java.lang.String getSellAddress() {
        return Sell_address;
    }

    // The WSDD service name defaults to the port name.
    private java.lang.String SellWSDDServiceName = "Sell";

    public java.lang.String getSellWSDDServiceName() {
        return SellWSDDServiceName;
    }

    public void setSellWSDDServiceName(java.lang.String name) {
        SellWSDDServiceName = name;
    }

    public main.Sell getSell() throws javax.xml.rpc.ServiceException {
       java.net.URL endpoint;
        try {
            endpoint = new java.net.URL(Sell_address);
        }
        catch (java.net.MalformedURLException e) {
            throw new javax.xml.rpc.ServiceException(e);
        }
        return getSell(endpoint);
    }

    public main.Sell getSell(java.net.URL portAddress) throws javax.xml.rpc.ServiceException {
        try {
            main.SellSoapBindingStub _stub = new main.SellSoapBindingStub(portAddress, this);
            _stub.setPortName(getSellWSDDServiceName());
            return _stub;
        }
        catch (org.apache.axis.AxisFault e) {
            return null;
        }
    }

    public void setSellEndpointAddress(java.lang.String address) {
        Sell_address = address;
    }

    /**
     * For the given interface, get the stub implementation.
     * If this service has no port for the given interface,
     * then ServiceException is thrown.
     */
    public java.rmi.Remote getPort(Class serviceEndpointInterface) throws javax.xml.rpc.ServiceException {
        try {
            if (main.Sell.class.isAssignableFrom(serviceEndpointInterface)) {
                main.SellSoapBindingStub _stub = new main.SellSoapBindingStub(new java.net.URL(Sell_address), this);
                _stub.setPortName(getSellWSDDServiceName());
                return _stub;
            }
        }
        catch (java.lang.Throwable t) {
            throw new javax.xml.rpc.ServiceException(t);
        }
        throw new javax.xml.rpc.ServiceException("There is no stub implementation for the interface:  " + (serviceEndpointInterface == null ? "null" : serviceEndpointInterface.getName()));
    }

    /**
     * For the given interface, get the stub implementation.
     * If this service has no port for the given interface,
     * then ServiceException is thrown.
     */
    public java.rmi.Remote getPort(javax.xml.namespace.QName portName, Class serviceEndpointInterface) throws javax.xml.rpc.ServiceException {
        if (portName == null) {
            return getPort(serviceEndpointInterface);
        }
        java.lang.String inputPortName = portName.getLocalPart();
        if ("Sell".equals(inputPortName)) {
            return getSell();
        }
        else  {
            java.rmi.Remote _stub = getPort(serviceEndpointInterface);
            ((org.apache.axis.client.Stub) _stub).setPortName(portName);
            return _stub;
        }
    }

    public javax.xml.namespace.QName getServiceName() {
        return new javax.xml.namespace.QName("http://main", "SellService");
    }

    private java.util.HashSet ports = null;

    public java.util.Iterator getPorts() {
        if (ports == null) {
            ports = new java.util.HashSet();
            ports.add(new javax.xml.namespace.QName("http://main", "Sell"));
        }
        return ports.iterator();
    }

    /**
    * Set the endpoint address for the specified port name.
    */
    public void setEndpointAddress(java.lang.String portName, java.lang.String address) throws javax.xml.rpc.ServiceException {
        
if ("Sell".equals(portName)) {
            setSellEndpointAddress(address);
        }
        else 
{ // Unknown Port Name
            throw new javax.xml.rpc.ServiceException(" Cannot set Endpoint Address for Unknown Port" + portName);
        }
    }

    /**
    * Set the endpoint address for the specified port name.
    */
    public void setEndpointAddress(javax.xml.namespace.QName portName, java.lang.String address) throws javax.xml.rpc.ServiceException {
        setEndpointAddress(portName.getLocalPart(), address);
    }

}

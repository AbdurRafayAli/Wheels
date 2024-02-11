/**
 * BuyServiceLocator.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package main;

public class BuyServiceLocator extends org.apache.axis.client.Service implements main.BuyService {

    public BuyServiceLocator() {
    }


    public BuyServiceLocator(org.apache.axis.EngineConfiguration config) {
        super(config);
    }

    public BuyServiceLocator(java.lang.String wsdlLoc, javax.xml.namespace.QName sName) throws javax.xml.rpc.ServiceException {
        super(wsdlLoc, sName);
    }

    // Use to get a proxy class for Buy
    private java.lang.String Buy_address = "http://localhost:8080/Wheels-project/services/Buy";

    public java.lang.String getBuyAddress() {
        return Buy_address;
    }

    // The WSDD service name defaults to the port name.
    private java.lang.String BuyWSDDServiceName = "Buy";

    public java.lang.String getBuyWSDDServiceName() {
        return BuyWSDDServiceName;
    }

    public void setBuyWSDDServiceName(java.lang.String name) {
        BuyWSDDServiceName = name;
    }

    public main.Buy getBuy() throws javax.xml.rpc.ServiceException {
       java.net.URL endpoint;
        try {
            endpoint = new java.net.URL(Buy_address);
        }
        catch (java.net.MalformedURLException e) {
            throw new javax.xml.rpc.ServiceException(e);
        }
        return getBuy(endpoint);
    }

    public main.Buy getBuy(java.net.URL portAddress) throws javax.xml.rpc.ServiceException {
        try {
            main.BuySoapBindingStub _stub = new main.BuySoapBindingStub(portAddress, this);
            _stub.setPortName(getBuyWSDDServiceName());
            return _stub;
        }
        catch (org.apache.axis.AxisFault e) {
            return null;
        }
    }

    public void setBuyEndpointAddress(java.lang.String address) {
        Buy_address = address;
    }

    /**
     * For the given interface, get the stub implementation.
     * If this service has no port for the given interface,
     * then ServiceException is thrown.
     */
    public java.rmi.Remote getPort(Class serviceEndpointInterface) throws javax.xml.rpc.ServiceException {
        try {
            if (main.Buy.class.isAssignableFrom(serviceEndpointInterface)) {
                main.BuySoapBindingStub _stub = new main.BuySoapBindingStub(new java.net.URL(Buy_address), this);
                _stub.setPortName(getBuyWSDDServiceName());
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
        if ("Buy".equals(inputPortName)) {
            return getBuy();
        }
        else  {
            java.rmi.Remote _stub = getPort(serviceEndpointInterface);
            ((org.apache.axis.client.Stub) _stub).setPortName(portName);
            return _stub;
        }
    }

    public javax.xml.namespace.QName getServiceName() {
        return new javax.xml.namespace.QName("http://main", "BuyService");
    }

    private java.util.HashSet ports = null;

    public java.util.Iterator getPorts() {
        if (ports == null) {
            ports = new java.util.HashSet();
            ports.add(new javax.xml.namespace.QName("http://main", "Buy"));
        }
        return ports.iterator();
    }

    /**
    * Set the endpoint address for the specified port name.
    */
    public void setEndpointAddress(java.lang.String portName, java.lang.String address) throws javax.xml.rpc.ServiceException {
        
if ("Buy".equals(portName)) {
            setBuyEndpointAddress(address);
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

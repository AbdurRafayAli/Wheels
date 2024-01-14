/**
 * BuyService.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package main;

public interface BuyService extends javax.xml.rpc.Service {
    public java.lang.String getBuyAddress();

    public main.Buy getBuy() throws javax.xml.rpc.ServiceException;

    public main.Buy getBuy(java.net.URL portAddress) throws javax.xml.rpc.ServiceException;
}

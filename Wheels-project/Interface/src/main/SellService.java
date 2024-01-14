/**
 * SellService.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package main;

public interface SellService extends javax.xml.rpc.Service {
    public java.lang.String getSellAddress();

    public main.Sell getSell() throws javax.xml.rpc.ServiceException;

    public main.Sell getSell(java.net.URL portAddress) throws javax.xml.rpc.ServiceException;
}

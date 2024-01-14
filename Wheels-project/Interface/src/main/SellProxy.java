package main;

public class SellProxy implements main.Sell {
  private String _endpoint = null;
  private main.Sell sell = null;
  
  public SellProxy() {
    _initSellProxy();
  }
  
  public SellProxy(String endpoint) {
    _endpoint = endpoint;
    _initSellProxy();
  }
  
  private void _initSellProxy() {
    try {
      sell = (new main.SellServiceLocator()).getSell();
      if (sell != null) {
        if (_endpoint != null)
          ((javax.xml.rpc.Stub)sell)._setProperty("javax.xml.rpc.service.endpoint.address", _endpoint);
        else
          _endpoint = (String)((javax.xml.rpc.Stub)sell)._getProperty("javax.xml.rpc.service.endpoint.address");
      }
      
    }
    catch (javax.xml.rpc.ServiceException serviceException) {}
  }
  
  public String getEndpoint() {
    return _endpoint;
  }
  
  public void setEndpoint(String endpoint) {
    _endpoint = endpoint;
    if (sell != null)
      ((javax.xml.rpc.Stub)sell)._setProperty("javax.xml.rpc.service.endpoint.address", _endpoint);
    
  }
  
  public main.Sell getSell() {
    if (sell == null)
      _initSellProxy();
    return sell;
  }
  
  public java.lang.String sellCar(java.lang.String make, java.lang.String model, java.lang.String year, java.lang.String mileage, float price) throws java.rmi.RemoteException{
    if (sell == null)
      _initSellProxy();
    return sell.sellCar(make, model, year, mileage, price);
  }
  
  
}
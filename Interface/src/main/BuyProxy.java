package main;

public class BuyProxy implements main.Buy {
  private String _endpoint = null;
  private main.Buy buy = null;
  
  public BuyProxy() {
    _initBuyProxy();
  }
  
  public BuyProxy(String endpoint) {
    _endpoint = endpoint;
    _initBuyProxy();
  }
  
  private void _initBuyProxy() {
    try {
      buy = (new main.BuyServiceLocator()).getBuy();
      if (buy != null) {
        if (_endpoint != null)
          ((javax.xml.rpc.Stub)buy)._setProperty("javax.xml.rpc.service.endpoint.address", _endpoint);
        else
          _endpoint = (String)((javax.xml.rpc.Stub)buy)._getProperty("javax.xml.rpc.service.endpoint.address");
      }
      
    }
    catch (javax.xml.rpc.ServiceException serviceException) {}
  }
  
  public String getEndpoint() {
    return _endpoint;
  }
  
  public void setEndpoint(String endpoint) {
    _endpoint = endpoint;
    if (buy != null)
      ((javax.xml.rpc.Stub)buy)._setProperty("javax.xml.rpc.service.endpoint.address", _endpoint);
    
  }
  
  public main.Buy getBuy() {
    if (buy == null)
      _initBuyProxy();
    return buy;
  }
  
  public java.lang.String setBuyerData(int userid, int carid, java.lang.String type) throws java.rmi.RemoteException{
    if (buy == null)
      _initBuyProxy();
    return buy.setBuyerData(userid, carid, type);
  }
  
  
}
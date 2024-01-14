package main;

public class ShowCarsProxy implements main.ShowCars {
  private String _endpoint = null;
  private main.ShowCars showCars = null;
  
  public ShowCarsProxy() {
    _initShowCarsProxy();
  }
  
  public ShowCarsProxy(String endpoint) {
    _endpoint = endpoint;
    _initShowCarsProxy();
  }
  
  private void _initShowCarsProxy() {
    try {
      showCars = (new main.ShowCarsServiceLocator()).getShowCars();
      if (showCars != null) {
        if (_endpoint != null)
          ((javax.xml.rpc.Stub)showCars)._setProperty("javax.xml.rpc.service.endpoint.address", _endpoint);
        else
          _endpoint = (String)((javax.xml.rpc.Stub)showCars)._getProperty("javax.xml.rpc.service.endpoint.address");
      }
      
    }
    catch (javax.xml.rpc.ServiceException serviceException) {}
  }
  
  public String getEndpoint() {
    return _endpoint;
  }
  
  public void setEndpoint(String endpoint) {
    _endpoint = endpoint;
    if (showCars != null)
      ((javax.xml.rpc.Stub)showCars)._setProperty("javax.xml.rpc.service.endpoint.address", _endpoint);
    
  }
  
  public main.ShowCars getShowCars() {
    if (showCars == null)
      _initShowCarsProxy();
    return showCars;
  }
  
  public main.Car[] showcars() throws java.rmi.RemoteException{
    if (showCars == null)
      _initShowCarsProxy();
    return showCars.showcars();
  }
  
  
}
import java.rmi.*;
import java.rmi.registry.*;

public class RMIClient
{
  public static void main(String[] args)
  {
    try
    {
      String host = "rmi://127.0.0.1:2000/DB";
//      RemoteDate dateServer = (RemoteDate)Naming.lookup(host);
      Registry registry = LocateRegistry.getRegistry(2000);
      RemoteDate dateServer = (RemoteDate)registry.lookup(host);
      System.out.println(dateServer.getDate()); 
    }
    catch(Exception e)
    {
      System.out.println(e);
    }
  }
}

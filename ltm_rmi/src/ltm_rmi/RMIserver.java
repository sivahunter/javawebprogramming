/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ltm_rmi;

import java.rmi.Remote;
import java.rmi.RemoteException;
import java.rmi.registry.LocateRegistry;
import java.rmi.registry.Registry;
import java.rmi.server.UnicastRemoteObject;

/**
 *
 * @author ASUS
 */
public class RMIserver extends UnicastRemoteObject implements RMIInterface{
    Registry registry;
    public RMIserver() throws RemoteException
    {
        registry=LocateRegistry.createRegistry(5000);
        registry.rebind("calRMI", this);
    }
    
    public static void main(String[] args) throws RemoteException {
        RMIserver server= new RMIserver();
    }
    @Override
  public int add(int a,int b)throws RemoteException{
      return a+b;
  }
    @Override
  public int tich2so(int a,int b)throws RemoteException
  {
      return a*b;
  }
}

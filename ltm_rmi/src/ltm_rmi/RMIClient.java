/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ltm_rmi;

import java.rmi.NotBoundException;
import java.rmi.RemoteException;
import java.rmi.registry.LocateRegistry;
import java.rmi.registry.Registry;

/**
 *
 * @author ASUS
 */
public class RMIClient {
    
    Registry registry;
    RMIInterface server;
   
    public RMIClient()throws RemoteException, NotBoundException{
        registry= LocateRegistry.getRegistry("127.0.0.1",5000);
        server= (RMIInterface) registry.lookup("calRMI");
    }
    public static void main(String[] args) throws RemoteException, NotBoundException {
        RMIClient client = new RMIClient();
        System.out.println(client.server.add(10, 30));
        System.out.println(client.server.tich2so(5, 10));
    }
}

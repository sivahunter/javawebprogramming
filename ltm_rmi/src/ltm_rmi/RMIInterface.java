/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ltm_rmi;

import java.rmi.Remote;
import java.rmi.RemoteException;

/**
 *
 * @author ASUS
 */
public interface RMIInterface extends Remote{
    public int add(int a,int b)throws RemoteException;
    public int tich2so(int a,int b) throws RemoteException;
}

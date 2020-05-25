/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package auca.library.service;

import auca.library.model.Client;
import java.rmi.Remote;
import java.rmi.RemoteException;

/**
 *
 * @author PAV
 */
public interface IClientService extends Remote{
    public boolean save(String regno,String firstname,String lastname,String address,String phoneno,String clientcategory,String photo)throws RemoteException;
    public boolean update(String regno,String firstname,String lastname,String address,String phoneno,String clientcategory,String photo)throws RemoteException;
    public void delete(Client c)throws RemoteException;
}


/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package auca.library.service;

import auca.library.dao.ClientDao;
import auca.library.model.Client;
import java.rmi.RemoteException;
import java.rmi.server.UnicastRemoteObject;

/**
 *
 * @author PAV
 */
public class ClientService  extends UnicastRemoteObject implements IClientService{
    public ClientService()throws RemoteException{
        super();
    
    }

    @Override
    public boolean save(String regno, String firstname, String lastname, String address, String phoneno,String clientcategory, String photo) throws RemoteException {
        Client cl = new Client(regno,firstname,lastname,address,phoneno,clientcategory,photo);
        ClientDao cdao =new ClientDao();
        cdao.SaveClient(cl);
        return true;     
        
       
    }

  

    @Override
    public boolean update(String regno, String firstname, String lastname, String address, String phoneno, String clientcategory, String photo) throws RemoteException {
        Client cl = new Client(regno,firstname,lastname,address,phoneno,clientcategory,photo);
        ClientDao cdao =new ClientDao();
        cdao.UpdateClient(cl);
        return true;
        

    }

    @Override
    public void delete(Client c) throws RemoteException {
        ClientDao cdao =new ClientDao();
        cdao.DeleteClient(c);
    }
    }    



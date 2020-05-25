/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package auca.library.service;

import java.rmi.Remote;
import java.rmi.RemoteException;

/**
 *
 * @author PAV
 */
public interface IBookCategoryService extends Remote{
    public boolean save(String cid,String cname)throws RemoteException;
    public boolean update(String cid,String cname)throws RemoteException;
    public boolean delete(String cid)throws RemoteException; 

    

    
}

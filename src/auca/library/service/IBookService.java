/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package auca.library.service;

import auca.library.model.Category;
import java.rmi.Remote;
import java.rmi.RemoteException;
import java.util.Date;

/**
 *
 * @author PAV
 */
public interface IBookService  extends Remote {
public boolean save(String bookid,String title,String publishinghouse,Date publishingdate,String author,String pages,String categoryname)throws RemoteException;
public boolean update(String bookid,String title,String publishinghouse,Date publishingdate,String author,String pages,String categoryname)throws RemoteException;
public boolean delete(String bookid)throws RemoteException;
}

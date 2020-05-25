/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package auca.library.service;

import auca.library.dao.CheckOutDao;
import auca.library.model.CheckOut;
import java.rmi.RemoteException;
import java.rmi.server.UnicastRemoteObject;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author PAV
 */
public class CheckOutService extends UnicastRemoteObject implements ICheckOutService {
    public CheckOutService()throws RemoteException{
        super();
    
    }

    @Override
    public boolean save(Integer id, String clientname, String bookname, String author, Date returndate, String status) throws RemoteException {
        
            CheckOut checkOut = new CheckOut(id,clientname, bookname, author, returndate, status);
            CheckOutDao choutdao = new CheckOutDao();
            choutdao.SavCheckOut(checkOut);
             return true;
        
        }

    

}

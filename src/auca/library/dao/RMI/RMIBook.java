/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package auca.library.dao.RMI;

import auca.library.service.IBookService;
import java.rmi.AccessException;
import java.rmi.NotBoundException;
import java.rmi.RemoteException;
import java.rmi.registry.LocateRegistry;
import java.rmi.registry.Registry;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author PAV
 */
public class RMIBook {
   /* public static void main(String[] args) {
      
        try {
            Registry registry =LocateRegistry.getRegistry("localhost",2000);
            IBookService bookService= (IBookService) registry.lookup("bookservice");
            boolean out =bookService.save("001", "data structure", "auca","2020-01-21" , "data", "120", "120");
        } catch (RemoteException ex) {
            Logger.getLogger(RMIBook.class.getName()).log(Level.SEVERE, null, ex);
        } catch (NotBoundException ex) {
            Logger.getLogger(RMIBook.class.getName()).log(Level.SEVERE, null, ex);
        }
       
        
    }*/
    
}

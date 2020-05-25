/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package auca.library.dao.RMI;

import auca.library.service.IBookCategoryService;
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
public class RMIBookCategory {
    public static void main(String[] args) {
        try {
            Registry registry = LocateRegistry.getRegistry("localhost", 2222);
            IBookCategoryService bookcategoryservice = (IBookCategoryService) registry.lookup("bookcategoryservice");
            boolean out = bookcategoryservice.save("CB010", "Biology");
            System.out.println("saved");
        } catch (RemoteException ex) {
            Logger.getLogger(RMIBookCategory.class.getName()).log(Level.SEVERE, null, ex);
        } catch (NotBoundException ex) {
            Logger.getLogger(RMIBookCategory.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
}

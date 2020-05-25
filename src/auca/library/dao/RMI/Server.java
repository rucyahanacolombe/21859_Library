/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package auca.library.dao.RMI;

import auca.library.service.BookCategoryService;
import auca.library.service.BookService;
import auca.library.service.CheckOutService;
import auca.library.service.ClientService;
import java.rmi.RemoteException;
import java.rmi.registry.LocateRegistry;
import java.rmi.registry.Registry;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author PAV
 */
public class Server {
    public static void main(String[] args) {
        try {
            Registry registry = LocateRegistry.createRegistry(2222);
            registry.rebind("clientservice", new ClientService());
            registry.rebind("bookcategoryservice", new BookCategoryService());
            registry.rebind("bookservice", new BookService());
            registry.rebind("checkoutservice", new CheckOutService());
            

            System.out.println("Server Started!!");
        } catch (RemoteException ex) {
            Logger.getLogger(Server.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
}

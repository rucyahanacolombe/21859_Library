/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package auca.library.dao.RMI;

import auca.library.service.IClientService;
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
public class RMIClient {
    public static void main(String[] args) {
        try {
            Registry registry = LocateRegistry.getRegistry("localhost", 2222);
            IClientService clientservice = (IClientService) registry.lookup("clientservice");
            boolean result= clientservice.save("C081", "Colombe", "Mumporeze", "Kibagabaga","0789162778", "Student", "C:\\Users\\PAV\\Pictures\\EYcz_6QWoAE8tUi");
            System.out.println(result?"Saved Successfully":"Error.cant be saved");
        } catch (RemoteException ex) {
            Logger.getLogger(RMIClient.class.getName()).log(Level.SEVERE, null, ex);
        } catch (NotBoundException ex) {
            Logger.getLogger(RMIClient.class.getName()).log(Level.SEVERE, null, ex);
        }
        
    }
    
}

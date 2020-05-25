/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package auca.library.dao.RMI;

import auca.library.service.ICheckOutService;
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
public class RMICheckOut {
    public static void main(String[] args) {
        try {
            Registry registry = LocateRegistry.getRegistry("localhost",2222);
            ICheckOutService choutser = (ICheckOutService) registry.lookup("operationservice");
            boolean result = choutser.save("Mumporeze", "Java", "Jerome", "2020-09-01", "Check out");
            System.out.println(result ? "Saved Successfully!!" : "Error. can't be Saved!!");
        } catch (RemoteException ex) {
            Logger.getLogger(RMICheckOut.class.getName()).log(Level.SEVERE, null, ex);
        } catch (NotBoundException ex) {
            Logger.getLogger(RMICheckOut.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
}

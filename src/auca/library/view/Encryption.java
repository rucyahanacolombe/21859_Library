/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package auca.library.view;

import java.math.BigInteger;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.util.logging.Level;
import java.util.logging.Logger;



/**
 *
 * @author PAV
 */
public class Encryption {
    public static String Encry(String st){
        try {
            MessageDigest md = MessageDigest.getInstance("MD5");
            byte[] messageDigest =md.digest(st.getBytes());
            BigInteger numb =new BigInteger(1,messageDigest);
            String hashtext= numb.toString(16);
            while(hashtext.length()<32)
            {
            hashtext="0" +hashtext;
            
            }
            return hashtext;
        } catch (NoSuchAlgorithmException ex) {
            Logger.getLogger(Encryption.class.getName()).log(Level.SEVERE, null, ex);
        }
        return null;
        
    }
    
}

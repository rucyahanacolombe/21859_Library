/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package auca.library.dao;

import java.io.FileReader;
import java.util.Properties;

/**
 *
 * @author PAV
 */
public class AccessPropertiesFile {
    public static void main(String[] args) throws  Exception{
         Properties pro = new Properties();
         FileReader read =new FileReader("src\\auca\\library\\dao\\newproperties.properties");
         pro.load(read);
         
         String  Username =pro.getProperty("Username");
         String  password =pro.getProperty("password");
         System.out.println("The Username is:"+ Username+" "+password);
         System.out.println("The Password is:"+password);
         
    }
    
}

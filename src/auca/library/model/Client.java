package auca.library.model;
// Generated May 10, 2020 10:01:00 PM by Hibernate Tools 4.3.1

import javax.persistence.Column;




/**
 * Client generated by hbm2java
 */
public class Client  implements java.io.Serializable {

     private String regno;
     private String firstname;
     private String lastname;
     private String address;
     private String phoneno;
     private String clientcategory;
     private String photo;

    public Client() {
    }

	
    public Client(String regno) {
        this.regno = regno;
        
    }
    public Client(String regno, String firstname, String lastname, String address, String phoneno, String clientcategory, String photo) {
       this.regno = regno;
       this.firstname = firstname;
       this.lastname = lastname;
       this.address = address;
       this.phoneno = phoneno;
       this.clientcategory = clientcategory;
       this.photo = photo;
    }

   
   
    public String getRegno() {
        return this.regno;
    }
    
    public void setRegno(String regno) {
        this.regno = regno;
    }
    public String getFirstname() {
        return this.firstname;
    }
    
    public void setFirstname(String firstname) {
        this.firstname = firstname;
    }
    public String getLastname() {
        return this.lastname;
    }
    
    public void setLastname(String lastname) {
        this.lastname = lastname;
    }
    public String getAddress() {
        return this.address;
    }
    
    public void setAddress(String address) {
        this.address = address;
    }
    public String getPhoneno() {
        return this.phoneno;
    }
    
    public void setPhoneno(String phoneno) {
        this.phoneno = phoneno;
    }
    public String getClientcategory() {
        return this.clientcategory;
    }
    
    public void setClientcategory(String clientcategory) {
        this.clientcategory = clientcategory;
    }
    public String getPhoto() {
        return this.photo;
    }
    
    public void setPhoto(String photo) {
        this.photo = photo;
    }




}



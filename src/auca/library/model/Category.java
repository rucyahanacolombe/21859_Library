package auca.library.model;
// Generated May 10, 2020 10:01:00 PM by Hibernate Tools 4.3.1


import java.util.HashSet;
import java.util.Set;

/**
 * Category generated by hbm2java
 */
public class Category  implements java.io.Serializable {


     private String cid;
     private String cname;
     private Set books = new HashSet(0);

    public Category() {
    }

	
    public Category(String cid) {
        this.cid = cid;
    }
    public Category(String cid, String cname, Set books) {
       this.cid = cid;
       this.cname = cname;
       this.books = books;
    }
   
    public String getCid() {
        return this.cid;
    }
    
    public void setCid(String cid) {
        this.cid = cid;
    }
    public String getCname() {
        return this.cname;
    }
    
    public void setCname(String cname) {
        this.cname = cname;
    }
    public Set getBooks() {
        return this.books;
    }
    
    public void setBooks(Set books) {
        this.books = books;
    }




}


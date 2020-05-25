package auca.library.model;
// Generated May 10, 2020 10:01:00 PM by Hibernate Tools 4.3.1


import java.math.BigDecimal;
import java.util.Date;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

/**
 * CheckOut generated by hbm2java
 */
public class CheckOut  implements java.io.Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
     private Integer id;
     private String clientname;
     private String bookname;
     private String author;
     private Date returndate;
     private String status;

    public CheckOut() {
    }

    public CheckOut(Integer id) {
        this.id = id;
    }

    public CheckOut(Integer id,String clientname, String bookname, String author, Date returndate, String status) {
        this.id = id;
        this.clientname = clientname;
        this.bookname = bookname;
        this.author = author;
        this.returndate = returndate;
        this.status = status;
    }

    

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getClientname() {
        return clientname;
    }

    public void setClientname(String clientname) {
        this.clientname = clientname;
    }

    public String getBookname() {
        return bookname;
    }

    public void setBookname(String bookname) {
        this.bookname = bookname;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public Date getReturndate() {
        return returndate;
    }

    public void setReturndate(Date returndate) {
        this.returndate = returndate;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

	
    




}



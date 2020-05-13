package auca.library.model;
// Generated May 10, 2020 1:34:31 AM by Hibernate Tools 4.3.1


import java.math.BigDecimal;
import java.util.Date;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

/**
 * CheckIn generated by hbm2java
 */
public class CheckIn  implements java.io.Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
     private Integer chid;
     private String bookname;
     private Date fromdate;
     private Date todate;

    public CheckIn() {
    }

    public CheckIn(Integer chid) {
        this.chid = chid;
    }

    public CheckIn(Integer chid, String bookname, Date fromdate, Date todate) {
        this.chid = chid;
        this.bookname = bookname;
        this.fromdate = fromdate;
        this.todate = todate;
    }

	
   
   
   
    public String getBookname() {
        return this.bookname;
    }
    
    public void setBookname(String bookname) {
        this.bookname = bookname;
    }
    public Date getFromdate() {
        return this.fromdate;
    }
    
    public void setFromdate(Date fromdate) {
        this.fromdate = fromdate;
    }
    public Date getTodate() {
        return this.todate;
    }
    
    public void setTodate(Date todate) {
        this.todate = todate;
    }

    /**
     * @return the chid
     */
    public Integer getChid() {
        return chid;
    }

    /**
     * @param chid the chid to set
     */
    public void setChid(Integer chid) {
        this.chid = chid;
    }




}



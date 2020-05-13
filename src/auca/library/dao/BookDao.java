/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package auca.library.dao;

import auca.library.model.Book;
import auca.library.util.HibernateUtil;
import java.util.ArrayList;
import java.util.List;
import org.hibernate.Criteria;
import org.hibernate.Session;
import org.hibernate.Transaction;

/**
 *
 * @author PAV
 */
public class BookDao {
    public void SaveBook(Book b){
        Session session=HibernateUtil.getSessionFactory().openSession();
        Transaction tr = session.beginTransaction();
        session.save(b);
        tr.commit();
        session.close();
        
    }
        public void UpdateBook(Book b){
        Session session=HibernateUtil.getSessionFactory().openSession();
        Transaction tr = session.beginTransaction();
        session.update(b);
        tr.commit();
        session.close();
    }
        public void DeleteBook(Book b){
        Session session=HibernateUtil.getSessionFactory().openSession();
        Transaction tr = session.beginTransaction();
        session.delete(b);
        tr.commit();
        session.close();
    }
        public List<String> read(){
            List<String> cat=new ArrayList<String>();
            Transaction tr = null;
            Session session=HibernateUtil.getSessionFactory().openSession();
            tr=session.beginTransaction();
            cat = session.createQuery("SELECT cname from Category").list();
            session.close();
            
        return cat;
    
}
        public List<Book> getBook(){
        Session session =HibernateUtil.getSessionFactory().openSession();
        Transaction tr = session.beginTransaction();
        Criteria cr =session.createCriteria(Book.class);
        List<Book> cl = cr.list();
        tr.commit();
        session.close();
        return  cl;
        }
}

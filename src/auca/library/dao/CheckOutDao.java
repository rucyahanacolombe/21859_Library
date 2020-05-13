/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package auca.library.dao;

import auca.library.model.CheckOut;
import auca.library.util.HibernateUtil;
import java.util.List;
import org.hibernate.Criteria;
import org.hibernate.Session;
import org.hibernate.Transaction;

/**
 *
 * @author PAV
 */
public class CheckOutDao {
    public void SaveCheckOut(CheckOut chout){
        Session session =HibernateUtil.getSessionFactory().openSession();
        Transaction tr = session.beginTransaction();
        session.save(chout);
        tr.commit();
        session.close();
    
}
    
    public void SavCheckOut(CheckOut chout){
        Session session =HibernateUtil.getSessionFactory().openSession();
        Transaction tr = session.beginTransaction();
        session.save(chout);
        tr.commit();
        session.close();
    
}
    public List<CheckOut> getCheckOut(){
        Session session =HibernateUtil.getSessionFactory().openSession();
        Transaction tr = session.beginTransaction();
        Criteria cr =session.createCriteria(CheckOut.class);
        List<CheckOut> cl = cr.list();
        tr.commit();
        session.close();
        return  cl;
        }
   
}

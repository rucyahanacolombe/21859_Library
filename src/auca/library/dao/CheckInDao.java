/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package auca.library.dao;

import auca.library.model.CheckIn;
import auca.library.util.HibernateUtil;
import org.hibernate.Query;
import org.hibernate.SQLQuery;
import org.hibernate.Session;
import org.hibernate.Transaction;

/**
 *
 * @author PAV
 */
public class CheckInDao {
    public void SaveCheckIn(CheckIn ckin){
   
    Session session = HibernateUtil.getSessionFactory().openSession();
    Transaction tr = session.beginTransaction();
    session.save(ckin);
    
    tr.commit();
    session.close();
    }
    
}

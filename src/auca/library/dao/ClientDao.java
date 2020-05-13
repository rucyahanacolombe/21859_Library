/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package auca.library.dao;

import auca.library.model.Client;
import auca.library.util.HibernateUtil;
import java.util.List;
import org.hibernate.Criteria;
import org.hibernate.Session;
import org.hibernate.Transaction;

/**
 *
 * @author PAV
 */
public class ClientDao {
public void SaveClient(Client cl){
    Session session =HibernateUtil.getSessionFactory().openSession();
    Transaction tr = session.beginTransaction();
    session.save(cl);
    tr.commit();
    session.close();
    
}
        public void UpdateClient(Client c){
        Session session=HibernateUtil.getSessionFactory().openSession();
        Transaction tr = session.beginTransaction();
        session.update(c);
        tr.commit();
        session.close();
    }
        public void DeleteClient(Client c){
        Session session=HibernateUtil.getSessionFactory().openSession();
        Transaction tr = session.beginTransaction();
        session.delete(c);
        tr.commit();
        session.close();
    }
        public List<Client> getClient(){
        Session session =HibernateUtil.getSessionFactory().openSession();
        Transaction tr = session.beginTransaction();
        Criteria cr =session.createCriteria(Client.class);
        List<Client> cl = cr.list();
        tr.commit();
        session.close();
        return  cl;
        }
        
    
}

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package auca.library.dao;

import auca.library.model.Category;
import auca.library.util.HibernateUtil;
import java.util.List;
import org.hibernate.Criteria;
import org.hibernate.Session;
import org.hibernate.Transaction;

/**
 *
 * @author PAV
 */
public class CategoryDao {
    public void SaveCategory(Category ct){
        Session session=HibernateUtil.getSessionFactory().openSession();
        Transaction tr = session.beginTransaction();
        session.save(ct);
        tr.commit();
        session.close();
        
                }
        public void UpdateCategory(Category ct){
        Session session=HibernateUtil.getSessionFactory().openSession();
        Transaction tr = session.beginTransaction();
        session.update(ct);
        tr.commit();
        session.close();
    }
        public void DeleteCategory(Category ct){
        Session session=HibernateUtil.getSessionFactory().openSession();
        Transaction tr = session.beginTransaction();
        session.delete(ct);
        tr.commit();
        session.close();
    }
    public List<Category> getCategory(){
        Session session =HibernateUtil.getSessionFactory().openSession();
        Transaction tr = session.beginTransaction();
        Criteria cr =session.createCriteria(Category.class);
        List<Category> cl = cr.list();
        tr.commit();
        session.close();
        return  cl;
        }
}

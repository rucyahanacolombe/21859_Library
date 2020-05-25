/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package auca.library.service;

import auca.library.dao.CategoryDao;
import auca.library.model.Category;
import java.rmi.RemoteException;
import java.rmi.server.UnicastRemoteObject;

/**
 *
 * @author PAV
 */
public class BookCategoryService extends UnicastRemoteObject implements IBookCategoryService{
    public  BookCategoryService()throws RemoteException{
    super();
    }
    @Override
    public boolean save(String cid, String cname) throws RemoteException{
        Category bcat = new Category(cid,cname);
        CategoryDao catdao = new CategoryDao();
        catdao.SaveCategory(bcat);
        return true;
        
        
    }

    @Override
    public boolean update(String cid, String cname) throws RemoteException {
        Category bcat = new Category(cid,cname);
        CategoryDao catdao = new CategoryDao();
        catdao.UpdateCategory(bcat);
        return true;
        
    
    }

    @Override
    public boolean delete(String cid) throws RemoteException {
    Category bcat = new Category(cid);
    CategoryDao catdao = new CategoryDao();
    catdao.DeleteCategory(bcat);
    return true;
    }

  

    
  

    
    
}

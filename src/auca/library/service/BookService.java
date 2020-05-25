/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package auca.library.service;

import auca.library.dao.BookDao;
import auca.library.model.Book;
import java.rmi.RemoteException;
import java.rmi.server.UnicastRemoteObject;
import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author PAV
 */
public class BookService extends  UnicastRemoteObject implements IBookService{

    public BookService()throws RemoteException{
    super();
    }

    @Override
    public boolean save(String bookid, String title, String publishinghouse, Date publishingdate, String author, String pages, String categoryname) throws RemoteException {
      
           
            Book b = new Book(bookid, title, publishinghouse, publishingdate, author, pages,categoryname);
            BookDao bdao = new BookDao();
            bdao.SaveBook(b);
      
        return true;
    }

    @Override
    public boolean update(String bookid, String title, String publishinghouse, Date publishingdate, String author, String pages, String categoryname) throws RemoteException {
        
            DateFormat df = new SimpleDateFormat("YYYY-MM-dd");
            Book b = new Book(bookid, title, publishinghouse, publishingdate, author, pages,categoryname);
            BookDao bdao = new BookDao();
            bdao.UpdateBook(b);
      
       
        return true;
    }

    @Override
    public boolean delete(String bookid) throws RemoteException {
        Book b = new Book(bookid);
            BookDao bdao = new BookDao();
            bdao.DeleteBook(b);
        return true;
       
    }    
}

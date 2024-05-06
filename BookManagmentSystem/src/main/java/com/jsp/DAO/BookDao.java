package com.jsp.DAO;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityTransaction;
import javax.persistence.Query;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.jsp.DTO.Book;
import com.jsp.DTO.User;
@Repository
public class BookDao {
	@Autowired
	EntityManager manager;
	
	@Autowired
	EntityTransaction transaction;
	
	//Add Book
	public void saveBook(Book book) {
		transaction.begin();
		manager.merge(book);
		transaction.commit();
	}
	
//display book
    public List<Book> getAllbooks() {
        String sql = "SELECT b FROM Book b";
        Query query = manager.createQuery(sql);
        List<Book> books = query.getResultList();
        return books;
    }
    
    //delete book

    public void deletebook(int id) {
  		Book b = manager.find(Book.class, id);
  		if(b != null) {
  			transaction.begin();
  			manager.remove(b);
  			transaction.commit();
  		}
  	}

	public Book findById(int id) {
		
		Book b = manager.find(Book.class,id);
		
  		
		return b;
	}
	public void updatebookdetails(Book book) {
		transaction.begin();
		manager.merge(book);
		transaction.commit();
	}
}

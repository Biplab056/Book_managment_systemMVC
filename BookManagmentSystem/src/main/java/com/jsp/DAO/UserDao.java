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
public class UserDao {
	@Autowired
	EntityManager manager;
	
	@Autowired
	EntityTransaction transaction;
	
	//Add user
	public void saveUser(User user) {
		transaction.begin();
		manager.persist(user);
		transaction.commit();
	}
	
	//Retrieve user email and password
	
      public boolean checkLogin(User user) {
    	  
    	  String sql = "SELECT COUNT(u) FROM User u WHERE u.email = :email AND u.password = :password";
    	  
          Query query = manager.createQuery(sql);
          query.setParameter("email", user.getEmail());
          query.setParameter("password", user.getPassword());
          Long count = (Long) query.getSingleResult();
          
          if(count>0) {
        	  return true;
          }
          
          return false;
      }
      //Display all users
      
     
      public List<User> getAlluser() {
          String sql = "SELECT u FROM User u";
          Query query = manager.createQuery(sql);
          List<User> users = query.getResultList();
          return users;
      }
      
      //delete user
      public void deleteUser(int id) {
  		User u = manager.find(User.class, id);
  		if(u != null) {
  			transaction.begin();
  			manager.remove(u);
  			transaction.commit();
  		}
  	}
      
    //display book
      public List<Book> getAllbooks() {
          String sql = "SELECT b FROM Book b";
          Query query = manager.createQuery(sql);
          List<Book> books = query.getResultList();
          return books;
      }

  	
}

package com.jsp.DAO;

import javax.persistence.EntityManager;
import javax.persistence.EntityTransaction;
import javax.persistence.Query;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.jsp.DTO.Admin;
import com.jsp.DTO.User;

@Repository
public class AdminDao {
	
	@Autowired
	EntityManager manager;
	
	@Autowired
	EntityTransaction transaction;
	
	//Add admin
	
	public void saveAdmin(Admin admin) {
		transaction.begin();
		manager.persist(admin);
		transaction.commit();
	}
	
	//Admin validation
	
	 public boolean checkAdminLogin(Admin admin) {
   	  
   	  String sql = "SELECT COUNT(a) FROM Admin a WHERE a.email = :email AND a.password = :password";
   	  
         Query query = manager.createQuery(sql);
         query.setParameter("email", admin.getEmail());
         query.setParameter("password", admin.getPassword());
         Long count = (Long) query.getSingleResult();
         
         if(count>0) {
       	  return true;
         }
         
         return false;
     }

}

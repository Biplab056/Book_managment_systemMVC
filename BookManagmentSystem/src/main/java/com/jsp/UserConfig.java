package com.jsp;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.stereotype.Component;

@Configuration
@ComponentScan("com.jsp")
public class UserConfig {
	
	
	@Bean // return object to IOC
	public EntityManager getEntityManager() {
		EntityManagerFactory factory = Persistence.createEntityManagerFactory("QA");
		
		return factory.createEntityManager();
	}
	
	@Bean// return object to IOC
	public EntityTransaction getEntityTransaction() {
		return getEntityManager().getTransaction();
	}
	
}

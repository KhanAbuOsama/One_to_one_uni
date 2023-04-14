package com.jsp.person.pan;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

public class TestSave {

	public static void main(String[] args) {
		EntityManagerFactory entityManagerFactory= Persistence.createEntityManagerFactory("osama");
		EntityManager entityManager = entityManagerFactory.createEntityManager();
	    EntityTransaction entityTransaction = entityManager.getTransaction();
	    
	    Person person = new Person();
	    person.setName("abc");
	    person.setEmail("abc@gmail.com");
	    
	    
	    Pan pan = new Pan();
	    pan.setGst_number("abc1234");
	    pan.setPerson(person);
	    
	    
	    
	    entityTransaction.begin();
	    entityManager.persist(person);
	    entityManager.persist(pan);
	    entityTransaction.commit();
	    
	}

}

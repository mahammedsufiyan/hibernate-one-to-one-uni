package com.ty.one_to_one;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

public class TestSave {
	
	public static void main(String[] args) {
		
		EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("vikas");
		EntityManager entityManager = entityManagerFactory.createEntityManager();
		EntityTransaction entityTransaction = entityManager.getTransaction();
		Pan pan = new Pan();
		Person person = new Person();
		person.setName("chimgond");
		person.setEmail("chi@gmail.com");
		person.setPhone(998877);
		
		pan.setName("SUF500TY");
		pan.setAddress("Tumkur-ri-nagar");
		
		person.setPan(pan);
		
		
		entityTransaction.begin();
		entityManager.persist(person);
		entityManager.persist(pan);
		entityTransaction.commit();
				
	}
}

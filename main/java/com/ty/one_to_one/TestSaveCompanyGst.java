package com.ty.one_to_one;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

public class TestSaveCompanyGst {
	
	public static void main(String[] args) {
		
		EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("vikas");
		EntityManager entityManager = entityManagerFactory.createEntityManager();
		EntityTransaction entityTransaction =entityManager.getTransaction();
		
		Company company = new Company();
		company.setName("NEW METRO");
		company.setPhone(11225500);
		company.setWeb("newmetro.com");
		
		Gst gst = new Gst();
		gst.setGstNumber(111);
		gst.setState("Karnataka");
		gst.setCounty("India");
		gst.setCompany(company);
		
		entityTransaction.begin();
		entityManager.persist(gst);
		entityManager.persist(company);
		entityTransaction.commit();
	}
}

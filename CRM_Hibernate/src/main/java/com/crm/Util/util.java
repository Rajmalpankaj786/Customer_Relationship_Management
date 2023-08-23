package com.crm.Util;

import jakarta.persistence.EntityManager;
import jakarta.persistence.EntityManagerFactory;
import jakarta.persistence.Persistence;

public class util {
	public static EntityManagerFactory emf =null;
	 static{
		emf = Persistence.createEntityManagerFactory("Customer_Relationship_Management");
	}
	
	public static  EntityManager getentityManager() {
		return emf.createEntityManager();
	}
	
}

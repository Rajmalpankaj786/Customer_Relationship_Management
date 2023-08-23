package com.crm.CRM_Hibernate;

import com.crm.Util.util;

import jakarta.persistence.EntityManager;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
    	EntityManager em = util.getentityManager();
    	System.out.println(em);
        System.out.println( "Hello World!" );
    }
}

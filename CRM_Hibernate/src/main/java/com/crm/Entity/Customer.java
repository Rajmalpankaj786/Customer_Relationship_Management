package com.crm.Entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class Customer {
	@Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name= "Customer_Id")
    private Long Customer_Id;
    private String username;
    private String password;
    private String Email;
    
    public Customer(String username, String password, String email) {
		super();
		this.username = username;
		this.password = password;
		Email = email;
	}
    public Customer() {
    	
    }
	
    // Other fields, getters, setters...
	
	public String getUsername() {
		return username;
	}
	public void setUsername(String username) {
		this.username = username;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public String getEmail() {
		return Email;
	}
	public void setEmail(String email) {
		Email = email;
	}
	public Long getCustomer_Id() {
		return Customer_Id;
	}
	public void setCustomer_Id(Long customer_Id) {
		Customer_Id = customer_Id;
	}
}

package com.crm.Entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToOne;

@Entity
public class Issue {
	@Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name= "Issue_Id")
    private Long Issue_Id;
	
    @ManyToOne
    private Customer customer;
    
    @ManyToOne
    private CustomerSupportRep supportRep;
    
    private String description;
    private boolean isOpen;
    
    public Issue(Customer customer, CustomerSupportRep supportRep, String description, boolean isOpen) {
		super();
		this.customer = customer;
		this.supportRep = supportRep;
		this.description = description;
		this.isOpen = isOpen;
	}
    public Issue() {
    	
    	
    }
    
	
    // Other fields, getters, setters...
	
	public Customer getCustomer() {
		return customer;
	}
	public void setCustomer(Customer customer) {
		this.customer = customer;
	}
	public CustomerSupportRep getSupportRep() {
		return supportRep;
	}
	public void setSupportRep(CustomerSupportRep supportRep) {
		this.supportRep = supportRep;
	}
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	public boolean isOpen() {
		return isOpen;
	}
	public void setOpen(boolean isOpen) {
		this.isOpen = isOpen;
	}
	public Long getIssue_Id() {
		return Issue_Id;
	}
	public void setIssue_Id(Long issue_Id) {
		Issue_Id = issue_Id;
	}
}

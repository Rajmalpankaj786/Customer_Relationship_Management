package com.crm.Entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class CustomerSupportRep {
	@Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "admin_id")
    private Long admin_id;
	
    @Column(name = "admin_Username",length=30,nullable= true, unique= true)
    private String admin_Username;
    
    @Column(name = "admin_Password",length=30,nullable= true, unique= true)
    private String admin_Password;
    
	public Long getAdmin_id() {
		return admin_id;
	}
	
    public CustomerSupportRep(String admin_Username, String admin_Password) {
		super();
		this.admin_Username = admin_Username;
		this.admin_Password = admin_Password;
	}
    public CustomerSupportRep() {
    	
    }
	
	public void setAdmin_id(Long admin_id) {
		this.admin_id = admin_id;
	}
	public String getAdmin_Username() {
		return admin_Username;
	}
	public void setAdmin_Username(String admin_Username) {
		this.admin_Username = admin_Username;
	}
	public String getAdmin_Password() {
		return admin_Password;
	}
	public void setAdmin_Password(String admin_Password) {
		this.admin_Password = admin_Password;
	}
    
}

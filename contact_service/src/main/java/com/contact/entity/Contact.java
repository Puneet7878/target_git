package com.contact.entity;

public class Contact {
	
	private long cId;
	private String contactname;
	private String email;
	
	private Long userId;

	public Contact(long cId, String email,String contactname, Long userId) {
		super();
		this.cId = cId;
		this.email = email;
		this.contactname = contactname;
		this.userId = userId;
	}

	public Contact() {
		
	}

	public long getcId() {
		return cId;
	}

	public void setcId(long cId) {
		this.cId = cId;
	}

	public String getContactname() {
		return contactname;
	}

	public void setContactname(String contactname) {
		this.contactname = contactname;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public Long getUserId() {
		return userId;
	}

	public void setUserId(Long userId) {
		this.userId = userId;
	}
	
	
	

}

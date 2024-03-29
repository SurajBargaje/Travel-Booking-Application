package com.pravass.project.model;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;

@Entity
public class Contact {
	
	
	@GeneratedValue
	@Id
	@Column(name="Email")
	private String email;
	@Column(name="Name")
	private String name;
	@Column(name="Address")
	private String address;
	@Column(name="Message")
	private String message;
	
	
	
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public String getMessage() {
		return message;
	}
	public void setMessage(String message) {
		this.message = message;
	}
	public Contact(String email, String name, String address, String message) {
		super();
		this.email = email;
		this.name = name;
		this.address = address;
		this.message = message;
	}
	public Contact() {
		super();
		// TODO Auto-generated constructor stub
	}
	@Override
	public String toString() {
		return "Contact [email=" + email + ", name=" + name + ", address=" + address + ", message=" + message + "]";
	}
	

}

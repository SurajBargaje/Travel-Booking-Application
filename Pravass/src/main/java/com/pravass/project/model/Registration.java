package com.pravass.project.model;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;

@Entity
public class Registration {
	
	
	@Column(name = "Id")
	private int Id;
	
	@Column(name = "Name")
	private String name;
	
	@Id
	
	@Column(name = "Email")
	private String email;
	
	@Column(name = "Password")
	private String password;
	
	@Column(name = "Birth_Date")
	private String DOB;
	
	@Column(name = "Contact")
	private String contact;
	
	@Column(name = "Country")
	private String country;

	@Column(name = "State")
	private String state;

	public int getId() {
		return Id;
	}

	public void setId(int id) {
		Id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getDOB() {
		return DOB;
	}

	public void setDOB(String dOB) {
		DOB = dOB;
	}

	public String getContact() {
		return contact;
	}

	public void setContact(String contact) {
		this.contact = contact;
	}

	public String getCountry() {
		return country;
	}

	public void setCountry(String country) {
		this.country = country;
	}

	public String getState() {
		return state;
	}

	public void setState(String state) {
		this.state = state;
	}

	public Registration(int id, String name, String email, String password, String dOB, String contact, String country,
			String state) {
		super();
		Id = id;
		this.name = name;
		this.email = email;
		this.password = password;
		DOB = dOB;
		this.contact = contact;
		this.country = country;
		this.state = state;
	}

	public Registration() {
		super();
		// TODO Auto-generated constructor stub
	}

	@Override
	public String toString() {
		return "Registration [ name=" + name + ", email=" + email + ", password=" + password + ", DOB="
				+ DOB + ", contact=" + contact + ", country=" + country + ", state=" + state + "]";
	}


	
	
}



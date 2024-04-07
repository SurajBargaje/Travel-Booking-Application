package com.pravass.project.model;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;

@Entity


public class Login {
	
	@Id
	@Column(name="Email")
	private String email;
	
	@Column(name="Password")
	private String password;
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
	public Login(String email, String password) {
		super();
		this.email = email;
		this.password = password;
	}
	public Login() {
		super();
		// TODO Auto-generated constructor stub
	}
	@Override
	public String toString() {
		return "Login [email=" + email + ", password=" + password + "]";
	}

}

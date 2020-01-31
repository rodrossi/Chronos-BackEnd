package br.com.chronos.domain;

import org.springframework.data.annotation.Id;

public class User {
	
	@Id
	private String id;
	private String name;
	private String email;
	private String phone;
	private boolean active;
	
	public String getId() {
		return id;
	}
	
	public String getName() {
		return name;
	}
	
	public String getEmail() {
		return email;
	}
	
	public String getPhone() {
		return phone;
	}
	
	public boolean isActive() {
		return active;
	}
	
	protected User() {
		
	}

	public User(String name, String email, String phone, boolean active) {
		
		this.name = name;
		this.email = email;
		this.phone = phone;
		this.active = active;
	}
	
	

}


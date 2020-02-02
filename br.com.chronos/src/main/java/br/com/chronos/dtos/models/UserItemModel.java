package br.com.chronos.dtos.models;

import br.com.chronos.domain.User;

public class UserItemModel {

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
	
	public static UserItemModel of(User user) {
		
		UserItemModel model = new UserItemModel();
		
		model.id = user.getId();
		model.name = user.getName();
		model.email = user.getEmail();
		model.phone = user.getPhone();
		model.active = user.isActive();
		
		return model;
		
	}
	
}

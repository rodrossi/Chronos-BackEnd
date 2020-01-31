package br.com.chronos.dtos.models;

import java.util.List;
import java.util.stream.Collectors;

import br.com.chronos.domain.User;

public class UserListModel {
	
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
	
	private static UserListModel of(User user) {
		
		UserListModel model = new UserListModel();
		
		model.id = user.getId();
		model.name = user.getName();
		model.email = user.getEmail();
		model.phone = user.getPhone();
		model.active = user.isActive();
		
		return model;
	}
	
	public static List<UserListModel> ofList(List<User> users){
		
		return users.stream().map(user -> of(user)).collect(Collectors.toList());
	}

}

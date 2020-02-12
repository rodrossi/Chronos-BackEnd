package br.com.chronos.domain;

import org.springframework.data.annotation.Id;

import br.com.chronos.dtos.commands.UserInsertCommand;
import br.com.chronos.dtos.commands.UserUpdateCommand;

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

	public User(UserInsertCommand command) {

		this.name = command.getName();
		this.email = command.getEmail();
		this.phone = command.getPhone();
		this.active = true;

	}

	public void update(UserUpdateCommand command) {
		
		this.name = name;
		this.email = email;
		this.phone = phone;
		this.active = active;
	}
	
	public void toggleStatus(boolean status) {
		this.active = status;
	}

}


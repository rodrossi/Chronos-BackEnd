package br.com.chronos.domain;

import org.springframework.data.annotation.Id;

import br.com.chronos.dtos.commands.UserInsertCommand;
import br.com.chronos.dtos.commands.UserUpdateCommand;
import lombok.Getter;

@Getter
public class User {

	@Id
	private String id;
	private String name;
	private String email;
	private String phone;
	private boolean active;
	private String password;

	protected User() {

	}

	public User(UserInsertCommand command) {

		this.name = command.getName();
		this.email = command.getEmail();
		this.phone = command.getPhone();
		this.active = true;

	}

	public void update(UserUpdateCommand command) {
		
		this.name = command.getName();
		this.email = command.getEmail();
		this.phone = command.getPhone();
		this.active = command.isActive();
	}
	
	public void toggleStatus(boolean status) {
		
		this.active = status;
	}

}

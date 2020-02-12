package br.com.chronos.dtos.commands;

import javax.validation.constraints.NotBlank;

public class UserUpdateCommand {

	private String name;
	private String email;
	private String phone;
	private boolean active;

	@NotBlank(message = "Nome deve ser informado")
	public String getName() {
		return name;
	}

	@NotBlank(message = "E-mail deve ser informado")
	public String getEmail() {
		return email;
	}

	@NotBlank(message = "Telefone deve ser informado")
	public String getPhone() {
		return phone;
	}

	public boolean isActive() {
		return active;
	}
}

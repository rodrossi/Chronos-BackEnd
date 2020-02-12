package br.com.chronos.dtos.commands;

import javax.validation.constraints.NotBlank;

public class UserInsertCommand {

	@NotBlank(message = "Name must be informed")
	private String name;

	@NotBlank(message = "E-mail must be informed")
	private String email;

	@NotBlank(message = "Phone must be informed")
	private String phone;

	public String getName() {
		return name;
	}

	public String getEmail() {
		return email;
	}

	public String getPhone() {
		return phone;
	}

}

package br.com.chronos.dtos.commands;

import javax.validation.constraints.NotBlank;

import lombok.Getter;

@Getter
public class UserInsertCommand {

	@NotBlank(message = "Name must be informed")
	private String name;

	@NotBlank(message = "E-mail must be informed")
	private String email;

	@NotBlank(message = "Phone must be informed")
	private String phone;
}

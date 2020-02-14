package br.com.chronos.dtos.commands;

import javax.validation.constraints.NotBlank;

import lombok.Getter;

@Getter
public class UserUpdateCommand {

	@NotBlank(message = "Nome deve ser informado")
	private String name;

	@NotBlank(message = "E-mail deve ser informado")
	private String email;

	@NotBlank(message = "Telefone deve ser informado")
	private String phone;
	
	private boolean active;
}

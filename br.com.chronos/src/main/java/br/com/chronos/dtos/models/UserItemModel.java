package br.com.chronos.dtos.models;

import br.com.chronos.domain.User;

public class UserItemModel {

	private String idUser;
	private String nameUser;

	public String getIdUser() {
		return idUser;
	}

	public String getNameUser() {
		return nameUser;
	}

	public static UserItemModel of(User users) {
		UserItemModel model = new UserItemModel();

		model.idUser = users.getId();
		model.nameUser = users.getName();

		return model;
	}
}

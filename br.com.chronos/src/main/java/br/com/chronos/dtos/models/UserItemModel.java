package br.com.chronos.dtos.models;

import br.com.chronos.domain.User;

public class UserItemModel {

	private String idUser;
	private String nameUser;
	private String emailUser;
	private String phoneUser;
	private boolean activeUser;

	public String getIdUser() {
		return idUser;
	}

	public String getNameUser() {
		return nameUser;
	}

	public String getEmailUser() {
		return emailUser;
	}

	public String getPhoneUser() {
		return phoneUser;
	}

	public boolean isActiveUser() {
		return activeUser;
	}

	public static UserItemModel of(User users) {
		UserItemModel model = new UserItemModel();

		model.idUser = users.getId();
		model.nameUser = users.getName();
		model.emailUser = users.getEmail();
		model.phoneUser = users.getPhone();
		model.activeUser = users.isActive();

		return model;
	}
}

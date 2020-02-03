package br.com.chronos.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.stereotype.Service;

import br.com.chronos.domain.User;
import br.com.chronos.dtos.commands.UserUpdateCommand;
import br.com.chronos.repositories.UserRepository;
import br.com.chronos.utils.exceptions.NotFoundException;

@Service
public class UserService {

	@Autowired
	private UserRepository userRepository;

	public List<User> list() {

		return userRepository.findAll();
	}

	public User consultById(String id) {
		return userRepository.findById(id).orElseThrow(() -> new NotFoundException("Nenhum usuario cadastrado"));

	}

	public User update(String id, UserUpdateCommand command) {
		User user = consultById(id);
		user.update(command);
		return userRepository.save(user);
	}

}

package br.com.chronos.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.com.chronos.domain.User;
import br.com.chronos.repositories.UserRepository;

@Service
public class UserService {

	@Autowired
	private UserRepository userRepository;

	public List<User> list() {

		return userRepository.findAll();
	}

}

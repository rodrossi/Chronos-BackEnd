package br.com.chronos.controllers;

import java.util.List;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PatchMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import br.com.chronos.domain.User;
import br.com.chronos.dtos.commands.UserInsertCommand;
import br.com.chronos.dtos.commands.UserUpdateCommand;
import br.com.chronos.dtos.models.UserItemModel;
import br.com.chronos.dtos.models.UserListModel;
import br.com.chronos.services.UserService;

@RestController
public class UserController {

	@Autowired
	private UserService userService;

	@PostMapping("users")
	public ResponseEntity<?> insertUser(@Valid 
                                        @RequestBody UserInsertCommand command) {

		User user = userService.insert(command);

		return ResponseEntity.ok(user);
	}

	@GetMapping("users")
	public ResponseEntity<?> list() {

		List<User> users = userService.list();
		List<UserListModel> model = UserListModel.ofList(users);

		return ResponseEntity.ok(model);
	}

	@GetMapping("users/{id}")
	public ResponseEntity<?> consultById(@PathVariable(name = "id") String id) {

		User users = userService.consultById(id);
		UserItemModel model = UserItemModel.of(users);

		return ResponseEntity.ok(model);
	}

	@PutMapping("users/{id}")
	public ResponseEntity<?> update(@PathVariable(name = "id") String id,
                                    @Valid 
                                    @RequestBody UserUpdateCommand command) {

		User user = userService.update(id, command);

		return ResponseEntity.ok(user);
	}

	@PatchMapping("users/{id}")
	public ResponseEntity<?> toggleStatus(@PathVariable(name = "id") String id, 
                                          @RequestBody boolean status) {

		User user = userService.toggleUserStatus(id, status);
		UserItemModel model = UserItemModel.of(user);

		return ResponseEntity.ok(model);
	}
}

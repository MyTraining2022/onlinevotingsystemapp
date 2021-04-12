package org.society.controller;
import org.society.entities.User;
import org.society.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("user")
public class UserController {
	
	@Autowired
	private UserService service;
	
	@GetMapping(value = "{id}")
	public ResponseEntity<?> getUserById(@PathVariable("id") long id) {
		User user = service.findByUserId(id);

		return new ResponseEntity<User>(user, HttpStatus.OK);
	}

}

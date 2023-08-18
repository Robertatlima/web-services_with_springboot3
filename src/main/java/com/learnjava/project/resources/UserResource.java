package com.learnjava.project.resources;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.learnjava.project.entities.User;

@RestController
@RequestMapping(value = "/users")
public class UserResource {
	
	@GetMapping
	public ResponseEntity<User> findALl() {
		User u = new User(1L, "Teste", "teste@gmail.com", "999999", "12345");
		return ResponseEntity.ok().body(u);
	}
	
}

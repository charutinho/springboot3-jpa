package com.charutinho.course.resources;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.charutinho.course.entities.User;

@RestController
@RequestMapping(value = "/users") // define o nome do recurso
public class UserResource {

	@GetMapping // especifica que é uma rota via GET
	public ResponseEntity<User> findAll(){
		User user = new User(1L, "Alisson", "alisson@gmail.com", "1199999 9999", "1password");
		return ResponseEntity.ok().body(user);
	}
	
}

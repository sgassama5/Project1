package com.revature.project1.controller;

import com.revature.project1.model.LoginTemplate;
import com.revature.project1.model.User;
import com.revature.project1.services.UserServices;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class LoginController {

	@Autowired
	private UserServices userServices;


	@PostMapping("/login")
	public ResponseEntity<User> login(@RequestBody LoginTemplate loginTemplate) {

		return ResponseEntity.ok(userServices.login(loginTemplate.getUsername(), loginTemplate.getPassword()));
	}

	@PostMapping("/logout")
	public ResponseEntity<Void> logout() {
		userServices.logout();

		return ResponseEntity.accepted().build();
	}
}

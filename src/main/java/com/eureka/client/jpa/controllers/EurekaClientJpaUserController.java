package com.eureka.client.jpa.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.eureka.client.jpa.model.User;
import com.eureka.client.jpa.services.EurekaClientJpaUserService;

@RestController
@RequestMapping("/api")
public class EurekaClientJpaUserController {
	
	@Autowired
	EurekaClientJpaUserService eurekaClientJpaUserService;
	
	@PostMapping(value = "/createuser")
	public User createUser(@RequestBody  User user) {
		return eurekaClientJpaUserService.createUser(user);
	}
	
	@GetMapping(value = "/byname/{username}")
	public List<User> users (@PathVariable String username){
		return eurekaClientJpaUserService.getUsersByName(username);
	}
	

}

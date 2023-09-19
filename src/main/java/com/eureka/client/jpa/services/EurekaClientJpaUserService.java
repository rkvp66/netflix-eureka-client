package com.eureka.client.jpa.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.eureka.client.jpa.model.User;
import com.eureka.client.jpa.repositories.EurekaClientJpaUserRepo;

@Service
public class EurekaClientJpaUserService {

	@Autowired
	EurekaClientJpaUserRepo eurekaClientJpaUserRepo;
	
	public User createUser(User user ) {
		User savedUser  = eurekaClientJpaUserRepo.save(user);
		return savedUser;
	}
	
	public List<User> getUsersByName(String name) {
		return eurekaClientJpaUserRepo.findByName(name);
	}
		
}

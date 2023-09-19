package com.eureka.client.jpa.repositories;

import java.util.List;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;

import com.eureka.client.jpa.model.User;

public interface EurekaClientJpaUserRepo extends CrudRepository<User, Long> {

	@Query("select u from User u where u.userName = ?1")
	List<User> findByName(String name);

}

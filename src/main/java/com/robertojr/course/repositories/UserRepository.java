package com.robertojr.course.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.robertojr.course.entities.User;

public interface UserRepository extends JpaRepository<User, Long> {
	
	

}

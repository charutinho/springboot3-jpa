package com.charutinho.course.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.charutinho.course.entities.User;

public interface UserRepository extends JpaRepository<User, Long> {

	
	
}

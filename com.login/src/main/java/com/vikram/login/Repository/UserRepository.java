package com.vikram.login.Repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.vikram.login.Entity.User;

public interface UserRepository extends JpaRepository<User, Long> {

	//User findByUsername(String username);

	User findByEmail(String email);



}

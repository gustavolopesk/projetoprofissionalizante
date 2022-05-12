package com.devgustavo.ftvideos.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.devgustavo.ftvideos.entities.User;

public interface UserRepository extends JpaRepository<User, Long> {

	User findByEmail(String email);
}

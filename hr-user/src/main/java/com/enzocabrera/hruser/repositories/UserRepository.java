package com.enzocabrera.hruser.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.enzocabrera.hruser.entities.User;

public interface UserRepository extends JpaRepository<User, Long> {

	User findByEmail(String email);
}

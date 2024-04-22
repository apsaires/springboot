package com.noremp.springboot.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.noremp.springboot.entities.User;

public interface UserRepository extends JpaRepository<User, Long> {

}

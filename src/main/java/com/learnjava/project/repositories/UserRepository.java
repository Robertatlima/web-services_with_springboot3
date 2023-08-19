package com.learnjava.project.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.learnjava.project.entities.User;


public interface UserRepository extends JpaRepository<User, Long> {

}

package com.production.course.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.production.course.entities.User;


public interface UserRepository extends JpaRepository<User, Long> {

}

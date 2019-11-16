package com.efraimjer.course.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.efraimjer.course.entities.User;

public interface UserRepository extends JpaRepository<User, Long>{

}

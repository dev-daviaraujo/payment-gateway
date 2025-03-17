package com.devdaviaraujo.course.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.devdaviaraujo.course.entities.User;

public interface UserRepository extends JpaRepository<User, Long>{

}

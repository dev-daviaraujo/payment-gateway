package com.devdaviaraujo.course.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.devdaviaraujo.course.entities.Category;

public interface CategoryRepository extends JpaRepository<Category, Long>{

}

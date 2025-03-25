package com.devdaviaraujo.course.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.devdaviaraujo.course.entities.Category;

//Repositório de acesso à dados da classe Category
public interface CategoryRepository extends JpaRepository<Category, Long>{

}

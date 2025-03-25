package com.devdaviaraujo.course.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.devdaviaraujo.course.entities.Product;

//Repositório de acesso à dados da classe Product
public interface ProductRepository extends JpaRepository<Product, Long>{

}

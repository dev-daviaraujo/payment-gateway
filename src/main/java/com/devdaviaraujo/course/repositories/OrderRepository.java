package com.devdaviaraujo.course.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.devdaviaraujo.course.entities.Order;

public interface OrderRepository extends JpaRepository<Order, Long>{

}

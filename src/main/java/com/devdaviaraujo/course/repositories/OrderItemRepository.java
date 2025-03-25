package com.devdaviaraujo.course.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.devdaviaraujo.course.entities.OrderItem;
import com.devdaviaraujo.course.entities.pk.OrderItemPK;

//Repositório de acesso à dados da classe Order
public interface OrderItemRepository extends JpaRepository<OrderItem, OrderItemPK>{

}

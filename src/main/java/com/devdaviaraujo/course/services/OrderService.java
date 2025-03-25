package com.devdaviaraujo.course.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.devdaviaraujo.course.entities.Order;
import com.devdaviaraujo.course.repositories.OrderRepository;

/*Classe referente à Order responsável por processar as requisições 
recebidas em resources e acessar o Banco através do repository*/
@Service
public class OrderService {
	
	//Instanciando um repositório para acessar dados
	@Autowired
	private OrderRepository repository;
	
	//Método que retorna todas as orders no repositório
	public List<Order> findAll(){
		return repository.findAll();
	}
	
	//Método que retorna uma Order específica no repositório através do id
	public Order findById(Long id) {
		Optional<Order> obj = repository.findById(id);
		return obj.get();
	}

}

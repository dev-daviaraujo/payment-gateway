package com.devdaviaraujo.course.resources;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.devdaviaraujo.course.entities.Order;
import com.devdaviaraujo.course.services.OrderService;

//Classe referente à Order da camada de Resources, que recebe e processa as requisições HTTP nos endpoints específicos classe
@RestController
//Definição do endpoint de acesso à categorias
@RequestMapping(value = "/orders")
public class OrderResource {
	
	//Instanciação da Classe da camada service para processar as requisições
	@Autowired
	private OrderService service;
	
	//Definindo o tipo de resposta da requisição para retornar uma lista de Orders
	@GetMapping
	public ResponseEntity<List<Order>> findAll(){
		List<Order> list = service.findAll();
		return ResponseEntity.ok().body(list);
	}
	
	//Especificação do endpoint para achar o Id de uma Order específica
	@GetMapping(value = "/{id}")
	public ResponseEntity<Order> findById(@PathVariable Long id){
		Order obj = service.findById(id);
		return ResponseEntity.ok().body(obj);
	}

	
	
}

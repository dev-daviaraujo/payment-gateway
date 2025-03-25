package com.devdaviaraujo.course.resources;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.devdaviaraujo.course.entities.Product;
import com.devdaviaraujo.course.services.ProductService;

//Classe referente à Product da camada de Resources, que recebe e processa as requisições HTTP nos endpoints específicos da classe
@RestController
//Definição do endpoint de acesso à categorias
@RequestMapping(value = "/products")
public class ProductResource {
	
	//Instanciação da Classe da camada service para processar as requisições
	@Autowired
	private ProductService service;
	
	//Definindo o tipo de resposta da requisição para retornar uma lista de Products
	@GetMapping
	public ResponseEntity<List<Product>> findAll(){
		List<Product> list = service.findAll();
		return ResponseEntity.ok().body(list);
	}
	
	//Especificação do endpoint para achar o Id de um Produto específico
	@GetMapping(value = "/{id}")
	public ResponseEntity<Product> findById(@PathVariable Long id){
		Product obj = service.findById(id);
		return ResponseEntity.ok().body(obj);
	}

	
	
}

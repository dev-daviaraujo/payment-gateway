package com.devdaviaraujo.course.resources;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.devdaviaraujo.course.entities.Category;
import com.devdaviaraujo.course.services.CategoryService;

//Classe referente à Category da camada de Resources, que recebe e processa as requisições HTTP nos endpoints específicos da classe
@RestController
//Definição do endpoint de acesso à categorias
@RequestMapping(value = "/categories")
public class CategoryResource {
	
	//Instanciação da Classe da camada service para processar as requisições
	@Autowired
	private CategoryService service;
	
	//Definindo o tipo de resposta da requisição para retornar uma lista de Categorias
	@GetMapping
	public ResponseEntity<List<Category>> findAll(){
		List<Category> list = service.findAll();
		return ResponseEntity.ok().body(list);
	}
	
	//Especificação do endpoint para achar o Id de uma Categoria específica
	@GetMapping(value = "/{id}")
	public ResponseEntity<Category> findById(@PathVariable Long id){
		Category obj = service.findById(id);
		return ResponseEntity.ok().body(obj);
	}

	
	
}

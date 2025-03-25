package com.devdaviaraujo.course.resources;

import java.net.URI;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.support.ServletUriComponentsBuilder;

import com.devdaviaraujo.course.entities.User;
import com.devdaviaraujo.course.services.UserService;

//Classe referente à Category da camada de Resources, que recebe e processa as requisições HTTP nos endpoints específicos da classe
@RestController
//Definição do endpoint de acesso à categorias
@RequestMapping(value = "/users")
public class UserResource {
	
	//Instanciação da Classe da camada service para processar as requisições
	@Autowired
	private UserService service;
	
	//Definindo o tipo de resposta da requisição para retornar uma lista de Users
	@GetMapping
	public ResponseEntity<List<User>> findAll(){
		List<User> list = service.findAll();
		return ResponseEntity.ok().body(list);
	}
	
	//Especificação do endpoint para achar o Id de um Usuário específico
	@GetMapping(value = "/{id}")
	public ResponseEntity<User> findById(@PathVariable Long id){
		User obj = service.findById(id);
		return ResponseEntity.ok().body(obj);
	}
	
	@PostMapping
	public ResponseEntity<User> insert(@RequestBody User obj){
		obj = service.insert(obj);
		URI uri = ServletUriComponentsBuilder.fromCurrentRequest().path("/{id}")
				.buildAndExpand(obj.getId()).toUri();
		return ResponseEntity.created(uri).body(obj);
	}

	
	
}

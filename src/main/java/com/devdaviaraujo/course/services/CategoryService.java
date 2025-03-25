package com.devdaviaraujo.course.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.devdaviaraujo.course.entities.Category;
import com.devdaviaraujo.course.repositories.CategoryRepository;

/*Classe referente à Category responsável por processar as requisições 
recebidas em resources e acessar o Banco através do repository*/
@Service
public class CategoryService {
	
	//Instanciando um repositório para acessar dados
	@Autowired
	private CategoryRepository repository;
	
	//Método que retorna todas as categorias no repositório
	public List<Category> findAll(){
		return repository.findAll();
	}
	
	//Método que retorna uma categoria específica no repositório através do id
	public Category findById(Long id) {
		Optional<Category> obj = repository.findById(id);
		return obj.get();
	}

}

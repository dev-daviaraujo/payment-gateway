package com.devdaviaraujo.course.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.devdaviaraujo.course.entities.Product;
import com.devdaviaraujo.course.repositories.ProductRepository;

/*Classe referente à Product responsável por processar as requisições 
  recebidas em resources e acessar o Banco através do repository*/
@Service
public class ProductService {
	
	//Instanciando um repositório para acessar dados
	@Autowired
	private ProductRepository repository;
	
	//Método que retorna todos os produtos no repositório
	public List<Product> findAll(){
		return repository.findAll();
	}
	
	//Método que retorna um produto específico no repositório através do id
	public Product findById(Long id) {
		Optional<Product> obj = repository.findById(id);
		return obj.get();
	}

}

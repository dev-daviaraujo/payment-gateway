package com.devdaviaraujo.course.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.devdaviaraujo.course.entities.User;
import com.devdaviaraujo.course.repositories.UserRepository;

/*Classe referente à User responsável por processar as requisições 
  recebidas em resources e acessar o Banco através do repository*/
@Service
public class UserService {
	
	//Instanciando um repositório para acessar dados
	@Autowired
	private UserRepository repository;
	
	//Método que retorna todos os usuários no repositório
	public List<User> findAll(){
		return repository.findAll();
	}
	
	//Método que retorna um usuário específico no repositório através do id
	public User findById(Long id) {
		Optional<User> obj = repository.findById(id);
		return obj.get();
	}
	
	public User insert(User obj) {
		return repository.save(obj);
	}
	
	public void delete(Long id) {
		repository.deleteById(id);
	}

	public User update(Long id, User obj) {
		User entity =  repository.getReferenceById(id);
		updateData(entity, obj);
		return repository.save(entity);
	}

	private void updateData(User entity, User obj) {
		entity.setName(obj.getName());
		entity.setEmail(obj.getEmail());
		entity.setPhone(obj.getPhone());		
	}
	
}

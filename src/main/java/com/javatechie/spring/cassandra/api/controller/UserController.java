package com.javatechie.spring.cassandra.api.controller;

import java.util.List;
import java.util.Optional;

import javax.validation.Valid;

import com.javatechie.spring.cassandra.api.model.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import com.javatechie.spring.cassandra.api.rpository.UserRepository;

@RestController
public class UserController {

	@Autowired
	private UserRepository repository;

	/*@PostConstruct
	public void saveUser() {
		List<User> users = new ArrayList<>();
		users.add(new User(437, "Basant", "Bangalore", 50));
		users.add(new User(523, "Saroj", "Pune", 20));
		users.add(new User(694, "Ravindra", "Mumbai", 30));
		users.add(new User(854, "Samas", "Odisha", 25));
		repository.saveAll(users);
	}*/

	@GetMapping("/getAllUsers")
	public List<User> getUsers() {
		return repository.findAll();
	}

	@GetMapping("/getUserFilterByAge/{age}")
	public List<User> getUserFilterByAge(@PathVariable int age) {
		return repository.findByAgeGreaterThan(age);
	}

	@PostMapping("/create")
	public User createUser(@Valid @RequestBody User user) {
		return repository.save(user);
	}

	@PutMapping("/update")
	public User update(@RequestBody User user) {
		return repository.save(user);
	}

	@DeleteMapping("/delete/{id}")
	public String delete(@PathVariable Integer id) {
		Optional<User> employeeObj = repository.findById(id);
		if(employeeObj.isPresent()) {
			repository.delete(employeeObj.get());
			return "User eliminado con el "+id;
		}else {
			throw new RuntimeException("Error al eliminar "+id);
		}
	}

}

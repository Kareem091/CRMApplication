package com.crm.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import java.util.Date;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;
import com.crm.entities.Users;
import com.crm.repository.UsersRepository;

@RestController
@RequestMapping("/api/user")
public class UsersController {

	private static final Logger LOGGER = LoggerFactory.getLogger(UsersController.class);
	@Autowired
	protected UsersRepository repo;
	
	@GetMapping("/all")
	public List<Users> getAll() {
		LOGGER.info("--Fetch all Users.."   + new Date());
		return repo.findAll();
	}
	
	
	@PutMapping("/new")
	public void insert(@RequestBody Users user) {
		repo.insert(user);
		LOGGER.info("--User: " +" User id: " + user.getId() + " User uid: " + user.getUid() + " User Display: "+ user.getDisplayName() +" "+ user.getEmail() + " Created successfully with ID: "
				+ user.getId() + " on " + new Date());
	}

	
	@PostMapping("/update")
	public void updateUser(@RequestBody Users user) {
		repo.save(user);
		LOGGER.info("--User ID Updated: " + user.getId() + " on " + new Date());
	}

	@DeleteMapping("/delete/{id}")
	public void deleteUser(@PathVariable("id") String id) {
		repo.delete(id);
		LOGGER.info("--User ID Deleted: " + id + " on " + new Date());
	}
	
	
	@ExceptionHandler
	@ResponseStatus(HttpStatus.NOT_FOUND)
	public void handleTodoNotFound(Exception e) {
		LOGGER.debug("***Handling error with message: {}", e.getMessage()  +  " on " + new Date());
	}

}

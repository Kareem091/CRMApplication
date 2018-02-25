package com.crm.controller;

import java.util.Date;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

import com.crm.entities.Comments;
import com.crm.entities.Images;
import com.crm.repository.ImageRepository;

@RestController
@RequestMapping("/api/img")
public class ImageController {

	
	private static final Logger LOGGER = LoggerFactory.getLogger(ImageController.class);

	
	@Autowired
	protected ImageRepository imgRepo;
	
	
	@PutMapping("/newImg")
	public void insertImg(@RequestBody Images img) {
		imgRepo.insert(img);
		
	}
	
	@PostMapping("/update/{id}")
	public void addComment(@PathVariable("id") String imgId, @RequestBody Comments comment) {
		Images img = imgRepo.findOne(imgId);
		img.getComments().add(comment);
		imgRepo.save(img);
		LOGGER.info("-- added comment to Img ID: " + imgId + " on " + new Date());
	}

	@ExceptionHandler
	@ResponseStatus(HttpStatus.NOT_FOUND)
	public void handleTodoNotFound(Exception e) {
		LOGGER.debug("***Handling error with message: {}", e.getMessage()  +  " on " + new Date());
	}
}

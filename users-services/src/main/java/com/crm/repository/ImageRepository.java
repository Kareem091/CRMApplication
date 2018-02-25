package com.crm.repository;

import org.springframework.data.mongodb.repository.MongoRepository;

import com.crm.entities.Images;
import com.crm.entities.Users;

public interface ImageRepository  extends MongoRepository<Images, String> {

}

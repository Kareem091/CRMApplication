package com.crm.repository;

import org.springframework.data.mongodb.repository.MongoRepository;

import com.crm.entities.Users;

public interface UsersRepository extends MongoRepository<Users, String> {

}

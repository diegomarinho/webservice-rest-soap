package com.repository;

import com.model.User;
import org.bson.types.ObjectId;
import org.springframework.data.mongodb.repository.MongoRepository;

/**
 * @author Diego Almeida
 */
public interface UserRepository extends MongoRepository<User,ObjectId>{


}

package com.service;

import com.model.User;
import org.bson.types.ObjectId;

/**
 * @author Diego Almeida
 */
public interface UserService {

    User findById(ObjectId id);

    User deleteById(ObjectId id);

    User save(User user);

    long countUser();
}

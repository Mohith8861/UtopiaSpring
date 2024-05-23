package com.example.UtopiaSpring.repo;

import com.example.UtopiaSpring.model.User;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface UserRepo extends MongoRepository<User, String> {
    User findByUsername(String username);
}

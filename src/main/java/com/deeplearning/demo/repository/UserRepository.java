package com.deeplearning.demo.repository;

import com.deeplearning.demo.model.User;
import org.springframework.data.repository.CrudRepository;

public interface UserRepository extends CrudRepository<User, Long> {
}
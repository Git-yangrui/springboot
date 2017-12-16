package com.example.cloud.microservieconsumer.repository;

import com.example.cloud.microservieconsumer.entity.User;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UserRepositry extends CrudRepository<User,Long> {
}

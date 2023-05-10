package com.spring_crud.spring.repository;

import com.spring_crud.spring.model.User;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface UserRepository extends JpaRepository<User, Long> {
//    List<User> findByLastName(String last_name);
}

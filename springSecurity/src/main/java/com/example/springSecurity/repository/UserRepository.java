package com.example.springSecurity.repository;

import com.example.springSecurity.domain.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Repository;

@Repository
public interface UserRepository extends JpaRepository<User,Long> {
//select * from username
    User findByUsername(String username);
}

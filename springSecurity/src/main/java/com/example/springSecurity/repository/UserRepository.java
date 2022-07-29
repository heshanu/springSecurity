package com.example.springSecurity.repository;

import com.example.springSecurity.domain.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Repository;

@Repository
public interface UserRepository extends JpaRepository<User,Long> {
//select * from username
    @Query("select * from User u"
            +
            "join fetch u.authorities"+"where u.username=:username")
    User findByUsername(String username);
}

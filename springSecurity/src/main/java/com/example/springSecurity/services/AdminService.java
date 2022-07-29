package com.example.springSecurity.services;

import com.example.springSecurity.domain.User;
import com.example.springSecurity.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.access.annotation.Secured;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class AdminService {

    @Autowired
    private UserRepository userRepository;

    @Secured({"ROLE_ADMIN","ROLE_SUPERUSER"})
    public List<User> getAllUsersAccounts(){
        return userRepository.findAll();
    }

    public void performsomeService() {
    }
}

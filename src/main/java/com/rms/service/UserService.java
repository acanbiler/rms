package com.rms.service;

import com.rms.model.entity.User;
import com.rms.model.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
@Transactional
public class UserService {
    @Autowired
    private UserRepository userRepository;

    public boolean isUserAuthorized(String name, String password) {
        return userRepository.findByNameAndPassword(name, password);
    }

    public List<User> getUserList() {
        return userRepository.findAll();
    }
}

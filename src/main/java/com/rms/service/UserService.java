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

    public String isUserAuthorized(String name, String password) {
        User user = userRepository.findByNameAndPassword(name, password);

        if (user != null) {
            switch (user.getRole()){
                case 1:
                    return "manager";
                case 2:
                    return "cook";
                case 3:
                    return "server";
            }
        }

        return "";
    }

    public List<User> getUserList() {
        return userRepository.findAll();
    }

    public void addUser(User user) {
        userRepository.save(user);
    }

    public void deleteUser(Integer userId) {
        User user = new User();
        user.setId(userId);
        userRepository.delete(user);
    }
}

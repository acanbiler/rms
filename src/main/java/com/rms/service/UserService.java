package com.rms.service;

import com.rms.model.repository.UserRepository;
import com.rms.model.dto.UserDTO;
import com.rms.model.entity.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.ArrayList;
import java.util.List;

@Service
@Transactional
public class UserService {
    @Autowired
    private UserRepository userRepository;
/*
    public UserDTO getUserByName(String name) {
        UserDTO userDTO = new UserDTO();

        User user = userRepository.findByName(name);

        userDTO.setName(user.getName());
        userDTO.setRole(user.getRole());
        userDTO.setPassword(user.getPassword());

        return userDTO;
    }
*/
    public List<UserDTO> getUserList() {
        List<UserDTO> userDTOList = new ArrayList<>();
        List<User> userList = userRepository.findAll();

        for (User user : userList) {
            UserDTO userDTO = new UserDTO();

            userDTO.setName(user.getName());
            userDTO.setRole(user.getRole());
            userDTO.setPassword(user.getPassword());

            userDTOList.add(userDTO);
        }

        return userDTOList;
    }
}

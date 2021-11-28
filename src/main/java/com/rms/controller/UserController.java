package com.rms.controller;

import com.rms.model.dto.UserDTO;
import com.rms.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("user")
public class UserController {

    @Autowired
    private UserService userService;
/*
    @GetMapping(value = "/{name}")
    public UserDTO getUserByName(@PathVariable String name) {
        return userService.getUserByName(name);
    }
*/
    @GetMapping(value = "/list")
    public List<UserDTO> getUserList() {
        return userService.getUserList();
    }
}

package com.rms.controller;

import com.rms.model.entity.User;
import com.rms.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/user")
public class UserController {

    @Autowired
    private UserService userService;

    @GetMapping(value = "/{name}/{password}")
    public boolean isUserAuthorized(@PathVariable String name, @PathVariable String password) {
        return userService.isUserAuthorized(name, password);
    }

    @GetMapping(value = "/list")
    public List<User> getUserList() {
        return userService.getUserList();
    }
}

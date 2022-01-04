package com.rms.controller;

import com.rms.model.entity.User;
import com.rms.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/user")
public class UserController {

    @Autowired
    private UserService userService;

    @GetMapping(value = "/{name}/{password}")
    public String isUserAuthorized(@PathVariable String name, @PathVariable String password) {
        return userService.isUserAuthorized(name, password);
    }

    @GetMapping(value = "/list")
    public List<User> getUserList() {
        return userService.getUserList();
    }

    @PostMapping(value = "/add")
    public void addUser(@RequestBody User user) {
        userService.addUser(user);
    }

    @PostMapping(value = "/delete/{userId}")
    public void deleteUser(@PathVariable Integer userId) {
        userService.deleteUser(userId);
    }
}

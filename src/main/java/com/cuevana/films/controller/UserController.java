/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.cuevana.films.controller;

import com.cuevana.films.models.entity.User;
import com.cuevana.films.service.iface.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Controller User
 * @author adrian
 */
@RestController
@RequestMapping("/user")
@CrossOrigin("*")
public class UserController {
    
    @Autowired
    private UserService userService;
    
    /**
     * Recurso que realiza login en el sistema
     * @param user Objeto User
     * @return Objeto User
     * @throws java.lang.Exception
     */
    @PostMapping("/login")
    public User login(@RequestBody User user) throws Exception {
        return this.userService.login(user);
    }
}

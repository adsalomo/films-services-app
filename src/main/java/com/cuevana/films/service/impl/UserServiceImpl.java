/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.cuevana.films.service.impl;

import com.cuevana.films.models.entity.User;
import com.cuevana.films.models.repository.UserRepository;
import com.cuevana.films.service.iface.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * Servicio implementa la interface UserService
 * @author adrian
 */
@Service
public class UserServiceImpl implements UserService {

    @Autowired
    private UserRepository userRepository;
    
    @Override
    public void create(User user) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public User login(User user) throws Exception {
        User existsUser = this.userRepository.findByEmailAndPassword(user.getEmail(), user.getPassword());
        if (existsUser == null) {
            throw new Exception("Usuario y/o contraseña incorrecto!!!");
        }
        return existsUser;
    }
    
}

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.cuevana.films.service.iface;

import com.cuevana.films.models.entity.User;

/**
 *
 * @author adrian
 */
public interface UserService {
    
    /**
     * Nuevo usuario
     * @param user Objeto User
     */
    void create(User user);
    
    /**
     * Login usuario
     * @param user Objeto User
     * @return User
     * @throws java.lang.Exception
     */
    User login(User user) throws Exception;
}

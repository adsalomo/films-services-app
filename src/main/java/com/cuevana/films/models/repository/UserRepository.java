/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.cuevana.films.models.repository;

import com.cuevana.films.models.entity.User;
import org.springframework.data.repository.CrudRepository;

/**
 * Repository Usuarios
 * @author adrian
 */
public interface UserRepository extends CrudRepository<User, Integer>{
    
    User findByEmailAndPassword(String email, String password);
}

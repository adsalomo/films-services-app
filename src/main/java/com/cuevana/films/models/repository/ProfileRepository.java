/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.cuevana.films.models.repository;

import com.cuevana.films.models.entity.Profile;
import org.springframework.data.repository.CrudRepository;

/**
 * Repository Profile
 * @author adrian
 */
public interface ProfileRepository extends CrudRepository<Profile, Integer>{
    
}

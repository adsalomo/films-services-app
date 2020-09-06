/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.cuevana.films.models.repository;

import com.cuevana.films.models.entity.Gender;
import org.springframework.data.repository.CrudRepository;

/**
 * Repository genero peliculas
 * Spring Data es un proyecto de SpringSource cuyo propósito es unificar y facilitar el acceso 
 * a distintos tipos de tecnologías de persistencia, tanto a bases de datos relacionales 
 * como a las del tipo NoSQL.
 * @author adrian
 */
public interface GenderRepository extends CrudRepository<Gender, Integer> {

}

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.cuevana.films.models.repository;

import com.cuevana.films.models.entity.Movie;
import org.springframework.data.repository.CrudRepository;

/**
 * Repository de la entidad pelicula
 *
 * @author adrian
 */
public interface MovieRepository extends CrudRepository<Movie, Integer> {

}

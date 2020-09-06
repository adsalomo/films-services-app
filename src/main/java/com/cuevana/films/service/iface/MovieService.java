/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.cuevana.films.service.iface;

import com.cuevana.films.models.entity.Movie;
import java.util.List;

/**
 * Interface para declarar los metodos relacionados a la entidad movie
 * @author adrian
 */
public interface MovieService {
    
    /**
     * Obtiene todas las peliculas
     * @return  Lista de peliculas
     */
    List<Movie> getAll();
    
    /**
     * Crea nueva pelicula
     * @param movie Objeto Movie
     */
    void create(Movie movie);
    
    /**
     * Edita una pelicula
     * @param movie Objeto Movie
     * @param movieId int movieId
     */
    void edit(Movie movie, int movieId);
    
    /**
     * Elimina una pelicula
     * @param movie Objeto Movie
     * @param movieId int movieId
     */
    void delete(int movieId);
}

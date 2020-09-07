package com.cuevana.films.controller;

import com.cuevana.films.models.entity.Movie;
import com.cuevana.films.service.iface.MovieService;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

/**
 * Controller Movie
 * @author adrian
 */
@RestController
@RequestMapping("/movie")
@CrossOrigin("*")
public class MovieController {
    
    @Autowired
    private MovieService movieService;
    
    /**
     * Recurso para obtener las peliculas
     * Implementa el metodo HTTP GET
     * @return Listado de peliculas
     */
    @GetMapping
    public List<Movie> getAll() {
        return this.movieService.getAll();
    }
    
    /**
     * Recurso para crear peliculas
     * Implementa el metodo HTTP POST
     * @param movie
     */
    @PostMapping("/create")
    @ResponseStatus(HttpStatus.CREATED)
    public void create(@RequestBody Movie movie) {
        this.movieService.create(movie);
    }
    
    /**
     * Recurso para editar peliculas
     * Implementa el metodo HTTP PUT
     * A diferencia del POST, PUT recibe como parametro el id del recurso a modificar 
     * @param movie
     * @param id 
     */
    @PutMapping("/edit/{id}")
    @ResponseStatus(HttpStatus.NO_CONTENT)
    public void edit(@RequestBody Movie movie, @PathVariable int id) {
        this.movieService.edit(movie, id);
    }
    
    /**
     * Recurso para eliminar peliculas
     * Implementa el metodo HTTP DELETE
     * @param id 
     */
    @DeleteMapping("/delete/{id}")
    @ResponseStatus(HttpStatus.NO_CONTENT)
    public void delete(@PathVariable int id) {
        this.movieService.delete(id);
    }
    
    /**
     * Recurso para calificar peliculas
     * Implementa el metodo HTTP PUT
     * A diferencia del POST, PUT recibe como parametro el id del recurso a modificar 
     * @param movie
     * @param id 
     */
    @PutMapping("/rate/{id}")
    @ResponseStatus(HttpStatus.NO_CONTENT)
    public void rate(@RequestBody Movie movie, @PathVariable int id) {
        this.movieService.rate(movie, id);
    }
    
}

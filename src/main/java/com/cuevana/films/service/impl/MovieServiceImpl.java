/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.cuevana.films.service.impl;

import com.cuevana.films.models.entity.Gender;
import com.cuevana.films.models.entity.Movie;
import com.cuevana.films.models.repository.GenderRepository;
import com.cuevana.films.models.repository.MovieRepository;
import com.cuevana.films.service.iface.MovieService;
import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * Implementacion de la interface MovieService
 *
 * @author adrian
 */
@Service
public class MovieServiceImpl implements MovieService {

    @Autowired
    private MovieRepository movieRepository;

    @Autowired
    private GenderRepository genderRepository;

    @Override
    public List<Movie> getAll() {
        List<Movie> movies = new ArrayList<>();
        this.movieRepository.findAll().forEach(movies::add);
        return movies;
    }

    @Override
    public void create(Movie movie) {
        Optional<Gender> existsGender = this.genderRepository.findById(movie.getGenderId().getGenderId());
        if (existsGender.isPresent()) {
            movie.setGenderId(existsGender.get());
            this.movieRepository.save(movie);
        }
    }

    @Override
    public void edit(Movie movie, int movieId) {
        Optional<Movie> existsMovie = this.movieRepository.findById(movieId);
        if (existsMovie.isPresent()) {
            existsMovie.get().setName(movie.getName());
            existsMovie.get().setDescription(movie.getDescription());
            existsMovie.get().setActors(movie.getActors());
            existsMovie.get().setImage(movie.getImage());
            existsMovie.get().setRating(movie.getRating());
            existsMovie.get().setReleaseDate(movie.getReleaseDate());
            Optional<Gender> existsGender = this.genderRepository.findById(movie.getGenderId().getGenderId());
            if (existsGender.isPresent()) {
                existsMovie.get().setGenderId(existsGender.get());
            }
            this.movieRepository.save(existsMovie.get());
        }
    }

    @Override
    public void delete(int movieId) {
        Optional<Movie> existsMovie = this.movieRepository.findById(movieId);
        if (existsMovie.isPresent()) {
            this.movieRepository.delete(existsMovie.get());
        }
    }

}

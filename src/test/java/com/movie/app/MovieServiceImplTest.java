package com.movie.app;

import com.cuevana.films.models.entity.Gender;
import com.cuevana.films.models.entity.Movie;
import com.cuevana.films.models.repository.MovieRepository;
import com.cuevana.films.service.impl.MovieServiceImpl;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;
import static junit.framework.Assert.assertEquals;
import org.junit.Before;
import org.junit.Test;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import static org.mockito.Mockito.times;
import static org.mockito.Mockito.verify;
import static org.mockito.Mockito.when;
import org.mockito.MockitoAnnotations;

public class MovieServiceImplTest {
 
    @InjectMocks
    MovieServiceImpl movieService;
    
    @Mock
    MovieRepository movieRepository;
    
    @Before
    public void init() {
        MockitoAnnotations.initMocks(this);
    }
    
    @Test
    public void getMovies() {
        List<Movie> movies = new ArrayList<>();
        
        movies.add(new Movie(1, "1", "", "", 
                LocalDateTime.now(), LocalDate.now(), "", new Gender(), 0));
        movies.add(new Movie(2, "1", "", "", 
                LocalDateTime.now(), LocalDate.now(), "", new Gender(), 0));
        movies.add(new Movie(3, "1", "", "", 
                LocalDateTime.now(), LocalDate.now(), "", new Gender(), 0));
        
        when(this.movieRepository.findAll()).thenReturn(movies);
        
        List<Movie> moviesList = this.movieService.getAll();
        
        assertEquals(3, moviesList.size());
        
        verify(this.movieRepository, times(1)).findAll();
    }
    
    
}

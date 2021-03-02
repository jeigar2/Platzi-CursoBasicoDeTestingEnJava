package es.jesustfk.javatest.movies.data;

import es.jesustfk.javatest.movies.model.Movie;

import java.util.Collection;
import java.util.List;

public interface MovieRepository {

    Movie findById(long id);
    List<Movie> findByName(String title);
    Collection<Movie> findAll();
    void saveOrUpdate(Movie movie);
}

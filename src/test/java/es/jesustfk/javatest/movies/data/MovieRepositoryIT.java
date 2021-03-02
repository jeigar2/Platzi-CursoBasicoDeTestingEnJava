package es.jesustfk.javatest.movies.data;

import es.jesustfk.javatest.movies.model.Genre;
import es.jesustfk.javatest.movies.model.Movie;
import org.junit.Before;
import org.junit.Test;
import org.springframework.core.io.ClassPathResource;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.datasource.DriverManagerDataSource;
import org.springframework.jdbc.datasource.init.ScriptUtils;

import javax.sql.DataSource;

import java.sql.SQLException;
import java.util.Collection;
import java.util.Arrays;


import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.*;

public class MovieRepositoryIT {

    private MovieRepositoryJdbc movieRepository;

    @Before
    public void setUp() throws Exception {
        DataSource dataSource =
                new DriverManagerDataSource("jdbc:h2:mem:test;MODE=MYSQL", "sa", "sa");

        ScriptUtils.executeSqlScript(dataSource.getConnection(), new ClassPathResource("sql-scripts/test-data.sql"));

        JdbcTemplate jdbcTemplate = new JdbcTemplate(dataSource);

        movieRepository = new MovieRepositoryJdbc(jdbcTemplate);
    }

    @Test
    public void load_all_movies() {


        Collection<Movie> movies = movieRepository.findAll();

        assertThat(movies, is(Arrays.asList(
                new Movie(1, "Dark Knight", 152, Genre.ACTION),
                new Movie(2, "Memento", 113, Genre.THRILLER),
                new Movie(3, "Matrix", 136, Genre.ACTION)
        )));
    }

    @Test
    public void load_movie_by_id() {
        Movie movie = movieRepository.findById(2);

        assertThat(movie, is(new Movie(2, "Memento", 113, Genre.THRILLER)));
    }

    @Test
    public void insert_a_movie() {
        Movie movie = new Movie(4, "Super 8", 112, Genre.THRILLER);
        movieRepository.saveOrUpdate(movie);
        Movie movieLoaded = movieRepository.findById(4);

        assertThat(movieLoaded, is(movie));


    }
}
package es.jesustfk.javatest.movies.data;

import es.jesustfk.javatest.movies.model.Genre;
import es.jesustfk.javatest.movies.model.Movie;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;

import java.sql.Types;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.Map;

public class MovieRepositoryJdbc implements MovieRepository {

    private JdbcTemplate jdbcTemplate;


    public MovieRepositoryJdbc(JdbcTemplate jdbcTemplate) {
        this.jdbcTemplate = jdbcTemplate;
    }

    @Override
    public Movie findById(long id) {
        Object[] args = { id };
        return jdbcTemplate.queryForObject("select * from movies where id = ?", args, movieMapper);
    }

    @Override
    public List<Movie> findByName(String title) {
        Object[] args = {"%" + title + "%"};
        List<Map<String, Object>> moviesLoaded = jdbcTemplate.queryForList(
                "select * from movies where lower(name) like lower(?)",
                args,
                new int[] {Types.VARCHAR});
        List<Movie> movieList = new ArrayList<>();
        moviesLoaded.forEach(row -> {
            movieList.add( new Movie(
                    (int) row.get("id"),
                    (String) row.get("name"),
                    (int) row.get("minutes"),
                    Genre.valueOf(row.get("genre").toString())
                ));
        });
        return movieList;
    }

    @Override
    public Collection<Movie> findAll() {
        return jdbcTemplate.query("select * from movies", movieMapper);
    }

    private RowMapper<Movie> movieMapper = (rs, rowNum) ->
            new Movie(
                rs.getInt("id"),
                rs.getString("name"),
                rs.getInt("minutes"),
                Genre.valueOf(rs.getString("genre")) );

    @Override
    public void saveOrUpdate(Movie movie) {
        jdbcTemplate.update("insert into movies (name, minutes, genre) values (?, ?, ?)",
                movie.getName(), movie.getMinutes(), movie.getGenre().toString());
    }
}

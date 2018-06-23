package tr.org.ab.spring.rest.videostore.movie.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import tr.org.ab.spring.rest.videostore.movie.Movie;

@Repository
public interface MovieRepository extends JpaRepository<Movie,String> {
    Movie findMovieById(String id);
}

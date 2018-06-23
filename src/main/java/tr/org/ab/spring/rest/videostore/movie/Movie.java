package tr.org.ab.spring.rest.videostore.movie;

import javax.persistence.ElementCollection;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.validation.constraints.NotNull;
import java.util.List;
import java.util.UUID;

/**
 * @author Omer Ozkan
 */
@Entity
public class Movie {
    @Id
    private String id;
    private String imdbId;
    private String title;
    private int year;
    @ElementCollection
    private List<String> countries;
    @ElementCollection
    private List<String> genres;
    private float imdbRating;

    public String getId() {
        return id;
    }

    public Movie setId(String id) {
        this.id = id;
        return this;
    }

    public String getImdbId() {
        return imdbId;
    }

    public Movie setImdbId(String imdbId) {
        this.imdbId = imdbId;
        return this;
    }

    public String getTitle() {
        return title;
    }

    public Movie setTitle(String title) {
        this.title = title;
        return this;
    }

    public int getYear() {
        return year;
    }

    public Movie setYear(int year) {
        this.year = year;
        return this;
    }

    public List<String> getCountries() {
        return countries;
    }

    public Movie setCountries(List<String> countries) {
        this.countries = countries;
        return this;
    }

    public List<String> getGenres() {
        return genres;
    }

    public Movie setGenres(List<String> genres) {
        this.genres = genres;
        return this;
    }

    public float getImdbRating() {
        return imdbRating;
    }

    public Movie setImdbRating(float imdbRating) {
        this.imdbRating = imdbRating;
        return this;
    }
}

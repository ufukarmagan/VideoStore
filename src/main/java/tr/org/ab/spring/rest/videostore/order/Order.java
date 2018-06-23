package tr.org.ab.spring.rest.videostore.order;

import tr.org.ab.spring.rest.videostore.movie.Movie;
import tr.org.ab.spring.rest.videostore.user.User;

import javax.persistence.ElementCollection;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import java.util.List;

@Entity
@Table(name="movieorders")
public class Order {

    @Id
    private String id;
    private String userId;
    private String adress;
    //@ElementCollection
    private List<String> moviesId;
    private int totalAmount;


    public String getId() {
        return id;
    }

    public Order setId(String id) {
        this.id = id;
        return this;
    }

    public String getUserId() {
        return userId;
    }

    public Order setUserId(String userId) {
        this.userId = userId;
        return this;
    }

    public String getAdress() {
        return adress;
    }

    public Order setAdress(String adress) {
        this.adress = adress;
        return this;
    }

    public List<String> getMoviesId() {
        return moviesId;
    }

    public void setMoviesId(List<String> moviesId) {
        this.moviesId = moviesId;
    }

    public int getTotalAmount() {
        return totalAmount;
    }

    public Order setTotalAmount(int totalAmount) {
        this.totalAmount = totalAmount;
        return this;
    }
}

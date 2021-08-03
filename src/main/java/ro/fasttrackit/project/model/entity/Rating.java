package ro.fasttrackit.project.model.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.ManyToOne;

import static javax.persistence.CascadeType.ALL;

@Entity
public class Rating {
	@Id
	@GeneratedValue
	private Integer id;
	private String user;
	private int movieRating;

	@ManyToOne(cascade = ALL)
	private Movie movie;

	public Rating(String user, int movieRating, Movie movie) {
		this.user = user;
		this.movieRating = movieRating;
		this.movie = movie;
	}

	Rating() {
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getUser() {
		return user;
	}

	public void setUser(String user) {
		this.user = user;
	}

	public int getMovieRating() {
		return movieRating;
	}

	public void setMovieRating(int movieRating) {
		this.movieRating = movieRating;
	}

	public Movie getMovie() {
		return movie;
	}

	public void setMovie(Movie movie) {
		this.movie = movie;
	}

	@Override
	public String toString() {
		return "Rating{" +
				"id=" + id +
				", user='" + user + '\'' +
				", movieRating=" + movieRating +
				", movie=" + movie +
				'}';
	}
}

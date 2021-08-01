package ro.fasttrackit.project.model.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
public class Rating {
	@Id
	@GeneratedValue
	private Integer id;
	private String user;
	private int movieRating;

	public Rating(String user, int movieRating) {
		this.user = user;
		this.movieRating = movieRating;
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

	@Override
	public String toString() {
		return "Rating{" +
				"id=" + id +
				", user='" + user + '\'' +
				", movieRating=" + movieRating +
				'}';
	}
}

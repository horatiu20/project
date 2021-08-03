package ro.fasttrackit.project.model.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.ManyToOne;

import static javax.persistence.CascadeType.ALL;

@Entity
public class Trailer {
	@Id
	@GeneratedValue
	private Integer id;
	private String trailerDescription;

	@ManyToOne(cascade = ALL)
	private Movie movie;

	public Trailer(String trailerDescription, Movie movie) {
		this.trailerDescription = trailerDescription;
		this.movie = movie;
	}

	Trailer() {
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getTrailerDescription() {
		return trailerDescription;
	}

	public void setTrailerDescription(String trailerDescription) {
		this.trailerDescription = trailerDescription;
	}

	public Movie getMovie() {
		return movie;
	}

	public void setMovie(Movie movie) {
		this.movie = movie;
	}

	@Override
	public String toString() {
		return "Trailer{" +
				"id=" + id +
				", trailerDescription='" + trailerDescription + '\'' +
				", movie=" + movie +
				'}';
	}
}

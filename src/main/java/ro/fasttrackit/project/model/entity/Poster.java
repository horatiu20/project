package ro.fasttrackit.project.model.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.ManyToOne;

@Entity
public class Poster {
	@Id
	@GeneratedValue
	private Integer id;
	private String posterDescription;

	@ManyToOne
	private Movie movie;

	public Poster(String posterDescription, Movie movie) {
		this.posterDescription = posterDescription;
		this.movie = movie;
	}

	Poster() {
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getPosterDescription() {
		return posterDescription;
	}

	public void setPosterDescription(String posterDescription) {
		this.posterDescription = posterDescription;
	}

	public Movie getMovie() {
		return movie;
	}

	public void setMovie(Movie movie) {
		this.movie = movie;
	}

	@Override
	public String toString() {
		return "Poster{" +
				"id=" + id +
				", posterDescription='" + posterDescription + '\'' +
				", movie=" + movie +
				'}';
	}
}

package ro.fasttrackit.project.model.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.ManyToOne;

@Entity
public class Trailer {
	@Id
	@GeneratedValue
	private Integer id;
	private String url;

	@ManyToOne
	private Movie movie;

	public Trailer(String url, Movie movie) {
		this.url = url;
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

	public String getUrl() {
		return url;
	}

	public void setUrl(String url) {
		this.url = url;
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
				", url='" + url + '\'' +
				", movie=" + movie +
				'}';
	}
}

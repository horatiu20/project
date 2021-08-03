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
	private String url;

	@ManyToOne
	private Movie movie;

	public Poster(String url, Movie movie) {
		this.url = url;
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
		return "Poster{" +
				"id=" + id +
				", url='" + url + '\'' +
				", movie=" + movie +
				'}';
	}
}

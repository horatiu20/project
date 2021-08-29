package ro.fasttrackit.project.model.entity;

import javax.persistence.*;
import java.util.List;

@Entity
public class Movie {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer id;
	private String name;
	private Integer year;
	private String description;
	private double rating;

	@OneToMany(cascade = CascadeType.ALL)
	private List<Poster> posters;
	@OneToMany(cascade = CascadeType.ALL)
	private List<Trailer> trailers;

	public Movie(String name, Integer year, String description, double rating, List<Poster> posters, List<Trailer> trailers) {
		this.name = name;
		this.year = year;
		this.description = description;
		this.rating = rating;
		this.posters = posters;
		this.trailers = trailers;
	}

	Movie() {
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Integer getYear() {
		return year;
	}

	public void setYear(Integer year) {
		this.year = year;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public double getRating() {
		return rating;
	}

	public void setRating(double rating) {
		this.rating = rating;
	}

	public List<Poster> getPosters() {
		return posters;
	}

	public void setPosters(List<Poster> posters) {
		this.posters = posters;
	}

	public List<Trailer> getTrailers() {
		return trailers;
	}

	public void setTrailers(List<Trailer> trailers) {
		this.trailers = trailers;
	}

	@Override
	public String toString() {
		return "Movie{" +
				"id=" + id +
				", name='" + name + '\'' +
				", year=" + year +
				", description='" + description + '\'' +
				", rating=" + rating +
				", posters=" + posters +
				", trailers=" + trailers +
				'}';
	}
}


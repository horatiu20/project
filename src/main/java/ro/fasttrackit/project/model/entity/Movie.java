package ro.fasttrackit.project.model.entity;

import javax.persistence.*;
import java.util.List;

import static javax.persistence.CascadeType.ALL;

@Entity
public class Movie {
	@Id
	@GeneratedValue
	private Integer id;
	private String name;
	private int year;

	@OneToOne(cascade = ALL)
	private Description description;
	@OneToMany(cascade = ALL)
	private List<Poster> posters;
	@OneToMany(cascade = ALL)
	private List<Trailer> trailers;
	@OneToMany(cascade = ALL)
	private List<Rating> ratings;

	public Movie(String name, int year, Description description, List<Poster> posters, List<Trailer> trailers, List<Rating> ratings) {
		this.name = name;
		this.year = year;
		this.description = description;
		this.posters = posters;
		this.trailers = trailers;
		this.ratings = ratings;
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

	public int getYear() {
		return year;
	}

	public void setYear(int year) {
		this.year = year;
	}

	public Description getDescription() {
		return description;
	}

	public void setDescription(Description description) {
		this.description = description;
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

	public List<Rating> getRatings() {
		return ratings;
	}

	public void setRatings(List<Rating> ratings) {
		this.ratings = ratings;
	}

	@Override
	public String toString() {
		return "Movie{" +
				"id=" + id +
				", name='" + name + '\'' +
				", year=" + year +
				", description=" + description +
				", posters=" + posters +
				", trailers=" + trailers +
				", ratings=" + ratings +
				'}';
	}
}

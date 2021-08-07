package ro.fasttrackit.project.service;

import org.springframework.stereotype.Service;
import ro.fasttrackit.project.model.entity.Movie;
import ro.fasttrackit.project.repository.MovieRepository;

import java.util.List;
import java.util.Optional;

@Service
public class MovieService {
	private final MovieRepository repository;

	public MovieService(MovieRepository repository) {
		this.repository = repository;
	}

	public List<Movie> getAllMovies() {
		return repository.findAll();
	}

	public Movie postMovie(Movie newMovie) {
		newMovie.setId(null);
		return repository.save(newMovie);
	}

	public Optional<Movie> putMovie(int movieId, Movie newMovie) {
		return repository.findById(movieId)
				.map(dbMovie -> patchMovie(dbMovie, newMovie))
				.map(repository::save);
	}

	public Optional<Movie> deleteMovie(int movieId) {
		Optional<Movie> movie = repository.findById(movieId);
		movie.ifPresent(repository::delete);
		return movie;
	}

	public Movie patchMovie(Movie dbMovie, Movie movie) {
		dbMovie.setName(movie.getName());
		dbMovie.setYear(movie.getYear());
		dbMovie.setDescription(movie.getDescription());
		return dbMovie;
	}

	public Optional<Movie> getMovie(int movieId) {
		return repository.findById(movieId);
	}
}

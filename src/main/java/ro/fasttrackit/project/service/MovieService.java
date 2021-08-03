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

	public Optional<Movie> getById(int movieId) {
		return this.repository.findAll().stream()
				.filter(movie -> movie.getId() == movieId)
				.findFirst();
	}

	public Movie postMovie(Movie movie) {
		movie.setId(null);
		return repository.save(movie);
	}

	public Optional<Movie> putMovie(int movieId, Movie newMovie) {
		Optional<Movie> replacedMovie = deleteMovie(movieId);
		replacedMovie
				.ifPresent(deleteMovie -> postMovie(newMovie));
		return replacedMovie;
	}

	public Optional<Movie> deleteMovie(int movieId) {
		Optional<Movie> movieOptional = getById(movieId);
		movieOptional
				.ifPresent(repository::delete);
		return movieOptional;
	}

	public Optional<Movie> patchMovie(int movieId, Movie movie) {
		Optional<Movie> movieById = getById(movieId);
		Optional<Movie> patchedMovie = movieById
				.map(oldMovie -> new Movie(
						movie.getName() != null ? movie.getName() : oldMovie.getName(),
						movie.getYear() != 0 ? movie.getYear() : oldMovie.getYear(),
						movie.getDescription() != null ? movie.getDescription() : oldMovie.getDescription()));
		patchedMovie.ifPresent(newMovie -> putMovie(movieId, newMovie));
		return patchedMovie;
	}
}

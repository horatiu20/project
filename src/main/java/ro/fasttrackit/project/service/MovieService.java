package ro.fasttrackit.project.service;

import org.springframework.stereotype.Service;
import ro.fasttrackit.project.model.entity.Movie;
import ro.fasttrackit.project.repository.MovieRepository;

import java.util.List;
import java.util.Optional;

@Service
public class MovieService {
	private final MovieRepository movieRepository;

	public MovieService(MovieRepository movieRepository) {
		this.movieRepository = movieRepository;
	}

	public List<Movie> getAllMovies() {
		return movieRepository.findAll();
	}

	public Movie postMovie(Movie newMovie) {
		newMovie.setId(null);
		return movieRepository.save(newMovie);
	}

	public Optional<Movie> putMovie(int movieId, Movie newMovie) {
		return movieRepository.findById(movieId)
				.map(dbMovie -> patchMovie(dbMovie, newMovie))
				.map(movieRepository::save);
	}

	public Optional<Movie> deleteMovie(int movieId) {
		Optional<Movie> movie = movieRepository.findById(movieId);
		movie.ifPresent(movieRepository::delete);
		return movie;
	}

	public Movie patchMovie(Movie dbMovie, Movie movie) {
		dbMovie.setName(movie.getName());
		dbMovie.setYear(movie.getYear());
		dbMovie.setDescription(movie.getDescription());
		dbMovie.setRating(movie.getRating());
		return dbMovie;
	}

	public Optional<Movie> getMovie(int movieId) {
		return movieRepository.findById(movieId);
	}

	public Movie getMovieById(Integer movieId) {
		return getOrThrow(movieId);
	}

	private Movie getOrThrow(int movieId) {
		return movieRepository.findById(movieId).orElse(null);
	}
}

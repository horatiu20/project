package ro.fasttrackit.project.service;

import org.springframework.stereotype.Service;
import ro.fasttrackit.project.model.entity.Movie;
import ro.fasttrackit.project.model.entity.Poster;
import ro.fasttrackit.project.model.entity.Trailer;
import ro.fasttrackit.project.repository.MovieRepository;
import ro.fasttrackit.project.repository.PosterRepository;
import ro.fasttrackit.project.repository.TrailerRepository;

import javax.transaction.Transactional;
import java.util.List;
import java.util.Optional;

import static java.util.stream.Collectors.toList;

@Service
public class MovieService {
	private final MovieRepository movieRepository;
	private final PosterRepository posterRepository;
	private final TrailerRepository trailerRepository;

	public MovieService(MovieRepository movieRepository, PosterRepository posterRepository, TrailerRepository trailerRepository) {
		this.movieRepository = movieRepository;
		this.posterRepository = posterRepository;
		this.trailerRepository = trailerRepository;
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

	@Transactional
	public Optional<Movie> deleteMovie(int movieId) {
		posterRepository.deleteByMovieId(movieId);
		trailerRepository.deleteByMovieId(movieId);
		Optional<Movie> movie = movieRepository.findById(movieId);
		movie.ifPresent(movieRepository::delete);
		return movie;
	}

	public Movie patchMovie(Movie dbMovie, Movie movie) {
		dbMovie.setName(movie.getName());
		dbMovie.setYear(movie.getYear());
		dbMovie.setDescription(movie.getDescription());
		return dbMovie;
	}

	public Optional<Movie> getMovie(int movieId) {
		return movieRepository.findById(movieId);
	}

	public List<String> getAllPosters(int movieId) {
		List<String> allPosters = posterRepository.findById(movieId).stream()
				.map(Poster::getUrl)
				.collect(toList());
		return allPosters;
	}

	public List<String> getAllTrailers(int movieId) {
		List<String> allTrailers = trailerRepository.findById(movieId).stream()
				.map(Trailer::getUrl)
				.collect(toList());
		return allTrailers;
	}
}

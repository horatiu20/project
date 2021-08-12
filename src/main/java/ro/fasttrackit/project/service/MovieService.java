package ro.fasttrackit.project.service;

import org.springframework.stereotype.Service;
import ro.fasttrackit.project.model.entity.Movie;
import ro.fasttrackit.project.repository.MovieRepository;
import ro.fasttrackit.project.repository.PosterRepository;
import ro.fasttrackit.project.repository.RatingRepository;
import ro.fasttrackit.project.repository.TrailerRepository;

import javax.transaction.Transactional;
import java.util.List;
import java.util.Optional;

@Service
public class MovieService {
	private final MovieRepository repository;
	private final PosterRepository posterRepository;
	private final RatingRepository ratingRepository;
	private final TrailerRepository trailerRepository;

	public MovieService(MovieRepository repository, PosterRepository posterRepository, RatingRepository ratingRepository, TrailerRepository trailerRepository) {
		this.repository = repository;
		this.posterRepository = posterRepository;
		this.ratingRepository = ratingRepository;
		this.trailerRepository = trailerRepository;
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

	@Transactional
	public Optional<Movie> deleteMovie(int movieId) {
		posterRepository.deleteByMovieId(movieId);
		trailerRepository.deleteByMovieId(movieId);
		ratingRepository.deleteByMovieId(movieId);
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

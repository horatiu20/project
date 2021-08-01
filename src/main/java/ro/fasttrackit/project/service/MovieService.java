package ro.fasttrackit.project.service;

import org.springframework.stereotype.Service;
import ro.fasttrackit.project.model.entity.Movie;
import ro.fasttrackit.project.repository.MovieRepository;

import java.util.List;

@Service
public class MovieService {
	private final MovieRepository repository;

	public MovieService(MovieRepository repository) {
		this.repository = repository;
	}

	public List<Movie> getAllMovies() {
		return repository.findAll();
	}
}

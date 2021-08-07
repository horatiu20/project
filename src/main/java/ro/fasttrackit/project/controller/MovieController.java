package ro.fasttrackit.project.controller;

import org.springframework.web.bind.annotation.*;
import ro.fasttrackit.project.model.entity.Movie;
import ro.fasttrackit.project.service.MovieService;

import java.util.List;

@RestController
@RequestMapping("api/movies")
public class MovieController {
	private final MovieService movieService;

	public MovieController(MovieService movieService) {
		this.movieService = movieService;
	}

	@GetMapping
	List<Movie> getAllMovies() {
		return movieService.getAllMovies();
	}

	@PostMapping
	Movie postMovie(@RequestBody Movie movie) {
		return movieService.postMovie(movie);
	}

	@PutMapping("{movieId}")
	Movie putMovie(@PathVariable int movieId, @RequestBody Movie newMovie) {
		return movieService.putMovie(movieId, newMovie)
				.orElseThrow(() -> new RuntimeException("Could not find movie with id " + movieId));
	}

	@PatchMapping()
	Movie patchMovie(@RequestBody Movie dbMovie, @RequestBody Movie movie) {
		return movieService.patchMovie(dbMovie, movie);
	}

	@DeleteMapping("{movieId}")
	Movie deleteMovie(@PathVariable int movieId) {
		return movieService.deleteMovie(movieId).
				orElse(null);
	}
}

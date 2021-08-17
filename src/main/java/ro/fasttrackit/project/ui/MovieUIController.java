package ro.fasttrackit.project.ui;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import ro.fasttrackit.project.service.MovieService;

import java.util.Optional;

@Controller
@RequestMapping("movies")
public class MovieUIController {
	private final MovieService service;

	public MovieUIController(MovieService service) {
		this.service = service;
	}

	@GetMapping
	String moviesPage(@RequestParam(required = false) Double averageRating, Model model) {
		model.addAttribute("movies", service.getAllMovies());
		Optional.ofNullable(averageRating)
				.flatMap(service::averageRating)
				.ifPresent(rating -> model.addAttribute("averageRating", rating));
		return "movies";
	}

	@GetMapping("{movieId}")
	String singleMoviePage(@PathVariable int movieId, Model pageModel) {
		pageModel.addAttribute("movie", service.getMovie(movieId).orElse(null));
		pageModel.addAttribute("allPosters", service.getAllPosters(movieId));
		pageModel.addAttribute("allTrailers", service.getAllTrailers(movieId));
		return "single-movie";
	}
}

package ro.fasttrackit.project.ui;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import ro.fasttrackit.project.service.MovieService;

@Controller
@RequestMapping("movies")
public class MovieUIController {
	private final MovieService service;

	public MovieUIController(MovieService service) {
		this.service = service;
	}

	@GetMapping
	String moviesPage(Model model) {
		model.addAttribute("movies", service.getAllMovies());
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

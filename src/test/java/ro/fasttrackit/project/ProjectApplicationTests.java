package ro.fasttrackit.project;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;
import ro.fasttrackit.project.model.entity.Movie;
import ro.fasttrackit.project.model.entity.Poster;
import ro.fasttrackit.project.model.entity.Trailer;
import ro.fasttrackit.project.repository.MovieRepository;
import ro.fasttrackit.project.service.MovieService;

import java.util.List;

import static org.assertj.core.api.AssertionsForClassTypes.assertThat;

@SpringBootTest
class ProjectApplicationTests {
	MovieService service;

	@BeforeEach
	void setup() {
		service = new MovieService(
				new MovieRepository(
						new Movie(
								"Test Movie",
								2021,
								"movie plot",
								9.7,
								List.of(new Poster("/images/movie1/posters/movie1_1.jpg")),
								List.of(new Trailer("https://www.youtube.com/embed/n9xhJrPXop4")))));
	}

	@Test
	@DisplayName("Get all movies works")
	void getAllMovies() {
		assertThat(service.getAllMovies()).isEqualTo(
				new Movie("Test Movie",
						2021,
						"movie plot",
						9.7,
						List.of(new Poster("/images/movie1/posters/movie1_1.jpg")),
						List.of(new Trailer("https://www.youtube.com/embed/n9xhJrPXop4"))));
	}


}

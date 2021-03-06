package ro.fasttrackit.project;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.ActiveProfiles;
import ro.fasttrackit.project.model.entity.Movie;
import ro.fasttrackit.project.repository.MovieRepository;
import ro.fasttrackit.project.service.MovieService;

import javax.transaction.Transactional;
import java.util.List;

import static org.assertj.core.api.Assertions.assertThat;

@SpringBootTest
@ActiveProfiles("test")
class ProjectApplicationTests {
	@Autowired
	MovieService service;
	@Autowired
	MovieRepository repository;

	@Test
	@Transactional
	@DisplayName("GET all movies works")
	void getAllMovies() {
		repository.saveAll(List.of(
				new Movie("movie1", 2021, "first movie description", 9.6, List.of(), List.of()),
				new Movie("movie2", 2021, "second movie description", 8.5, List.of(), List.of())));

		assertThat(service.getAllMovies())
				.extracting("name")
				.containsExactly("movie1", "movie2");
	}

	@Test
	@Transactional
	@DisplayName("POST a new movie works")
	void postMovie() {
		service.postMovie(new Movie("movie", 1999, "movie description", 8.7, List.of(), List.of()));

		assertThat(repository.findAll())
				.extracting("name")
				.containsExactly("movie");
	}

	@Test
	@Transactional
	@DisplayName("PUT a movie works")
	void putMovie() {
		service.postMovie(new Movie("movie1", 2021, "first movie description", 9.6, List.of(), List.of()));
		service.putMovie(1, new Movie("movie2", 2021, "movie2 description", 9.6, List.of(), List.of()));

		assertThat(repository.findAll())
				.extracting("name")
				.containsExactly("movie2");
	}

	@Test
	@Transactional
	@DisplayName("PATCH an old movie works")
	void patchMovie() {
		service.postMovie(new Movie("movie1", 2021, "first movie description", 9.6, List.of(), List.of()));

		service.patchMovie(
				new Movie("movie1", 2021, "first movie description", 9.6, List.of(), List.of()),
				new Movie("movie2", 2021, "second movie description", 9.6, List.of(), List.of()));

		assertThat(repository.findAll())
				.extracting("name")
				.containsExactly("movie2");
	}

	@Test
	@Transactional
	@DisplayName("DELETE a movie works")
	void deleteMovie() {
		service.postMovie(new Movie("movie", 1999, "movie description", 8.7, List.of(), List.of()));
		service.deleteMovie(1);

		assertThat(repository.findAll())
				.isEmpty();
	}
}
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
				new Movie("Dune",
						2021,
						"Feature adaptation of Frank Herbert's science fiction novel, about the son of a noble family entrusted with the protection of the most valuable asset and most vital element in the galaxy.",
						9.6,
						List.of(),
						List.of()),
				new Movie("Foundation",
						2021,
						"A complex saga of humans scattered on planets throughout the galaxy all living under the rule of the Galactic Empire.",
						8.5,
						List.of(),
						List.of())));

		assertThat(service.getAllMovies())
				.extracting("name")
				.containsExactly("Dune", "Foundation");
	}

	@Test
	@Transactional
	@DisplayName("POST a new movie works")
	void postMovie() {
		service.postMovie(
				new Movie("The Matrix",
						1999,
						"When a beautiful stranger leads computer hacker Neo to a forbidding underworld, he discovers the shocking truth--the life he knows is the elaborate deception of an evil cyber-intelligence.",
						8.7,
						List.of(),
						List.of()));

		assertThat(repository.findAll())
				.extracting("name")
				.containsExactly("The Matrix");
	}

//	@Test
//	@Transactional
//	@DisplayName("PUT a new movie works")
//	void putMovie() {
//		repository.saveAll(List.of(
//				new Movie("Dune",
//						2021,
//						"Feature adaptation of Frank Herbert's science fiction novel, about the son of a noble family entrusted with the protection of the most valuable asset and most vital element in the galaxy.",
//						9.6,
//						List.of(),
//						List.of()),
//				new Movie("Foundation",
//						2021,
//						"A complex saga of humans scattered on planets throughout the galaxy all living under the rule of the Galactic Empire.",
//						8.5,
//						List.of(),
//						List.of())));
//
//		assertThat(service.putMovie(1,
//						new Movie("The Matrix",
//								1999,
//								"When a beautiful stranger leads computer hacker Neo to a forbidding underworld, he discovers the shocking truth--the life he knows is the elaborate deception of an evil cyber-intelligence.",
//								8.7,
//								List.of(),
//								List.of())))
//				.contains();
//	}
//
//	@Test
//	@Transactional
//	@DisplayName("PATCH a new movie works")
//	void patchMovie() {
//		repository.save(
//				new Movie("Dune",
//						2021,
//						"Feature adaptation of Frank Herbert's science fiction novel, about the son of a noble family entrusted with the protection of the most valuable asset and most vital element in the galaxy.",
//						9.6,
//						List.of(),
//						List.of()));
//
//		assertThat(service.patchMovie(
//				new Movie("Dune",
//						2021,
//						"Feature adaptation of Frank Herbert's science fiction novel, about the son of a noble family entrusted with the protection of the most valuable asset and most vital element in the galaxy.",
//						9.6,
//						List.of(),
//						List.of()),
//				new Movie("Dune - part2",
//						2021,
//						"Feature adaptation of Frank Herbert's science fiction novel, about the son of a noble family entrusted with the protection of the most valuable asset and most vital element in the galaxy.",
//						9.6,
//						List.of(),
//						List.of())))
//				.extracting("name")
//				.isEqualTo("Dune");
//	}
}





//	@Test
//	@Transactional
//	@DisplayName("Get all movies works")
//	void getAllMovies() {
//		//SETUP
//		repo.save(new Movie("Test1", 1111, "desc", 2.0, List.of(), List.of()));
//
//		//RUN & ASSERT
//		assertThat(service.getAllMovies())
//				.extracting("name")
//				.containsExactly("Test1");
//	}
//
////apoi teste cu add in serviciu si verifici in repo
////apoi mai poti face teste cu @WebMvcTest cu controller.

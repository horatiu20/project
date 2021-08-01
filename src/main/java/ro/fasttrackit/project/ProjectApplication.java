package ro.fasttrackit.project;

//PROJECT:
//Aplicație gen IMDB (afișare filme cu descriere, afiș, trailer + posibilitate de rating și afișare top-uri).

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import ro.fasttrackit.project.model.entity.*;
import ro.fasttrackit.project.repository.MovieRepository;

import java.util.List;

@SpringBootApplication
public class ProjectApplication {

	public static void main(String[] args) {
		SpringApplication.run(ProjectApplication.class, args);
	}

	@Bean
	CommandLineRunner atStartup(MovieRepository repository) {
		return args -> {
			repository.saveAll(List.of(
					new Movie("Dune", 2021, new Description("Feature adaptation of Frank Herbert's science fiction novel, about the son of a noble family entrusted with the protection of the most valuable asset and most vital element in the galaxy."),
							listOfPosters(),
							listOfTrailers(),
							listOfRatings())
			));
		};
	}

	private List<Poster> listOfPosters() {
		return List.of(
				new Poster("official poster"),
				new Poster("actor1 poster"),
				new Poster("actor2 poster"),
				new Poster("actor3 poster"));
	}

	private List<Trailer> listOfTrailers() {
		return List.of(
				new Trailer("official trailer"),
				new Trailer("fan-made trailer"));
	}

	private List<Rating> listOfRatings() {
		return List.of(
				new Rating("user1", 10),
				new Rating("user2", 10),
				new Rating("user3", 10));
	}

}

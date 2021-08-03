package ro.fasttrackit.project;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import ro.fasttrackit.project.model.entity.Movie;
import ro.fasttrackit.project.model.entity.Poster;
import ro.fasttrackit.project.model.entity.Trailer;
import ro.fasttrackit.project.repository.MovieRepository;
import ro.fasttrackit.project.repository.PosterRepository;
import ro.fasttrackit.project.repository.RatingRepository;
import ro.fasttrackit.project.repository.TrailerRepository;

@SpringBootApplication
public class ProjectApplication {

	public static void main(String[] args) {
		SpringApplication.run(ProjectApplication.class, args);
	}

	@Bean
	CommandLineRunner atStartup(MovieRepository movieRepository, PosterRepository posterRepository, TrailerRepository trailerRepository, RatingRepository ratingRepository) {
		return args -> {
			Movie movie1 = movieRepository.save(new Movie("Dune", 2021));
			Movie movie2 = movieRepository.save(new Movie("Foundation", 2021));
			Movie movie3 = movieRepository.save(new Movie("The Matrix", 1999));
			Movie movie4 = movieRepository.save(new Movie("The Witcher", 2019));
			Movie movie5 = movieRepository.save(new Movie("Star Trek: Discovery", 2017));

			Poster movie1Poster1 = posterRepository.save(new Poster("official poster", movie1));
			Poster movie1Poster2 = posterRepository.save(new Poster("first actor", movie1));
			Poster movie1Poster3 = posterRepository.save(new Poster("second actor", movie1));
			Poster movie1Poster4 = posterRepository.save(new Poster("third actor", movie1));

			Poster movie2Poster1 = posterRepository.save(new Poster("official poster", movie2));
			Poster movie2Poster2 = posterRepository.save(new Poster("first actor", movie2));
			Poster movie2Poster3 = posterRepository.save(new Poster("second actor", movie2));
			Poster movie2Poster4 = posterRepository.save(new Poster("third actor", movie2));

			Poster movie3Poster1 = posterRepository.save(new Poster("official poster", movie3));
			Poster movie3Poster2 = posterRepository.save(new Poster("first actor", movie3));
			Poster movie3Poster3 = posterRepository.save(new Poster("second actor", movie3));
			Poster movie3Poster4 = posterRepository.save(new Poster("third actor", movie3));

			Poster movie4Poster1 = posterRepository.save(new Poster("official poster", movie4));
			Poster movie4Poster2 = posterRepository.save(new Poster("first actor", movie4));
			Poster movie4Poster3 = posterRepository.save(new Poster("second actor", movie4));
			Poster movie4Poster4 = posterRepository.save(new Poster("third actor", movie4));

			Poster movie5Poster1 = posterRepository.save(new Poster("official poster", movie5));
			Poster movie5Poster2 = posterRepository.save(new Poster("first actor", movie5));
			Poster movie5Poster3 = posterRepository.save(new Poster("second actor", movie5));
			Poster movie5Poster4 = posterRepository.save(new Poster("third actor", movie5));

			Trailer movie1Trailer1 = trailerRepository.save(new Trailer("sneak-peak trailer", movie1));
			Trailer movie1Trailer2 = trailerRepository.save(new Trailer("official trailer", movie1));

			Trailer movie2Trailer1 = trailerRepository.save(new Trailer("sneak-peak trailer", movie2));
			Trailer movie2Trailer2 = trailerRepository.save(new Trailer("official trailer", movie2));

			Trailer movie3Trailer1 = trailerRepository.save(new Trailer("sneak-peak trailer", movie3));
			Trailer movie3Trailer2 = trailerRepository.save(new Trailer("official trailer", movie3));

			Trailer movie4Trailer1 = trailerRepository.save(new Trailer("sneak-peak trailer", movie4));
			Trailer movie4Trailer2 = trailerRepository.save(new Trailer("official trailer", movie4));

			Trailer movie5Trailer1 = trailerRepository.save(new Trailer("sneak-peak trailer", movie5));
			Trailer movie5Trailer2 = trailerRepository.save(new Trailer("official trailer", movie5));
		};
	}
}

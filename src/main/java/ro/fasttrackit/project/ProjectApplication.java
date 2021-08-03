package ro.fasttrackit.project;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import ro.fasttrackit.project.model.entity.Movie;
import ro.fasttrackit.project.model.entity.Poster;
import ro.fasttrackit.project.model.entity.Rating;
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
			Movie movie1 = movieRepository.save(new Movie("Dune", 2021, "Feature adaptation of Frank Herbert's science fiction novel, about the son of a noble family entrusted with the protection of the most valuable asset and most vital element in the galaxy."));
			Movie movie2 = movieRepository.save(new Movie("Foundation", 2021, "A complex saga of humans scattered on planets throughout the galaxy all living under the rule of the Galactic Empire."));
			Movie movie3 = movieRepository.save(new Movie("The Matrix", 1999, "When a beautiful stranger leads computer hacker Neo to a forbidding underworld, he discovers the shocking truth--the life he knows is the elaborate deception of an evil cyber-intelligence."));
			Movie movie4 = movieRepository.save(new Movie("The Witcher", 2019, "Geralt of Rivia, a solitary monster hunter, struggles to find his place in a world where people often prove more wicked than beasts."));
			Movie movie5 = movieRepository.save(new Movie("Star Trek: Discovery", 2017, "Ten years before Kirk, Spock, and the Enterprise, the USS Discovery discovers new worlds and lifeforms as one Starfleet officer learns to understand all things alien."));

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

			Rating movie1Rating1 = ratingRepository.save(new Rating("user1", 10, movie1));
			Rating movie1Rating2 = ratingRepository.save(new Rating("user2", 8, movie1));
			Rating movie1Rating3 = ratingRepository.save(new Rating("user3", 7, movie1));

			Rating movie2Rating1 = ratingRepository.save(new Rating("user1", 5, movie2));
			Rating movie2Rating2 = ratingRepository.save(new Rating("user2", 9, movie2));
			Rating movie2Rating3 = ratingRepository.save(new Rating("user3", 7, movie2));

			Rating movie3Rating1 = ratingRepository.save(new Rating("user1", 9, movie3));
			Rating movie3Rating2 = ratingRepository.save(new Rating("user2", 10, movie3));
			Rating movie3Rating3 = ratingRepository.save(new Rating("user3", 9, movie3));

			Rating movie4Rating1 = ratingRepository.save(new Rating("user1", 6, movie4));
			Rating movie4Rating2 = ratingRepository.save(new Rating("user2", 8, movie4));
			Rating movie4Rating3 = ratingRepository.save(new Rating("user3", 9, movie4));

			Rating movie5Rating1 = ratingRepository.save(new Rating("user1", 8, movie5));
			Rating movie5Rating2 = ratingRepository.save(new Rating("user2", 9, movie5));
			Rating movie5Rating3 = ratingRepository.save(new Rating("user3", 8, movie5));
		};
	}
}

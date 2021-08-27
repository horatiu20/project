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
import ro.fasttrackit.project.repository.TrailerRepository;

@SpringBootApplication
public class ProjectApplication {

	public static void main(String[] args) {
		SpringApplication.run(ProjectApplication.class, args);
	}

	@Bean
	CommandLineRunner atStartup(MovieRepository movieRepository, PosterRepository posterRepository, TrailerRepository trailerRepository) {
		return args -> {
			Movie movie1 = movieRepository.save(new Movie("Dune", 2021, "Feature adaptation of Frank Herbert's science fiction novel, about the son of a noble family entrusted with the protection of the most valuable asset and most vital element in the galaxy.", 9.8));
			Movie movie2 = movieRepository.save(new Movie("Foundation", 2021, "A complex saga of humans scattered on planets throughout the galaxy all living under the rule of the Galactic Empire.", 9.5));
			Movie movie3 = movieRepository.save(new Movie("The Matrix", 1999, "When a beautiful stranger leads computer hacker Neo to a forbidding underworld, he discovers the shocking truth--the life he knows is the elaborate deception of an evil cyber-intelligence.", 8.8));
			Movie movie4 = movieRepository.save(new Movie("The Witcher", 2019, "Geralt of Rivia, a solitary monster hunter, struggles to find his place in a world where people often prove more wicked than beasts.", 9.2));
			Movie movie5 = movieRepository.save(new Movie("Star Trek: Discovery", 2017, "Ten years before Kirk, Spock, and the Enterprise, the USS Discovery discovers new worlds and lifeforms as one Starfleet officer learns to understand all things alien.", 8.5));

			Poster movie1Poster1 = posterRepository.save(new Poster("/images/movie1/posters/movie1_1.jpg", movie1));
			Poster movie1Poster2 = posterRepository.save(new Poster("/images/movie1/posters/movie1_2.jpg", movie1));
			Poster movie1Poster3 = posterRepository.save(new Poster("/images/movie1/posters/movie1_3.jpg", movie1));
			Poster movie1Poster4 = posterRepository.save(new Poster("/images/movie1/posters/movie1_4.jpg", movie1));

			Poster movie2Poster1 = posterRepository.save(new Poster("/images/movie2/posters/movie2_1.jpg", movie2));
			Poster movie2Poster2 = posterRepository.save(new Poster("/images/movie2/posters/movie2_2.jpg", movie2));
			Poster movie2Poster3 = posterRepository.save(new Poster("/images/movie2/posters/movie2_3.jpg", movie2));
			Poster movie2Poster4 = posterRepository.save(new Poster("/images/movie2/posters/movie2_4.jpg", movie2));

			Poster movie3Poster1 = posterRepository.save(new Poster("/images/movie3/posters/movie3_1.jpg", movie3));
			Poster movie3Poster2 = posterRepository.save(new Poster("/images/movie3/posters/movie3_2.jpg", movie3));
			Poster movie3Poster3 = posterRepository.save(new Poster("/images/movie3/posters/movie3_3.jpg", movie3));
			Poster movie3Poster4 = posterRepository.save(new Poster("/images/movie3/posters/movie3_4.jpg", movie3));

			Poster movie4Poster1 = posterRepository.save(new Poster("/images/movie4/posters/movie4_1.jpg", movie4));
			Poster movie4Poster2 = posterRepository.save(new Poster("/images/movie4/posters/movie4_2.jpg", movie4));
			Poster movie4Poster3 = posterRepository.save(new Poster("/images/movie4/posters/movie4_3.jpg", movie4));
			Poster movie4Poster4 = posterRepository.save(new Poster("/images/movie4/posters/movie4_4.jpg", movie4));

			Poster movie5Poster1 = posterRepository.save(new Poster("/images/movie5/posters/movie5_1.jpg", movie5));
			Poster movie5Poster2 = posterRepository.save(new Poster("/images/movie5/posters/movie5_2.jpg", movie5));
			Poster movie5Poster3 = posterRepository.save(new Poster("/images/movie5/posters/movie5_3.jpg", movie5));
			Poster movie5Poster4 = posterRepository.save(new Poster("/images/movie5/posters/movie5_4.jpg", movie5));

			Trailer movie1Trailer1 = trailerRepository.save(new Trailer("https://www.youtube.com/embed/n9xhJrPXop4", movie1));
			Trailer movie1Trailer2 = trailerRepository.save(new Trailer("https://www.youtube.com/embed/8g18jFHCLXk", movie1));

			Trailer movie2Trailer1 = trailerRepository.save(new Trailer("https://www.youtube.com/embed/xgbPSA94Rqg", movie2));
			Trailer movie2Trailer2 = trailerRepository.save(new Trailer("https://www.youtube.com/embed/wvOAA1U0li8", movie2));

			Trailer movie3Trailer1 = trailerRepository.save(new Trailer("https://www.youtube.com/embed/m8e-FF8MsqU", movie3));
			Trailer movie3Trailer2 = trailerRepository.save(new Trailer("https://www.youtube.com/embed/EweuTOz7g-g", movie3));

			Trailer movie4Trailer1 = trailerRepository.save(new Trailer("https://www.youtube.com/embed/ndl1W4ltcmg", movie4));
			Trailer movie4Trailer2 = trailerRepository.save(new Trailer("https://www.youtube.com/embed/2aMVzFlApa0", movie4));

			Trailer movie5Trailer1 = trailerRepository.save(new Trailer("https://www.youtube.com/embed/oWnYtyNKPsA", movie5));
			Trailer movie5Trailer2 = trailerRepository.save(new Trailer("https://www.youtube.com/embed/09Cd7NKKvDc", movie5));
		};
	}
}

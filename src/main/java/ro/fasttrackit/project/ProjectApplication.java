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

			Poster movie1Poster1 = posterRepository.save(new Poster("https://m.media-amazon.com/images/M/MV5BMGFkZGY0NTgtMGEyZC00YzhjLTkyOWItYzMzOTljMDA3ZjU2XkEyXkFqcGdeQXVyNzc4NTU3Njg@._V1_FMjpg_UX1000_.jpg", movie1));
			Poster movie1Poster2 = posterRepository.save(new Poster("https://m.media-amazon.com/images/M/MV5BNWU4NjVkMTItZjhjMS00MWMyLWFiOGUtY2QxMmNhM2MwZDkyXkEyXkFqcGdeQXVyODIyOTEyMzY@._V1_.jpg", movie1));
			Poster movie1Poster3 = posterRepository.save(new Poster("https://m.media-amazon.com/images/M/MV5BM2M5OGI2MWYtZTEwYy00MmJjLWE5NzEtYzEyMTcyMjRiOWMyXkEyXkFqcGdeQXVyMTkxNjUyNQ@@.jpg", movie1));
			Poster movie1Poster4 = posterRepository.save(new Poster("https://film-book.com/wp-content/uploads/2021/07/Rebecca-Ferguson-Dune-Movie-Poster-01-1400x2075-1.jpg", movie1));

			Poster movie2Poster1 = posterRepository.save(new Poster("https://m.media-amazon.com/images/M/MV5BMTE5MDY1MGUtMmMxNi00YjA3LWIyZTYtN2FhOWJmNTY2NmM4XkEyXkFqcGdeQXVyMTkxNjUyNQ@@.jpg", movie2));
			Poster movie2Poster2 = posterRepository.save(new Poster("http://www.crash.fr/wp-content/uploads/2015/05/LEE3.jpg", movie2));
			Poster movie2Poster3 = posterRepository.save(new Poster("https://resizing.flixster.com/fA1R2tszTc1SxWuexEpHycv7H3Y=/506x652/v2/https://flxt.tmsimg.com/v9/AllPhotos/29836/29836_v9_bb.jpg", movie2));
			Poster movie2Poster4 = posterRepository.save(new Poster("https://m.media-amazon.com/images/M/MV5BZjJjNTAwOTktMGFmZi00OWRlLThhN2YtZmEyOWJiYmI5NDZlXkEyXkFqcGdeQXVyMjQwMDg0Ng@@.jpg", movie2));

			Poster movie3Poster1 = posterRepository.save(new Poster("https://m.media-amazon.com/images/M/MV5BNzQzOTk3OTAtNDQ0Zi00ZTVkLWI0MTEtMDllZjNkYzNjNTc4L2ltYWdlXkEyXkFqcGdeQXVyNjU0OTQ0OTY@.jpg", movie3));
			Poster movie3Poster2 = posterRepository.save(new Poster("https://pbs.twimg.com/media/EDPcr6TW4AQQF0b.jpg", movie3));
			Poster movie3Poster3 = posterRepository.save(new Poster("https://pbs.twimg.com/media/EDPeUOwWwAEn-wT.jpg", movie3));
			Poster movie3Poster4 = posterRepository.save(new Poster("https://pbs.twimg.com/media/EDPdYkiXoAAdNHF.jpg", movie3));

			Poster movie4Poster1 = posterRepository.save(new Poster("https://m.media-amazon.com/images/M/MV5BOGE4MmVjMDgtMzIzYy00NjEwLWJlODMtMDI1MGY2ZDlhMzE2XkEyXkFqcGdeQXVyMzY0MTE3NzU@.jpg", movie4));
			Poster movie4Poster2 = posterRepository.save(new Poster("https://m.media-amazon.com/images/M/MV5BY2NjMzg1ZDEtN2E0NS00MWNmLWI1MGItYTUyYTVjNjA4ZmU0XkEyXkFqcGdeQXVyNDQxNjcxNQ@@.jpg", movie4));
			Poster movie4Poster3 = posterRepository.save(new Poster("https://m.media-amazon.com/images/M/MV5BODA2NTY0ZmYtNTY2YS00ZTI0LWJjNTktMDc1NjAwZGU4YjhjXkEyXkFqcGdeQXVyNDQxNjcxNQ@@.jpg", movie4));
			Poster movie4Poster4 = posterRepository.save(new Poster("https://m.media-amazon.com/images/M/MV5BZDIwZjllZmItOWZlMS00NzU2LTg4ZTgtMTU2ZWMwYmI5ZTU1XkEyXkFqcGdeQXVyNDQxNjcxNQ@@.jpg", movie4));

			Poster movie5Poster1 = posterRepository.save(new Poster("https://m.media-amazon.com/images/M/MV5BZWUxMjBmMTMtNzdkZi00NjEyLTkwODQtODAyNGI2YWUwYjgwXkEyXkFqcGdeQXVyNzE5MTM1NTQ@.jpg", movie5));
			Poster movie5Poster2 = posterRepository.save(new Poster("https://m.media-amazon.com/images/M/MV5BN2Q1ODAwNTItNGQ2Yy00ZGViLWEzNzktNTg1MGZiZDYzNTU0XkEyXkFqcGdeQXVyODAzMDY0MTY@.jpg", movie5));
			Poster movie5Poster3 = posterRepository.save(new Poster("https://m.media-amazon.com/images/M/MV5BY2EwNjg5OGMtN2U3NS00MzMwLTg2Y2EtZDBkN2ExMDQyOWY4XkEyXkFqcGdeQXVyNzU3Nzk4MDQ@.jpg", movie5));
			Poster movie5Poster4 = posterRepository.save(new Poster("https://m.media-amazon.com/images/M/MV5BMWM5ZGZjM2QtMmNlYi00OTQyLWFkOTItNDFkOWRkYzZlZjkwXkEyXkFqcGdeQXVyODAzMDY0MTY@.jpg", movie5));

			Trailer movie1Trailer1 = trailerRepository.save(new Trailer("https://youtu.be/8g18jFHCLXk", movie1));
			Trailer movie1Trailer2 = trailerRepository.save(new Trailer("https://youtu.be/n9xhJrPXop4", movie1));

			Trailer movie2Trailer1 = trailerRepository.save(new Trailer("https://youtu.be/xgbPSA94Rqg", movie2));
			Trailer movie2Trailer2 = trailerRepository.save(new Trailer("https://youtu.be/wvOAA1U0li8", movie2));

			Trailer movie3Trailer1 = trailerRepository.save(new Trailer("https://youtu.be/EweuTOz7g-g", movie3));
			Trailer movie3Trailer2 = trailerRepository.save(new Trailer("https://youtu.be/m8e-FF8MsqU", movie3));

			Trailer movie4Trailer1 = trailerRepository.save(new Trailer("https://youtu.be/cSqi-8kAMmM", movie4));
			Trailer movie4Trailer2 = trailerRepository.save(new Trailer("https://youtu.be/ndl1W4ltcmg", movie4));

			Trailer movie5Trailer1 = trailerRepository.save(new Trailer("https://youtu.be/oWnYtyNKPsA", movie5));
			Trailer movie5Trailer2 = trailerRepository.save(new Trailer("https://youtu.be/09Cd7NKKvDc", movie5));

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

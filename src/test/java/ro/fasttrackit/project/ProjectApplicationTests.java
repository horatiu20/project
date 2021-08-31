package ro.fasttrackit.project;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import ro.fasttrackit.project.model.entity.Movie;
import ro.fasttrackit.project.model.entity.Poster;
import ro.fasttrackit.project.model.entity.Trailer;
import ro.fasttrackit.project.service.MovieService;

import javax.transaction.Transactional;
import java.util.List;

import static org.assertj.core.api.AssertionsForClassTypes.assertThat;

@SpringBootTest
class ProjectApplicationTests {
	@Autowired
	MovieService service;

	@Test
	@Transactional
	@DisplayName("Get all movies works")
	void getAllMovies() {
		assertThat(service.getAllMovies()).isEqualTo(List.of(
				new Movie("Dune", 2021, "Feature adaptation of Frank Herbert's science fiction novel, about the son of a noble family entrusted with the protection of the most valuable asset and most vital element in the galaxy.", 9.6, postersMovie1(), trailersMovie1()),
				new Movie("Foundation", 2021, "A complex saga of humans scattered on planets throughout the galaxy all living under the rule of the Galactic Empire.", 8.5, postersMovie2(), trailersMovie2()),
				new Movie("The Matrix", 1999, "When a beautiful stranger leads computer hacker Neo to a forbidding underworld, he discovers the shocking truth--the life he knows is the elaborate deception of an evil cyber-intelligence.", 8.7, postersMovie3(), trailersMovie3()),
				new Movie("The Witcher", 2019, "Geralt of Rivia, a solitary monster hunter, struggles to find his place in a world where people often prove more wicked than beasts.", 8.2, postersMovie4(), trailersMovie4()),
				new Movie("Star Trek: Discovery", 2017, "Ten years before Kirk, Spock, and the Enterprise, the USS Discovery discovers new worlds and lifeforms as one Starfleet officer learns to understand all things alien.", 7.2, postersMovie5(), trailersMovie5()),
				new Movie("The Lord of the Rings: The Two Towers", 2002, "While Frodo and Sam edge closer to Mordor with the help of the shifty Gollum, the divided fellowship makes a stand against Sauron's new ally, Saruman, and his hordes of Isengard.", 8.7, postersMovie6(), trailersMovie6()),
				new Movie("The Dark Knight", 2008, "When the menace known as the Joker wreaks havoc and chaos on the people of Gotham, Batman must accept one of the greatest psychological and physical tests of his ability to fight injustice.", 9.0, postersMovie7(), trailersMovie7()),
				new Movie("Westworld", 2016, "Set at the intersection of the near future and the reimagined past, explore a world in which every human appetite can be indulged without consequence.", 8.6, postersMovie8(), trailersMovie8()),
				new Movie("Interstellar", 2014, "A team of explorers travel through a wormhole in space in an attempt to ensure humanity's survival.", 8.6, postersMovie9(), trailersMovie9()),
				new Movie("Blade Runner 2049", 2017, "Young Blade Runner K's discovery of a long-buried secret leads him to track down former Blade Runner Rick Deckard, who's been missing for thirty years.", 8.0, postersMovie10(), trailersMovie10())));
	}

	private List<Poster> postersMovie1() {
		return List.of(
				new Poster("/images/movie1/posters/movie1_1.jpg"),
				new Poster("/images/movie1/posters/movie1_2.jpg"),
				new Poster("/images/movie1/posters/movie1_3.jpg"),
				new Poster("/images/movie1/posters/movie1_4.jpg"));
	}

	private List<Poster> postersMovie2() {
		return List.of(
				new Poster("/images/movie2/posters/movie2_1.jpg"),
				new Poster("/images/movie2/posters/movie2_2.jpg"),
				new Poster("/images/movie2/posters/movie2_3.jpg"),
				new Poster("/images/movie2/posters/movie2_4.jpg"));
	}

	private List<Poster> postersMovie3() {
		return List.of(
				new Poster("/images/movie3/posters/movie3_1.jpg"),
				new Poster("/images/movie3/posters/movie3_2.jpg"),
				new Poster("/images/movie3/posters/movie3_3.jpg"),
				new Poster("/images/movie3/posters/movie3_4.jpg"));
	}

	private List<Poster> postersMovie4() {
		return List.of(
				new Poster("/images/movie4/posters/movie4_1.jpg"),
				new Poster("/images/movie4/posters/movie4_2.jpg"),
				new Poster("/images/movie4/posters/movie4_3.jpg"),
				new Poster("/images/movie4/posters/movie4_4.jpg"));
	}

	private List<Poster> postersMovie5() {
		return List.of(
				new Poster("/images/movie5/posters/movie5_1.jpg"),
				new Poster("/images/movie5/posters/movie5_2.jpg"),
				new Poster("/images/movie5/posters/movie5_3.jpg"),
				new Poster("/images/movie5/posters/movie5_4.jpg"));
	}

	private List<Poster> postersMovie6() {
		return List.of(
				new Poster("/images/movie6/posters/movie6_1.jpg"),
				new Poster("/images/movie6/posters/movie6_2.jpg"),
				new Poster("/images/movie6/posters/movie6_3.jpg"),
				new Poster("/images/movie6/posters/movie6_4.jpg"));
	}

	private List<Poster> postersMovie7() {
		return List.of(
				new Poster("/images/movie7/posters/movie7_1.jpg"),
				new Poster("/images/movie7/posters/movie7_2.jpg"),
				new Poster("/images/movie7/posters/movie7_3.jpg"),
				new Poster("/images/movie7/posters/movie7_4.jpg"));
	}

	private List<Poster> postersMovie8() {
		return List.of(
				new Poster("/images/movie8/posters/movie8_1.jpg"),
				new Poster("/images/movie8/posters/movie8_2.jpg"),
				new Poster("/images/movie8/posters/movie8_3.jpg"),
				new Poster("/images/movie8/posters/movie8_4.jpg"));
	}

	private List<Poster> postersMovie9() {
		return List.of(
				new Poster("/images/movie9/posters/movie9_1.jpg"),
				new Poster("/images/movie9/posters/movie9_2.jpg"),
				new Poster("/images/movie9/posters/movie9_3.jpg"),
				new Poster("/images/movie9/posters/movie9_4.jpg"));
	}

	private List<Poster> postersMovie10() {
		return List.of(
				new Poster("/images/movie10/posters/movie10_1.jpg"),
				new Poster("/images/movie10/posters/movie10_2.jpg"),
				new Poster("/images/movie10/posters/movie10_3.jpg"),
				new Poster("/images/movie10/posters/movie10_4.jpg"));
	}

	private List<Trailer> trailersMovie1() {
		return List.of(
				new Trailer("https://www.youtube.com/embed/n9xhJrPXop4"),
				new Trailer("https://www.youtube.com/embed/8g18jFHCLXk"));
	}

	private List<Trailer> trailersMovie2() {
		return List.of(
				new Trailer("https://www.youtube.com/embed/xgbPSA94Rqg"),
				new Trailer("https://www.youtube.com/embed/wvOAA1U0li8"));
	}

	private List<Trailer> trailersMovie3() {
		return List.of(
				new Trailer("https://www.youtube.com/embed/m8e-FF8MsqU"),
				new Trailer("https://www.youtube.com/embed/EweuTOz7g-g"));
	}

	private List<Trailer> trailersMovie4() {
		return List.of(
				new Trailer("https://www.youtube.com/embed/ndl1W4ltcmg"),
				new Trailer("https://www.youtube.com/embed/2aMVzFlApa0"));
	}

	private List<Trailer> trailersMovie5() {
		return List.of(
				new Trailer("https://www.youtube.com/embed/oWnYtyNKPsA"),
				new Trailer("https://www.youtube.com/embed/09Cd7NKKvDc"));
	}

	private List<Trailer> trailersMovie6() {
		return List.of(
				new Trailer("https://www.youtube.com/embed/hYcw5ksV8YQ"),
				new Trailer("https://www.youtube.com/embed/LbfMDwc4azU"));
	}

	private List<Trailer> trailersMovie7() {
		return List.of(
				new Trailer("https://www.youtube.com/embed/EXeTwQWrcwY"),
				new Trailer("https://www.youtube.com/embed/TQfATDZY5Y4"));
	}

	private List<Trailer> trailersMovie8() {
		return List.of(
				new Trailer("https://www.youtube.com/embed/qLFBcdd6Qw0"),
				new Trailer("https://www.youtube.com/embed/0zZcBv0gPK0"));
	}

	private List<Trailer> trailersMovie9() {
		return List.of(
				new Trailer("https://www.youtube.com/embed/2LqzF5WauAw"),
				new Trailer("https://www.youtube.com/embed/ePbKGoIGAXY"));
	}

	private List<Trailer> trailersMovie10() {
		return List.of(
				new Trailer("https://www.youtube.com/embed/gCcx85zbxz4"),
				new Trailer("https://www.youtube.com/embed/dZOaI_Fn5o4"));
	}
}

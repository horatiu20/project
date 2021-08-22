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

			Poster movie1Poster1 = posterRepository.save(new Poster("https://lh3.google.com/u/0/d/1TxIAOPMt6PUDcXPJ1wTqxLtKBECFdPBT=w1920-h969-iv1", movie1));
			Poster movie1Poster2 = posterRepository.save(new Poster("https://lh3.google.com/u/0/d/1CxILmvvJ-CM-rvdmAO511s5EVM55Erus=w1920-h969-iv1", movie1));
			Poster movie1Poster3 = posterRepository.save(new Poster("https://lh3.google.com/u/0/d/1c1-HSCnrtbfF_uRHv04lGcg_n1W9_eF2=w1920-h969-iv1", movie1));
			Poster movie1Poster4 = posterRepository.save(new Poster("https://lh3.google.com/u/0/d/1okZvi6_dAeIINXZtf3xzNWe8Eq2xSRAH=w1920-h969-iv1", movie1));

			Poster movie2Poster1 = posterRepository.save(new Poster("https://lh3.google.com/u/0/d/1GcmMgRq5B6J9hXoiEaeG_r8rbhLTsued=w1920-h969-iv1", movie2));
			Poster movie2Poster2 = posterRepository.save(new Poster("https://lh3.google.com/u/0/d/1lWTben96OmSzmVGKhCggAqgLLudX6PS9=w1375-h969-iv1", movie2));
			Poster movie2Poster3 = posterRepository.save(new Poster("https://lh3.google.com/u/0/d/1zrun-p33Zsjv-lj-GyuUI06kcMBat01d=w1375-h969-iv1", movie2));
			Poster movie2Poster4 = posterRepository.save(new Poster("https://lh3.google.com/u/0/d/19-wwi9KP3OFqHpczyorgRbnCFrjVoSQu=w1375-h969-iv1", movie2));

			Poster movie3Poster1 = posterRepository.save(new Poster("https://lh3.google.com/u/0/d/1yTJHV0q7zgHAiFGU8D7V1Z786x5NibJ7=w1920-h912-iv1", movie3));
			Poster movie3Poster2 = posterRepository.save(new Poster("https://lh3.google.com/u/0/d/1Y6arAeiHBhvEQxo6FtjrBMXg0Gyw8XIM=w1375-h912-iv1", movie3));
			Poster movie3Poster3 = posterRepository.save(new Poster("https://lh3.google.com/u/0/d/1rhMsPFQjbvq8EjB7VOPabfscUq_P16d1=w1375-h912-iv1", movie3));
			Poster movie3Poster4 = posterRepository.save(new Poster("https://lh3.google.com/u/0/d/1_XKpS9xL2Rye_GqIsa_NR0Ze_fuEOhhx=w1375-h912-iv1", movie3));

			Poster movie4Poster1 = posterRepository.save(new Poster("https://lh3.google.com/u/0/d/1ihQG7gpoRzDWceKn30FbrmFrdwhoKZr_=w1375-h912-iv1", movie4));
			Poster movie4Poster2 = posterRepository.save(new Poster("https://lh3.google.com/u/0/d/1Ds-jDDJtCJD1Qj-cnBBoVyag2ijlDwDN=w1375-h912-iv1", movie4));
			Poster movie4Poster3 = posterRepository.save(new Poster("https://lh3.google.com/u/0/d/1irA53EgYVlzxdIFxWIPQxAeDhI9JcWvJ=w1375-h912-iv1", movie4));
			Poster movie4Poster4 = posterRepository.save(new Poster("https://lh3.google.com/u/0/d/19qP41RXIEVHgTr2MogDU2AyFKiqy2C_O=w1375-h912-iv1", movie4));

			Poster movie5Poster1 = posterRepository.save(new Poster("https://lh3.google.com/u/0/d/14-gkhZzHL-4cteWMdV3C9VPkfrT2ok4A=w1375-h912-iv1", movie5));
			Poster movie5Poster2 = posterRepository.save(new Poster("https://lh3.google.com/u/0/d/1aVLtg_2ztlxNsaFjpR4X-IUp7-CEtkvx=w1375-h912-iv1", movie5));
			Poster movie5Poster3 = posterRepository.save(new Poster("https://lh3.google.com/u/0/d/1qZgM3GWfzjadRcpW6ERS4TbS2fgHfBgU=w1375-h912-iv1", movie5));
			Poster movie5Poster4 = posterRepository.save(new Poster("https://lh3.google.com/u/0/d/1PxWPhumbwVXaIE0bwIOT0rn1t4ujtK2D=w1375-h912-iv1", movie5));

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

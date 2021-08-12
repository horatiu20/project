package ro.fasttrackit.project.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import ro.fasttrackit.project.model.entity.Poster;

public interface PosterRepository extends JpaRepository<Poster, Integer> {
	void deleteByMovieId(int movieId);
}

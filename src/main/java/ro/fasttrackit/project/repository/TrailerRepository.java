package ro.fasttrackit.project.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import ro.fasttrackit.project.model.entity.Trailer;

public interface TrailerRepository extends JpaRepository<Trailer, Integer> {
	void deleteByMovieId(int movieId);
}

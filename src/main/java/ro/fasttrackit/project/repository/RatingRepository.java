package ro.fasttrackit.project.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import ro.fasttrackit.project.model.entity.Rating;

public interface RatingRepository extends JpaRepository<Rating, Integer> {
	void deleteByMovieId(int movieId);
}

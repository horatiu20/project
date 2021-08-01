package ro.fasttrackit.project.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import ro.fasttrackit.project.model.entity.Movie;

public interface MovieRepository extends JpaRepository<Movie, Integer> {
}

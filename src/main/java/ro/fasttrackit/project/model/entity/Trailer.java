package ro.fasttrackit.project.model.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
public class Trailer {
	@Id
	@GeneratedValue
	private Integer id;
	private String trailerDescription;

	public Trailer(String trailerDescription) {
		this.trailerDescription = trailerDescription;
	}

	Trailer() {
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getTrailerDescription() {
		return trailerDescription;
	}

	public void setTrailerDescription(String trailerDescription) {
		this.trailerDescription = trailerDescription;
	}

	@Override
	public String toString() {
		return "Trailer{" +
				"id=" + id +
				", trailerDescription='" + trailerDescription + '\'' +
				'}';
	}
}

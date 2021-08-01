package ro.fasttrackit.project.model.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
public class Poster {
	@Id
	@GeneratedValue
	private Integer id;
	private String posterDescription;

	public Poster(String posterDescription) {
		this.posterDescription = posterDescription;
	}

	Poster() {
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getPosterDescription() {
		return posterDescription;
	}

	public void setPosterDescription(String posterDescription) {
		this.posterDescription = posterDescription;
	}

	@Override
	public String toString() {
		return "Poster{" +
				"id=" + id +
				", posterDescription='" + posterDescription + '\'' +
				'}';
	}
}

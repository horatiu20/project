package ro.fasttrackit.project.model.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
public class Description {
	@Id
	@GeneratedValue
	private Integer id;
	private String description;

	public Description(String description) {
		this.description = description;
	}

	Description() {
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	@Override
	public String toString() {
		return "Description{" +
				"id=" + id +
				", description='" + description + '\'' +
				'}';
	}
}

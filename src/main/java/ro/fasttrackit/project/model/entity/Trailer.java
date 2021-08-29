package ro.fasttrackit.project.model.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
public class Trailer {
	@Id
	@GeneratedValue
	private Integer id;
	private String url;

	public Trailer(String url) {
		this.url = url;
	}

	Trailer() {
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getUrl() {
		return url;
	}

	public void setUrl(String url) {
		this.url = url;
	}

	@Override
	public String toString() {
		return "Trailer{" +
				"id=" + id +
				", url='" + url + '\'' +
				'}';
	}
}

package ro.fasttrackit.project.model.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
public class Poster {
	@Id
	@GeneratedValue
	private Integer id;
	private String url;

	public Poster(String url) {
		this.url = url;
	}

	Poster() {
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
		return "Poster{" +
				"id=" + id +
				", url='" + url + '\'' +
				'}';
	}
}

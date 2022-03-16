package com.java.training.jpa.entity;

import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.Table;

@Entity
@Table(name = "actor")
public class Actor implements java.io.Serializable {

	@Id
	@Column(name = "id")
	private Integer id;

	@Column(name = "actor_name")
	private String actorName;

	public Actor() {
	}
	// joinColumns: Assign the column of third table related to entity itself.
	// inverseJoinColumns: Assign the column of third table related to associated
	// entity.

	@ManyToMany(cascade = CascadeType.ALL)
	@JoinTable(name = "actor_movie", joinColumns = { @JoinColumn(name = "actor_id") }, inverseJoinColumns = {
			@JoinColumn(name = "movie_id") })
	private List<Movie> movies;

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getActorName() {
		return actorName;
	}

	public void setActorName(String actorName) {
		this.actorName = actorName;
	}

	public List<Movie> getMovies() {
		return movies;
	}

	public void setMovies(List<Movie> movies) {
		this.movies = movies;
	}

}

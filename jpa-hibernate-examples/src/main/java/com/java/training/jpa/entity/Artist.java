package com.java.training.jpa.entity;

import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.Table;

@Entity
@Table(name = "artist")
public class Artist {

	@Id
	@Column(name = "id")
	private Integer id;

	@Column(name = "artist_name")
	private String artistName;

	public Artist() {
	}
	// joinColumns: Assign the column of third table related to entity itself.
	// inverseJoinColumns: Assign the column of third table related to associated
	// entity.

	@ManyToMany(cascade = CascadeType.ALL)
	@JoinTable(name = "artist_cinema", joinColumns = { @JoinColumn(name = "artist_id") }, inverseJoinColumns = {
			@JoinColumn(name = "cinema_id") })
	private List<Cinema> cinemas;

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getArtistName() {
		return artistName;
	}

	public void setArtistName(String artistName) {
		this.artistName = artistName;
	}

	public List<Cinema> getCinemas() {
		return cinemas;
	}

	public void setCinemas(List<Cinema> cinemas) {
		this.cinemas = cinemas;
	}

}

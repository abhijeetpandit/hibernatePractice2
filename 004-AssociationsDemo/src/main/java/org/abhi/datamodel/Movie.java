package org.abhi.datamodel;

import java.util.Set;

public class Movie {
	private Integer id;
	private String movieName;
	private Set<Actor> actors;
	public Movie() {
		super();
	}
	public Movie(Integer id, String movieName, Set<Actor> actors) {
		super();
		this.id = id;
		this.movieName = movieName;
		this.actors = actors;
	}
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public String getMovieName() {
		return movieName;
	}
	public void setMovieName(String movieName) {
		this.movieName = movieName;
	}
	public Set<Actor> getActors() {
		return actors;
	}
	public void setActors(Set<Actor> actors) {
		this.actors = actors;
	}
	@Override
	public String toString() {
		return "Movie [id=" + id + ", movieName=" + movieName + ", actors=" + actors + "]";
	}
	
}

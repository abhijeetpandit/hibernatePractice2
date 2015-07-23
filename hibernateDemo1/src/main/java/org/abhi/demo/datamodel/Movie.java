package org.abhi.demo.datamodel;

public class Movie {
	private Integer id;
	private String title;
	private String director;
	private String synopsys;
	
	
	public Movie() {
		super();
	}
	public Movie(Integer id, String title, String director, String synopsys) {
		super();
		this.id = id;
		this.title = title;
		this.director = director;
		this.synopsys = synopsys;
	}
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public String getDirector() {
		return director;
	}
	public void setDirector(String director) {
		this.director = director;
	}
	public String getSynopsys() {
		return synopsys;
	}
	public void setSynopsys(String synopsys) {
		this.synopsys = synopsys;
	}
	@Override
	public String toString() {
		return "Movie [id=" + id + ", title=" + title + ", director=" + director + ","
				+ " synopsys=" + synopsys + "]";
	}
}

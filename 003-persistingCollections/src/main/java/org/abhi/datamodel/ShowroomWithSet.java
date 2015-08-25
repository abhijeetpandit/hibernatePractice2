package org.abhi.datamodel;

import java.util.Set;

public class ShowroomWithSet {
	private int id;
	private String manager;
	private Set<Car> cars = null;
	public ShowroomWithSet() {
		super();
	}
	public ShowroomWithSet(int id, String manager, Set<Car> cars) {
		super();
		this.id = id;
		this.manager = manager;
		this.cars = cars;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getManager() {
		return manager;
	}
	public void setManager(String manager) {
		this.manager = manager;
	}
	public Set<Car> getCars() {
		return cars;
	}
	public void setCars(Set<Car> cars) {
		this.cars = cars;
	}
	@Override
	public String toString() {
		return "Showroom [id=" + id + ", manager=" + manager + ", cars=" + cars + "]";
	}
}

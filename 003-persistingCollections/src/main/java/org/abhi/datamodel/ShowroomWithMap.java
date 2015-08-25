package org.abhi.datamodel;

import java.util.Map;

public class ShowroomWithMap {
	private int id;
	private String manager;
	private Map<String, Car> cars = null;
	public ShowroomWithMap() {
		super();
	}
	public ShowroomWithMap(int id, String manager, Map<String, Car> cars) {
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
	public Map<String, Car> getCars() {
		return cars;
	}
	public void setCars(Map<String, Car> cars) {
		this.cars = cars;
	}
	@Override
	public String toString() {
		return "Showroom [id=" + id + ", manager=" + manager + ", cars=" + cars + "]";
	}
}

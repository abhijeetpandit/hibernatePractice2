package org.abhi.datamodel;

import java.util.List;

public class Showroom {
	private int id;
	private String manager;
	private List<Car> cars = null;
	public Showroom() {
		super();
	}
	public Showroom(int id, String manager, List<Car> cars) {
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
	public List<Car> getCars() {
		return cars;
	}
	public void setCars(List<Car> cars) {
		this.cars = cars;
	}
	@Override
	public String toString() {
		return "Showroom [id=" + id + ", manager=" + manager + ", cars=" + cars + "]";
	}
}

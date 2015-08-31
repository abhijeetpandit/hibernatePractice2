package org.abhi.datamodel;

public class Engine {
	private String id;
	private String make;
	private String model;
	private String size;
	private Car car;
	public Engine() {
		super();
	}
	public Engine(String id, String make, String model, String size, Car car) {
		super();
		this.id = id;
		this.make = make;
		this.model = model;
		this.size = size;
		this.car = car;
	}
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getMake() {
		return make;
	}
	public void setMake(String make) {
		this.make = make;
	}
	public String getModel() {
		return model;
	}
	public void setModel(String model) {
		this.model = model;
	}
	public String getSize() {
		return size;
	}
	public void setSize(String size) {
		this.size = size;
	}
	public Car getCar() {
		return car;
	}
	public void setCar(Car car) {
		this.car = car;
	}
	@Override
	public String toString() {
		return "Engine [id=" + id + ", make=" + make + ", model=" + model + ", size=" + size + ", car=" + car + "]";
	}
	
	
}

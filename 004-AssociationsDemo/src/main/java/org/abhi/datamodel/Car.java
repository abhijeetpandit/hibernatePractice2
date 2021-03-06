package org.abhi.datamodel;

public class Car {
	private Integer id;
	private String name;
	private String color;
	private Engine engine;
	
	public Car() {
		super();
	}
	
	public Car(Integer id, String name, String color, Engine engine) {
		super();
		this.id = id;
		this.name = name;
		this.color = color;
		this.engine = engine;
	}
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getColor() {
		return color;
	}
	public void setColor(String color) {
		this.color = color;
	}
	public Engine getEngine() {
		return engine;
	}
	public void setEngine(Engine engine) {
		this.engine = engine;
	}

	@Override
	public String toString() {
		return "Car [id=" + id + ", name=" + name + ", color=" + color + ", engine=" + engine + "]";
	}
	
	
}

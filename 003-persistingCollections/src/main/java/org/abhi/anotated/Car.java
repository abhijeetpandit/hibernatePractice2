package org.abhi.anotated;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="CAR_ANN")
public class Car {
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name="CAR_ID")
	private int id;
	private String name;
	private String color;
	public Car() {
		super();
	}
	public Car(int id, String name, String color) {
		super();
		this.id = id;
		this.name = name;
		this.color = color;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
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
	@Override
	public boolean equals(Object car) {
		return name.equals(((Car)car).getName());
	}
	@Override
	public int hashCode() {
		return name.hashCode();
	}
	@Override
	public String toString() {
		return "Car [id=" + id + ", name=" + name + ", color=" + color + "]";
	}
	
	
}

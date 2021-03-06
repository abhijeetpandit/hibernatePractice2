package org.abhi.anotated;

import java.util.Set;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import org.hibernate.annotations.Cascade;
import org.hibernate.annotations.CascadeType;

@Entity
@Table(name="SHOWROOM_ANN")
public class Showroom {
	@Id
	@Column(name="SHOWROOM_ID")
	@GeneratedValue(strategy=GenerationType.AUTO)
	private int id;
	private String manager;
	
	@OneToMany
	@JoinTable(name="SHOWROOM_CAR_SET_ANN_JOINTABLE", joinColumns= @JoinColumn(name="SHOWROOM_ID"))
	@Cascade(CascadeType.ALL)
	private Set<Car> cars = null;
	public Showroom() {
		super();
	}
	public Showroom(int id, String manager, Set<Car> cars) {
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

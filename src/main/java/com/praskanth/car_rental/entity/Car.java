package com.praskanth.car_rental.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
@Table(name="car")
public class Car {
	
	@Id
	private int id;
	@Column(name="model", nullable = true)
	private String model;
	@Column(name="available", nullable = true)
	private boolean available;
	@Column(name="name", nullable = true)
	private String name;
	
	public Car() {
		// TODO Auto-generated constructor stub
	}

	public Car(int id, String model, boolean available,String name) {
		super();
		this.id = id;
		this.model = model;
		this.available = available;
		this.name = name;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getModel() {
		return model;
	}

	public void setModel(String model) {
		this.model = model;
	}

	public boolean isAvailable() {
		return available;
	}

	public void setAvailable(boolean available) {
		this.available = available;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
	
	

}

package com.praskanth.car_rental.dto;


import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class Customer {
	
	private int id;
	private String name;
	private int carId;
	private String model;
	private boolean isAvailable;
	
	public Customer() {
		// TODO Auto-generated constructor stub
	}

	public Customer(int id, String name, int carId, String model,boolean isAvailable) {
		super();
		this.id = id;
		this.name = name;
		this.carId = carId;
		this.model = model;
		this.isAvailable = isAvailable;
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

	public int getCarId() {
		return carId;
	}

	public void setCarId(int carId) {
		this.carId = carId;
	}

	public String getModel() {
		return model;
	}

	public void setModel(String model) {
		this.model = model;
	}
	
	public boolean isAvailable() {
		return isAvailable;
	}

	public void setAvailable(boolean isAvailable) {
		this.isAvailable = isAvailable;
	}

	@Override
	public String toString() {
		return "Customer [id=" + id + ", name=" + name + ", carId=" + carId + ", model=" + model + "]";
	}

	
	
	

}

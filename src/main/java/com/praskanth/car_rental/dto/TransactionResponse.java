package com.praskanth.car_rental.dto;

import com.praskanth.car_rental.entity.Car;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class TransactionResponse {
	private Car car;
	private int carId;
	private String model;
	private String name;
	private boolean isAvailable;
	private String response;
	
	public TransactionResponse() {
		// TODO Auto-generated constructor stub
	}

	public TransactionResponse(Car car,String model,String name, String response) {
		super();
		this.car = car;
		this.name = name;
		this.response = response;
		this.model = model;
	}

	public Car getCar() {
		return car;
	}

	public void setCar(Car car) {
		this.car = car;
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

	public String getResponse() {
		return response;
	}

	public void setResponse(String response) {
		this.response = response;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
	
	
	
	

}

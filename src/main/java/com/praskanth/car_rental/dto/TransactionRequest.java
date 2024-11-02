package com.praskanth.car_rental.dto;

import com.praskanth.car_rental.entity.Car;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class TransactionRequest {
	
	private Car car;
	private Customer customer;
	
	public TransactionRequest() {
		// TODO Auto-generated constructor stub
	}
	
	public TransactionRequest(Car car, Customer customer) {
		super();
		this.car = car;
		this.customer = customer;
	}



	public Car getCar() {
		return car;
	}
	public void setCar(Car car) {
		this.car = car;
	}
	public Customer getCustomer() {
		return customer;
	}
	public void setCustomer(Customer customer) {
		this.customer = customer;
	}

	@Override
	public String toString() {
		return "TransactionRequest [car=" + car + ", customer=" + customer + "]";
	}
	
	
	
	

}

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
	private String address;
	

}

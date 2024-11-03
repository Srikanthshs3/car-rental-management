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

    public TransactionResponse(Car car, String model, String name, String response) {
    }
}

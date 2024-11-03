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
	

}

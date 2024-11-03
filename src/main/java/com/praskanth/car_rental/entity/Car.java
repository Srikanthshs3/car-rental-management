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
	
	

}

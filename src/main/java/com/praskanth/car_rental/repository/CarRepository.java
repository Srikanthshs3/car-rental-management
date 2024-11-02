package com.praskanth.car_rental.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.praskanth.car_rental.entity.Car;

public interface CarRepository extends JpaRepository<Car, Integer> {
	
	//public Car saveCar(Car car);

}

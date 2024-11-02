package com.praskanth.car_rental.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.praskanth.car_rental.dto.TransactionRequest;
import com.praskanth.car_rental.dto.TransactionResponse;
import com.praskanth.car_rental.entity.Car;
import com.praskanth.car_rental.service.CarService;

@RestController
@RequestMapping("/car")
public class CarController {
	
	@Autowired
	private CarService carService;
	
	public CarController(CarService carService) {
		this.carService = carService;
	}
	
	
	  @PostMapping("/newCar") public Car createCar(@RequestBody Car car) { return
	  carService.saveCar(car); }
	 
	
	 // @GetMapping("/rentCar/car/{carId}/customer/{customerId}")
	  @PostMapping("rentCar")
	public Car rentCar(@PathVariable int carId, @PathVariable int customerId) {
		return carService.rentCar(carId,customerId);
	}
	
	@GetMapping("/showCars")
	public List<Car> showAllCar(Car car) {
		return carService.findAllCar(car);
	}
	
	@GetMapping("/showCar/{id}")
	public Optional<Car> findCarById(@PathVariable int id){
		return carService.findCarById(id);
	}
	
	 @PostMapping("rentTheCar")
		public TransactionResponse rentTheCar(@RequestBody TransactionRequest request) {
			return carService.rentTheCar(request);
		}

}

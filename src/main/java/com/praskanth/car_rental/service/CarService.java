package com.praskanth.car_rental.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.client.RestTemplate;

import com.praskanth.car_rental.dto.Customer;
import com.praskanth.car_rental.dto.TransactionRequest;
import com.praskanth.car_rental.dto.TransactionResponse;
import com.praskanth.car_rental.entity.Car;
import com.praskanth.car_rental.repository.CarRepository;

@Service
public class CarService {

	@Autowired
	private CarRepository carRepository;

	@Autowired
	private RestTemplate restTemplate;

	public CarService(CarRepository carRepository) {
		this.carRepository = carRepository;
	}

	public Car saveCar(Car car) {
		car.setAvailable(true);
		return carRepository.save(car);
	}
	
	public Optional<Car> findCarById(int id) {
		return carRepository.findById(id);
	}
	
	public List<Car> findAllCar(Car car) {
		return carRepository.findAll();
	}
	
	

	public Car rentCar(int carId, int customerId) {
		Car car = new Car();
		Customer customer = new Customer();
		
		Customer customerResponse = restTemplate.getForObject("http://localhost:8082/customer/showCustomer/"+customerId, Customer.class);
		if(customerResponse != null && customerResponse.isAvailable()) {
			Car carResponse = carRepository.findById(carId).orElseThrow();
			if(carResponse.isAvailable()) {
				customer.setCarId(carResponse.getId());
				customer.setModel(carResponse.getModel());
				
			}
			//customerResponse.setAvailable(false);
			//carResponse.setAvailable(false);
			
		}
		return carRepository.save(car);
	}
	
	public TransactionResponse rentTheCar(TransactionRequest request) {
		String response = "";
		Car car = request.getCar();
		Customer customer = request.getCustomer();
			
			customer.setCarId(car.getId());
			System.out.println("customer.getCarId(): "+customer.getCarId());
			System.out.println("customer.getId()" +customer.getId());
			System.out.println("car.getId(): "+car.getId());
			customer.setModel(car.getModel());
			customer.setName(car.getName());
			System.out.println("car.getModel(): "+car.getModel());
			System.out.println("car.getName(): "+car.getName());
			customer.setAvailable(true);
			car.setAvailable(true);
		
		
		
		Customer customerResponse = restTemplate.postForObject("http://CUSTOMER-SERVICE/customer/createCustomer", customer, Customer.class);
		System.out.println("Rest Template: "+customerResponse);
		response = customerResponse.isAvailable() == true?"Car created succesfull with customer":"Failed to create Car and Customer";
		System.out.println("customerResponse.getCarId(): "+customerResponse.getCarId());
		System.out.println("customerResponse.getId(): "+customerResponse.getId());
		carRepository.save(car);
		return new TransactionResponse(car, customerResponse.getModel(), customerResponse.getName(), response);
	}

}





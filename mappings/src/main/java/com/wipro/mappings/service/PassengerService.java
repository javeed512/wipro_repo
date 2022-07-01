package com.wipro.mappings.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.wipro.mappings.entities.Passenger;
import com.wipro.mappings.repository.PassengerRepository;

@Service
public class PassengerService {
	
	
	@Autowired
	PassengerRepository passengerRepo;
	
	
	public Passenger  addPassenger(Passenger passenger) {
		
		return passengerRepo.save(passenger);
	}

}

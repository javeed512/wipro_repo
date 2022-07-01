package com.wipro.mappings.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.wipro.mappings.entities.Flight;
import com.wipro.mappings.repository.FlightRepository;

@Service
public class FlightService {

	@Autowired
	FlightRepository flightRepo;
	
	
	public Flight   addFlight(Flight flight) {
		
		return flightRepo.save(flight);
		
	}
	
	

	
	
	
}

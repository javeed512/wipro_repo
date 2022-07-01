package com.wipro.mappings.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.wipro.mappings.entities.Flight;

@Repository
public interface FlightRepository extends JpaRepository<Flight,Integer> {

}

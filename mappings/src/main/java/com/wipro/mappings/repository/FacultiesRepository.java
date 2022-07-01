package com.wipro.mappings.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.wipro.mappings.entities.Faculties;

@Repository
public interface FacultiesRepository  extends JpaRepository<Faculties, Integer>{

}

package com.wipro.mappings.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.wipro.mappings.entities.Courses;

@Repository
public interface CoursesRepository extends JpaRepository<Courses,Integer> {

}

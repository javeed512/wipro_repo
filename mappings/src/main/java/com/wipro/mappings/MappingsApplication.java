package com.wipro.mappings;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.web.client.RestTemplate;

import com.wipro.mappings.entities.Courses;
import com.wipro.mappings.entities.Faculties;
import com.wipro.mappings.entities.Flight;
import com.wipro.mappings.entities.Passenger;
import com.wipro.mappings.service.CoursesService;
import com.wipro.mappings.service.FacultiesService;
import com.wipro.mappings.service.FlightService;
import com.wipro.mappings.service.PassengerService;

@SpringBootApplication
public class MappingsApplication {

		
	
	public static void main(String[] args) {
		SpringApplication.run(MappingsApplication.class, args);
	}
	
	@Bean
	public  RestTemplate getRestTemplate() {
		
		
		return new RestTemplate();
	}
	
	
	@Bean
	public  CommandLineRunner   getOneToMany(FlightService flightService,PassengerService passengerService) {
		
		return args -> {
			
			
			Flight flight1 = new Flight();
			
			flight1.setFlightName("A30027");
			flight1.setCompanyName("Air India");
			
			flightService.addFlight(flight1);
			
			
			Passenger p1 = new Passenger();
			p1.setPassengerName("Javeed"); 
			p1.setSource("Hyderabad");
			p1.setDestination("Delhi");
			p1.setFlight(flight1);
			
			//p1.setFlight(flight1);
			
			
			
			Passenger p2 = new Passenger();
			p2.setPassengerName("Kunal"); 
			p2.setSource("Delhi");
			p2.setDestination("Chennai");
			p2.setFlight(flight1);
			
			Passenger p3 = new Passenger();
			p3.setPassengerName("Charan"); 
			p3.setSource("Noida");
			p3.setDestination("Mumbai");
			p3.setFlight(flight1);
			
			passengerService.addPassenger(p1);
			passengerService.addPassenger(p2);
			passengerService.addPassenger(p3);
			
			
			
			/*
			 * Set<Passenger> set = new HashSet<Passenger>(); set.add(p1); set.add(p2);
			 * set.add(p3);
			 * 
			 * flight1.setPassengers(set);
			 * 
			 * flightService.addFlight(flight1);
			 */
			 
			
			
		};
				
		
		
	}
	
	@Bean
	public  CommandLineRunner getManyToMany(FacultiesService facultyService,CoursesService courseService) {
		
		
		return args ->{
			
			
			Faculties  faculty1 = new Faculties();
			faculty1.setFname("King");
			faculty1.setAge(30);
			
			
			Courses  course1 = new Courses();
			
				course1.setCname("Java FS");
				course1.setFee(50000.00);
			
			Courses  course2 = new Courses();
				
				course2.setCname("Angular");
				course2.setFee(20000.00);	
			
				
				
				Set<Courses>  setOfCourses = new HashSet<Courses>();
				setOfCourses.add(course1);  setOfCourses.add(course2);
					
					faculty1.setCourses(setOfCourses);
				
					facultyService.addFaculties(faculty1);
					
			
					
					
					
					Faculties  faculty2 = new Faculties();
					faculty2.setFname("Javeed");
					faculty2.setAge(31);
					
					
					Courses  course3 = new Courses();
					
						course3.setCname("Python2");
						course3.setFee(44000.00);
					
											
						Courses  course4 = new Courses();
						
						course4.setCname("ReactJS");
						course4.setFee(30000.00);	
						
						Set<Courses>  setOfCourses2 = new HashSet<Courses>();
						setOfCourses2.add(course3);  setOfCourses2.add(course4);
						
						faculty2.setCourses(setOfCourses2);
						
					
					facultyService.addFaculties(faculty2);
					
					
					
					
					
					
			
		};
		
		
		
		
	}
	
	
	
	
	
	
	
	
	
	

}

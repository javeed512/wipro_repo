package com.wipro.mappings.entities;

import java.util.HashSet;
import java.util.Set;

import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.ManyToMany;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@AllArgsConstructor
@NoArgsConstructor
@Data
@Entity
public class Courses {
	
	@Id
	@GeneratedValue
	private int cid;
	private String cname;
	private double fee;
	
	
	@ManyToMany(mappedBy = "courses", fetch = FetchType.LAZY)
	private  Set<Faculties>  faculties = new HashSet<Faculties>();
	
	

}

package com.wipro.mappings.entities;

import java.util.HashSet;
import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@AllArgsConstructor
@NoArgsConstructor
@Data
@Entity
public class Faculties {
	
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int fid;
	private String fname;
	private int age;
	
	
	@ManyToMany(fetch = FetchType.LAZY, cascade = CascadeType.PERSIST)
    @JoinTable(name = "faculty_courses",
            joinColumns = {
                    @JoinColumn(name = "faculty_id", referencedColumnName = "fid",
                            nullable = false, updatable = false)},
            inverseJoinColumns = {
                    @JoinColumn(name = "course_id", referencedColumnName = "cid",
                            nullable = false, updatable = false)})
	
	private Set<Courses> courses = new HashSet<>();

}

package com.wipro.mappings.entities;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToOne;
import javax.persistence.Table;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@NoArgsConstructor
@AllArgsConstructor
@Data
@Entity
@Table(name="User_Table")
public class User {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int id;           //primary key
	private String email;
	private String name;
	private String password;
	

	
//	@OneToOne(mappedBy = "user" )
//	private UserProfile userProfile;
	
}

package com.wipro.mappings.entities;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.Table;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@NoArgsConstructor
@AllArgsConstructor
@Data
@Table(name="UserProfile_Table")
@Entity
public class UserProfile {

		@Id
		@GeneratedValue(strategy = GenerationType.AUTO)
		private int id;
		private int age;
		private String city;
		private String state;
	
		
		@OneToOne
		@JoinColumn(name="user_id",nullable=false) //foreign key
		private User user;
	
		
	

}

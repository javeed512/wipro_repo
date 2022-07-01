package com.wipro.mappings.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.wipro.mappings.entities.UserProfile;

@Repository
public interface UserProfileRepository extends JpaRepository<UserProfile,Integer> {

}

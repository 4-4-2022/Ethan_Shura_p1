package com.revature.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.revature.entity.Dog;

@Repository
public interface DoggyData extends JpaRepository<Dog, Long>{
	
}

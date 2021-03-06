package com.revature.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.revature.models.Dog;

@Repository
public interface CheckInRepository extends JpaRepository<Dog, Long>{

}

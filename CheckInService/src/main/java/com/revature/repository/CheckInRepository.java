package com.revature.repository;

import org.springframework.stereotype.Repository;

import com.revature.models.Dog;

import org.springframework.data.jpa.repository.JpaRepository;

@Repository
public interface CheckInRepository extends JpaRepository <Dog, Long> {

}

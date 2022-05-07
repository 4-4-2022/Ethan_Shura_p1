package com.revature.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.revature.entities.Reservation;

public interface ReservationRepository extends JpaRepository<Reservation, Long>{

}

package com.revature.service;

import java.util.List;

import org.springframework.stereotype.Repository;
import org.springframework.stereotype.Service;

import com.revature.entities.Reservation;

@Service
public interface ReservationService {

	public Reservation save(Reservation reserve);
	
}

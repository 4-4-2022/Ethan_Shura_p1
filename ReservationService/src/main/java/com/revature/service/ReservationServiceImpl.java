package com.revature.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.revature.entities.Reservation;
import com.revature.models.ReservationView;
import com.revature.repository.ReservationRepository;

@Service
public class ReservationServiceImpl implements ReservationService{
	 
	@Autowired
	private ReservationRepository resRepo;
	

	@Override
	public Reservation save(Reservation reserve) {
		return resRepo.save(reserve);
	}

}

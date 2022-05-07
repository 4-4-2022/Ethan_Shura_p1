package com.revature.controllers;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.revature.entities.Reservation;
import com.revature.repository.ReservationRepository;
import com.revature.service.ReservationServiceImpl;

@RestController
@RequestMapping("/reservation")
public class ReservationController {
	
	@Autowired
	ReservationRepository resRepo;
	
	@Autowired
	private ReservationServiceImpl reservationService;

	@GetMapping("/view")
	public ResponseEntity<List<Reservation>> viewAllReservations(@RequestParam(required = false) Long id) {
		try {
			List<Reservation> reserves = new ArrayList<Reservation>();
			resRepo.findAll().forEach(reserves::add);
			return new ResponseEntity<>(reserves, HttpStatus.OK);
		} catch (Exception e) {
			return new ResponseEntity<>(null, HttpStatus.INTERNAL_SERVER_ERROR);
		}
	}
	
	@GetMapping("/view/{id}")
	public ResponseEntity<Reservation> viewReservationByID(@PathVariable("id") long id) {
		Optional<Reservation> resDataByID = resRepo.findById(id);
			if (resDataByID.isPresent()) {
				return new ResponseEntity<>(resDataByID.get(),HttpStatus.OK);
			} else {
				return new ResponseEntity<>(HttpStatus.NOT_FOUND);
			}
	}
	
	@PostMapping("/save")
	public Reservation saveReservation(@RequestBody Reservation reserve) {
		return reservationService.save(reserve);
	}
}

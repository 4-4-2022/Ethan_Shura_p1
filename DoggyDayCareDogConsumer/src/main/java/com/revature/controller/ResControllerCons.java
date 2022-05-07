package com.revature.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.client.RestTemplate;

import com.revature.models.Reservation;

public class ResControllerCons {

	@Autowired
	private RestTemplate restTemplate;
	
	@GetMapping("/view")
	public List<Reservation> viewAllReservations() {
		ResponseEntity<Reservation> reserve = restTemplate.getForEntity("http://localhost:8082/reservation/", Reservation.class);
		return (List<Reservation>) reserve.getBody();
	}
	
	@GetMapping("/view/{id}")
	public List<Reservation> viewReservationById(@RequestParam long id) {
		ResponseEntity<Reservation> res = restTemplate.getForEntity("http://localhost:8082/reservation/" + id, Reservation.class);
		return (List<Reservation>) res.getBody();
	}
	
	@PostMapping("/save")
	public String saveReservation(@RequestBody Reservation res) {
		ResponseEntity<String> response = restTemplate.postForEntity("https://localhost:8082/reservation/", res, String.class);
		return response.getBody();
	}
	
}

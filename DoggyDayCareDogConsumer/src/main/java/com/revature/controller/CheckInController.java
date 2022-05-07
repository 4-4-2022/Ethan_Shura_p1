package com.revature.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.revature.models.CheckIn;
import com.revature.models.Dog;
import com.revature.service.CheckInService;

@RestController
@RequestMapping("/checkin")
public class CheckInController {

	@Autowired
	private CheckInService checkInService;
	
	@GetMapping("/dogsincare")
	public List<CheckIn> dogsInCare(){
		return this.checkInService.dogsInCare();
	}
	
	@PostMapping("/checkin")
	public CheckIn checkIn(@RequestBody CheckIn dog) {
		return checkInService.checkIn(dog);
	}
	
	@DeleteMapping("/checkout")
	public void checkOut(@RequestParam long id) {
		checkInService.checkOut(id);
	}
}

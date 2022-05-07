package com.revature.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.revature.entity.Dog;
import com.revature.service.DoggyService;

@RestController
@RequestMapping("/doggy")
public class DogDayCareController {

	@Autowired
	private DoggyService dogService;
	
	@GetMapping("/view")
	public List<Dog> getDogs() {
		return dogService.getDogs();
	}
	
	@PostMapping("/add")
	public void addDog(@RequestBody Dog doggy) {
		this.dogService.addDog(doggy);
	}
	
	@DeleteMapping("/remove/{id}")
	public void removeDog(@PathVariable("id") long id) {
		this.dogService.removeDog(id);
	}
}

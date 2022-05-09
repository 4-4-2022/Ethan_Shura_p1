package com.revature.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import com.revature.models.Dog;

@RestController
public class DogController {

	@Autowired
	private RestTemplate restTemplate;
	
	@GetMapping("/doggy/view")
	public Dog getDogs() {
		ResponseEntity<Dog> dogs = restTemplate.getForEntity("http://localhost:8080/doggy/view", Dog.class);
		return dogs.getBody();
	}
	
	@PostMapping("/doggy/add")
	public String addDog(@RequestBody Dog doggy) {
		ResponseEntity<String> response = restTemplate.postForEntity("http://localhost:8080/doggy/add", doggy, String.class);
		return response.getBody();
	}
	
	@DeleteMapping("/doggy/remove/{id}") 
	public void removeDog(@RequestParam long id) {
		restTemplate.delete("http://localhost:8080/doggy/remove/" + id, Dog.class);
	}
	
}

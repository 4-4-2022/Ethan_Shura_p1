package com.revature.service;

import java.util.List;

import javax.jws.WebMethod;
import javax.jws.WebService;

import org.springframework.beans.factory.annotation.Autowired;

import com.revature.models.Dog;
import com.revature.repository.CheckInRepository;

@WebService(endpointInterface = "com.revature.service.CheckInService")
public class CheckInServiceImpl implements CheckInService{
	
	@Autowired
	private CheckInRepository checkInRepo;
	
	@WebMethod
	public List<Dog> dogsInCare() {
		return checkInRepo.findAll();
	}
	
	@WebMethod
	public Dog checkIn(Dog dog) {
		return checkInRepo.save(dog);
	}
	
	@WebMethod
	public void checkOut(long id) {
		checkInRepo.deleteById(id);
	}
}

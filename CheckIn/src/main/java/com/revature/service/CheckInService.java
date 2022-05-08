package com.revature.service;

import java.util.List;

import javax.jws.WebService;

import com.revature.models.Dog;

@WebService
public interface CheckInService {
	public List<Dog> dogsInCare();
	public Dog checkIn (Dog dog);
	public void checkOut (long id);
}

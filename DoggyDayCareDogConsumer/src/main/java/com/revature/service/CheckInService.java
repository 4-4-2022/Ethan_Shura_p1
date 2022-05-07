package com.revature.service;

import java.util.List;

import javax.jws.WebMethod;
import javax.jws.WebService;

import org.springframework.stereotype.Component;

import com.revature.models.CheckIn;
import com.revature.models.Dog;

@WebService(serviceName = "checkInService", targetNamespace = "http://service.revature.com/")
@Component
public interface CheckInService {

	@WebMethod
	public List<CheckIn> dogsInCare();
	
	@WebMethod
	public CheckIn checkIn (CheckIn dog);
	
	@WebMethod
	public void checkOut (long id);
	
}

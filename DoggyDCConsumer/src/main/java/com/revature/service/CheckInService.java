package com.revature.service;

import java.util.List;

import javax.jws.WebMethod;
import javax.jws.WebService;

import org.springframework.stereotype.Component;
import com.revature.models.CheckIns;

@WebService (serviceName = "checkinservice", targetNamespace = "http://service.revature.com/")
@Component
public interface CheckInService {

	@WebMethod
	public List<CheckIns> dogsInCare();
	
	@WebMethod
	public CheckIns checkIn (CheckIns dog);
	
	@WebMethod
	public void checkOut (long id);
	
}

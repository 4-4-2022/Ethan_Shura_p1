package com.revature.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.revature.entity.Dog;
import com.revature.repository.DoggyData;

@Service
public interface DoggyService {
	public List<Dog> getDogs();
	public <S extends Dog> S addDog(Dog doggy);
	public void removeDog(long id);
}

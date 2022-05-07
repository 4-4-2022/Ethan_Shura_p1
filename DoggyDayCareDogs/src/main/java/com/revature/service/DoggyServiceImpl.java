package com.revature.service;

import java.util.List;
import java.util.Optional;
import java.util.function.Function;

import javax.persistence.Query;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Example;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;
import org.springframework.data.repository.query.FluentQuery.FetchableFluentQuery;
import org.springframework.stereotype.Service;

import com.revature.entity.Dog;
import com.revature.repository.DoggyData;

@Service
public class DoggyServiceImpl implements DoggyService{
	
	@Autowired
	private DoggyData dogData;

	@Override
	public List<Dog> getDogs() {
		return dogData.findAll();
	}

	@Override
	public void removeDog(long id) {
		dogData.deleteById(id);
	}

	@Override
	public Dog addDog(Dog doggy) {
		return dogData.save(doggy);
	}
	
	
}

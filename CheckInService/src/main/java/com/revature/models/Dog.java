package com.revature.models;

import java.util.Objects;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "dogsInCare", schema = "p1")
public class Dog {

	@Id
	private long id;
	private String dogName;
	private boolean isIn;
	
	public Dog() {
		super();
	}

	public Dog(long id, String dogName, boolean isIn) {
		super();
		this.id = id;
		this.dogName = dogName;
		this.isIn = isIn;
	}

	@Override
	public String toString() {
		return "Dog [id=" + id + ", dogName=" + dogName + ", isIn=" + isIn + "]";
	}

	@Override
	public int hashCode() {
		return Objects.hash(dogName, id, isIn);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Dog other = (Dog) obj;
		return Objects.equals(dogName, other.dogName) && id == other.id && isIn == other.isIn;
	}

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public String getDogName() {
		return dogName;
	}

	public void setDogName(String dogName) {
		this.dogName = dogName;
	}

	public boolean isIn() {
		return isIn;
	}

	public void setIn(boolean isIn) {
		this.isIn = isIn;
	}
	
	
}

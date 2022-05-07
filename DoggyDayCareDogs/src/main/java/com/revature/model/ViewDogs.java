package com.revature.model;

import java.util.Objects;

public class ViewDogs {

	private String name;
	private String owner;
	private int age;
	private String breed;
	private boolean vetRecords;
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getOwner() {
		return owner;
	}
	public void setOwner(String owner) {
		this.owner = owner;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public String getBreed() {
		return breed;
	}
	public void setBreed(String breed) {
		this.breed = breed;
	}
	public boolean isVetRecords() {
		return vetRecords;
	}
	public void setVetRecords(boolean vetRecords) {
		this.vetRecords = vetRecords;
	}
	@Override
	public int hashCode() {
		return Objects.hash(age, breed, name, owner, vetRecords);
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		ViewDogs other = (ViewDogs) obj;
		return age == other.age && Objects.equals(breed, other.breed) && Objects.equals(name, other.name)
				&& Objects.equals(owner, other.owner) && vetRecords == other.vetRecords;
	}
	public ViewDogs(String name, String owner, int age, String breed, boolean vetRecords) {
		super();
		this.name = name;
		this.owner = owner;
		this.age = age;
		this.breed = breed;
		this.vetRecords = vetRecords;
	}
	public ViewDogs() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	
}

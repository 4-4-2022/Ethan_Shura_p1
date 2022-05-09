package com.revature.models;

import java.util.Objects;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@JsonIgnoreProperties(ignoreUnknown = true)
public class Dog {

	private long id;
	private String name;
	private String owner;
	private int age;
	private String breed;
	private boolean vetRecords;
	
	public long getId() {
		return id;
	}
	public void setId(long id) {
		this.id = id;
	}
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
		return Objects.hash(age, breed, id, name, owner, vetRecords);
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
		return age == other.age && Objects.equals(breed, other.breed) && id == other.id
				&& Objects.equals(name, other.name) && Objects.equals(owner, other.owner)
				&& vetRecords == other.vetRecords;
	}
	public Dog() {
		super();
	}
	@Override
	public String toString() {
		return "Dog [id=" + id + ", name=" + name + ", owner=" + owner + ", age=" + age + ", breed=" + breed
				+ ", vetRecords=" + vetRecords + "]";
	}
	public Dog(long id, String name, String owner, int age, String breed, boolean vetRecords) {
		super();
		this.id = id;
		this.name = name;
		this.owner = owner;
		this.age = age;
		this.breed = breed;
		this.vetRecords = vetRecords;
	}
	
}

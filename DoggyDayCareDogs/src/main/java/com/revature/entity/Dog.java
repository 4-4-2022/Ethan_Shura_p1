package com.revature.entity;

import java.util.Objects;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="dogs", schema="p1")
public class Dog {
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name = "dogId")
	private Long id;

	@Column(name = "dogName")
	private String name;
	
	@Column(name = "dogOwner")
	private String owner;
	
	@Column(name = "dogAge")
	private int age;
	
	@Column(name = "dogBreed")
	private String breed;
	
	@Column(name = "dogVetRecords")
	private boolean vetRecords;

	public Dog(Long id, String name, String owner, int age, String breed, boolean vetRecords) {
		super();
		this.id = id;
		this.name = name;
		this.owner = owner;
		this.age = age;
		this.breed = breed;
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
		return age == other.age && Objects.equals(breed, other.breed) && Objects.equals(id, other.id)
				&& Objects.equals(name, other.name) && Objects.equals(owner, other.owner)
				&& vetRecords == other.vetRecords;
	}

	public Dog() {
		super();
		// TODO Auto-generated constructor stub
	}

	@Override
	public String toString() {
		return "Dog [id=" + id + ", name=" + name + ", owner=" + owner + ", age=" + age + ", breed=" + breed
				+ ", vetRecords=" + vetRecords + "]";
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
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
	
}

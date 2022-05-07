package com.revature.models;

import java.util.Objects;

public class ReservationView {

	private long id;
	private String dogName;
	private String dateStart;
	
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
	public String getDateStart() {
		return dateStart;
	}
	public void setDateStart(String dateStart) {
		this.dateStart = dateStart;
	}
	public ReservationView() {
		super();
		// TODO Auto-generated constructor stub
	}
	public ReservationView(long id, String dogName, String dateStart) {
		super();
		this.id = id;
		this.dogName = dogName;
		this.dateStart = dateStart;
	}
	@Override
	public int hashCode() {
		return Objects.hash(dateStart, dogName, id);
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		ReservationView other = (ReservationView) obj;
		return Objects.equals(dateStart, other.dateStart) && Objects.equals(dogName, other.dogName) && id == other.id;
	}
	@Override
	public String toString() {
		return "ReservationView [id=" + id + ", dogName=" + dogName + ", dateStart=" + dateStart + "]";
	}
	
	
}

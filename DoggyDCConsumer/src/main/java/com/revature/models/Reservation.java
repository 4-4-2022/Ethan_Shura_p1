package com.revature.models;

import java.util.Objects;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@JsonIgnoreProperties(ignoreUnknown=true)
public class Reservation {

	private long id;
	private String dogName;
	private String dateStart;
	private String dateEnd;
	private String ownerName;
	
	
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


	public String getDateEnd() {
		return dateEnd;
	}


	public void setDateEnd(String dateEnd) {
		this.dateEnd = dateEnd;
	}


	public String getOwnerName() {
		return ownerName;
	}


	public void setOwnerName(String ownerName) {
		this.ownerName = ownerName;
	}

	@Override
	public String toString() {
		return "Reservation [id=" + id + ", dogName=" + dogName + ", dateStart=" + dateStart + ", dateEnd=" + dateEnd
				+ ", ownerName=" + ownerName + "]";
	}


	@Override
	public int hashCode() {
		return Objects.hash(dateEnd, dateStart, dogName, id, ownerName);
	}


	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Reservation other = (Reservation) obj;
		return Objects.equals(dateEnd, other.dateEnd) && Objects.equals(dateStart, other.dateStart)
				&& Objects.equals(dogName, other.dogName) && id == other.id
				&& Objects.equals(ownerName, other.ownerName);
	}


	public Reservation() {
		super();
	}

	public Reservation(long id, String dogName, String dateStart, String dateEnd, String ownerName) {
		super();
		this.id = id;
		this.dogName = dogName;
		this.dateStart = dateStart;
		this.dateEnd = dateEnd;
		this.ownerName = ownerName;
	}
	
	
	
}

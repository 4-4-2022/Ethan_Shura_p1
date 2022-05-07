package com.revature.entities;

import java.util.Objects;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
@Entity
@Table(name = "reservations", schema = "p1")
public class Reservation {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private long id;
	@Column(name = "dogName")
	private String dogName;
	@Column(name = "ownerName")
	private String ownerName;
	@Column(name = "dateStart")
	private String dateStart;
	@Column(name = "dateEnd")
	private String dateEnd;
	
	public Reservation() {
		super();
	}

	public Reservation(long id, String dogName, String ownerName, String dateStart, String dateEnd) {
		super();
		this.id = id;
		this.dogName = dogName;
		this.ownerName = ownerName;
		this.dateStart = dateStart;
		this.dateEnd = dateEnd;
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

	public String getOwnerName() {
		return ownerName;
	}

	public void setOwnerName(String ownerName) {
		this.ownerName = ownerName;
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

	@Override
	public String toString() {
		return "Reservation [id=" + id + ", dogName=" + dogName + ", ownerName=" + ownerName + ", dateStart="
				+ dateStart + ", dateEnd=" + dateEnd + "]";
	}
	
}

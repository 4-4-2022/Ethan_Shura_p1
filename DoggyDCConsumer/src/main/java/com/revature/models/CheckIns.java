package com.revature.models;

import java.util.Objects;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@JsonIgnoreProperties(ignoreUnknown=true)
public class CheckIns {

	private long id;
	private String name;
	private boolean isIn;
	
	public CheckIns() {
		super();
	}

	public CheckIns(long id, String name, boolean isIn) {
		super();
		this.id = id;
		this.name = name;
		this.isIn = isIn;
	}

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

	public boolean isIn() {
		return isIn;
	}

	public void setIn(boolean isIn) {
		this.isIn = isIn;
	}

	@Override
	public String toString() {
		return "CheckIn [id=" + id + ", name=" + name + ", isIn=" + isIn + "]";
	}

	@Override
	public int hashCode() {
		return Objects.hash(id, isIn, name);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		CheckIns other = (CheckIns) obj;
		return id == other.id && isIn == other.isIn && Objects.equals(name, other.name);
	}
	
	
}

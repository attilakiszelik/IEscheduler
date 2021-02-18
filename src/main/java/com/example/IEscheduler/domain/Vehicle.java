package com.example.IEscheduler.domain;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;

@Entity(name="Vehicles")
public class Vehicle {
	
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Id
	private long id;
	private boolean deleted;
	private String regnum; //registration number
	private String man; //manufacturer
	private String type; //type
	private Integer yop; //year of production
	@ManyToOne
	private User owner;

	//constructors
	
	//->private constructor to read from db
	public Vehicle() {

	}
	
	//->public constructor (without id!) to write into db
	public Vehicle(boolean deleted, String regnum, String man, String type, Integer yop, User owner) {
		this.deleted = deleted;
		this.regnum = regnum;
		this.man = man;
		this.type = type;
		this.yop = yop;
		this.owner = owner;
	}

	//getters-setters
	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}
	
	public boolean isDeleted() {
		return deleted;
	}

	public void setDeleted(boolean deleted) {
		this.deleted = deleted;
	}

	public String getRegnum() {
		return regnum;
	}

	public void setRegnum(String regnum) {
		this.regnum = regnum;
	}

	public String getMan() {
		return man;
	}

	public void setMan(String man) {
		this.man = man;
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	public Integer getYop() {
		return yop;
	}

	public void setYop(Integer yop) {
		this.yop = yop;
	}
	
	public User getOwner() {
		return owner;
	}

	public void setOwner(User owner) {
		this.owner = owner;
	}

	//toString
	@Override
	public String toString() {
		return "Vehicle [id=" + id + ", deleted=" + deleted + ", regnum=" + regnum + ", man=" + man + ", type=" + type + ", yop=" + yop
				+ ", owner=" + owner + "]";
	}

}
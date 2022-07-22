package com.cg.placementservice;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import org.hibernate.type.DateType;

@Entity
public class Placement 
{
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int ID;
	private String Name;
	private String College;
	private String Qualification;
	private int Date;
	private int Year;
	public Placement(int id, String Name, String College, String Qualification, int Date, int Year) 
	{
		super();
		
		this.ID = id;
		this.Name = Name;
		this.College = College;
		this.Qualification = Qualification;
		this.Date = Date;
		this.Year = Year;
	}

	public Placement() {
		
	}
	
	public Integer getID() {
		return ID;
	}
	public void setID(Integer id) {
		this.ID = id;
	}
	public String getName() {
		return Name;
	}
	public void setName(String Name) {
		this.Name = Name;
	}
	public String getCollege() {
		return College;
	}
	public void setCollege(String College) {
		this.College = College;
	}
	public String getQualification() {
		return Qualification;
	}
	public void setQualification(String Qualification) {
		this.Qualification = Qualification;
	}
	public Integer getDate() {
		return Date;
	}
	public void setDate(Integer Date) {
		this.Date = Date;
	}
	public Integer getYear() {
		return Year;
	}
	public void setYear(Integer Year) {
		this.Year = Year;
	}
	@Override
	public String toString() {
		return "Placement [ID=" + ID + ", Name=" + Name + ", College=" + College + ", Qualification=" + Qualification
				+ ", Date=" + Date + ", Year=" + Year + "]";
	}
	
	
	
	
}

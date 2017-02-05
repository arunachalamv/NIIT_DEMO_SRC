package com.niit.daopatterns;

public class Cities implements java.io.Serializable{
	private int id; 
	private String name; 
	private String district; 
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getDistrict() {
		return district;
	}
	public void setDistrict(String district) {
		this.district = district;
	}
	public long getPopulation() {
		return population;
	}
	public void setPopulation(long population) {
		this.population = population;
	}
	private long population; 
	public String toString() { 
		String s = String.format("ID: %02d, Name: %s, District: %s, Population: %d", id,name, district,population);
		return s; 
			
	}
}

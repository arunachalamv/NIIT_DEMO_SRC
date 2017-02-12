package com.niit.daopatterns;

public class Cities implements java.io.Serializable{
	/**
	 * 
	 */
	private static final long serialVersionUID = 1761397239948674676L;
	private Integer id; 
	private String name; 
	private String district; 
	private Long population; 
	public String toString() { 
		String s = String.format("ID: %02d, Name: %s, District: %s, Population: %d", id,name, district,population);
		return s; 
			
	}
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
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
	public Long getPopulation() {
		return population;
	}
	public void setPopulation(Long population) {
		this.population = population;
	}
	
}

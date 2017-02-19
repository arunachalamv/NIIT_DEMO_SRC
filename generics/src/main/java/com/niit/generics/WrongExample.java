package com.niit.generics;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class WrongExample {
	public static void main(String ... args){
		// Create list
		List stamps = new ArrayList(); 
		// Add values ... 
		stamps.add(new Stamp("India",2016,true,200.00));
		stamps.add(new Coin("USA",2016,true,200.00,"Denver","Obverse Strike"));
		stamps.add(new Coin("USA",2014,true,200.00,"Philadelphia","Reverse Strike"));
		stamps.add(new Stamp("India",2017,false,400.00));
		// now how do we iterate only over stamps and not coins??
		for (Iterator i = stamps.iterator(); i.hasNext();){
			Stamp c = (Stamp)i.next(); 
			System.out.println(c);// will now throw error at runtime.
		}
		
	}
}

class Coin { 
	private String country;
	private Integer year; 
	private boolean isRare; 
	private Double price; 
	private String mint; 
	private String remarks;
	public String toString() { 
		return String.format("Country:%s,Year:%d,Boolean:%s,Price:%.2f,Mint:%s,Remarks:%s", 
				country, year,isRare,price,mint,remarks);
	}
	public Coin(String country, Integer year, boolean isRare, Double price, String mint, String remarks){
		this.country = country; 
		this.year = year; 
		this.isRare = isRare;
		this.price = price; 
		this.mint = mint; 
		this.remarks = remarks; 
	}
	public String getCountry() {
		return country;
	}
	public void setCountry(String country) {
		this.country = country;
	}
	public Integer getYear() {
		return year;
	}
	public void setYear(Integer year) {
		this.year = year;
	}
	public boolean isRare() {
		return isRare;
	}
	public void setRare(boolean isRare) {
		this.isRare = isRare;
	}
	public Double getPrice() {
		return price;
	}
	public void setPrice(Double price) {
		this.price = price;
	}
	public String getMint() {
		return mint;
	}
	public void setMint(String mint) {
		this.mint = mint;
	}
	public String getRemarks() {
		return remarks;
	}
	public void setRemarks(String remarks) {
		this.remarks = remarks;
	} 

}
class Stamp{
	private String country;
	private Integer year; 
	private boolean isRare; 
	private Double price; 
	public String toString() { 
		return String.format("Country:%s,Year:%d,Boolean:%s,Price:%.2f", 
				country, year,isRare,price);
	}
	public Stamp(String country, Integer year, boolean isRare, Double price){
		this.country = country; 
		this.year = year; 
		this.isRare = isRare;
		this.price = price; 
	}

	public String getCountry() {
		return country;
	}
	public void setCountry(String country) {
		this.country = country;
	}
	public Integer getYear() {
		return year;
	}
	public void setYear(Integer year) {
		this.year = year;
	}
	public boolean isRare() {
		return isRare;
	}
	public void setRare(boolean isRare) {
		this.isRare = isRare;
	}
	public Double getPrice() {
		return price;
	}
	public void setPrice(Double price) {
		this.price = price;
	}
}
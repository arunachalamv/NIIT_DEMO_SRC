package com.niit.daopatterns;

import java.util.ArrayList;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		DAOFactory factory = DAOFactory.getDAOFactory(DAOFactory.MYSQL);
		CityDAO obj = factory.getCityDAO();
		ArrayList<Cities> p = obj.getAllCities(); 
		for (Cities p1: p){
			System.out.println(p1.toString());
		}
		
	}

}

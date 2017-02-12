package com.niit.daopatterns;

import java.util.ArrayList;
import java.util.Collections;

import com.niit.utilities.GenericComparator;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		DAOFactory factory = DAOFactory.getDAOFactory(DAOFactory.MYSQL);
		CityDAO obj = factory.getCityDAO();
		ArrayList<Cities> p = obj.getAllCities(); 
		for (Cities p1: p){
			System.out.println(p1.toString());
		}
		Collections.sort(p, new GenericComparator("population",false));
		System.out.println("******City with biggest population:"+p.get(0).getName());
		Collections.sort(p, new GenericComparator("name",false));
		System.out.println("******City which comes alphabetically last:"+p.get(0).getName());
		System.out.println("******City which comes alphabetically first:"+p.get(p.size()-1).getName());
		
	}

}

package com.niit.daopatterns;


import com.mysql.jdbc.Connection;
import java.sql.ResultSet;
import java.util.ArrayList;

public class MySQLCustomerDAO implements CityDAO {

	
	public MySQLCustomerDAO() { 
	
	}
	@Override
	public ArrayList<Cities> getAllCities() {
		return getAllCities("AFG");
	}
	@Override
	public ArrayList <Cities>getAllCities(String country) {
		Connection conn = MySQLDAOFactory.getConnection();
		ResultSet rs = MySQLDAOFactory.executeStatement(conn, "SELECT * FROM world.city where world.city.CountryCode=?", country);
		ArrayList<Cities> p = new ArrayList<Cities>();
		try { 
			if (rs !=null && !rs.isClosed()) {
					while(rs.next()){
					         //Retrieve by column name
					         int id  = rs.getInt("id");	         
					         String name = rs.getString("name");
					         String district = rs.getString("district");
					         long population = rs.getLong("population");
					         Cities tmp = new Cities(); 
					         tmp.setId(id);
					         tmp.setName(name);
					         tmp.setDistrict(district);
					         tmp.setPopulation(population);
					         p.add(tmp); 
					  }
					rs.close();
			}
		}
		catch (Exception e){
			
		}
		MySQLDAOFactory.closeConnection(conn);
		return p; 
	}
}

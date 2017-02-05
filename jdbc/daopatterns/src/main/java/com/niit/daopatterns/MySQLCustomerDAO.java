package com.niit.daopatterns;

import com.mysql.jdbc.Statement;
import com.mysql.jdbc.Connection;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

public class MySQLCustomerDAO implements CityDAO {

	
	public MySQLCustomerDAO() { 
	
	}
	@Override
	public ArrayList getAllCities() {
		// TODO Auto-generated method stub
		Connection conn = MySQLDAOFactory.getConnection(); 
		//ResultSet rs = MySQLDAOFactory.executeStatement(conn, "SELECT * FROM world.city where world.city.CountryCode = 'AFG'");
	      Statement stmt = null; 
	      ResultSet rs = null;
		try {
			stmt = (Statement)conn.createStatement();
		} catch (SQLException e2) {
			// TODO Auto-generated catch block
			e2.printStackTrace();
		}
	      String sql;
	      sql = "SELECT * FROM world.city where world.city.CountryCode = 'AFG'";
		try {
			rs = stmt.executeQuery(sql);
		} catch (SQLException e2) {
			// TODO Auto-generated catch block
			e2.printStackTrace();
		}

		ArrayList<Cities> p = new ArrayList<Cities>();
	      try {
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
			//rs.close(); 
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} 
			//MySQLDAOFactory.closeConnection();
	      return p; 
	}

}

package com.niit.jdbc.firstexample;

import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;

import com.mysql.jdbc.Connection;
import com.mysql.jdbc.Statement;

public class FirstExample {
	// JDBC driver name and database URL
	   static final String JDBC_DRIVER = "com.mysql.jdbc.Driver"; 
	   static final String DB_URL = "jdbc:mysql://localhost:3306/world";
	  // new FirstExample(); 
	   //  Database credentials
	   static final String USER = "root";
	   static final String PASS = "root";
	   static Connection conn = null;
	   static Statement stmt = null;
	   public static void main(String[] args) {
	   try{
	
	      //STEP 2: Register JDBC driver
	      Class.forName("com.mysql.jdbc.Driver");

	      //STEP 3: Open a connection
	      System.out.println("Connecting to database...");
	      conn = (Connection)DriverManager.getConnection(DB_URL,USER,PASS);
	      //STEP 4: Execute a query
	      System.out.println("Creating statement...");
	      stmt = (Statement)conn.createStatement();
	      String sql;
	      sql = "SELECT * FROM world.city where world.city.CountryCode = 'AFG'";
	      ResultSet rs = stmt.executeQuery(sql);

	      //STEP 5: Extract data from result set
	      while(rs.next()){
	         //Retrieve by column name
	         int id  = rs.getInt("id");	         
	         String name = rs.getString("name");
	         String district = rs.getString("district");
	         long population = rs.getLong("population");

	         //Display values
	         System.out.print("ID: " + id);
	         System.out.print(", Name: " + name);
	         System.out.print(", District: " + district);
	         System.out.println(", Population: " + population);

	      }
	      //STEP 6: Clean-up environment
	      rs.close();
	      stmt.close();
	      conn.close();
	   }catch(SQLException se){
	      //Handle errors for JDBC
	      se.printStackTrace();
	   }catch(Exception e){
	      //Handle errors for Class.forName
	      e.printStackTrace();
	   }finally{
	      //finally block used to close resources
	      try{
	         if(stmt!=null)
	            stmt.close();
	      }catch(SQLException se2){
	      }// nothing we can do
	      try{
	         if(conn!=null)
	            conn.close();
	      }catch(SQLException se){
	         se.printStackTrace();
	      }//end finally try
	   }//end try
	   System.out.println("Goodbye!");
}
}
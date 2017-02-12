package com.niit.daopatterns;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;

import com.mysql.jdbc.Connection;
import com.mysql.jdbc.PreparedStatement;
import com.mysql.jdbc.Statement;
import com.niit.utilities.*;
public class MySQLDAOFactory extends DAOFactory {
		   static String JDBC_DRIVER = null;  
		   static String DB_URL = null;
		   static String USER = null; 
		   static String PASS = null; 

	 	private static void init() { 
	 		PropertyHelper.loadProperties("db.properties");
	 		JDBC_DRIVER = PropertyHelper.get("jdbc_driver");  
			DB_URL = PropertyHelper.get("jdbc_url");
			USER = PropertyHelper.get("jdbc_user"); 
			PASS = PropertyHelper.get("jdbc_password"); 
	 	}
	   public static void closeRS(ResultSet rs){
		   try {
			if (rs!=null && !rs.isClosed()){
				   rs.close();
			   }
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	   }
	   public static ResultSet executeStatement(Connection conn, String sql, String... args){
		   com.mysql.jdbc.PreparedStatement stmt = null; 
		ResultSet rs = null; 
		try{ 
			stmt = (PreparedStatement) conn.prepareStatement(sql);
			int cntr =1; 
			for (String args1: args){
				stmt.setString(cntr++,args1); 
			}
			rs = stmt.executeQuery();
		}
		catch (Exception e){
			e.printStackTrace();
		}
		return rs; 
	   }
	   
	   public static ResultSet executeStatement(Connection conn,String sql){
		   Statement stmt = null; 
		   ResultSet rs = null; 
		try {
			stmt = (Statement)conn.createStatement();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		try {
			if(stmt!=null) rs = stmt.executeQuery(sql);
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		   return rs; 
	   }
	   public static Connection getConnection() {
		   init(); 
		    // Use DRIVER and DBURL to create a connection
		    // Recommend connection pool implementation/usage
		    //if (conn!= null) return conn;
		   Connection conn = null; 
		      try {
				conn = (Connection)DriverManager.getConnection(DB_URL,USER,PASS);
				conn.setAutoCommit(false);
				conn.setAutoClosePStmtStreams(true);
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		      return conn; 
		  }
	   
	   public static void closeConnection(Connection conn) { 
		   if (conn!=null){ 
			   try {
				if(!conn.isClosed()){
					   conn.close();
				   }
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		   }
	   }
	   public MySQLCustomerDAO getCityDAO() {
		    // CloudscapeCustomerDAO implements CustomerDAO
		    return new MySQLCustomerDAO();
		  }
}

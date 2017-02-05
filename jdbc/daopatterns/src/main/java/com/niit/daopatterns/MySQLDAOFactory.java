package com.niit.daopatterns;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;

import com.mysql.jdbc.Connection;
import com.mysql.jdbc.Statement;

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
	   static Connection conn = null;
	   //static Statement stmt = null;
	   //static ResultSet rst = null; 
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
		   try {
			if(stmt!=null && !stmt.isClosed()) stmt.close();
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
		    if (conn!= null) return conn; 
		      try {
				conn = (Connection)DriverManager.getConnection(DB_URL,USER,PASS);
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		      return conn; 
		  }
	   
	   public static void closeConnection() { 
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

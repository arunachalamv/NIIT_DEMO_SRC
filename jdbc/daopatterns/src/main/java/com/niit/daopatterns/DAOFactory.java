package com.niit.daopatterns;
public abstract class DAOFactory {
	  public static final int CLOUDSCAPE = 1;
	  public static final int ORACLE = 2;
	  public static final int SYBASE = 3;
      public static final int MYSQL = 4; 
	  // There will be a method for each DAO that can be 
	  // created. The concrete factories will have to 
	  // implement these methods.
	  public abstract CityDAO getCityDAO();
	  public static DAOFactory getDAOFactory(
		      int whichFactory) {
		    switch (whichFactory) {
		      case CLOUDSCAPE: 
		          return null; 
		    	  //return new CloudscapeDAOFactory();
		      case ORACLE    :
		    	  return null; 
		          //return new OracleDAOFactory();      
		      case SYBASE    : 
		    	  return null; 
		          //return new SybaseDAOFactory();
		      case MYSQL: 
		    	  return new MySQLDAOFactory(); 
		      default           : 
		          return null;
		    }
		  }
} 		
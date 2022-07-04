package com.Chandan.Practice;


import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;

import com.mysql.cj.jdbc.Driver;

/**
 * This class contains
 * @author USER
 *
 */
public class DataBase {

	static Connection conn;
	static Statement stat;
	public static ArrayList<String> openDbConnection(String path, String username, String password,String query, String columnName) throws SQLException 
	{
		Driver driver1 = null;
		
			driver1 = new Driver();
		
					DriverManager.registerDriver(driver1);
	
	
		
			conn=DriverManager.getConnection(path, username, password);
		
	
			stat = conn.createStatement();
			ArrayList<String> list=new ArrayList<>();
		
		ResultSet result = null;
		
			result = stat.executeQuery(query);
		
			
					while(result.next()) {
					}
					return list;
					
				
						
		
		//return list;
		
	}
	/*public static boolean validateDataInDatabase( String query, String columnName, String expectedData) 
	{
		ArrayList<String> list = null;
		try {
			list = getDataFromDatabase( query, columnName);
		} catch (Throwable e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			System.out.println(e.getMessage());
			System.out.println("Error occured during validation");
		}
		boolean flag=false;
		for(String actualData:list)
		{
			if(actualData.equalsIgnoreCase(expectedData))
			{
				flag=true;
				break;
			}
		}
		return flag;
	}
	
	public static void setDataInDatabase( String query) 
	{
		
		int result = 0;
		try {
			result = stat.executeUpdate(query);
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			System.out.println(e.getMessage());
			System.out.println("Error occured during updating the database");
			
		}
		if(result>=1)
		{
			System.out.println("Data Entered or modified sucessfully");
		}
		
	}
	public static void closeDatabase()
	{
		try {
			conn.close();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			System.out.println(e.getMessage());
			System.out.println("Error occured during clossing the database");
		}
	}
}*/


}

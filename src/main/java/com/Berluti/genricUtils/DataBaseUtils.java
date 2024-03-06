package com.Berluti.genricUtils;

import java.sql.Connection;

import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;

import com.mysql.cj.jdbc.Driver;

public class DataBaseUtils 
{
Connection con = null;

public void connectToDataBase() throws SQLException
{
	//REGISTER DATABASE();
	Driver driver = new Driver();
	DriverManager.registerDriver(driver);
	con = DriverManager.getConnection(IpathConstants.DataBaseUrl, IpathConstants.DBUserName, IpathConstants.DBPassword);
	}
public void closeDB() throws SQLException
{
con.close();	

}
public String executeQueryAndGetData(String query,int columnIndex, String expData) throws SQLException
{
	String data = null;
	boolean flag = false;
	ResultSet result = con.createStatement().executeQuery(query);
	while (result.next())
	{
	data = result.getString(columnIndex);
	
	if(data.equalsIgnoreCase(expData))
	{
	flag = true;
	//flag rising
	break;
	}
	}
	if(flag)
	{
		System.out.println("--->data not verified");
		return expData;
	}
	else
	{
		
		System.out.println("data not verified");
		return "";
	}
	}
	
	
		
		
}


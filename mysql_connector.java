package com.inixindo;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLClientInfoException;
import java.sql.SQLException;

public class MysqlConnect {
	
	private Connection connection = null;
	
	public Connection getConnection(){
		
		try{
			Class.forName("com.mysql.jdbc.driver");
			this.connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/","mysql","");
		} catch(SQLException eSql){
			eSql.printStackTrace();
		} catch(Exception e){
			e.printStackTrace();
		}
		
		return this.connection;
	}
}
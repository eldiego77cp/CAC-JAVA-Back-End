package ar.com.codoacodo.repository;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

public class AdministradorDeConexiones {
	
	public Connection getConnection() {
		
		String username = "root";
		String password = "secret";
		String port = "33060"; //cambiar por el port en la base de Xampp
		String host = "localhost";
		String dbName = "DB-23044"; //cambiar por el nombre en la base de Xampp
		
		String driverName = "com.mysql.cj.jdbc.Driver";
		
		String dbUrl = "jdbc:mysql://"+host+":"+port+":"+"/"+dbName+ "?serverTimeZone=UTC&useSSL=false";
		
		try {
			Class.forName(dbName);
			DriverManager.getConnection(driverName, username, password);
		}catch(Exception e) {
			
		}
		
		
		
		return null;
		
	}
	
	public PreparedStatement prepared() {
		
		
		return null;
		
	}

}

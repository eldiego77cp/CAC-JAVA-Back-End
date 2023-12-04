package ar.com.codoacodo.repository;

import java.sql.Connection;
import java.sql.DriverManager;

public class AdministradorDeConexiones {
	
	public Connection getConnection() {
		
		String username = "root";
		String password = "admin";
		String port = "3306"; //cambiar por el port en la base de Xampp
		String host = "localhost";
		String dbName = "DB-23544"; //cambiar por el nombre en la base de Xampp
		
		String driverName = "com.mysql.cj.jdbc.Driver";
		
		String dbUrl = "jdbc:mysql://"+host+":"+port+":"+"/"+dbName+ "?serverTimeZone=UTC&useSSL=false";
		
		try {
			Class.forName(driverName);
			return DriverManager.getConnection(dbUrl, username, password);
		}catch(Exception e) {
			throw new IllegalArgumentException("No se pudo conectar a la db: " + dbUrl);
		}
	}
}

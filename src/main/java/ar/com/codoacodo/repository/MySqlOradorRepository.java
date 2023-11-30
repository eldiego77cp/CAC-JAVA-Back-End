package ar.com.codoacodo.repository;

import ar.com.codoacodo.entity.Orador;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

import com.mysql.cj.xdevapi.Statement;

public class MySqlOradorRepository implements OradorRepository {

	@Override
	public void save(Orador orador) {
		
		Connection con = AdministradorDeConexiones.getConnection();
		String sql = "insert into orador(nombre, apellido, tema, email, fecha_alta) values (?,?,?,?,?)";
		
		
		
		try {
		PreparedStatement statement = con.prepareStatement(sql,PreparedStatement.RETURN_GENERATED_KEYS);
		statement.setString(1,orador.getNombre());
		statement.setString(2,orador.getApellido());
		statement.setString(3,orador.getTema());
		statement.setString(4,orador.getMail());
		statement.setDate(5,new java.sql.Date(System.currentTimeMillis()));
		
		statement.executeUpdate();
		
		ResultSet res = statement.getGeneratedKeys();
		
		}catch(Exception e) {
			throw new IllegalArgumentException("No se pudo crear el oradorr:" ,e);
		}
	}

	
	public Orador getById(Long id) {
		Connection con = AdministradorDeConexiones.getConnection();
		String sql = "select id, nombre, apellido, tema, email, fecha_alta from ordador where id = ?";
		
		
		
		try {
		PreparedStatement statement = con.prepareStatement(sql,PreparedStatement.RETURN_GENERATED_KEYS);
		statement.setString(1,orador.getNombre());
		statement.setString(2,orador.getApellido());
		statement.setString(3,orador.getTema());
		statement.setString(4,orador.getMail());
		statement.setDate(5,new java.sql.Date(System.currentTimeMillis()));
		
		statement.executeUpdate();
		
		ResultSet res = statement.getGeneratedKeys();
		
		}catch(Exception e) {
			throw new IllegalArgumentException("No se pudo crear el oradorr:" ,e);
		}
	}
	}

	
	public void update(Orador orador) {
		
		
	}

	
	public void delete(Long id) {
		
		
	}

}

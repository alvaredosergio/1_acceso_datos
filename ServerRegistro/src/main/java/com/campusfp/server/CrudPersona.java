package com.campusfp.server;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

public class CrudPersona {
	
	public static List<Persona> getAll(Connection con) throws SQLException {
		List<Persona> pers = new ArrayList<>();
		Statement stmt = con.createStatement();
		ResultSet rs = stmt.executeQuery("SELECT * FROM usuario");
		while (rs.next()) {
			int id = rs.getInt("id");
			String nombre = rs.getString("nombre");
			String apellido = rs.getString("apellido");
			String dni = rs.getString("dni");
			String tlf = rs.getString("tlf");

			Persona p = new Persona(id,nombre,apellido,dni,tlf);
			pers.add(p);
		}
		rs.close();
		stmt.close();
		return pers;
	}
	
	public static void showRecords(List <Persona> pers) {
    	for(Persona p: pers) {
    		System.out.println(p.toString());
    	}
    }
	
	public boolean createRecord(Connection con,Persona pers) throws SQLException {
    	boolean opOK = false;
    	String sql = "INSERT INTO usuario (nombre,apellido,dni,tlf) VALUES (?,?,?,?)";
    	PreparedStatement statement = con.prepareStatement(sql);
    	statement.setString(1, pers.getNombre());
    	statement.setString(2, pers.getApellido());
    	statement.setString(3, pers.getDni());
    	statement.setString(4, pers.getTlf());
    	int r = statement.executeUpdate();
    	if(r > 0) {
    		opOK = true;
    	}
    	return opOK;
    }
	
	public boolean updateRecord(Connection con, Persona pers) throws SQLException {
    	boolean opOK = false;
    	String sql = "UPDATE usuario SET nombre = ?, apellido = ?,dni = ?, tlf = ?";
    	PreparedStatement statement = con.prepareStatement(sql);
    	statement.setString(1, pers.getNombre());
    	statement.setString(2, pers.getApellido());
    	statement.setString(3, pers.getDni());
    	statement.setString(4, pers.getTlf());
    	int r = statement.executeUpdate();
    	if(r > 0) {
    		opOK = true;
    	}
    	return opOK;
    }	
	
	public boolean deleteRecord(Connection con, Persona pers) throws SQLException {
    	boolean opOK = false;
		String sql = "DELETE FROM usuario WHERE nombre = ?";
		PreparedStatement statement = con.prepareStatement(sql);
		statement.setString(1, pers.getNombre());
		int r = statement.executeUpdate();
    	if(r > 0) {
    		opOK = true;
    	}
    	return opOK;	
    }
	
	public Persona getRecord(Connection con, String nomb) throws SQLException {
		Persona p = null;
		String sql = "SELECT * FROM usuario WHERE nombre=?";
		PreparedStatement pstmt = con.prepareStatement(sql);
		pstmt.setString(1, nomb);
		ResultSet rs = pstmt.executeQuery();
		while (rs.next()) {
			int id = rs.getInt("id");
			String nombre = rs.getString("nombre");
			String apellido = rs.getString("apellido");
			String dni = rs.getString("dni");
			String tlf = rs.getString("tlf");
			p = new Persona(id,nombre,apellido,dni,tlf);
		}
		rs.close();
		pstmt.close();
		return p;
	}
}

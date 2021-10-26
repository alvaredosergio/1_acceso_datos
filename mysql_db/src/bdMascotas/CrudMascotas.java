package bdMascotas;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

public class CrudMascotas {
	
	public static List<Mascotas> getAll(Connection con) throws SQLException {
		List<Mascotas> masc = new ArrayList<>();
		Statement stmt = con.createStatement();
		ResultSet rs = stmt.executeQuery("SELECT * FROM mascotas");
		ResultSet rs2 = stmt.executeQuery("SELECT * FROM historia_clinica");
		while (rs.next()) {
			int id = rs.getInt("id");
			String nombre = rs.getString("nombre");
			String raza = rs.getString("raza");
			String anio = rs.getString("anio");
			int historial = rs.getInt("cod_historia_clinica");
			int id2 = rs2.getInt("id");
			String historia = rs2.getString("historial");

			Mascotas m = new Mascotas(id,nombre,raza,anio,historial);
			masc.add(m);
		}
		rs.close();
		stmt.close();
		return masc;
	}
	
	public static void showRecords(List <Mascotas> masc) {
    	for(Mascotas m: masc) {
    		System.out.println(m.toString());
    	}
    }
	
	public boolean createRecord(Connection con,Mascotas msc) throws SQLException {
    	boolean opOK = false;
    	String sql = "INSERT INTO mascotas (nombre,raza,anio,cod_historia_clinica) VALUES (?,?,?,?)";
    	PreparedStatement statement = con.prepareStatement(sql);
    	statement.setString(2, msc.getNombre());
    	statement.setString(3, msc.getRaza());
    	statement.setString(4, msc.getAnio());
    	statement.setInt(5, msc.getCodHistorial());
    	int r = statement.executeUpdate();
    	if(r > 0) {
    		opOK = true;
    	}
    	return opOK;
    }
	
	public boolean updateRecord(Connection con, Mascotas msc) throws SQLException {
    	boolean opOK = false;
    	String sql = "UPDATE mascotas SET nombre = ?, raza = ?,anios = ?, cod_historia_clinica = ?";
    	PreparedStatement statement = con.prepareStatement(sql);
    	statement.setString(1, msc.getNombre());
    	statement.setString(2, msc.getRaza());
    	statement.setString(3, msc.getAnio());
    	int r = statement.executeUpdate();
    	if(r > 0) {
    		opOK = true;
    	}
    	return opOK;
    }	
	
	public boolean deleteRecord(Connection con, Mascotas msc) throws SQLException {
    	boolean opOK = false;
		String sql = "DELETE FROM mascotas WHERE nombre = ?";
		PreparedStatement statement = con.prepareStatement(sql);
		statement.setString(1, msc.getNombre());
		int r = statement.executeUpdate();
    	if(r > 0) {
    		opOK = true;
    	}
    	return opOK;	
    }
	
	public Mascotas getRecord(Connection con, String nomb) throws SQLException {
		Mascotas m = null;
		String sql = "SELECT * FROM mascotas WHERE nombre=?";
		PreparedStatement pstmt = con.prepareStatement(sql);
		pstmt.setString(1, nomb);
		ResultSet rs = pstmt.executeQuery();
		while (rs.next()) {
			int id = rs.getInt("id");
			String nombre = rs.getString("nombre");
			String raza = rs.getString("raza");
			String anio = rs.getString("anio");
			int historial = rs.getInt("cod_historia_clinica");
			m = new Mascotas(id,nombre,raza,anio,historial);
		}
		rs.close();
		pstmt.close();
		return m;
	}
}

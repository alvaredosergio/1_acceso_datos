package bdMascotas;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;
import mysql_db.Modelo;

public class Principal {
	public static void main(String[] args) {
		CrudMascotas cr = new CrudMascotas();
		
		try {
			Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/mascotas", "root", "alvaredocampus1");
			List <Mascotas> mcs = CrudMascotas.getAll(con);
	        //CrudMascotas.showRecords(mcs);
	        //System.out.println(cr.getRecord(con, "Rocky"));
			
	        
			con.close();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}

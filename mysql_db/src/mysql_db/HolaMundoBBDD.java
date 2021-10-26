package mysql_db;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

public class HolaMundoBBDD {
    public static void main(String[] args) {
    	HolaMundoBBDD hmbd = new HolaMundoBBDD();
        try {
        Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/test_schema", "root", "alvaredocampus1");
        //List <Modelo> mm = hmbd.getAll(con);
        //showRecords(mm);
        Modelo m = hmbd.getRecord(con,"Alvaredo");
        System.out.println(m.toString());
        m.setFirstName("Gonzalez");
        hmbd.updateRecord(con,m);
        
        Modelo m2 = hmbd.getRecord(con,"Alvaredo");
        
        hmbd.deleteRecord(con,m2);
        
        List <Modelo> mms = hmbd.getAll(con);
        showRecords(mms);
        
        con.close();
        } catch (SQLException e) {

        e.printStackTrace();
        }
    }
    
    // Metodo para insertar datos
    public boolean createRecord(Connection con,Modelo miModelo) throws SQLException {
    	boolean opOK = false;
    	String sql = "INSERT INTO employee (first_name, last_name,cat) VALUES (?,?,?)";
    	PreparedStatement statement = con.prepareStatement(sql);
    	statement.setString(1, miModelo.getFirstName());
    	statement.setString(2, miModelo.getLastName());
    	statement.setInt(3, miModelo.getCategory());
    	int r = statement.executeUpdate();
    	if(r > 0) {
    		opOK = true;
    	}
    	return opOK;
    }
    
    // Metodo para obtener los resultados de una Query, y meterlo en una Lista Modelo
    public List <Modelo> getAll (Connection con) throws SQLException{
    	List <Modelo> misModelos = new ArrayList <>();
    	Statement stmt = con.createStatement();
    	ResultSet rs = stmt.executeQuery("SELECT * FROM employee WHERE first_name = 'Sergio'");
        while(rs.next()) {
        String firstName = rs.getString("first_name");
        String lastName = rs.getString("last_name");
        int cat = rs.getInt("cat");
        Modelo m = new Modelo(firstName,lastName,cat);
        misModelos.add(m);
        }
        stmt.close();
        rs.close();
		return misModelos;
    }
    
    // Actualizar datos para cambiarlos de una db
    public boolean updateRecord(Connection con, Modelo miNuevoModelo) throws SQLException {
    	boolean opOK = false;
    	String sql = "UPDATE employee SET first_name = ?, cat = ? WHERE last_name = ?";
    	PreparedStatement statement = con.prepareStatement(sql);
    	statement.setString(1, miNuevoModelo.getFirstName());
    	statement.setInt(2, miNuevoModelo.getCategory());
    	statement.setString(3, miNuevoModelo.getLastName());
    	int r = statement.executeUpdate();
    	if(r > 0) {
    		opOK = true;
    	}
    	return opOK;
    }
    
    // Borrar registros
    public boolean deleteRecord(Connection con, Modelo miModelo) throws SQLException {
    	boolean opOK = false;
		String sql = "DELETE FROM employee WHERE last_name = ?";
		PreparedStatement statement = con.prepareStatement(sql);
		statement.setString(1, miModelo.getLastName());
		int r = statement.executeUpdate();
    	if(r > 0) {
    		opOK = true;
    	}
    	return opOK;	
    }
    
    public Modelo getRecord(Connection con, String lName) throws SQLException {
		Modelo mm = null;
		String sql = "SELECT * FROM employee WHERE last_name=?";
		PreparedStatement pstmt = con.prepareStatement(sql);
		pstmt.setString(1, lName);
		ResultSet rs = pstmt.executeQuery();
		while (rs.next()) {
			String firstName = rs.getString("first_name");
			String lastName = rs.getString("last_name");
			int cat = rs.getInt("cat");
			mm = new Modelo(firstName, lastName, cat);
		}
		rs.close();
		pstmt.close();
		return mm;
	}
    
    // Mostrar los registros
    public static void showRecords(List <Modelo> misModelos) {
    	for(Modelo m: misModelos) {
    		System.out.println(m.toString());
    	}
    }
}
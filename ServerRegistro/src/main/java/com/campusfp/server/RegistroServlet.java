package com.campusfp.server;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class RegistroServlet
 */
@WebServlet("/RegistroServlet")
public class RegistroServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public RegistroServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		response.getWriter().append("Served at: ").append(request.getContextPath());
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
			String nombre = request.getParameter("name");	
			String apellido = request.getParameter("surname");	
			String dni = request.getParameter("dni");	
			String tlf = request.getParameter("tlf");
			
			String resultado = null;
			PrintWriter out = response.getWriter();
			
			resultado = insertar(nombre, apellido, dni, tlf);
			out.println(resultado);
			
	
	}

	private String insertar(String nombre, String apellido, String dni, String tlf) {
		String sql = null, msg = null;
		try {
			Connection con = DatabaseConnection.initializeDatabase();
			sql = "INSERT INTO usuario(nombre, apellido, dni, tlf) VALUES (?, ?, ?, ?) ";
			PreparedStatement ps = con.prepareStatement(sql);
			ps.setString(1, nombre);
			ps.setString(2, apellido);
			ps.setString(3, dni);
			ps.setString(4, tlf);
			int rows = ps.executeUpdate();
			if(rows > 0) {
				msg = "<html><body><b style=\"color:#00ff00\";>Insercion exitosa!"+"</b></body></html>";
			}else {
				msg = "<html><body><b style=\"color:#ff0000\";>Insercion fracasada!"+"</b></body></html>";
				
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return msg;
	}

}

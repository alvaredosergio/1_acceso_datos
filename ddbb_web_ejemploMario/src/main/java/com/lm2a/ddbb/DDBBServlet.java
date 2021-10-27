package com.lm2a.ddbb;

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
 * Servlet implementation class DDBBServlet
 */
@WebServlet("/DDBBServlet")
public class DDBBServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public DDBBServlet() {
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
			String fUname = request.getParameter("uname");	
			String fPass = request.getParameter("pass");	
			String fNombreCompleto = request.getParameter("nombreCompleto");	
			String fEmilio = request.getParameter("emilio");
			
			String resultado = null;
			PrintWriter out = response.getWriter();
			
			resultado = insertar(fUname, fPass, fNombreCompleto, fEmilio);
			out.println(resultado);
			
	
	}

	private String insertar(String fUname, String fPass, String fNombreCompleto, String fEmilio) {
		String sql = null, msg = null;
		try {
			Connection con = DatabaseConnection.initializeDatabase();
			sql = "INSERT INTO Users(uname, pass, nombre_completo, emilio) VALUES (?, ?, ?, ?) ";
			PreparedStatement ps = con.prepareStatement(sql);
			ps.setString(1, fUname);
			ps.setString(2, fPass);
			ps.setString(3, fNombreCompleto);
			ps.setString(4, fEmilio);
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

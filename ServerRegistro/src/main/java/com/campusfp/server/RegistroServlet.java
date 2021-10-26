package com.campusfp.server;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class loginServlet
 */
@WebServlet("/registro")
public class RegistroServlet extends HttpServlet {
	List <Persona> personas;
	
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public RegistroServlet() {
        super();
        personas = new ArrayList <Persona>();
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String nombre = request.getParameter("name");
		String apellido = request.getParameter("surname");
		String dni = request.getParameter("dni");
		String telefono = request.getParameter("tlf");
		String correo = request.getParameter("mail");
		
		Persona p1 = new Persona(nombre,apellido,dni,telefono,correo);
		personas.add(p1);
		
		response.getWriter().append("<html>");
		response.getWriter().append("<body>");
		response.getWriter().append("Usuario guardado: " + p1 + "<br>");
		response.getWriter().append("Todos los usuarios: <br>");
		for(Persona p: personas) {
			response.getWriter().append(p + "<br>");
		}
		
		response.getWriter().append("<a href='index.html'>Enlace a Index</a>");
		response.getWriter().append("</body>");
		response.getWriter().append("</html>");
		
		
		
		
	}

}

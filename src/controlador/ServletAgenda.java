package controlador;

import java.io.IOException;
import java.sql.SQLException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import entidad.Agenda;
import modelo.ModeloAgenda;


/**
 * Servlet implementation class ServletAgenda
 */
@WebServlet("/agenda")
public class ServletAgenda extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public ServletAgenda() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	*/
    
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		response.sendRedirect("agenda.jsp");
	}
	
	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
		Agenda ea = new Agenda();
		ea.setIdMascota(Integer.valueOf(request.getParameter("idMascota")));
		ea.setRutDuenio(request.getParameter("rutDuenio"));
		ea.setNombreMascota(request.getParameter("nombreMascota"));
		ea.setHora(request.getParameter("hora"));
		ea.setFecha(request.getParameter("fecha"));
		System.out.println(ea);
		
		ModeloAgenda ma = new ModeloAgenda();
		try {
			ma.crear(ea);
		} catch (SQLException e) {
			
			System.out.println("Error al insertar");
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}

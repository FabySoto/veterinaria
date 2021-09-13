package controlador;

import java.io.IOException;
import java.sql.SQLException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import entidad.Duenio;
import modelo.ModeloDuenio;

/**
 * Servlet implementation class ServletDuenio
 */
@WebServlet("/duenio")
public class ServletDuenio extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public ServletDuenio() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		response.sendRedirect("duenio.jsp");
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
		ModeloDuenio md = new ModeloDuenio();
		Duenio ed = new Duenio();
		ed.setRut(request.getParameter("rut"));
		ed.setNombre(request.getParameter("nombre"));
		ed.setApellido(request.getParameter("apellido"));
		ed.setDireccion(request.getParameter("direccion"));
		ed.setCorreo(request.getParameter("correo"));
		ed.setTelefono(request.getParameter("telefono"));
		ed.setNombreMascota(request.getParameter("nombreMascota"));
		try {
			md.crear(ed);
			System.out.println("Dueño creado exitosamente!");
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			System.out.println("Fallo al crear dueño");
			e.printStackTrace();
		}
	}

}

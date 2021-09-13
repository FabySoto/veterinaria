package controlador;

import java.io.IOException;
import java.sql.SQLException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import modelo.ModeloMascota;
import entidad.Mascota;
/**
 * Servlet implementation class ServletMascota
 */
@WebServlet("/mascota")
public class ServletMascota extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public ServletMascota() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		response.sendRedirect("mascota.jsp");
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
		Mascota em = new Mascota();
		ModeloMascota mm = new ModeloMascota();
		try {
			em.setEdadMascota(Integer.valueOf(request.getParameter("edad")));
			em.setNombreMascota(request.getParameter("nombre"));
			em.setRutDuenio(request.getParameter("rutDuenio"));
			em.setTipoMascota(request.getParameter("tipo"));
			mm.crear(em);
			//response.sendRedirect("mascota.jsp");
			request.getRequestDispatcher("mascota.jsp").forward(request, response);
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}

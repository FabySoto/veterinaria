package controlador;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import entidad.Usuario;
import modelo.ModeloUsuario;
/**
 * Servlet implementation class Usuario
 */
@WebServlet("/usuario")
public class ServletUsuario extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    @Override
	public void service(HttpServletRequest request, HttpServletResponse response) 
			throws ServletException, IOException {
		// TODO Auto-generated method stub
		
    	String evento = request.getParameter("evento");
    	
    	if ("salirSistema".equalsIgnoreCase(evento)) {
    		HttpSession sesion = request.getSession();
    		sesion.invalidate();
    		request.getRequestDispatcher("index.jsp").forward(request, response);
    	}
    	
		String nombreUsuario = request.getParameter("usuario");
		String password = request.getParameter("password");
		
		System.out.println(nombreUsuario + password);
		ModeloUsuario modelo = new ModeloUsuario();
		Usuario usuario = modelo.iniciarSesion(nombreUsuario, password);

		if (usuario == null) {
			request.setAttribute("mensaje", "Usuario o contraseña invalidos!");
			request.getRequestDispatcher("index.jsp").forward(request, response);
		} else {
			HttpSession sesion = request.getSession();
			sesion.setAttribute("usuario", usuario);
			response.sendRedirect("principal.jsp");
		}
	}
}

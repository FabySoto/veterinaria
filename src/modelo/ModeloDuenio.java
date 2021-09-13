package modelo;

import java.sql.PreparedStatement;
import java.sql.SQLException;

import entidad.Duenio;
import util.Conexion;

public class ModeloDuenio {
	Conexion c;
	public ModeloDuenio() {
		// TODO Auto-generated constructor stub
		c = new Conexion();
	}
	public boolean crear(Duenio d) throws SQLException {
		String sql="INSERT INTO `duenio` (`rut`, `nombre`, `apellido`, `direccion`, `correo`, `telefono`, `nombreMascota`) VALUES (?, ?, ?, ?, ?, ?, ?);";
		PreparedStatement ps=c.getConexion().prepareStatement(sql);
		ps.setString(1, d.getRut());
		ps.setString(2, d.getNombre());
		ps.setString(3, d.getApellido());
		ps.setString(4, d.getDireccion());
		ps.setString(5, d.getCorreo());
		ps.setString(6, d.getTelefono());
		ps.setString(7, d.getNombreMascota());
		return ps.execute();
	}
}

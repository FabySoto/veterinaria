package modelo;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

import entidad.Agenda;
import util.Conexion;

public class ModeloAgenda {
	Conexion c; 
	public ModeloAgenda() {
		// TODO Auto-generated constructor stub
		c = new Conexion();
	}
	public boolean crear(Agenda em) throws SQLException {
		String sql= "INSERT INTO `agenda` (`idMascota`, `rutDuenio`, `nombreMascota`, `hora`, `fecha`) VALUES (?, ?, ?, ?, ?);";
		PreparedStatement ps= c.getConexion().prepareStatement(sql);
		ps.setInt(1, em.getIdMascota());
		ps.setString(2,em.getRutDuenio());
		ps.setString(3,em.getNombreMascota());
		ps.setString(4,em.getHora());
		ps.setString(5,em.getFecha());
		return ps.execute();
	}
	
	public ArrayList<Agenda> Listar() throws SQLException {
		String sql="SELECT * FROM `agenda`";
		PreparedStatement ps= c.getConexion().prepareStatement(sql);
		ResultSet rs = ps.executeQuery();
		ArrayList<Agenda> dt = new ArrayList<Agenda>();
		
		while (rs.next()) {
			Agenda ea = new Agenda();
			ea.setId(rs.getInt(1));
			ea.setIdMascota(rs.getInt(2));
			ea.setRutDuenio(rs.getString(3));
			ea.setNombreMascota(rs.getString(4));
			ea.setHora(rs.getString(5));
			ea.setFecha(rs.getString(6));
			dt.add(ea);
		}
		return dt;
	}
}

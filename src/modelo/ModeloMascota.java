package modelo;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

import entidad.Mascota;
import util.Conexion;

public class ModeloMascota {

	Conexion c; 
	public ModeloMascota() {
		c = new Conexion();
	}
	
	public boolean crear(Mascota em) throws SQLException {
		String sql= "INSERT INTO `mascota` (`tipoMascota`, `edadMascota`, `nombreMascota`, `rutDuenio`) VALUES (?, ?, ?, ?);";
		PreparedStatement ps= c.getConexion().prepareStatement(sql);
		ps.setString(1, em.getTipoMascota());
		ps.setInt(2,em.getEdadMascota());
		ps.setString(3, em.getNombreMascota());
		ps.setString(4, em.getRutDuenio());
		return ps.execute();
	}

	public ArrayList<Mascota> Listar() throws SQLException{
		String sql="SELECT `idMascota`, `tipoMascota`, `edadMascota`, `nombreMascota`, `nombre` as Responsable FROM `mascota`, `duenio`;";
		PreparedStatement ps= c.getConexion().prepareStatement(sql);
		ResultSet rs = ps.executeQuery();
		ArrayList<Mascota> dt = new ArrayList<Mascota>();
		while (rs.next()) {
        	Mascota em = new Mascota();
        	em.setIdMascota(rs.getInt(1));
        	em.setTipoMascota(rs.getString(2));
        	em.setEdadMascota(rs.getInt(3));
        	em.setNombreMascota(rs.getString(4));
        	em.setRutDuenio(rs.getString(5));
        	dt.add(em);
        }
		return dt;
	}
}

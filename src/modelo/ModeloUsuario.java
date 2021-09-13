package modelo;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

import util.Conexion;
import entidad.Usuario;

public class ModeloUsuario {	
	public Usuario iniciarSesion(String nombreUsuario, String password) {
		Usuario usuario = null;
		Connection cn = null;
		PreparedStatement pstm = null;
		ResultSet rs = null;
		
		try {
			cn = Conexion.getConexion();
			String sql = "SELECT U.id, U.nombreUsuario, U.password FROM usuario U WHERE U.nombreUsuario = ? AND U.password = ?";
			pstm = cn.prepareStatement(sql);
			pstm.setString(1, nombreUsuario);
			pstm.setString(2, password);
			rs = pstm.executeQuery();
			
			while (rs.next()) {
				usuario = new Usuario();
				usuario.setId(rs.getInt("id"));
				usuario.setNombreUsuario(rs.getString("nombreUsuario"));
				usuario.setPassword(rs.getString("password"));
			}
			
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			try {
				if (rs != null) {
					rs.close();
				}
				
				if (pstm != null) {
					pstm.close();
				}
				
				if (cn != null) {
					cn.close();
				}
			} catch (Exception e2) {
				e2.printStackTrace();
			}
		}
		
		return usuario;
	}
}
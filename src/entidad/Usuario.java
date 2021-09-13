package entidad;


public class Usuario {
	private int id;
	private String nombreUsuario;
	private String password;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getNombreUsuario() {
		return nombreUsuario;
	}
	public void setNombreUsuario(String nombreUsuario) {
		this.nombreUsuario = nombreUsuario;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	@Override
	public String toString() {
		return "EntidadUsuario [id=" + id + ", nombreUsuario=" + nombreUsuario + ", password=" + password + "]";
	}
}
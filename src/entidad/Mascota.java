package entidad;

public class Mascota {
	private int idMascota, edadMascota;
	private String tipoMascota, nombreMascota , rutDuenio;

	public int getIdMascota() {
		return idMascota;
	}
	public void setIdMascota(int idMascota) {
		this.idMascota = idMascota;
	}
	public String getTipoMascota() {
		return tipoMascota;
	}
	public void setTipoMascota(String tipoMascota) {
		this.tipoMascota = tipoMascota;
	}
	public int getEdadMascota() {
		return edadMascota;
	}
	public void setEdadMascota(int edadMascota) {
		this.edadMascota = edadMascota;
	}
	public String getNombreMascota() {
		return nombreMascota;
	}
	public void setNombreMascota(String nombreMascota) {
		this.nombreMascota = nombreMascota;
	}
	public String getRutDuenio() {
		return rutDuenio;
	}
	public void setRutDuenio(String rutDuenio) {
		this.rutDuenio = rutDuenio;
	}
	
	@Override
	public String toString() {
		return "Mascota [idMascota=" + idMascota + ", tipoMascota=" + tipoMascota + ", edadMascota=" + edadMascota
				+ ", nombreMascota=" + nombreMascota + ", rutDuenio=" + rutDuenio + "]";
	}
	
}

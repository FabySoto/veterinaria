package entidad;

public class Agenda {
	private int id, idMascota;
	private String rutDuenio, nombreMascota,hora,fecha;
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public int getIdMascota() {
		return idMascota;
	}
	public void setIdMascota(int idMascota) {
		this.idMascota = idMascota;
	}
	public String getRutDuenio() {
		return rutDuenio;
	}
	public void setRutDuenio(String rutDuenio) {
		this.rutDuenio = rutDuenio;
	}
	public String getNombreMascota() {
		return nombreMascota;
	}
	public void setNombreMascota(String nombreMascota) {
		this.nombreMascota = nombreMascota;
	}
	public String getHora() {
		return hora;
	}
	public void setHora(String hora) {
		this.hora = hora;
	}
	public String getFecha() {
		return fecha;
	}
	public void setFecha(String fecha) {
		this.fecha = fecha;
	}
	
	@Override
	public String toString() {
		return "Agenda [id=" + id + ", idMascota=" + idMascota + ", rutDuenio=" + rutDuenio + ", nombreMascota="
				+ nombreMascota + ", hora=" + hora + ", fecha=" + fecha + "]";
	}
	
}

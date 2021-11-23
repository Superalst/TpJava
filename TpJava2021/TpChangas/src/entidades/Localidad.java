package entidades;

public class Localidad {
	
	private int idlocalidad;
	private String odPostal; 
	private String descripcion;
	private int idProvincia;
	public int getIdlocalidad() {
		return idlocalidad;
	}
	public void setIdlocalidad(int idlocalidad) {
		this.idlocalidad = idlocalidad;
	}
	public String getOdPostal() {
		return odPostal;
	}
	public void setOdPostal(String odPostal) {
		this.odPostal = odPostal;
	}
	public String getDescripcion() {
		return descripcion;
	}
	public void setDescripcion(String descripcion) {
		this.descripcion = descripcion;
	}
	public int getIdProvincia() {
		return idProvincia;
	}
	public void setIdProvincia(int idProvincia) {
		this.idProvincia = idProvincia;
	}
	
	
}

package entidades;


public class Persona {

	private int dni;
	private String nombre;
	private String apellido;
	private String telefono;
	private String oficio;
	private String areaTrabajo;
	private Double valuacionPromedio;
	public int getDni() {
		return dni;
	}
	public void setDni(int dni) {
		this.dni = dni;
	}
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public String getApellido() {
		return apellido;
	}
	public void setApellido(String apellido) {
		this.apellido = apellido;
	}
	public String getTelefono() {
		return telefono;
	}
	public void setTelefono(String telefono) {
		this.telefono = telefono;
	}
	public String getOficio() {
		return oficio;
	}
	public void setOficio(String oficio) {
		this.oficio = oficio;
	}
	public String getAreaTrabajo() {
		return areaTrabajo;
	}
	public void setAreaTrabajo(String areaTrabajo) {
		this.areaTrabajo = areaTrabajo;
	}
	public Double getValuacionPromedio() {
		return valuacionPromedio;
	}
	public void setValuacionPromedio(Double valuacionPromedio) {
		this.valuacionPromedio = valuacionPromedio;
	}
	
	@Override
	public String toString() {
		return "Persona [dni=" + dni + ", nombre=" + nombre + ", apellido=" + apellido + ", telefono=" + telefono
				+ ", oficio=" + oficio + ", areaTrabajo=" + areaTrabajo + ", valuacionPromedio=" + valuacionPromedio
				+ "]";
	}

	
	
}

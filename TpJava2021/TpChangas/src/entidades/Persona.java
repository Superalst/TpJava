package entidades;

import java.util.Date;

public class Persona {

	private int dni;
	private String apellido;
	private String nombre;
	private Date fecha_nacimiento;
	private Date fecha_registro_agencia;
	private String direccion;
	private String telefono;
	
	
	return dni;
	}
	public void setDni(int dni) {
		this.dni = dni;
	}
	public String getApellido() {
		return apellido;
	}
	public void setApellido(String apellido) {
		this.apellido = apellido;
	}
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public Date getFecha_nacimiento() {
		return fecha_nacimiento;
	}
	public void setFecha_nacimiento(Date fecha_nacimiento) {
		this.fecha_nacimiento = fecha_nacimiento;
	}
	public Date getFecha_registro_agencia() {
		return fecha_registro_agencia;
	}
	public void setFecha_registro_agencia(Date fecha_registro_agencia) {
		this.fecha_registro_agencia = fecha_registro_agencia;
	}
	public String getDireccion() {
		return direccion;
	}
	public void setDireccion(String direccion) {
		this.direccion = direccion;
	}
	public String getTelefono() {
		return telefono;
	}
	public void setTelefono(String telefono) {
		this.telefono = telefono;
	}
	

	@Override
	public String toString() {
		return "\nPersona [documento=" + documento + ", apellido=" + apellido + ", nombre=" + nombre
				+ ", fecha de nacimiento=" + fecha_nacimiento +", fecha de registro agencia=" +fecha_registro_agencia 
				 + ", direccion=" + direccion +", tel=" + tel + "]";
	}

	
}

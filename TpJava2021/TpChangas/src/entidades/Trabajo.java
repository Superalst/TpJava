package entidades;

public class Trabajo {

	
	private int idtrabajo;
	private String estado;
	private String fechaIni;
	private String fechaFin;
	private String fechaEstimadaFin;
	private String fechaEstimadaIni;
	private String ubicacionAprox;
	private String observaciones;
	private Double valuacionTrabajo;
	private int idCotizacion;
	private int dniCliente;
	private int dniTrabajador;
	private int idLocalidad;
	
	public int getIdtrabajo() {
		return idtrabajo;
	}
	public void setIdtrabajo(int idtrabajo) {
		this.idtrabajo = idtrabajo;
	}
	public String getEstado() {
		return estado;
	}
	public void setEstado(String estado) {
		this.estado = estado;
	}
	public String getFechaIni() {
		return fechaIni;
	}
	public void setFechaIni(String fechaIni) {
		this.fechaIni = fechaIni;
	}
	public String getFechaFin() {
		return fechaFin;
	}
	public void setFechaFin(String fechaFin) {
		this.fechaFin = fechaFin;
	}
	public String getFechaEstimadaFin() {
		return fechaEstimadaFin;
	}
	public void setFechaEstimadaFin(String fechaEstimadaFin) {
		this.fechaEstimadaFin = fechaEstimadaFin;
	}
	public String getFechaEstimadaIni() {
		return fechaEstimadaIni;
	}
	public void setFechaEstimadaIni(String fechaEstimadaIni) {
		this.fechaEstimadaIni = fechaEstimadaIni;
	}
	public String getUbicacionAprox() {
		return ubicacionAprox;
	}
	public void setUbicacionAprox(String ubicacionAprox) {
		this.ubicacionAprox = ubicacionAprox;
	}
	public String getObservaciones() {
		return observaciones;
	}
	public void setObservaciones(String observaciones) {
		this.observaciones = observaciones;
	}
	public Double getValuacionTrabajo() {
		return valuacionTrabajo;
	}
	public void setValuacionTrabajo(Double valuacionTrabajo) {
		this.valuacionTrabajo = valuacionTrabajo;
	}
	public int getIdCotizacion() {
		return idCotizacion;
	}
	public void setIdCotizacion(int idCotizacion) {
		this.idCotizacion = idCotizacion;
	}
	public int getDniCliente() {
		return dniCliente;
	}
	public void setDniCliente(int dniCliente) {
		this.dniCliente = dniCliente;
	}
	public int getDniTrabajador() {
		return dniTrabajador;
	}
	public void setDniTrabajador(int dniTrabajador) {
		this.dniTrabajador = dniTrabajador;
	}
	public int getIdLocalidad() {
		return idLocalidad;
	}
	public void setIdLocalidad(int idLocalidad) {
		this.idLocalidad = idLocalidad;
	}
	
	@Override
	public String toString() {
		return "Trabajo [idtrabajo=" + idtrabajo + ", estado=" + estado + ", fechaIni=" + fechaIni + ", fechaFin="
				+ fechaFin + ", fechaEstimadaFin=" + fechaEstimadaFin + ", fechaEstimadaIni=" + fechaEstimadaIni
				+ ", ubicacionAprox=" + ubicacionAprox + ", observaciones=" + observaciones + ", valuacionTrabajo="
				+ valuacionTrabajo + ", idCotizacion=" + idCotizacion + ", dniCliente=" + dniCliente
				+ ", dniTrabajador=" + dniTrabajador + ", idLocalidad=" + idLocalidad + "]";
	}
	
	
	
}

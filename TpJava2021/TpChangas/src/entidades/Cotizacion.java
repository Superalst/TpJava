package entidades;

public class Cotizacion {

	private int idCotizacion;
	private Double precioHora;
	private Double precioFinal;
	private String fechaCotizacion;
	private String descripcion;
	private String materialesRequeridos;
	public int getIdCotizacion() {
		return idCotizacion;
	}
	public void setIdCotizacion(int idCotizacion) {
		this.idCotizacion = idCotizacion;
	}
	public Double getPrecioHora() {
		return precioHora;
	}
	public void setPrecioHora(Double precioHora) {
		this.precioHora = precioHora;
	}
	public Double getPrecioFinal() {
		return precioFinal;
	}
	public void setPrecioFinal(Double precioFinal) {
		this.precioFinal = precioFinal;
	}
	public String getFechaCotizacion() {
		return fechaCotizacion;
	}
	public void setFechaCotizacion(String fechaCotizacion) {
		this.fechaCotizacion = fechaCotizacion;
	}
	public String getDescripcion() {
		return descripcion;
	}
	public void setDescripcion(String descripcion) {
		this.descripcion = descripcion;
	}
	public String getMaterialesRequeridos() {
		return materialesRequeridos;
	}
	public void setMaterialesRequeridos(String materialesRequeridos) {
		this.materialesRequeridos = materialesRequeridos;
	}
	
	

}

package src.negocio;

public class OrdenModificacion {
	private Empleado encargado;
	private int cantidad;
	private Empleado autorizado;
	private String comentarios;
	private Prenda prenda;
	
	public OrdenModificacion(){}

	public Empleado getEncargado() {
		return encargado;
	}

	public void setEncargado(Empleado encargado) {
		this.encargado = encargado;
	}

	public int getCantidad() {
		return cantidad;
	}

	public void setCantidad(int cantidad) {
		this.cantidad = cantidad;
	}

	public Empleado getAutorizado() {
		return autorizado;
	}

	public void setAutorizado(Empleado autorizado) {
		this.autorizado = autorizado;
	}

	public String getComentarios() {
		return comentarios;
	}

	public void setComentarios(String comentarios) {
		this.comentarios = comentarios;
	}

	public Prenda getPrenda() {
		return prenda;
	}

	public void setPrenda(Prenda prenda) {
		this.prenda = prenda;
	}
	
	
	

}

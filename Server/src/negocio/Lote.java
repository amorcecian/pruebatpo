package src.negocio;

public class Lote {
	private int idLote;
	private Prenda prenda;
	private OrdenDeProduccion ordenDeProduccion;
	private int proceso;
	private String estado;
	private float costoProd;
	private Almacenamiento ubicacion;
	private int cantidadProducida;
	private int cantidadRestante;
	
	public Lote(){}

	public int getIdLote() {
		return idLote;
	}

	public void setIdLote(int idLote) {
		this.idLote = idLote;
	}

	public Prenda getPrenda() {
		return prenda;
	}

	public void setPrenda(Prenda prenda) {
		this.prenda = prenda;
	}

	public OrdenDeProduccion getOrdenDeProduccion() {
		return ordenDeProduccion;
	}

	public void setOrdenDeProduccion(OrdenDeProduccion ordenDeProduccion) {
		this.ordenDeProduccion = ordenDeProduccion;
	}

	public int getProceso() {
		return proceso;
	}

	public void setProceso(int proceso) {
		this.proceso = proceso;
	}

	public String getEstado() {
		return estado;
	}

	public void setEstado(String estado) {
		this.estado = estado;
	}

	public float getCostoProd() {
		return costoProd;
	}

	public void setCostoProd(float costoProd) {
		this.costoProd = costoProd;
	}

	public Almacenamiento getUbicacion() {
		return ubicacion;
	}

	public void setUbicacion(Almacenamiento ubicacion) {
		this.ubicacion = ubicacion;
	}

	public int getCantidadProducida() {
		return cantidadProducida;
	}

	public void setCantidadProducida(int cantidadProducida) {
		this.cantidadProducida = cantidadProducida;
	}

	public int getCantidadRestante() {
		return cantidadRestante;
	}

	public void setCantidadRestante(int cantidadRestante) {
		this.cantidadRestante = cantidadRestante;
	}
	
	

}

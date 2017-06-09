package src.negocio;

import java.util.List;

public class OrdenDeProduccion {
	private int idOrdenDeProduccion;
	private String fecha;
	private String tipo;
	private List<Prenda> prenda;
	private List<ItemOCMP> materiales;
	private Pedido pedido;
	private float precioProd;
	private List<Lote> lotes;
	
	public OrdenDeProduccion (){}

	public int getIdOrdenDeProduccion() {
		return idOrdenDeProduccion;
	}

	public void setIdOrdenDeProduccion(int idOrdenDeProduccion) {
		this.idOrdenDeProduccion = idOrdenDeProduccion;
	}

	public String getFecha() {
		return fecha;
	}

	public void setFecha(String fecha) {
		this.fecha = fecha;
	}

	public String getTipo() {
		return tipo;
	}

	public void setTipo(String tipo) {
		this.tipo = tipo;
	}

	public List<Prenda> getPrenda() {
		return prenda;
	}

	public void setPrenda(List<Prenda> prenda) {
		this.prenda = prenda;
	}

	public List<ItemOCMP> getMateriales() {
		return materiales;
	}

	public void setMateriales(List<ItemOCMP> materiales) {
		this.materiales = materiales;
	}

	public Pedido getPedido() {
		return pedido;
	}

	public void setPedido(Pedido pedido) {
		this.pedido = pedido;
	}

	public float getPrecioProd() {
		return precioProd;
	}

	public void setPrecioProd(float precioProd) {
		this.precioProd = precioProd;
	}

	public List<Lote> getLotes() {
		return lotes;
	}

	public void setLotes(List<Lote> lotes) {
		this.lotes = lotes;
	}
	
	

}

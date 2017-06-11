package negocio;

public class PrendaVenta {
	private int idPrendaVenta;
	private String estado;
	private Lote lote;
	
	public PrendaVenta(){}

	public int getIdPrendaVenta() {
		return idPrendaVenta;
	}

	public void setIdPrendaVenta(int idPrendaVenta) {
		this.idPrendaVenta = idPrendaVenta;
	}

	public String getEstado() {
		return estado;
	}

	public void setEstado(String estado) {
		this.estado = estado;
	}

	public Lote getLote() {
		return lote;
	}

	public void setLote(Lote lote) {
		this.lote = lote;
	}
	
	

}

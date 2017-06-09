package src.negocio;

import java.util.List;

public class Stock {
	private int idStock;
	private int cantidad;
	private List<PrendaVenta> prendasVenta;
	
	public Stock(){}

	public int getIdStock() {
		return idStock;
	}

	public void setIdStock(int idStock) {
		this.idStock = idStock;
	}

	public int getCantidad() {
		return cantidad;
	}

	public void setCantidad(int cantidad) {
		this.cantidad = cantidad;
	}

	public List<PrendaVenta> getPrendasVenta() {
		return prendasVenta;
	}

	public void setPrendasVenta(List<PrendaVenta> prendasVenta) {
		this.prendasVenta = prendasVenta;
	}
	
	

}

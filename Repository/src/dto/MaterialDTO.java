package dto;

import java.io.Serializable;

public class MaterialDTO implements Serializable{
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private Integer idMaterial;
	private String nombre;
	private Integer cantDisponible;
	private Integer cantReservada;
	private String proveedor;
	private float costo;
	
	
	
	
	public Integer getIdMaterial() {
		return idMaterial;
	}
	public void setIdMaterial(Integer idMaterial) {
		this.idMaterial = idMaterial;
	}
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public Integer getCantDisponible() {
		return cantDisponible;
	}
	public void setCantDisponible(Integer cantDisponible) {
		this.cantDisponible = cantDisponible;
	}
	public Integer getCantReservada() {
		return cantReservada;
	}
	public void setCantReservada(Integer cantReservada) {
		this.cantReservada = cantReservada;
	}
	public String getProveedor() {
		return proveedor;
	}
	public void setProveedor(String proveedor) {
		this.proveedor = proveedor;
	}
	public float getCosto() {
		return costo;
	}
	public void setCosto(float costo) {
		this.costo = costo;
	}
	
	
	
	
}

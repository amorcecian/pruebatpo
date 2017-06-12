package negocio;

import dto.MaterialDTO;
import entities.MaterialEntity;

public class Material {
	private Integer idMaterial;
	private String nombre;
	private Integer cantDisponible;
	private Integer cantReservada;
	private String proveedor;
	private float costo;
	
	public Material(){}

	public Material(MaterialEntity me) {
		this.setCantDisponible(me.getCantDisponible());
		this.setCantReservada(me.getCantReservada());
		this.setCosto(me.getCosto());
		this.setIdMaterial(me.getIdMaterial());
		this.setNombre(me.getNombre());
		this.setProveedores(me.getProveedor());
	}

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

	public String getProveedores() {
		return proveedor;
	}

	public void setProveedores(String proveedor) {
		this.proveedor = proveedor;
	}

	public float getCosto() {
		return costo;
	}

	public void setCosto(float costo) {
		this.costo = costo;
	}

	public MaterialDTO toDTO() {
		MaterialDTO maux = new MaterialDTO();
		maux.setCantDisponible(this.cantDisponible);
		maux.setCantReservada(this.getCantReservada());
		maux.setCosto(this.getCosto());
		maux.setIdMaterial(this.getIdMaterial());
		maux.setNombre(this.nombre);
		maux.setProveedor(this.getProveedores());
		return maux;
	}
	
	

}

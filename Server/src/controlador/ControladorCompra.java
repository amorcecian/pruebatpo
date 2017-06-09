package src.controlador;

import java.util.List;

import src.negocio.*;

public class ControladorCompra {
	private List<OrdenCMP> ordenesMP;
	private List<Proveedor> proveedores;
	private List<Material> materiales;
	
	private static ControladorCompra instancia;
	
	private static ControladorCompra getInstancia(){
		if(instancia==null){
			instancia=new ControladorCompra();
		}
		return instancia;
	}
	

}

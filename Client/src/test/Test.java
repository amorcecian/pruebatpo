package test;

import java.rmi.RemoteException;
import java.util.ArrayList;
import java.util.List;

import src.dto.ClienteDTO;
import src.dto.EmpleadoDTO;
import src.dto.SucursalDTO;
import src.exceptions.ExceptionCliente;
import src.businessDelegate.*;

public class Test {
	
	

	public static void main(String[] args) throws RemoteException, ExceptionCliente {		

		/*List<SucursalDTO> list=new ArrayList<SucursalDTO>();
		try{
			list=BusinessDelegate.getInstancia().listarSucursales();
			for(SucursalDTO sucu:list){
				System.out.println("Id Sucursal: "+sucu.getIdSucursal()+" Nombre:"+sucu.getNombre());
			}
		}catch(Exception e){
			e.printStackTrace();
		}*/
		/*
		ClienteDTO caux = new ClienteDTO();
		caux.setCondicion("activo");
		caux.setDireccion("mosconi 123");
		caux.setNombre("Juan Perez");
		caux.setCondicionPago("efectivo");
		caux.setLimiteCredito(314324);
		caux.setSaldo(34234);
		caux.setValorConsignacion(324234);
		caux.setIdSucu(1);
		BusinessDelegate.getInstancia().agregarCliente(caux);
		
		
		caux = BusinessDelegate.getInstancia().recuperarCliente(2);
		caux.setLimiteCredito(2000);
		BusinessDelegate.getInstancia().actualizarCliente(caux);
		
		for(ClienteDTO c :  BusinessDelegate.getInstancia().listarClientes()){
			System.out.println(c.getNombre());
		}
		
	*/
		EmpleadoDTO e = new EmpleadoDTO();
		e.setNombre("pepe argento234");
		e.setMail("a234j@123.com");
		e.setArea("area adm");
		e.setUser("pep21");
		e.setContrasenia("pass");
		e.setIdSucu(1);
		e.setIdUsuario(13);
	//	BusinessDelegate.getInstancia().agregarEmpleado(e);
		
		e = BusinessDelegate.getInstancia().recuperarEmpleado(3);
		e.setNombre("juan perez");
		BusinessDelegate.getInstancia().actualizarEmpleado(e);
		e = BusinessDelegate.getInstancia().recuperarEmpleado(3);
		System.out.println(e.getNombre());
		
		for(EmpleadoDTO es :  BusinessDelegate.getInstancia().listarEmpleados()){
			System.out.println(es.getArea()+es.getContrasenia()+es.getMail()+es.getNombre()+es.getUser()+es.getIdEmpleado()+es.getIdSucu()+es.getIdUsuario());
		}
	}

}

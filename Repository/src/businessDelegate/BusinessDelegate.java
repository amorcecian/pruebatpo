
package businessDelegate;

import java.rmi.Naming;
import java.rmi.RemoteException;
import java.util.List;

import dto.ClienteDTO;
import dto.EmpleadoDTO;
import dto.MaterialDTO;
import dto.SucursalDTO;
import exceptions.ExceptionCliente;
import interfaces.*;

public class BusinessDelegate implements IControllerVentas {
	
	private static BusinessDelegate instancia=null;
	private IControllerVentas objetoRemoto;
	
	
	public static BusinessDelegate getInstancia(){
		if(instancia==null){
			instancia=new BusinessDelegate();
		}
		return instancia;
	}
	
	public BusinessDelegate(){
		try{
			objetoRemoto=(IControllerVentas)Naming.lookup("//localhost/objetoRemoto");
		}catch(Exception e){
			e.printStackTrace();
		}
	}

	//@Override
	public List<SucursalDTO> listarSucursales() throws RemoteException {		
		return objetoRemoto.listarSucursales();
	}
	
	public void agregarCliente(ClienteDTO c) throws RemoteException, ExceptionCliente{
		objetoRemoto.agregarCliente(c);
	}

	public void actualizarCliente(ClienteDTO c) throws RemoteException, ExceptionCliente {
		objetoRemoto.actualizarCliente(c);
		
	}

	public ClienteDTO recuperarCliente(Integer i) throws RemoteException, ExceptionCliente {
		return objetoRemoto.recuperarCliente(i);
	}

	public List<ClienteDTO> listarClientes() throws RemoteException, ExceptionCliente {
		return objetoRemoto.listarClientes();
	}

	public void agregarEmpleado(EmpleadoDTO e) throws RemoteException, ExceptionCliente {
		objetoRemoto.agregarEmpleado(e);
		
	}

	public void actualizarEmpleado(EmpleadoDTO e) throws RemoteException, ExceptionCliente {
		objetoRemoto.actualizarEmpleado(e);
		
	}

	public EmpleadoDTO recuperarEmpleado(Integer i) throws RemoteException, ExceptionCliente {
		return objetoRemoto.recuperarEmpleado(i);
	}

	public List<EmpleadoDTO> listarEmpleados() throws RemoteException, ExceptionCliente {
		// TODO Auto-generated method stub
		return objetoRemoto.listarEmpleados();
	}

	public void agregarSucursal(SucursalDTO sucursal) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void agregarMaterial(MaterialDTO m) throws RemoteException, ExceptionCliente {
		objetoRemoto.agregarMaterial(m);
		
	}

	@Override
	public void actualizarMaterial(MaterialDTO m) throws RemoteException, ExceptionCliente {
		objetoRemoto.actualizarMaterial(m);
		
	}

	@Override
	public MaterialDTO recuperarMaterial(Integer i) throws RemoteException, ExceptionCliente {
		return objetoRemoto.recuperarMaterial(i);
	}

	@Override
	public List<MaterialDTO> listarMateriales() throws RemoteException, ExceptionCliente {
		return objetoRemoto.listarMateriales();
	}

}


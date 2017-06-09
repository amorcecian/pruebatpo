package src.objetoRemoto;

import java.rmi.RemoteException;
import java.rmi.server.UnicastRemoteObject;
import java.util.List;

import src.dto.ClienteDTO;
import src.dto.EmpleadoDTO;
import src.dto.SucursalDTO;
import src.exceptions.ExceptionCliente;
import src.interfaces.*;
import src.controlador.*;

public class ObjetoRemoto extends UnicastRemoteObject implements IControllerVentas {

	private static final long serialVersionUID = 2833723427294478879L;

	public ObjetoRemoto() throws RemoteException {
		super();
	}

	public List<SucursalDTO> listarSucursales() throws RemoteException {
		return ControladorVenta.getInstancia().listarSucursales();
	}

	public void agregarCliente(ClienteDTO cliente) throws ExceptionCliente{
		ControladorVenta.getInstancia().agregarCliente(cliente);
	}
	public void actualizarCliente(ClienteDTO cliente) throws ExceptionCliente{
		ControladorVenta.getInstancia().actualizarCliente(cliente);
	}

	public ClienteDTO recuperarCliente(Integer id) throws ExceptionCliente{
		return ControladorVenta.getInstancia().recuperarCliente(id);
	}
	
	public List<ClienteDTO> listarClientes() throws ExceptionCliente{
		return ControladorVenta.getInstancia().listarClientes();
	}

	public void agregarEmpleado(EmpleadoDTO e) throws RemoteException, ExceptionCliente {
		ControladorVenta.getInstancia().agregarEmpleado(e);
		
	}

	public void actualizarEmpleado(EmpleadoDTO e) throws RemoteException, ExceptionCliente {
		ControladorVenta.getInstancia().actualizarEmpleado(e);
		
	}

	public EmpleadoDTO recuperarEmpleado(Integer i) throws RemoteException, ExceptionCliente {
		return ControladorVenta.getInstancia().recuperarEmpleado(i);
	}

	public List<EmpleadoDTO> listarEmpleados() throws RemoteException, ExceptionCliente {
		// TODO Auto-generated method stub
		return ControladorVenta.getInstancia().listarEmpleados();
	}
	
}

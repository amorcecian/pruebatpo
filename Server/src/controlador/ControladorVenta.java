package controlador;

import java.util.List;
import java.util.Vector;

import negocio.*;
import dto.*;
import entities.EmpleadoEntity;
import exceptions.ExceptionCliente;
import exceptions.ExceptionSucursal;
import dao.*;

public class ControladorVenta {
	
	private List<Cliente> clientes;
	private List<Pedido> pedidos;
	private List<Empleado> empleados;
	private List<Factura> facturas;
	private List<Remito> remitos;
	private List<Sucursal> sucursales;
	private List<Prenda> prendas;
	private List<NotaDeCredito> notasDeCredito;
	
	private static ControladorVenta instancia;
	
	public static ControladorVenta getInstancia(){
		if(instancia==null){
			instancia=new ControladorVenta();
		}
		return instancia;
	}
	
	//*********************************************************************************
	//METODOS CLIENTE
	//*********************************************************************************
		//Agregar Cliente
	public void agregarCliente(String nombre, String direccion, String condicion, Integer idScurusal,
			float limiteCredito,String condicionPago,float saldo,float valorConsignacion) throws ExceptionCliente{
		Cliente c = new Cliente();
		CuentaCorriente cc = new CuentaCorriente(limiteCredito, condicionPago, saldo, valorConsignacion);
		Sucursal s = SucursalDAO.getInstancia().obtenerSucursal(idScurusal);
		c.setCondicion(condicion);
		c.setDireccion(direccion);
		c.setNombre(nombre);
		c.setCuentaCorriente(cc);
		c.setSucursal(s);
		c.setactivo(true);
		ClienteDAO.getInstance().grabarCliente(c);
	}
		//Recuperar Cliente
	public ClienteDTO recuperarCliente(Integer idCliente) throws ExceptionCliente{
		return ClienteDAO.getInstance().recuperarCliente(idCliente).toDTO();
	}
		//Eliminar Cliente
	public void eliminarCliente(Integer idCliente) throws ExceptionCliente{
		Cliente cliente = ClienteDAO.getInstance().recuperarCliente(idCliente);
		ClienteDAO.getInstance().eliminarCliente(cliente);
	}
	
	//Agrego un cliente 
	public void agregarCliente(ClienteDTO cliente) throws ExceptionCliente {
		Cliente c = new Cliente();
		CuentaCorriente cc = new CuentaCorriente(cliente.getLimiteCredito(), cliente.getCondicionPago(), cliente.getSaldo(), cliente.getValorConsignacion());
		Sucursal s = SucursalDAO.getInstancia().obtenerSucursal(cliente.getIdSucu());
		c.setCondicion(cliente.getCondicion());
		c.setDireccion(cliente.getDireccion());
		c.setNombre(cliente.getNombre());
		c.setCuentaCorriente(cc);
		c.setSucursal(s);
		c.setactivo(true);
		ClienteDAO.getInstance().grabarCliente(c);
		
	}
	
	//Actualizo clientes
	public void actualizarCliente(ClienteDTO cliente) throws ExceptionCliente{
		Cliente c = new Cliente();
		CuentaCorriente cc = new CuentaCorriente(cliente.getLimiteCredito(), cliente.getCondicionPago(), cliente.getSaldo(), cliente.getValorConsignacion());
		Sucursal s = SucursalDAO.getInstancia().obtenerSucursal(cliente.getIdSucu());
		c.setCondicion(cliente.getCondicion());
		c.setDireccion(cliente.getDireccion());
		c.setNombre(cliente.getNombre());
		c.setCuentaCorriente(cc);
		c.setSucursal(s);
		c.setactivo(true);
		c.setIdCliente(cliente.getIdCliente());
		ClienteDAO.getInstance().actualizarCliente(c);
	}
	
	
	//Listar Todos Clientes
	
	public List<ClienteDTO> listarClientes() throws ExceptionCliente{
		List<ClienteDTO> listaux = ClienteDAO.getInstance().listarClientes();
		return listaux;
	
	}
	
	
	
	//*********************************************************************************
	//METODOS SUCURSAL
	//*********************************************************************************	
		//Agregar Sucursal
	public void agregarSucursal(SucursalDTO sucursal) {
		Sucursal sucu = new Sucursal(sucursal.getIdSucursal(),sucursal.getNombre(),sucursal.getDomicilio(),sucursal.getHorario());
		SucursalDAO.getInstancia().agregarSucursal(sucu);
	}
	
		//Recuperar Sucursal
	public Sucursal recuperarSucursal(Integer idSucursal){
		return SucursalDAO.getInstancia().obtenerSucursal(idSucursal);
	}
	
	public List<SucursalDTO> listarSucursales(){
		return SucursalDAO.getInstancia().listarSucursales();	
	}
	
	/*
	public void asignarEncargado(Integer idEncargado){
		SucursalDAO.getInstancia().asignarEncargado(idEncargado);
	}
	*/
	//*********************************************************************************
	//METODOS EMPLEADO
	//*********************************************************************************	
		//Agregar Empleado
	/*public void agregarEmpleado(String nombre,String mail,String area,String user,String contraseņa,
			Integer idSucursal){
		Sucursal sucursal = SucursalDAO.getInstancia().obtenerSucursal(idSucursal);
		Empleado empleado = new Empleado(nombre, mail, area, user, contraseņa, sucursal);
		EmpleadoDAO.getInstancia().grabarEmpleado(empleado);
	}*/
	
	
	

	
	public int generarPedido(int idCliente, int idSucursal, String fechaGeneracion){
		return 0;
	}

	public void agregarEmpleado(EmpleadoDTO e) {
		Sucursal sucursal = SucursalDAO.getInstancia().obtenerSucursal(e.getIdSucu());
		Empleado empleado = new Empleado();
		empleado.setNombre(e.getNombre());
		empleado.setMail(e.getMail());
		empleado.setArea(e.getArea());
		empleado.setUser(e.getUser());
		empleado.setContrasenia(e.getContrasenia());
		empleado.setSucursal(sucursal);
		empleado.setActivo(true);
		empleado.setIdUsuario(e.getIdUsuario());
		EmpleadoDAO.getInstancia().grabarEmpleado(empleado);
		
	}

	public void actualizarEmpleado(EmpleadoDTO e) {
		
		Empleado em = new Empleado();
		Sucursal s = SucursalDAO.getInstancia().obtenerSucursal(e.getIdSucu());
		em.setArea(e.getArea());
		em.setContrasenia(e.getContrasenia());
		em.setIdUsuario(e.getIdUsuario());
		em.setMail(e.getMail());
		em.setNombre(e.getNombre());
		em.setSucursal(s);
		em.setUser(e.getUser());
		em.setActivo(e.isActivo());
		em.setIdEmpleado(e.getIdEmpleado());
		EmpleadoDAO.getInstancia().actualizarEmpleado(em);
	}
	
	public EmpleadoDTO recuperarEmpleado(Integer idEmpleado){
		return EmpleadoDAO.getInstancia().recuperarEmpleado(idEmpleado).toDTO();
	}

	public List<EmpleadoDTO> listarEmpleados() {
		List<EmpleadoDTO> aux = new Vector<EmpleadoDTO>();
		for(EmpleadoEntity e:EmpleadoDAO.getInstancia().listarEmpleados())
			aux.add(e.toDTO());
		return aux;	
	}


}

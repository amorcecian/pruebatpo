package view;

import java.awt.EventQueue;
import java.util.List;
import java.util.Vector;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JList;
import javax.swing.JComboBox;
import javax.swing.JButton;

import src.businessDelegate.BusinessDelegate;
import src.dto.SucursalDTO;

public class AltaEmpleado {

	private JFrame frmAltaEmpleado;
	private JTextField txtNombre;
	private JTextField txtMail;
	private JLabel lblArea;
	private JTextField textArea;
	private JLabel lblUsuario;
	private JTextField txtUsuario;
	private JLabel lblContrasea;
	private JTextField txtContraseña;
	private JLabel lblSucursal;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					AltaEmpleado window = new AltaEmpleado();
					window.frmAltaEmpleado.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public AltaEmpleado() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frmAltaEmpleado = new JFrame();
		frmAltaEmpleado.setTitle("Alta Empleado");
		frmAltaEmpleado.setBounds(100, 100, 450, 300);
		frmAltaEmpleado.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frmAltaEmpleado.getContentPane().setLayout(null);
		frmAltaEmpleado.setLocationRelativeTo(null);
		
		JLabel lblNombre = new JLabel("Nombre:");
		lblNombre.setBounds(22, 35, 90, 14);
		frmAltaEmpleado.getContentPane().add(lblNombre);
		
		txtNombre = new JTextField();
		txtNombre.setBounds(122, 32, 180, 20);
		frmAltaEmpleado.getContentPane().add(txtNombre);
		txtNombre.setColumns(10);
		
		JLabel lblMail = new JLabel("Mail:");
		lblMail.setBounds(22, 63, 90, 14);
		frmAltaEmpleado.getContentPane().add(lblMail);
		
		txtMail = new JTextField();
		txtMail.setBounds(122, 60, 180, 20);
		frmAltaEmpleado.getContentPane().add(txtMail);
		txtMail.setColumns(10);
		
		lblArea = new JLabel("Area:");
		lblArea.setBounds(22, 91, 90, 14);
		frmAltaEmpleado.getContentPane().add(lblArea);
		
		textArea = new JTextField();
		textArea.setBounds(122, 88, 180, 20);
		frmAltaEmpleado.getContentPane().add(textArea);
		textArea.setColumns(10);
		
		lblUsuario = new JLabel("Usuario:");
		lblUsuario.setBounds(22, 126, 90, 14);
		frmAltaEmpleado.getContentPane().add(lblUsuario);
		
		txtUsuario = new JTextField();
		txtUsuario.setBounds(122, 123, 180, 20);
		frmAltaEmpleado.getContentPane().add(txtUsuario);
		txtUsuario.setColumns(10);
		
		lblContrasea = new JLabel("Contrase\u00F1a:");
		lblContrasea.setBounds(22, 159, 90, 14);
		frmAltaEmpleado.getContentPane().add(lblContrasea);
		
		txtContraseña = new JTextField();
		txtContraseña.setBounds(122, 156, 180, 20);
		frmAltaEmpleado.getContentPane().add(txtContraseña);
		txtContraseña.setColumns(10);
		
		lblSucursal = new JLabel("Sucursal:");
		lblSucursal.setBounds(22, 199, 90, 14);
		frmAltaEmpleado.getContentPane().add(lblSucursal);
		
		
		try{
		List<SucursalDTO> listaSucursales=BusinessDelegate.getInstancia().listarSucursales();		
		JComboBox comboBox = new JComboBox();
		comboBox.setBounds(122, 195, 180, 22);	
		comboBox.addItem("");
		for(SucursalDTO sucu:listaSucursales){
			comboBox.addItem(sucu);			
		}
		frmAltaEmpleado.getContentPane().add(comboBox);
		}catch(Exception e){
			e.printStackTrace();
		}
		
		JButton btnCargar = new JButton("Cargar");
		btnCargar.setBounds(318, 239, 91, 23);
		frmAltaEmpleado.getContentPane().add(btnCargar);
	}
}

import java.awt.BorderLayout;
import java.awt.EventQueue;
import java.util.List;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.border.EtchedBorder;
import javax.swing.JLabel;
import javax.swing.JComboBox;

import dto.ClienteDTO;
import dto.SucursalDTO;
import businessDelegate.BusinessDelegate;

import javax.swing.JButton;
import javax.swing.JTextField;


public class ModificarCliente extends JFrame {

	private JPanel contentPane;
	private JTextField textField;
	private JTextField textField_1;
	private JTextField textField_2;
	private JTextField textField_3;
	private JTextField textField_4;
	private JTextField textField_5;
	private JTextField textField_6;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					ModificarCliente frame = new ModificarCliente();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public ModificarCliente() {
		setTitle("Modificar Cliente");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 453);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		setLocationRelativeTo(null);
		
		
		try{
			JLabel lblClientes = new JLabel("Clientes:");
			lblClientes.setBounds(23, 30, 97, 14);
			contentPane.add(lblClientes);
			
			JComboBox comboBox = new JComboBox();
			comboBox.setBounds(130, 26, 205, 22);
			comboBox.addItem("");
			List <ClienteDTO> lstClientes=BusinessDelegate.getInstancia().listarClientes();
			for(ClienteDTO cliente:lstClientes){
				comboBox.addItem(cliente.getNombre());
			}
			contentPane.add(comboBox);
			
			JLabel lblNombre = new JLabel("Nombre:");
			lblNombre.setBounds(23, 66, 97, 14);
			contentPane.add(lblNombre);
			
			JLabel lblDireccion = new JLabel("Direccion:");
			lblDireccion.setBounds(23, 107, 97, 14);
			contentPane.add(lblDireccion);
			
			JLabel lblCondicion = new JLabel("Condicion:");
			lblCondicion.setBounds(23, 148, 97, 14);
			contentPane.add(lblCondicion);
			
			JLabel lblLimiteCredito = new JLabel("Limite Credito:");
			lblLimiteCredito.setBounds(23, 193, 97, 14);
			contentPane.add(lblLimiteCredito);
			
			JLabel lblCondicionDePago = new JLabel("Condici\u00F3n de Pago:");
			lblCondicionDePago.setBounds(23, 234, 97, 14);
			contentPane.add(lblCondicionDePago);
			
			JLabel lblSaldo = new JLabel("Saldo:");
			lblSaldo.setBounds(23, 276, 97, 14);
			contentPane.add(lblSaldo);
			
			JLabel lblValorConsignacin = new JLabel("Valor Consignaci\u00F3n:");
			lblValorConsignacin.setBounds(23, 310, 97, 14);
			contentPane.add(lblValorConsignacin);
			
			
			JButton btnModificar = new JButton("Modificar");
			btnModificar.setBounds(289, 392, 91, 23);
			contentPane.add(btnModificar);
			
			textField = new JTextField();
			textField.setBounds(130, 63, 205, 20);
			contentPane.add(textField);
			textField.setColumns(10);
			
			textField_1 = new JTextField();
			textField_1.setColumns(10);
			textField_1.setBounds(130, 104, 205, 20);
			contentPane.add(textField_1);
			
			textField_2 = new JTextField();
			textField_2.setColumns(10);
			textField_2.setBounds(130, 145, 205, 20);
			contentPane.add(textField_2);
			
			textField_3 = new JTextField();
			textField_3.setColumns(10);
			textField_3.setBounds(130, 190, 205, 20);
			contentPane.add(textField_3);
			
			textField_4 = new JTextField();
			textField_4.setColumns(10);
			textField_4.setBounds(130, 231, 205, 20);
			contentPane.add(textField_4);
			
			textField_5 = new JTextField();
			textField_5.setColumns(10);
			textField_5.setBounds(130, 273, 205, 20);
			contentPane.add(textField_5);
			
			textField_6 = new JTextField();
			textField_6.setColumns(10);
			textField_6.setBounds(130, 304, 205, 20);
			contentPane.add(textField_6);
			
			
			
			try{
				JLabel lblSucursal = new JLabel("Sucursal:");
				lblSucursal.setBounds(23, 351, 97, 14);
				contentPane.add(lblSucursal);
				
				JComboBox comboBox_1 = new JComboBox();
				comboBox_1.setBounds(130, 347, 205, 22);
				comboBox_1.addItem("");
				List <SucursalDTO> lstSucursales=BusinessDelegate.getInstancia().listarSucursales();
				for(SucursalDTO sucursal:lstSucursales){
					comboBox_1.addItem(sucursal.getNombre());
				}
				contentPane.add(comboBox_1);
				
			}catch(Exception e){
				e.printStackTrace();
			}

			
		}catch(Exception e){
			e.printStackTrace();
		}

	}
}

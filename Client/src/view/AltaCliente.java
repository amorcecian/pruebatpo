

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JButton;
import javax.swing.JComboBox;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class AltaCliente extends JFrame {

	private JPanel contentPane;
	private JTextField txtNombre;
	private JTextField txtDireccion;
	private JTextField txtCondicion;
	private JTextField txtLimiteCredito;
	private JTextField txtCondPago;
	private JTextField txtSaldo;
	private JTextField txtValorConsig;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					AltaCliente frame = new AltaCliente();
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
	public AltaCliente() {
		setTitle("Alta Cliente");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 451);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNombre = new JLabel("Nombre:");
		lblNombre.setBounds(20, 30, 126, 14);
		contentPane.add(lblNombre);
		
		JLabel lblDireccion = new JLabel("Direccion:");
		lblDireccion.setBounds(20, 74, 126, 14);
		contentPane.add(lblDireccion);
		
		JLabel lblCondicion = new JLabel("Condicion:");
		lblCondicion.setBounds(20, 118, 126, 14);
		contentPane.add(lblCondicion);
		
		JLabel lblLimiteCredito = new JLabel("Limite Credito:");
		lblLimiteCredito.setBounds(20, 162, 126, 14);
		contentPane.add(lblLimiteCredito);
		
		JLabel lblCondicinDePago = new JLabel("Condici\u00F3n de Pago:");
		lblCondicinDePago.setBounds(20, 206, 126, 14);
		contentPane.add(lblCondicinDePago);
		
		JLabel lblSaldo = new JLabel("Saldo:");
		lblSaldo.setBounds(20, 250, 126, 14);
		contentPane.add(lblSaldo);
		
		JLabel lblValorConsignacin = new JLabel("Valor Consignaci\u00F3n:");
		lblValorConsignacin.setBounds(20, 294, 126, 14);
		contentPane.add(lblValorConsignacin);
		
		JLabel lblSucursal = new JLabel("Sucursal:");
		lblSucursal.setBounds(20, 338, 126, 14);
		contentPane.add(lblSucursal);
		
		txtNombre = new JTextField();
		txtNombre.setBounds(181, 27, 203, 20);
		contentPane.add(txtNombre);
		txtNombre.setColumns(10);
		
		txtDireccion = new JTextField();
		txtDireccion.setColumns(10);
		txtDireccion.setBounds(181, 71, 203, 20);
		contentPane.add(txtDireccion);
		
		txtCondicion = new JTextField();
		txtCondicion.setColumns(10);
		txtCondicion.setBounds(181, 115, 203, 20);
		contentPane.add(txtCondicion);
		
		txtLimiteCredito = new JTextField();
		txtLimiteCredito.setColumns(10);
		txtLimiteCredito.setBounds(181, 159, 203, 20);
		contentPane.add(txtLimiteCredito);
		
		txtCondPago = new JTextField();
		txtCondPago.setColumns(10);
		txtCondPago.setBounds(181, 203, 203, 20);
		contentPane.add(txtCondPago);
		
		txtSaldo = new JTextField();
		txtSaldo.setColumns(10);
		txtSaldo.setBounds(181, 247, 203, 20);
		contentPane.add(txtSaldo);
		
		txtValorConsig = new JTextField();
		txtValorConsig.setColumns(10);
		txtValorConsig.setBounds(181, 291, 203, 20);
		contentPane.add(txtValorConsig);
		
		JButton btnAlta = new JButton("Alta");
		btnAlta.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				
			}
		});
		btnAlta.setBounds(341, 395, 91, 23);
		contentPane.add(btnAlta);
		
		JComboBox comboSucursal = new JComboBox();
		comboSucursal.setBounds(181, 334, 203, 22);
		contentPane.add(comboSucursal);
	}

}

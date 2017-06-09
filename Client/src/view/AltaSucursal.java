

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JButton;

import businessDelegate.BusinessDelegate;
import dto.SucursalDTO;

import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class AltaSucursal extends JFrame {

	private JPanel contentPane;
	private JTextField txtNombre;
	private JTextField txtDomicilio;
	private JTextField txtHorario;
	private JButton btnAlta;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					AltaSucursal frame = new AltaSucursal();
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
	public AltaSucursal() {
		setTitle("Alta Sucursal");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 204);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNombre = new JLabel("Nombre:");
		lblNombre.setBounds(10, 27, 41, 14);
		contentPane.add(lblNombre);
		
		JLabel lblDomicilio = new JLabel("Domicilio:");
		lblDomicilio.setBounds(10, 54, 44, 14);
		contentPane.add(lblDomicilio);
		
		JLabel lblHorario = new JLabel("Horario:");
		lblHorario.setBounds(10, 79, 85, 14);
		contentPane.add(lblHorario);
		
		txtNombre = new JTextField();
		txtNombre.setBounds(94, 24, 208, 20);
		contentPane.add(txtNombre);
		txtNombre.setColumns(10);
		
		txtDomicilio = new JTextField();
		txtDomicilio.setColumns(10);
		txtDomicilio.setBounds(94, 51, 208, 20);
		contentPane.add(txtDomicilio);
		
		txtHorario = new JTextField();
		txtHorario.setColumns(10);
		txtHorario.setBounds(94, 76, 208, 20);
		contentPane.add(txtHorario);
		
		btnAlta = new JButton("Alta");
		btnAlta.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				SucursalDTO sucursal=new SucursalDTO(txtNombre.getText(),txtDomicilio.getText(),txtHorario.getText());
				//Agregar Sucursal
				
			}
		});
		btnAlta.setBounds(284, 120, 91, 23);
		contentPane.add(btnAlta);
	}

}

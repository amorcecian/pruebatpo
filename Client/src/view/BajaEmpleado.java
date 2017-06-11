package view;


import java.awt.BorderLayout;
import java.awt.EventQueue;
import java.util.List;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JComboBox;
import javax.swing.JButton;

import businessDelegate.BusinessDelegate;
import dto.EmpleadoDTO;

public class BajaEmpleado extends JFrame {

	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					BajaEmpleado frame = new BajaEmpleado();
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
	public BajaEmpleado() {
		setTitle("Baja Empleado");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 154);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblEmpleados = new JLabel("Empleados:");
		lblEmpleados.setBounds(30, 31, 99, 14);
		contentPane.add(lblEmpleados);
		
		
		try{
			JComboBox lstEmpleados = new JComboBox();
			lstEmpleados.setBounds(139, 27, 229, 22);
			List<EmpleadoDTO> lstEmpleado=BusinessDelegate.getInstancia().listarEmpleados();
			for(EmpleadoDTO emp:lstEmpleado){
				lstEmpleados.addItem(emp.getNombre());
			}
			contentPane.add(lstEmpleados);			
		}catch(Exception e){
			e.printStackTrace();
		}
		
		JButton btnEliminar = new JButton("Eliminar");
		btnEliminar.setBounds(319, 79, 91, 23);
		contentPane.add(btnEliminar);
	}

}

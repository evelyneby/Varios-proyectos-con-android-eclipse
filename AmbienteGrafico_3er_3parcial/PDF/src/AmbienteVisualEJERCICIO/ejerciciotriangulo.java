package AmbienteVisualEJERCICIO;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JButton;

import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JTextField;

public class ejerciciotriangulo extends JFrame {

	triangulo T1=new triangulo();
	
	private JPanel contentPane;
	private JTextField txtBase;
	private JTextField txtAltura;
	private JTextField txtArea;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					ejerciciotriangulo frame = new ejerciciotriangulo();
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
	public ejerciciotriangulo() {
		setTitle("CALCULA AREA");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblBase = new JLabel("base");
		lblBase.setBounds(10, 31, 46, 14);
		contentPane.add(lblBase);
		
		JLabel lblAltura = new JLabel("altura");
		lblAltura.setBounds(10, 73, 46, 14);
		contentPane.add(lblAltura);
		
		JLabel lblArea = new JLabel("area");
		lblArea.setBounds(10, 130, 46, 14);
		contentPane.add(lblArea);
		
		JButton btnGuardar = new JButton("GUARDAR");
		btnGuardar.addActionListener(new ActionListener() {
			
			public void actionPerformed(ActionEvent arg0) {
				double base, altura;
				
				base=Double.parseDouble(txtBase.getText());
				altura=Double.parseDouble(txtAltura.getText());
				T1.setbase(base);
				T1.setaltura(altura);
			}
		});
		btnGuardar.setBounds(10, 166, 130, 23);
		contentPane.add(btnGuardar);
		
		txtBase = new JTextField();
		txtBase.setBounds(44, 28, 86, 20);
		contentPane.add(txtBase);
		txtBase.setColumns(10);
		
		txtAltura = new JTextField();
		txtAltura.setBounds(44, 70, 86, 20);
		contentPane.add(txtAltura);
		txtAltura.setColumns(10);
		
		txtArea = new JTextField();
		txtArea.setBounds(44, 127, 86, 20);
		contentPane.add(txtArea);
		txtArea.setColumns(10);
		
		JButton btnCalcular = new JButton("CALCULAR");
		btnCalcular.addActionListener(new ActionListener() {
			
			public void actionPerformed(ActionEvent arg0) {
				
				
				double area;
				area=T1.calcula_area();
				txtArea.setText(String.valueOf(area));
			}
		});
		btnCalcular.setBounds(206, 166, 130, 23);
		contentPane.add(btnCalcular);
		
		JButton btnSalir = new JButton("salir");
		btnSalir.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				System.exit(0);
			}
		});
		btnSalir.setBounds(335, 227, 89, 23);
		contentPane.add(btnSalir);
		
		JButton btnLimpiar = new JButton("LIMPIAR");
		btnLimpiar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String limpiar="";
				
				txtAltura.setText(String.valueOf(limpiar));
				txtBase.setText(String.valueOf(limpiar));
				txtArea.setText(String.valueOf(limpiar));
			}
		});
		btnLimpiar.setBounds(10, 215, 89, 23);
		contentPane.add(btnLimpiar);
	}
}

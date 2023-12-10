package figurasAmbienteGrafico;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JButton;

import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.Color;
import java.awt.SystemColor;

import javax.swing.JMenuItem;

import java.awt.Font;

import javax.swing.JComboBox;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JMenuBar;
import javax.swing.JMenu;

public class FIGURAS extends JFrame {

	prueba_triangulo ft=new prueba_triangulo();
	prueba_circulo fc=new prueba_circulo();
	prueba_cuadrado fcua=new prueba_cuadrado();
	prueba_rectangulo fr=new prueba_rectangulo();
	
	
	   
	private JPanel contentPane;

	private JMenuBar mb;
	private JMenu Opciones;
	private JMenuItem triangulo,circulo,rectangulo, cuadrado;
	
	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					FIGURAS frame = new FIGURAS();
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
	public FIGURAS() {
		setTitle("FIGURAS :D");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 486, 321);
		
		JMenuBar menuBar = new JMenuBar();
		setJMenuBar(menuBar);
		
		JMenu JMenuOpciones = new JMenu("opciones");
		menuBar.add(JMenuOpciones);
		
		JMenuItem JMItriangulo = new JMenuItem("triangulo");
		JMenuOpciones.add(JMItriangulo);
		
		JMenuItem JMIcirculo = new JMenuItem("circulo");
		JMenuOpciones.add(JMIcirculo);
		
		JMenuItem JMIrectangulo = new JMenuItem("rectangulo");
		JMenuOpciones.add(JMIrectangulo);
		
		JMenuItem JMICuadrado = new JMenuItem("cuadrado");
		JMenuOpciones.add(JMICuadrado);
		contentPane = new JPanel();
		contentPane.setBackground(SystemColor.activeCaption);
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JButton btnSalir = new JButton("SALIR");
		btnSalir.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				System.exit(0);
			}
		});
		btnSalir.setBounds(449, 638, 89, 23);
		contentPane.add(btnSalir);
		
		JButton btnSalir_1 = new JButton("SALIR");
		btnSalir_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				System.exit(0);
			}
		});
		btnSalir_1.setBounds(351, 232, 89, 23);
		contentPane.add(btnSalir_1);
		
		JLabel lblEligeUnaOpcion = new JLabel("elige una opcion");
		lblEligeUnaOpcion.setFont(new Font("Tahoma", Font.PLAIN, 20));
		lblEligeUnaOpcion.setBounds(176, 168, 173, 33);
		contentPane.add(lblEligeUnaOpcion);
		
		JLabel lblSoloPuedesElegir = new JLabel("SOLO PUEDES ELEGIR:");
		lblSoloPuedesElegir.setBounds(10, 118, 172, 14);
		contentPane.add(lblSoloPuedesElegir);
		
		JLabel lblTriangulo = new JLabel("TRIANGULO");
		lblTriangulo.setBounds(10, 143, 82, 14);
		contentPane.add(lblTriangulo);
		
		JLabel lblCirculo = new JLabel("CIRCULO");
		lblCirculo.setBounds(10, 168, 82, 14);
		contentPane.add(lblCirculo);
		
		JLabel lblRectangulo = new JLabel("RECTANGULO");
		lblRectangulo.setBounds(10, 193, 82, 14);
		contentPane.add(lblRectangulo);
		
		JLabel lblCuadrado = new JLabel("CUADRADO");
		lblCuadrado.setBounds(10, 218, 82, 14);
		contentPane.add(lblCuadrado);
		
		
	}
}

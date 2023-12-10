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
import javax.swing.JMenuBar;
import javax.swing.JMenu;
import javax.swing.JMenuItem;

public class prueba_circulo extends JFrame {
	
	circulo cir=new circulo();
	
	private JPanel contentPane;
	private JTextField txtRadio;
	private JTextField txtPerimetro;
	private JTextField txtArea;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					prueba_circulo frame = new prueba_circulo();
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
	public prueba_circulo() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 367, 388);
		
		JMenuBar menuBar = new JMenuBar();
		setJMenuBar(menuBar);
		
		JMenu mnOpciones = new JMenu("OPCIONES");
		menuBar.add(mnOpciones);
		
		JMenuItem mntmGuardar = new JMenuItem("guardar");
		mntmGuardar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				double radio;
				
				radio=Double.parseDouble(txtRadio.getText());
				cir.setRadio(radio);
			}
		});
		mnOpciones.add(mntmGuardar);
		
		JMenuItem mntmCalcular = new JMenuItem("calcular");
		mntmCalcular.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				double perimetro;
				perimetro=cir.calcular_perimetro(cir.getRadio());
				
				txtPerimetro.setText(String.valueOf(perimetro));
				double area;
				area=cir.calcular_area(cir.getRadio());
				txtArea.setText(String.valueOf(area));
			}
		});
		mnOpciones.add(mntmCalcular);
		
		JMenuItem mntmRegresarAlMenu = new JMenuItem("regresar al menu");
		mntmRegresarAlMenu.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				MENUFIGURAS F=new MENUFIGURAS();
			F.show();
			dispose();
			}
		});
		mnOpciones.add(mntmRegresarAlMenu);
		
		JMenuItem mntmLimpiar = new JMenuItem("limpiar");
		mntmLimpiar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				String limpiar="";
				
				txtRadio.setText(String.valueOf(limpiar));
				txtPerimetro.setText(String.valueOf(limpiar));
				txtArea.setText(String.valueOf(limpiar));
			}
		});
		mnOpciones.add(mntmLimpiar);
		
		JMenuItem mntmSalir = new JMenuItem("salir");
		mntmSalir.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				System.exit(0);
			}
		});
		mnOpciones.add(mntmSalir);
		contentPane = new JPanel();
		contentPane.setBackground(new Color(0, 0, 0));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JPanel panel = new JPanel();
		panel.setBackground(SystemColor.text);
		panel.setLayout(null);
		panel.setBounds(10, 11, 331, 290);
		contentPane.add(panel);
		
		JLabel label = new JLabel("CIRCULO");
		label.setBounds(73, 11, 78, 14);
		panel.add(label);
		
		JLabel label_1 = new JLabel("RADIO");
		label_1.setBounds(10, 41, 62, 14);
		panel.add(label_1);
		
		txtRadio = new JTextField();
		txtRadio.setColumns(10);
		txtRadio.setBounds(133, 38, 86, 20);
		panel.add(txtRadio);
		
		JLabel lblResultadoPerimetro = new JLabel(" Resultado perimetro");
		lblResultadoPerimetro.setBounds(10, 121, 129, 14);
		panel.add(lblResultadoPerimetro);
		
		txtPerimetro = new JTextField();
		txtPerimetro.setColumns(10);
		txtPerimetro.setBounds(133, 118, 86, 20);
		panel.add(txtPerimetro);
		
		JButton button = new JButton("GUARDAR");
		button.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				double radio;
				
				radio=Double.parseDouble(txtRadio.getText());
				cir.setRadio(radio);
			}
		});
		button.setBounds(10, 83, 113, 23);
		panel.add(button);
		
		JButton button_1 = new JButton("LIMPIAR");
		button_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				String limpiar="";
				
				txtRadio.setText(String.valueOf(limpiar));
				txtPerimetro.setText(String.valueOf(limpiar));
				txtArea.setText(String.valueOf(limpiar));
			}
		});
		button_1.setBounds(133, 256, 89, 23);
		panel.add(button_1);
		
		JButton btnCalcular = new JButton("CALCULAR");
		btnCalcular.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				double perimetro;
				perimetro=cir.calcular_perimetro(cir.getRadio());
				
				txtPerimetro.setText(String.valueOf(perimetro));
				double area;
				area=cir.calcular_area(cir.getRadio());
				txtArea.setText(String.valueOf(area));
			}
		});
		btnCalcular.setBounds(10, 201, 141, 23);
		panel.add(btnCalcular);
		
		JButton button_4 = new JButton("SALIR");
		button_4.setBounds(232, 256, 89, 23);
		panel.add(button_4);
		
		JButton btnRegresar = new JButton("REGRESAR");
		btnRegresar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				MENUFIGURAS F=new MENUFIGURAS();
			F.show();
			dispose();
			}
		});
		btnRegresar.setBounds(10, 256, 113, 23);
		panel.add(btnRegresar);
		
		JLabel lblResultadoArea = new JLabel("Resultado Area");
		lblResultadoArea.setBounds(10, 160, 102, 14);
		panel.add(lblResultadoArea);
		
		txtArea = new JTextField();
		txtArea.setBounds(133, 157, 86, 20);
		panel.add(txtArea);
		txtArea.setColumns(10);
		button_4.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				System.exit(0);
			}
		});
	}
}

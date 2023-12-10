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

public class prueba_triangulo extends JFrame {
	
	triangulo t=new triangulo();

	private JPanel contentPane;
	private JTextField txtBase;
	private JTextField txtAltura;
	private JTextField txtLado1;
	private JTextField txtLado2;
	private JTextField txtLado3;
	private JTextField txtPerimetro;
	private JTextField txtArea;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					prueba_triangulo frame = new prueba_triangulo();
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
	public prueba_triangulo() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 392, 467);
		contentPane = new JPanel();
		contentPane.setBackground(SystemColor.desktop);
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JPanel panel = new JPanel();
		panel.setBackground(SystemColor.text);
		panel.setLayout(null);
		panel.setBounds(10, 40, 355, 354);
		contentPane.add(panel);
		
		JLabel label = new JLabel("TRIANGULO");
		label.setBounds(87, 0, 91, 14);
		panel.add(label);
		
		JLabel label_1 = new JLabel("BASE");
		label_1.setBounds(10, 21, 66, 14);
		panel.add(label_1);
		
		JLabel label_2 = new JLabel("ALTURA");
		label_2.setBounds(10, 46, 66, 14);
		panel.add(label_2);
		
		JLabel lblResultadoPerimetro = new JLabel("resultado perimetro");
		lblResultadoPerimetro.setBounds(10, 210, 116, 14);
		panel.add(lblResultadoPerimetro);
		
		JLabel label_4 = new JLabel("M.LADO1");
		label_4.setBounds(10, 77, 66, 14);
		panel.add(label_4);
		
		JLabel label_5 = new JLabel("M. LADO2");
		label_5.setBounds(10, 108, 66, 14);
		panel.add(label_5);
		
		JLabel lblMLado = new JLabel("M. LADO3");
		lblMLado.setBounds(10, 139, 66, 14);
		panel.add(lblMLado);
		
		txtBase = new JTextField();
		txtBase.setColumns(10);
		txtBase.setBounds(86, 18, 86, 20);
		panel.add(txtBase);
		
		txtAltura = new JTextField();
		txtAltura.setColumns(10);
		txtAltura.setBounds(86, 43, 86, 20);
		panel.add(txtAltura);
		
		txtLado1 = new JTextField();
		txtLado1.setColumns(10);
		txtLado1.setBounds(87, 74, 86, 20);
		panel.add(txtLado1);
		
		txtLado2 = new JTextField();
		txtLado2.setColumns(10);
		txtLado2.setBounds(87, 105, 86, 20);
		panel.add(txtLado2);
		
		txtLado3 = new JTextField();
		txtLado3.setColumns(10);
		txtLado3.setBounds(87, 136, 86, 20);
		panel.add(txtLado3);
		
		txtPerimetro = new JTextField();
		txtPerimetro.setColumns(10);
		txtPerimetro.setBounds(136, 207, 110, 20);
		panel.add(txtPerimetro);
		
		JButton btnCalcular = new JButton("CALCULAR");
		btnCalcular.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				double perimetro, area;
				
				perimetro=t.calcula_perimetro(t.getLado1(), t.getLado2(), t.getLado3());
				txtPerimetro.setText(String.valueOf(perimetro));
				
				area=t.calcular_area(t.getBase(), t.getAltura());
				txtArea.setText(String.valueOf(area));
			}
		});
		btnCalcular.setBounds(10, 282, 110, 23);
		panel.add(btnCalcular);
		
		JButton button_2 = new JButton("GUARDAR");
		button_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				double base, altura, lado1, lado2, lado3;
				
				base=Double.parseDouble(txtBase.getText());
				t.setBase(base);
				altura=Double.parseDouble(txtAltura.getText());
				t.setAltura(altura);
				
				lado1=Double.parseDouble(txtLado1.getText());
				lado2=Double.parseDouble(txtLado2.getText());
				lado3=Double.parseDouble(txtLado3.getText());
				t.setLado1(lado1);
				t.setLado2(lado2);
				t.setLado3(lado3);
				
			}
		});
		button_2.setBounds(10, 176, 116, 23);
		panel.add(button_2);
		
		JButton button_3 = new JButton("LIMPIAR");
		button_3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				String limpiar="";
				txtAltura.setText(String.valueOf(limpiar));
				txtBase.setText(String.valueOf(limpiar));
				txtPerimetro.setText(String.valueOf(limpiar));
				txtLado1.setText(String.valueOf(limpiar));
				txtLado2.setText(String.valueOf(limpiar));
				txtLado3.setText(String.valueOf(limpiar));
				txtArea.setText(String.valueOf((limpiar)));
			}
		});
		button_3.setBounds(136, 320, 89, 23);
		panel.add(button_3);
		
		JButton btnSalir = new JButton("SALIR");
		btnSalir.setBounds(250, 320, 89, 23);
		panel.add(btnSalir);
		
		JButton btnRegresar = new JButton("REGRESAR");
		btnRegresar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				MENUFIGURAS F=new MENUFIGURAS();
				F.show();
				dispose();
			}
		});
		btnRegresar.setBounds(10, 320, 110, 23);
		panel.add(btnRegresar);
		
		JLabel lblResultadoArea = new JLabel("resultado area");
		lblResultadoArea.setBounds(10, 238, 89, 14);
		panel.add(lblResultadoArea);
		
		txtArea = new JTextField();
		txtArea.setBounds(136, 235, 86, 20);
		panel.add(txtArea);
		txtArea.setColumns(10);
		
		JMenuBar menuBar = new JMenuBar();
		menuBar.setBounds(0, 0, 351, 21);
		contentPane.add(menuBar);
		
		JMenu menu = new JMenu("OPCIONES");
		menuBar.add(menu);
		
		JMenuItem menuItem = new JMenuItem("guardar");
		menuItem.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				double base, altura, lado1, lado2, lado3;
				
				base=Double.parseDouble(txtBase.getText());
				t.setBase(base);
				altura=Double.parseDouble(txtAltura.getText());
				t.setAltura(altura);
				
				lado1=Double.parseDouble(txtLado1.getText());
				lado2=Double.parseDouble(txtLado2.getText());
				lado3=Double.parseDouble(txtLado3.getText());
				t.setLado1(lado1);
				t.setLado2(lado2);
				t.setLado3(lado3);
				
			}
		});
		menu.add(menuItem);
		
		JMenuItem menuItem_1 = new JMenuItem("calcular");
		menuItem_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				double perimetro, area;
				
				perimetro=t.calcula_perimetro(t.getLado1(), t.getLado2(), t.getLado3());
				txtPerimetro.setText(String.valueOf(perimetro));
				
				area=t.calcular_area(t.getBase(), t.getAltura());
				txtArea.setText(String.valueOf(area));
			}
		});
		menu.add(menuItem_1);
		
		JMenuItem menuItem_2 = new JMenuItem("regresar al menu");
		menuItem_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				MENUFIGURAS F=new MENUFIGURAS();
				F.show();
				dispose();
			}
		});
		menu.add(menuItem_2);
		
		JMenuItem menuItem_3 = new JMenuItem("limpiar");
		menuItem_3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				String limpiar="";
				txtAltura.setText(String.valueOf(limpiar));
				txtBase.setText(String.valueOf(limpiar));
				txtPerimetro.setText(String.valueOf(limpiar));
				txtLado1.setText(String.valueOf(limpiar));
				txtLado2.setText(String.valueOf(limpiar));
				txtLado3.setText(String.valueOf(limpiar));
				txtArea.setText(String.valueOf((limpiar)));
			}
		});
		menu.add(menuItem_3);
		
		JMenuItem menuItem_4 = new JMenuItem("salir");
		
		menu.add(menuItem_4);
		
		btnSalir.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				System.exit(0);
			}
		});
	}

}

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
import java.awt.SystemColor;
import javax.swing.JMenuBar;
import javax.swing.JMenu;
import javax.swing.JMenuItem;

public class prueba_cuadrado extends JFrame {

	cuadrado c=new cuadrado();
	private JPanel contentPane;
	private JTextField txtLadoc;
	private JTextField txtArea;
	private JTextField txtPerimetro;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					prueba_cuadrado frame = new prueba_cuadrado();
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
	public prueba_cuadrado() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 387, 409);
		contentPane = new JPanel();
		contentPane.setBackground(SystemColor.desktop);
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JPanel panel = new JPanel();
		panel.setBackground(SystemColor.text);
		panel.setLayout(null);
		panel.setBounds(10, 33, 351, 291);
		contentPane.add(panel);
		
		JLabel label = new JLabel("CUADRADO");
		label.setBounds(94, 11, 86, 14);
		panel.add(label);
		
		JLabel label_1 = new JLabel("LADO");
		label_1.setBounds(10, 40, 46, 14);
		panel.add(label_1);
		
		txtLadoc = new JTextField();
		txtLadoc.setColumns(10);
		txtLadoc.setBounds(104, 36, 86, 20);
		panel.add(txtLadoc);
		
		JLabel lblArea = new JLabel("resultado area");
		lblArea.setBounds(10, 166, 96, 14);
		panel.add(lblArea);
		
		txtArea = new JTextField();
		txtArea.setColumns(10);
		txtArea.setBounds(140, 163, 86, 20);
		panel.add(txtArea);
		
		JButton button = new JButton("GUARDAR");
		button.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				double lado;
				lado=Double.parseDouble(txtLadoc.getText());
				c.setLado(lado);
			}
		});
		button.setBounds(10, 65, 117, 23);
		panel.add(button);
		
		JButton btnCalcular = new JButton("CALCULAR");
		btnCalcular.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				double area;
				
				area=c.calcula_area(c.getLado());
				txtArea.setText(String.valueOf(area));
				
				double perimetro;
				perimetro=c.calcular_perimetro(c.getLado());
				txtPerimetro.setText(String.valueOf(perimetro));
			}
		});
		btnCalcular.setBounds(10, 204, 170, 23);
		panel.add(btnCalcular);
		
		JButton button_3 = new JButton("LIMPIAR");
		button_3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				String limpiar="";
				txtLadoc.setText(String.valueOf(limpiar));
				txtArea.setText(String.valueOf(limpiar));
				txtPerimetro.setText(String.valueOf(limpiar));
			}
		});
		button_3.setBounds(137, 257, 89, 23);
		panel.add(button_3);
		
		JButton button_4 = new JButton("SALIR");
		button_4.setBounds(252, 257, 89, 23);
		panel.add(button_4);
		
		JButton btnRegresar = new JButton("REGRESAR");
		btnRegresar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				MENUFIGURAS F=new MENUFIGURAS();
				F.show();
				dispose();
			}
		});
		btnRegresar.setBounds(10, 257, 102, 23);
		panel.add(btnRegresar);
		
		JLabel lblNewLabel = new JLabel("resultado perimetro");
		lblNewLabel.setBounds(10, 126, 117, 14);
		panel.add(lblNewLabel);
		
		txtPerimetro = new JTextField();
		txtPerimetro.setBounds(137, 123, 86, 20);
		panel.add(txtPerimetro);
		txtPerimetro.setColumns(10);
		
		JMenuBar menuBar = new JMenuBar();
		menuBar.setBounds(0, 0, 361, 21);
		contentPane.add(menuBar);
		
		JMenu menu = new JMenu("OPCIONES");
		menuBar.add(menu);
		
		JMenuItem menuItem = new JMenuItem("guardar");
		menuItem.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				double lado;
				lado=Double.parseDouble(txtLadoc.getText());
				c.setLado(lado);
			}
		});
		menu.add(menuItem);
		
		JMenuItem menuItem_1 = new JMenuItem("calcular");
		menuItem_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				double area;
				
				area=c.calcula_area(c.getLado());
				txtArea.setText(String.valueOf(area));
				
				double perimetro;
				perimetro=c.calcular_perimetro(c.getLado());
				txtPerimetro.setText(String.valueOf(perimetro));
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
				txtLadoc.setText(String.valueOf(limpiar));
				txtArea.setText(String.valueOf(limpiar));
				txtPerimetro.setText(String.valueOf(limpiar));
			}
		});
		menu.add(menuItem_3);
		
		JMenuItem menuItem_4 = new JMenuItem("salir");
		menuItem_4.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				System.exit(0);
			}
		});
		menu.add(menuItem_4);
		button_4.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				System.exit(0);
			}
		});
	}

}

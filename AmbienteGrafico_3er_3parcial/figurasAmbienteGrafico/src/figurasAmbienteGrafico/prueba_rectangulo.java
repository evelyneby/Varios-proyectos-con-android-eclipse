package figurasAmbienteGrafico;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.table.DefaultTableModel;
import javax.swing.JLabel;
import javax.swing.JTable;
import javax.swing.JTextField;
import javax.swing.JButton;

import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.Color;
import javax.swing.JMenuBar;
import javax.swing.JMenu;
import javax.swing.JMenuItem;

public class prueba_rectangulo extends JFrame {
	rectangulo r=new rectangulo();

	private JPanel contentPane;
	private JTextField txtLargo;
	private JTextField txtAncho;
	private JTextField txtArea;
	private JTextField txtPerimetro;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					prueba_rectangulo frame = new prueba_rectangulo();
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
	public prueba_rectangulo() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 369, 399);
		contentPane = new JPanel();
		contentPane.setBackground(Color.BLACK);
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JPanel panel = new JPanel();
		panel.setBackground(Color.WHITE);
		panel.setLayout(null);
		panel.setBounds(10, 36, 333, 313);
		contentPane.add(panel);
		
		JLabel label = new JLabel("RECTANGULO");
		label.setBounds(76, 11, 109, 14);
		panel.add(label);
		
		JLabel label_1 = new JLabel("LARGO");
		label_1.setBounds(10, 45, 56, 14);
		panel.add(label_1);
		
		JLabel label_2 = new JLabel("ANCHO");
		label_2.setBounds(10, 83, 56, 14);
		panel.add(label_2);
		
		txtLargo = new JTextField();
		txtLargo.setColumns(10);
		txtLargo.setBounds(76, 42, 86, 20);
		panel.add(txtLargo);
		
		txtAncho = new JTextField();
		txtAncho.setColumns(10);
		txtAncho.setBounds(76, 80, 86, 20);
		panel.add(txtAncho);
		
		JButton button = new JButton("GUARDAR");
		button.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				double largo, ancho;
				largo=Double.parseDouble(txtLargo.getText());
				ancho=Double.parseDouble(txtAncho.getText());
				r.setLargo(largo);
				r.setAncho(ancho);
			}
		});
		button.setBounds(10, 199, 109, 23);
		panel.add(button);
		
		JButton button_1 = new JButton("LIMPIAR");
		button_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				String limpiar="";
				
				txtLargo.setText(String.valueOf(limpiar));
				txtAncho.setText(String.valueOf(limpiar));
				txtArea.setText(String.valueOf(limpiar));
				txtPerimetro.setText(String.valueOf(limpiar));
			}
		});
		button_1.setBounds(129, 279, 89, 23);
		panel.add(button_1);
		
		JButton btnCalcular = new JButton("CALCULAR");
		btnCalcular.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				
				double area;
				area=r.calcular_area(r.getLargo(), r.getAncho());
				txtArea.setText(String.valueOf(area));
				double perimetro;
				perimetro=r.calcular_perimetro(r.getLargo(), r.getAncho());
				txtPerimetro.setText(String.valueOf(perimetro));
			}
		});
		btnCalcular.setBounds(10, 233, 119, 23);
		panel.add(btnCalcular);
		
		JLabel lblResultadoArea = new JLabel("resultado area");
		lblResultadoArea.setBounds(10, 171, 89, 14);
		panel.add(lblResultadoArea);
		
		txtArea = new JTextField();
		txtArea.setColumns(10);
		txtArea.setBounds(146, 168, 86, 20);
		panel.add(txtArea);
		
		JButton button_4 = new JButton("SALIR");
		button_4.setBounds(234, 279, 89, 23);
		panel.add(button_4);
		
		JButton btnRegresar = new JButton("REGRESAR");
		btnRegresar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				MENUFIGURAS F=new MENUFIGURAS();
				F.show();
				dispose();
			}
		});
		btnRegresar.setBounds(10, 279, 109, 23);
		panel.add(btnRegresar);
		
		JLabel lblResultadoPerimetro = new JLabel("resultado perimetro");
		lblResultadoPerimetro.setBounds(10, 136, 119, 14);
		panel.add(lblResultadoPerimetro);
		
		txtPerimetro = new JTextField();
		txtPerimetro.setBounds(148, 133, 86, 20);
		panel.add(txtPerimetro);
		txtPerimetro.setColumns(10);
		
		JMenuBar menuBar = new JMenuBar();
		menuBar.setBounds(0, 0, 351, 21);
		contentPane.add(menuBar);
		
		JMenu menu = new JMenu("OPCIONES");
		menuBar.add(menu);
		
		JMenuItem menuItem = new JMenuItem("guardar");
		menuItem.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				double largo, ancho;
				largo=Double.parseDouble(txtLargo.getText());
				ancho=Double.parseDouble(txtAncho.getText());
				r.setLargo(largo);
				r.setAncho(ancho);
			}
		});
		menu.add(menuItem);
		
		JMenuItem menuItem_1 = new JMenuItem("calcular");
		menuItem_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				
				double area;
				area=r.calcular_area(r.getLargo(), r.getAncho());
				txtArea.setText(String.valueOf(area));
				double perimetro;
				perimetro=r.calcular_perimetro(r.getLargo(), r.getAncho());
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
				
				txtLargo.setText(String.valueOf(limpiar));
				txtAncho.setText(String.valueOf(limpiar));
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

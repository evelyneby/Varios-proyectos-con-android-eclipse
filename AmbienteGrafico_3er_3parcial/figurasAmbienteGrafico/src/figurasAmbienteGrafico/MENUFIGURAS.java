package figurasAmbienteGrafico;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JMenuBar;
import javax.swing.JMenu;
import javax.swing.JMenuItem;
import javax.swing.JLabel;
import javax.swing.JRadioButtonMenuItem;
import javax.swing.JButton;

import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.KeyStroke;
import java.awt.event.KeyEvent;
import java.awt.event.InputEvent;

public class MENUFIGURAS extends JFrame {
	prueba_triangulo ft=new prueba_triangulo();
	prueba_circulo fc=new prueba_circulo();
	prueba_cuadrado fcua=new prueba_cuadrado();
	prueba_rectangulo fr=new prueba_rectangulo();

	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					MENUFIGURAS frame = new MENUFIGURAS();
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
	public MENUFIGURAS() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JMenuBar MenuBar = new JMenuBar();
		MenuBar.setBounds(0, 0, 434, 21);
		contentPane.add(MenuBar);
		
		JMenu JMenuOP = new JMenu("OPCIONES");
		MenuBar.add(JMenuOP);
		
		JMenuItem mntmSalir = new JMenuItem("SALIR");
		mntmSalir.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				System.exit(0);
			}
			});
		
		JMenu mnAbrir = new JMenu("abrir");
		JMenuOP.add(mnAbrir);
		
		JMenuItem mntmCuadrado = new JMenuItem("cuadrado");
		mntmCuadrado.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				fcua.show();
			}
			});
		mnAbrir.add(mntmCuadrado);
		
		JMenuItem mntmCirculo = new JMenuItem("circulo");
		mntmCirculo.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				fc.show();
			}
			});
		mnAbrir.add(mntmCirculo);
		
		JMenuItem mntmRectangulo = new JMenuItem("rectangulo");
		mntmRectangulo.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				fr.show();
			}
			});
		mnAbrir.add(mntmRectangulo);
		
		JMenuItem mntmTriangulo = new JMenuItem("triangulo");
		mntmTriangulo.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				ft.show();
			}
			});
		mnAbrir.add(mntmTriangulo);
		mntmSalir.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_F, InputEvent.CTRL_MASK));
		JMenuOP.add(mntmSalir);
		
		
		JLabel lblSaleccionaUnaFigura = new JLabel("SALECCIONA UNA FIGURA");
		lblSaleccionaUnaFigura.setBounds(10, 91, 162, 14);
		contentPane.add(lblSaleccionaUnaFigura);
		
		JRadioButtonMenuItem JRadioMenuCua = new JRadioButtonMenuItem("CUADRADO");
		JRadioMenuCua.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_1, InputEvent.CTRL_MASK));
		JRadioMenuCua.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				fcua.show();
			}
			});
		JRadioMenuCua.setBounds(127, 116, 200, 22);
		contentPane.add(JRadioMenuCua);
		
		JRadioButtonMenuItem JRadioMenuCir = new JRadioButtonMenuItem("CIRCULO");
		JRadioMenuCir.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_2, InputEvent.CTRL_MASK));
		JRadioMenuCir.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				fc.show();
			}
			});
		JRadioMenuCir.setBounds(127, 149, 200, 22);
		contentPane.add(JRadioMenuCir);
		
		JRadioButtonMenuItem JRadioMenuRec = new JRadioButtonMenuItem("RECTANGULO");
		JRadioMenuRec.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_3, InputEvent.CTRL_MASK));
		JRadioMenuRec.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				fr.show();
			}
			});
		JRadioMenuRec.setBounds(127, 182, 200, 22);
		contentPane.add(JRadioMenuRec);
		
		JRadioButtonMenuItem JRadioMenuTri = new JRadioButtonMenuItem("TRIANGULO");
		JRadioMenuTri.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_4, InputEvent.CTRL_MASK));
		JRadioMenuTri.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				ft.show();
			}
			});
		JRadioMenuTri.setBounds(127, 215, 200, 22);
		contentPane.add(JRadioMenuTri);
	}
}

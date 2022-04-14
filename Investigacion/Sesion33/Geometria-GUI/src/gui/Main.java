package gui;

import java.awt.BorderLayout;
import java.awt.EventQueue;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JMenuBar;
import javax.swing.JMenu;
import javax.swing.JMenuItem;

public class Main extends JFrame {

	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Main frame = new Main();
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
	public Main() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		
		JMenuBar menuBar = new JMenuBar();
		setJMenuBar(menuBar);
		
		JMenu menuArchivo = new JMenu("Archivo");
		menuBar.add(menuArchivo);
		
		JMenuItem menuItemSalir = new JMenuItem("Salir");
		menuArchivo.add(menuItemSalir);
		// Lambda para que al presionar el item Salir, el sistema fuerce el cierre.
		menuItemSalir.addActionListener(evento -> System.exit(0));
		
		JMenu menuCalculos = new JMenu("Calculos");
		menuBar.add(menuCalculos);
		
		JMenuItem menuItemRectangulo = new JMenuItem("Rectangulo");
		menuCalculos.add(menuItemRectangulo);
		menuItemRectangulo.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				contentPane = new RectanguloJPanel();
				contentPane.setBorder(new EmptyBorder(5,5,5,5));
				contentPane.setLayout(new BorderLayout(0,0));
				setContentPane(contentPane);
				contentPane.updateUI();
				
			}
			
		});
		
		JMenuItem menuItemCirculo = new JMenuItem("Circulo");
		menuCalculos.add(menuItemCirculo);
		menuItemCirculo.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				contentPane = new CirculoJPanel();
				contentPane.setBorder(new EmptyBorder(5,5,5,5));
				contentPane.setLayout(new BorderLayout(0,0));
				setContentPane(contentPane);
				contentPane.updateUI();
				
			}
			
		});

		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		contentPane.setLayout(new BorderLayout(0, 0));
		setContentPane(contentPane);
	}

}

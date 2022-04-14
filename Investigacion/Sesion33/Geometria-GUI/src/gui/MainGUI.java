package gui;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JButton;
import javax.swing.JTextField;

import geometria.*;

import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class MainGUI {

	private JFrame frame;
	private JTextField txtFieldBase;
	private JTextField txtFieldAltura;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					MainGUI window = new MainGUI();
					window.frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public MainGUI() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 450, 300);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Base");
		lblNewLabel.setBounds(24, 44, 46, 14);
		frame.getContentPane().add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("Altura");
		lblNewLabel_1.setBounds(24, 134, 46, 14);
		frame.getContentPane().add(lblNewLabel_1);
		
		JLabel labelTextResultado = new JLabel("Resultado:");
		labelTextResultado.setBounds(209, 94, 66, 14);
		frame.getContentPane().add(labelTextResultado);
		
		JLabel labelResultado = new JLabel("0");
		labelResultado.setBounds(272, 94, 144, 14);
		frame.getContentPane().add(labelResultado);
		
		JButton btnNewButton = new JButton("Calcular area");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				try {
					// recupera la base y altura de los txtField, los convierte a double
					double base = Double.parseDouble(txtFieldBase.getText());
					double altura = Double.parseDouble(txtFieldAltura.getText());
					
					// genera instnacia de Rectangulo y calcula
					Rectangulo rectangulo = new Rectangulo(base,altura);
					double area = rectangulo.calcularArea();
					
					// muestra en pantalla
					labelResultado.setText(String.format("El area es: %s", area));
				}catch(Exception ex){
					labelResultado.setText("Error");	
				}
			}
		});
		btnNewButton.setBounds(24, 188, 161, 23);
		frame.getContentPane().add(btnNewButton);
		
		txtFieldBase = new JTextField();
		txtFieldBase.setBounds(79, 41, 86, 20);
		frame.getContentPane().add(txtFieldBase);
		txtFieldBase.setColumns(10);
		
		txtFieldAltura = new JTextField();
		txtFieldAltura.setBounds(80, 131, 86, 20);
		frame.getContentPane().add(txtFieldAltura);
		txtFieldAltura.setColumns(10);
		
		JButton btnNewButton_1 = new JButton("Calcular perimetro");
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				try {
					double base = Double.parseDouble(txtFieldBase.getText());
					double altura = Double.parseDouble(txtFieldAltura.getText());
					
					Rectangulo rectangulo = new Rectangulo(base,altura);
					double perimetro = rectangulo.calcularPerimetro();
					
					labelResultado.setText(String.format("El perimetro es: %s", perimetro));
					
				}catch(Exception ex) {
					labelResultado.setText("Error");
				}
				
			}
		});
		btnNewButton_1.setBounds(255, 188, 161, 23);
		frame.getContentPane().add(btnNewButton_1);
		

	}
}

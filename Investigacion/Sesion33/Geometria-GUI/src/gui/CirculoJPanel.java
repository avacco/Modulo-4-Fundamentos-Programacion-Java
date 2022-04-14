package gui;

import javax.swing.JPanel;
import javax.swing.JLabel;
import javax.swing.JTextField;

import geometria.*;

import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class CirculoJPanel extends JPanel {
	private JTextField txtFieldDiametro;

	/**
	 * Create the panel.
	 */
	public CirculoJPanel() {
		setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Diametro");
		lblNewLabel.setBounds(38, 50, 86, 14);
		add(lblNewLabel);
		
		txtFieldDiametro = new JTextField();
		txtFieldDiametro.setBounds(149, 47, 164, 20);
		add(txtFieldDiametro);
		txtFieldDiametro.setColumns(10);
		
		JLabel lblNewLabel_1 = new JLabel("Resultado:");
		lblNewLabel_1.setBounds(38, 141, 86, 14);
		add(lblNewLabel_1);
		
		JLabel labelResultado = new JLabel("0");
		labelResultado.setBounds(134, 141, 179, 14);
		add(labelResultado);
		
		JButton btnCalcularArea = new JButton("Calcular Area");
		btnCalcularArea.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				try {
					double diametro = Double.parseDouble(txtFieldDiametro.getText());
					Circulo circulo = new Circulo(diametro);
					double area = circulo.calcularArea();
					
					labelResultado.setText(String.format("El area es %s", area));	
				}catch(Exception ex) {
					labelResultado.setText("Error");	
				}

				
			}
		});
		btnCalcularArea.setBounds(38, 187, 157, 23);
		add(btnCalcularArea);
		
		JButton btnCalcularPerimetro = new JButton("Calcular Perimetro");
		btnCalcularPerimetro.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
	
				try {
					double diametro = Double.parseDouble(txtFieldDiametro.getText());
					Circulo circulo = new Circulo(diametro);
					double perimetro = circulo.calcularPerimetro();
					
					labelResultado.setText(String.format("El perimetro es %s", perimetro));	
					
				}catch(Exception ex) {
					labelResultado.setText("Error");	
				}
				
			}
		});
		btnCalcularPerimetro.setBounds(224, 187, 195, 23);
		add(btnCalcularPerimetro);
		


	}

}

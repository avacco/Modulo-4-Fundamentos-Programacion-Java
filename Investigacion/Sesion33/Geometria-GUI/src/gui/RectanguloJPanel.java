package gui;

import javax.swing.JPanel;
import javax.swing.JLabel;
import javax.swing.JTextField;

import geometria.Rectangulo;

import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class RectanguloJPanel extends JPanel {
	private JTextField txtFieldBase;
	private JTextField txtFieldAltura;

	/**
	 * Create the panel.
	 */
	public RectanguloJPanel() {
		setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Base");
		lblNewLabel.setBounds(37, 51, 46, 14);
		add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("Altura");
		lblNewLabel_1.setBounds(37, 131, 46, 14);
		add(lblNewLabel_1);
		
		txtFieldBase = new JTextField();
		txtFieldBase.setBounds(81, 48, 86, 20);
		add(txtFieldBase);
		txtFieldBase.setColumns(10);
		
		txtFieldAltura = new JTextField();
		txtFieldAltura.setBounds(81, 128, 86, 20);
		add(txtFieldAltura);
		txtFieldAltura.setColumns(10);
		
		JLabel labelResultado = new JLabel("0");
		labelResultado.setBounds(291, 93, 149, 14);
		add(labelResultado);
		
		JButton btnNewButton = new JButton("Calcular Area");
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
		btnNewButton.setBounds(37, 205, 130, 23);
		add(btnNewButton);
		
		JButton btnNewButton_1 = new JButton("Calcular Perimetro");
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
		btnNewButton_1.setBounds(271, 205, 130, 23);
		add(btnNewButton_1);
		
		JLabel lblNewLabel_2 = new JLabel("Resultado:");
		lblNewLabel_2.setBounds(209, 93, 72, 14);
		add(lblNewLabel_2);
		


	}

}

import java.awt.BorderLayout;
import java.awt.EventQueue;
import java.sql.SQLException;
import java.util.List;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.border.EmptyBorder;
import javax.swing.table.AbstractTableModel;
import javax.swing.table.TableModel;
import javax.swing.JTable;

public class MainGUI extends JFrame {

	private JPanel contentPane;
	private JTable table;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					MainGUI frame = new MainGUI();
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
	public MainGUI() {
		setTitle("Bodegas");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		contentPane.setLayout(new BorderLayout(0, 0));
		setContentPane(contentPane);
		
		try {
			List<Bodega> bodegas = BaseDatos.getBodegas();
			TableModel tableModel = new AbstractTableModel() {
				
				@Override
				public String getColumnName(int columnIndex) {
					switch(columnIndex) {
					case 0:
						return "ID";
					case 1:
						return "Nombre";
					case 2:
						return "Ocupada";
					default:
						return "";	
					}
				}
				
				@Override
				public Object getValueAt(int rowIndex, int columnIndex) {
					Bodega bodega = bodegas.get(rowIndex);
					switch(columnIndex) {
					case 0:
						return bodega.getId();
					case 1:
						return bodega.getNombre();
					case 2:
						return bodega.isEstado();
					default:
						return "";
					}
				}
				
				@Override
				public int getRowCount() {
					return bodegas.size();
				}
				
				@Override
				public int getColumnCount() {
					return 3;
				}
			};
			table = new JTable(tableModel);
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		// envuelve JTable dentro de un JScrollPane, dara scroll horizontal y vertical
		JScrollPane jScrollPane = new JScrollPane(table);
		contentPane.add(jScrollPane, BorderLayout.CENTER);
	}

}

package view;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JInternalFrame;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

public class MenuArticulos extends JInternalFrame {

	private static final long serialVersionUID = 1L;
	private JTable table;
	private DefaultTableModel tableModel;

	public MenuArticulos() {
		setTitle("Menú Articulos");
		setSize(800, 291);
		getContentPane().setLayout(null);

		tableModel = new DefaultTableModel(new Object[][] {}, new String[] { "Nombre", "Cantidad", "Estado" });
		table = new JTable(tableModel);
		JScrollPane scrollPane = new JScrollPane(table);
		scrollPane.setBounds(183, 0, 601, 261);
		getContentPane().add(scrollPane);

		JButton btnSalir = new JButton("Salir");
		btnSalir.setBounds(31, 152, 123, 66);
		getContentPane().add(btnSalir);
		btnSalir.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				dispose(); // Cierra la ventana al hacer clic en el botón "Salir"
			}
		});

		JButton btnGestionarArticulos = new JButton("Gestionar Artículos");
		btnGestionarArticulos.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		btnGestionarArticulos.setBounds(31, 43, 123, 66);
		getContentPane().add(btnGestionarArticulos);

	}

	public void agregarArticulo(String nombre, int cantidad, String estado) {
		tableModel.addRow(new Object[] { nombre, cantidad, estado });
	}

}

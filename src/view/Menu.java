package view;

import javax.swing.*;
import javax.swing.border.EmptyBorder;
import javax.swing.table.DefaultTableModel;

import java.awt.*;
import java.awt.event.*;

public class Menu extends JFrame {

	private JTable table;
	private DefaultTableModel tableModel;

	public Menu() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setTitle("Menú Principal");
		setSize(800, 600); 
		setLocationRelativeTo(null);
		getContentPane().setLayout(null);


		JPanel panel = new JPanel();
		panel.setBounds(0, 0, 183, 561);
		panel.setBorder(BorderFactory.createEmptyBorder(30, 30, 30, 30));
		JButton btnGestionarArticulos = new JButton("Gestionar Artículos");
		btnGestionarArticulos.setBounds(30, 32, 123, 66);
		JButton btnGestionarCentros = new JButton("Gestionar Centros");
		btnGestionarCentros.setBounds(30, 204, 123, 66);
		JButton btnSalir = new JButton("Salir");
		btnSalir.setBounds(30, 290, 123, 66);
		panel.setLayout(null);
		panel.add(btnGestionarArticulos);
		
				
				JButton btnAgregarArticulo = new JButton("Agregar Artículo");
				btnAgregarArticulo.setBounds(30, 118, 123, 66);
				
						
						panel.add(btnAgregarArticulo);
		panel.add(btnGestionarCentros);
		panel.add(btnSalir); 
		
		getContentPane().add(panel); 
		// Tabla para mostrar los artículos
		tableModel = new DefaultTableModel(new Object[][] {}, new String[] { "Nombre", "Cantidad", "Estado" });
		table = new JTable(tableModel);
		JScrollPane scrollPane = new JScrollPane(table);
		scrollPane.setBounds(183, 0, 601, 561);
		getContentPane().add(scrollPane); // Posicionado en el centro
	}

	// Método para agregar artículo a la tabla
	public void agregarArticulo(String nombre, int cantidad, String estado) {
		tableModel.addRow(new Object[] { nombre, cantidad, estado });
	}

	public static void main(String[] args) {
		SwingUtilities.invokeLater(() -> {
			Menu menu = new Menu();
			menu.setVisible(true);
		});
	}
}

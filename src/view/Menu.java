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


		JPanel panel = new JPanel();
		panel.setLayout(new GridLayout(6, 1, 20, 20));
		panel.setBorder(BorderFactory.createEmptyBorder(30, 30, 30, 30));

		
		JButton btnAgregarArticulo = new JButton("Agregar Artículo");
		JButton btnGestionarArticulos = new JButton("Gestionar Artículos");
		JButton btnGestionarCentros = new JButton("Gestionar Centros");
		JButton btnSalir = new JButton("Salir");

		
		panel.add(btnAgregarArticulo);
		panel.add(btnGestionarArticulos);
		panel.add(btnGestionarCentros);
		panel.add(btnSalir); 
		
		getContentPane().add(panel, BorderLayout.WEST); 
		// Tabla para mostrar los artículos
		tableModel = new DefaultTableModel(new Object[][] {}, new String[] { "Nombre", "Cantidad", "Estado" });
		table = new JTable(tableModel);
		JScrollPane scrollPane = new JScrollPane(table);
		getContentPane().add(scrollPane, BorderLayout.CENTER); // Posicionado en el centro
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

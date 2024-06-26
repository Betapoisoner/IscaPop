package view;

import java.awt.BorderLayout;
import java.awt.Font;

import javax.swing.*;
import javax.swing.border.EmptyBorder;
import javax.swing.table.DefaultTableModel;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class ArticulosGestion extends JInternalFrame {

	private static final long serialVersionUID = 1L;
	private final JPanel contentPanel = new JPanel();
	private JTextField txtNombreBuscar;
	private JButton btnBuscar;
	private JTable tableArticulos;
	private DefaultTableModel tableModel;
	private JButton btnModificar;
	private JButton btnEliminar;
	private JButton btnSalir; // Botón para salir

	public static void main(String[] args) {
		try {
			ArticulosGestion dialog = new ArticulosGestion();
			dialog.setDefaultCloseOperation(JDialog.DISPOSE_ON_CLOSE);
			dialog.setVisible(true);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	public ArticulosGestion() {
		setTitle("Gestión de Artículos");
		setDefaultCloseOperation(JDialog.DISPOSE_ON_CLOSE);
		setBounds(100, 100, 800, 487);
		getContentPane().setLayout(new BorderLayout());
		contentPanel.setBorder(new EmptyBorder(5, 5, 5, 5));
		getContentPane().add(contentPanel, BorderLayout.CENTER);
		contentPanel.setLayout(null);

		JPanel panelBuscar = new JPanel();
		panelBuscar.setBorder(BorderFactory.createTitledBorder("Buscar Artículo"));
		panelBuscar.setBounds(11, 12, 762, 57);
		contentPanel.add(panelBuscar);
		panelBuscar.setLayout(null);

		JLabel lblNombre = new JLabel("Nombre:");
		lblNombre.setFont(new Font("Dialog", Font.BOLD, 14));
		lblNombre.setBounds(10, 16, 119, 26);
		panelBuscar.add(lblNombre);

		txtNombreBuscar = new JTextField();
		txtNombreBuscar.setBounds(77, 19, 578, 25);
		panelBuscar.add(txtNombreBuscar);
		txtNombreBuscar.setColumns(10);

		btnBuscar = new JButton("Buscar");
		btnBuscar.setFont(new Font("Dialog", Font.BOLD, 14));
		btnBuscar.setBounds(669, 17, 83, 25);
		panelBuscar.add(btnBuscar);

		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setBounds(11, 80, 762, 320);
		contentPanel.add(scrollPane);

		tableModel = new DefaultTableModel();
		tableModel.addColumn("ID");
		tableModel.addColumn("Nombre");
		tableModel.addColumn("Descripción");
		tableModel.addColumn("Cantidad");
		tableModel.addColumn("Estado");
		tableArticulos = new JTable(tableModel);
		scrollPane.setViewportView(tableArticulos);

		btnModificar = new JButton("Modificar");
		btnModificar.setFont(new Font("Dialog", Font.BOLD, 14));
		btnModificar.setBounds(19, 410, 232, 35);
		contentPanel.add(btnModificar);

		btnEliminar = new JButton("Eliminar");
		btnEliminar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		btnEliminar.setFont(new Font("Dialog", Font.BOLD, 14));
		btnEliminar.setBounds(270, 410, 260, 35);
		contentPanel.add(btnEliminar);

		btnSalir = new JButton("Salir");
		btnSalir.setFont(new Font("Dialog", Font.BOLD, 14));
		btnSalir.setBounds(549, 411, 216, 35);
		contentPanel.add(btnSalir);
		btnSalir.addActionListener(e -> dispose());
	}
}

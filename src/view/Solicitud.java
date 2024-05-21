package view;

import java.awt.BorderLayout;
import java.awt.Font;

import javax.swing.JButton;
import javax.swing.JDialog;
import javax.swing.JInternalFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JSpinner;
import javax.swing.JTable;
import javax.swing.JTextField;
import javax.swing.border.EmptyBorder;
import javax.swing.table.DefaultTableModel;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class Solicitud extends JInternalFrame {

	/**
	 *
	 */
	private static final long serialVersionUID = 1L;
	private final JPanel contentPanel = new JPanel();
	private JTable tableArticulos;
	private DefaultTableModel tableModel;
	private JLabel lblMensaje;
	private JTextField textField;

	public static void main(String[] args) {
		try {
			Solicitud dialog = new Solicitud();
			dialog.setDefaultCloseOperation(JDialog.DISPOSE_ON_CLOSE);
			dialog.setVisible(true);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	public Solicitud() {
		setTitle("Solicitud");
		setDefaultCloseOperation(JDialog.DISPOSE_ON_CLOSE);
		setBounds(100, 100, 629, 450);
		getContentPane().setLayout(null);
		contentPanel.setBounds(0, 0, 604, 410);
		contentPanel.setBorder(new EmptyBorder(5, 5, 5, 5));
		getContentPane().add(contentPanel);
		contentPanel.setLayout(null);

		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setBounds(21, 52, 562, 258);
		contentPanel.add(scrollPane);

		tableModel = new DefaultTableModel();
		tableModel.addColumn("Nombre Artículo");
		tableModel.addColumn("Cantidad");
		tableArticulos = new JTable(tableModel);
		scrollPane.setViewportView(tableArticulos);

		JLabel lblNombreArticulo = new JLabel("Nombre Artículo:");
		lblNombreArticulo.setFont(new Font("Dialog", Font.BOLD, 14));
		lblNombreArticulo.setBounds(13, 17, 120, 14);
		contentPanel.add(lblNombreArticulo);

		textField = new JTextField();
		textField.setColumns(10);
		textField.setBounds(146, 11, 200, 30);
		contentPanel.add(textField);

		JLabel lblCantidad = new JLabel("Cantidad:");
		lblCantidad.setFont(new Font("Dialog", Font.BOLD, 14));
		lblCantidad.setBounds(359, 17, 80, 14);
		contentPanel.add(lblCantidad);

		JSpinner spnCantidad = new JSpinner();
		spnCantidad.setBounds(452, 11, 135, 30);
		contentPanel.add(spnCantidad);

		JButton btnAgregarArticulo = new JButton("Agregar Artículo");
		btnAgregarArticulo.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		btnAgregarArticulo.setFont(new Font("Dialog", Font.BOLD, 14));
		btnAgregarArticulo.setBounds(22, 321, 269, 38);
		contentPanel.add(btnAgregarArticulo);

		JButton btnFinalizarSolicitud = new JButton("Finalizar solicitud");
		btnFinalizarSolicitud.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		btnFinalizarSolicitud.setFont(new Font("Dialog", Font.BOLD, 14));
		btnFinalizarSolicitud.setBounds(313, 321, 269, 38);
		contentPanel.add(btnFinalizarSolicitud);

		JButton btnSalir = new JButton("Salir");
		btnSalir.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				dispose();
			}
		});
		btnSalir.setFont(new Font("Dialog", Font.BOLD, 14));
		btnSalir.setBounds(167, 369, 269, 38);
		contentPanel.add(btnSalir);

		lblMensaje = new JLabel();
		lblMensaje.setBounds(183, 400, 188, 23);
		getContentPane().add(lblMensaje);
	}
}

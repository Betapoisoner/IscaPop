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
import javax.swing.SpinnerNumberModel;
import javax.swing.border.EmptyBorder;
import javax.swing.table.DefaultTableModel;

public class ArticuloAdd extends JInternalFrame {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private final JPanel contentPanel = new JPanel();
	private JTextField txtNombre, txtDescripcion;
	private JSpinner spnCantidad;
	private JButton btnAgregar;
	private JTable table;
	private JTextField txtExtado;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		try {
			ArticuloAdd dialog = new ArticuloAdd();
			dialog.setDefaultCloseOperation(JDialog.DISPOSE_ON_CLOSE);
			dialog.setVisible(true);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	/**
	 * Create the dialog.
	 */

	public ArticuloAdd() {
		setTitle("Articulos");
		setDefaultCloseOperation(JDialog.DISPOSE_ON_CLOSE);
		setBounds(100, 100, 800, 389);
		getContentPane().setLayout(new BorderLayout());
		contentPanel.setBorder(new EmptyBorder(5, 5, 5, 5));
		getContentPane().add(contentPanel, BorderLayout.CENTER);
		contentPanel.setLayout(null);

		JLabel lblNombre = new JLabel("Nombre:");
		lblNombre.setFont(new Font("Dialog", Font.BOLD, 17));
		lblNombre.setBounds(14, 11, 91, 23);
		contentPanel.add(lblNombre);

		JLabel lblDescripcion = new JLabel("Descripción:");
		lblDescripcion.setFont(new Font("Dialog", Font.BOLD, 17));
		lblDescripcion.setBounds(14, 82, 409, 23);
		contentPanel.add(lblDescripcion);

		JLabel lblCantidad = new JLabel("Cantidad:");
		lblCantidad.setFont(new Font("Dialog", Font.BOLD, 17));
		lblCantidad.setBounds(14, 153, 91, 23);
		contentPanel.add(lblCantidad);

		JLabel lblEstado = new JLabel("Estado:");
		lblEstado.setFont(new Font("Dialog", Font.BOLD, 17));
		lblEstado.setBounds(14, 221, 91, 23);
		contentPanel.add(lblEstado);

		txtNombre = new JTextField();
		txtNombre.setBounds(14, 44, 409, 28);
		contentPanel.add(txtNombre);
		txtNombre.setColumns(10);

		txtDescripcion = new JTextField();
		txtDescripcion.setBounds(12, 115, 411, 28);
		contentPanel.add(txtDescripcion);
		txtDescripcion.setColumns(10);

		spnCantidad = new JSpinner(new SpinnerNumberModel(1, 1, 100, 1));
		spnCantidad.setBounds(14, 186, 409, 25);
		contentPanel.add(spnCantidad);

		btnAgregar = new JButton("Agregar");
		btnAgregar.setFont(new Font("Dialog", Font.BOLD, 17));
		btnAgregar.setBounds(14, 292, 409, 44);
		contentPanel.add(btnAgregar);

		table = new JTable();
		table.setModel(new DefaultTableModel(new Object[][] {}, new String[] { "Nombre", "Cantidad", "Estado" }));
		JScrollPane scrollPane = new JScrollPane(table);
		scrollPane.setBounds(454, 11, 320, 333);
		contentPanel.add(scrollPane);

		txtExtado = new JTextField();
		txtExtado.setColumns(10);
		txtExtado.setBounds(14, 254, 411, 28);
		contentPanel.add(txtExtado);
	}
}

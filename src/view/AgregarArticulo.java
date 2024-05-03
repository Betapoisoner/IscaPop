package view;

import javax.swing.*;
import javax.swing.border.EmptyBorder;
import javax.swing.table.DefaultTableModel;

import java.awt.*;
import java.awt.event.*;

public class AgregarArticulo extends JDialog implements ActionListener {

    private final JPanel contentPanel = new JPanel();
    private JTextField txtNombre, txtDescripcion;
    private JSpinner spnCantidad;
    private JComboBox<String> cbEstado;
    private JButton btnAgregar;
    private JLabel lblMensaje;
    private JTable table;

    // Modelo de tabla
    private DefaultTableModel tableModel;

    /**
     * Launch the application.
     */
    public static void main(String[] args) {
        try {
            AgregarArticulo dialog = new AgregarArticulo(null);
            dialog.setDefaultCloseOperation(JDialog.DISPOSE_ON_CLOSE);
            dialog.setVisible(true);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    /**
     * Create the dialog.
     */

    public AgregarArticulo(JFrame parentFrame) { // Assuming you have a parent frame

        setDefaultCloseOperation(JDialog.DISPOSE_ON_CLOSE);
        setBounds(100, 100, 800, 411); // Aumenté el tamaño de la ventana
        getContentPane().setLayout(new BorderLayout());
        contentPanel.setBorder(new EmptyBorder(5, 5, 5, 5));
        getContentPane().add(contentPanel, BorderLayout.CENTER);
        contentPanel.setLayout(null);

        // Etiquetas
        JLabel lblNombre = new JLabel("Nombre:");
        lblNombre.setFont(new Font("Dialog", Font.BOLD, 17));
        lblNombre.setBounds(14, 11, 91, 23);
        contentPanel.add(lblNombre);

        JLabel lblDescripcion = new JLabel("Descripción:");
        lblDescripcion.setFont(new Font("Dialog", Font.BOLD, 17));
        lblDescripcion.setBounds(14, 84, 409, 23);
        contentPanel.add(lblDescripcion);

        JLabel lblCantidad = new JLabel("Cantidad:");
        lblCantidad.setFont(new Font("Dialog", Font.BOLD, 17));
        lblCantidad.setBounds(14, 157, 91, 23);
        contentPanel.add(lblCantidad);

        JLabel lblEstado = new JLabel("Estado:");
        lblEstado.setFont(new Font("Dialog", Font.BOLD, 17));
        lblEstado.setBounds(14, 227, 91, 23);
        contentPanel.add(lblEstado);

        // Campos de texto
        txtNombre = new JTextField();
        txtNombre.setBounds(14, 45, 409, 28);
        contentPanel.add(txtNombre);
        txtNombre.setColumns(10);

        txtDescripcion = new JTextField();
        txtDescripcion.setBounds(12, 118, 411, 28);
        contentPanel.add(txtDescripcion);
        txtDescripcion.setColumns(10);

        // Spinners
        spnCantidad = new JSpinner(new SpinnerNumberModel(1, 1, 100, 1));
        spnCantidad.setBounds(14, 191, 409, 25);
        contentPanel.add(spnCantidad);

        // Combo Box
        String[] estados = {"Nuevo", "Usado","GAREN NO HACE NADA"};
        cbEstado = new JComboBox<>(estados);
        cbEstado.setBounds(12, 261, 411, 28);
        contentPanel.add(cbEstado);

        // Botón
        btnAgregar = new JButton("Agregar");
        btnAgregar.setFont(new Font("Dialog", Font.BOLD, 17));
        btnAgregar.setBounds(14, 299, 186, 44);
        btnAgregar.addActionListener(this); // Add listener here
        contentPanel.add(btnAgregar);

        // Etiqueta de mensaje
        lblMensaje = new JLabel();
        lblMensaje.setBounds(12, 232, 409, 23);
        contentPanel.add(lblMensaje);

        // Tabla para mostrar los artículos agregados
        table = new JTable();
        table.setModel(new DefaultTableModel(
                new Object[][]{},
                new String[]{"Nombre", "Cantidad", "Estado"}
        ));
        JScrollPane scrollPane = new JScrollPane(table);
        scrollPane.setBounds(450, 10, 320, 333); // Ajusté la posición y el tamaño de la tabla
        contentPanel.add(scrollPane);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        // Implement action listener for "Agregar" button
        // Call controller to add article and handle response
        // Update table with added article
    }
}

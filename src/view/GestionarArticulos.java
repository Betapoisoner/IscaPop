package view;

import javax.swing.*;
import javax.swing.border.EmptyBorder;
import javax.swing.table.*;
import java.awt.*;
import java.awt.event.*;

public class GestionarArticulos extends JDialog implements ActionListener {

    private final JPanel contentPanel = new JPanel();
    private JTextField txtNombreBuscar;
    private JButton btnBuscar, btnModificar, btnEliminar;
    private JTable tableArticulos;
    private DefaultTableModel tableModel;
    private JLabel lblMensaje;

    public static void main(String[] args) {
        try {
            GestionarArticulos dialog = new GestionarArticulos();
            dialog.setDefaultCloseOperation(JDialog.DISPOSE_ON_CLOSE);
            dialog.setVisible(true);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public GestionarArticulos() {
        setDefaultCloseOperation(JDialog.DISPOSE_ON_CLOSE);
        setBounds(100, 100, 800, 500);
        getContentPane().setLayout(new BorderLayout());
        contentPanel.setBorder(new EmptyBorder(5, 5, 5, 5));
        getContentPane().add(contentPanel, BorderLayout.CENTER);
        contentPanel.setLayout(null);

        // Panel de búsqueda
        JPanel panelBuscar = new JPanel();
        panelBuscar.setBorder(BorderFactory.createTitledBorder("Buscar Artículo"));
        panelBuscar.setBounds(12, 12, 450, 80);
        contentPanel.add(panelBuscar);
        panelBuscar.setLayout(null);

        JLabel lblNombre = new JLabel("Nombre:");
        lblNombre.setFont(new Font("Dialog", Font.BOLD, 14));
        lblNombre.setBounds(10, 20, 89, 14);
        panelBuscar.add(lblNombre);

        txtNombreBuscar = new JTextField();
        txtNombreBuscar.setBounds(125, 17, 193, 25);
        panelBuscar.add(txtNombreBuscar);
        txtNombreBuscar.setColumns(10);

        btnBuscar = new JButton("Buscar");
        btnBuscar.setFont(new Font("Dialog", Font.BOLD, 14));
        btnBuscar.setBounds(342, 15, 83, 25);
        btnBuscar.addActionListener(this);
        panelBuscar.add(btnBuscar);

        // Tabla de artículos
        JScrollPane scrollPane = new JScrollPane();
        scrollPane.setBounds(12, 103, 762, 320);
        contentPanel.add(scrollPane);

        tableModel = new DefaultTableModel();
        tableModel.addColumn("ID");
        tableModel.addColumn("Nombre");
        tableModel.addColumn("Descripción");
        tableModel.addColumn("Cantidad");
        tableModel.addColumn("Estado");
        tableArticulos = new JTable(tableModel);
        scrollPane.setViewportView(tableArticulos);

        // Panel de botones
        JPanel panelBotones = new JPanel();
        panelBotones.setBounds(500, 430, 274, 40);
        contentPanel.add(panelBotones);

        btnModificar = new JButton("Modificar");
        btnModificar.setFont(new Font("Dialog", Font.BOLD, 14));
        btnModificar.setEnabled(false); // Initially disabled
        btnModificar.addActionListener(this);
        panelBotones.add(btnModificar);

        btnEliminar = new JButton("Eliminar");
        btnEliminar.setFont(new Font("Dialog", Font.BOLD, 14));
        btnEliminar.setEnabled(false); // Initially disabled
        btnEliminar.addActionListener(this);
        panelBotones.add(btnEliminar);

        // Mensaje
        lblMensaje = new JLabel();
        lblMensaje.setBounds(12, 430, 478, 23);
        contentPanel.add(lblMensaje);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        Object source = e.getSource();

       
    }
}

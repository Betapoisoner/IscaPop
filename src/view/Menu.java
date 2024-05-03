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
        setSize(800, 600); // Aumenté el tamaño del menú
        setLocationRelativeTo(null); // Centrar ventana en pantalla

        // Panel principal
        JPanel panel = new JPanel();
        panel.setLayout(new GridLayout(6, 1, 20, 20)); // Aumenté el espaciado entre los botones
        panel.setBorder(BorderFactory.createEmptyBorder(30, 30, 30, 30)); // Aumenté el espacio alrededor del panel

        // Botones del menú
        JButton btnAgregarArticulo = new JButton("Agregar Artículo");
        JButton btnGestionarArticulos = new JButton("Gestionar Artículos");
        JButton btnGestionarCentros = new JButton("Gestionar Centros");
        JButton btnSalir = new JButton("Salir");

        // Agregar acciones a los botones
        btnAgregarArticulo.addActionListener(e -> abrirVentana(new AgregarArticulo(this)));
        btnGestionarArticulos.addActionListener(e -> abrirVentana(new GestionarArticulos()));
        btnGestionarCentros.addActionListener(e -> abrirVentana(new GestionarCentros()));
        btnSalir.addActionListener(e -> System.exit(0)); // Acción para salir del programa
        JButton btnRegistro = new JButton("Registro");
        btnRegistro.addActionListener(e -> abrirVentana(new Registro()));
        panel.add(btnRegistro);
        JButton btnRealizarSolicitud = new JButton("Realizar Solicitud");
        btnRealizarSolicitud.addActionListener(e -> abrirVentana(new RealizarSolicitud()));
        panel.add(btnRealizarSolicitud);

        // Agregar botones al panel
        panel.add(btnAgregarArticulo);
        panel.add(btnGestionarArticulos);
        panel.add(btnGestionarCentros);
        panel.add(btnSalir); // Agregué el botón de salida al menú

        // Agregar panel al frame
        getContentPane().add(panel, BorderLayout.WEST); // Posicionado a la izquierda

        // Tabla para mostrar los artículos
        tableModel = new DefaultTableModel(
                new Object[][]{},
                new String[]{"Nombre", "Cantidad", "Estado"}
        );
        table = new JTable(tableModel);
        JScrollPane scrollPane = new JScrollPane(table);
        getContentPane().add(scrollPane, BorderLayout.CENTER); // Posicionado en el centro
    }

    // Método para abrir una ventana y ocultar el menú principal
    private void abrirVentana(JFrame ventana) {
        setVisible(false);
        ventana.setVisible(true);
    }

    // Método para agregar artículo a la tabla
    public void agregarArticulo(String nombre, int cantidad, String estado) {
        tableModel.addRow(new Object[]{nombre, cantidad, estado});
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> {
            Menu menu = new Menu();
            menu.setVisible(true);
        });
    }
}

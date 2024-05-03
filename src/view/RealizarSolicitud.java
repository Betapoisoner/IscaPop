package view;

import javax.swing.*;
import javax.swing.border.EmptyBorder;
import javax.swing.table.*;

import java.awt.*;
import java.awt.event.*;

public class RealizarSolicitud extends JDialog implements ActionListener {

  private final JPanel contentPanel = new JPanel();
  private JTextField txtNombreArticulo, txtCantidad;
  private JButton btnAgregarArticulo, btnRealizarSolicitud;
  private JTable tableArticulos;
  private DefaultTableModel tableModel;
  private JLabel lblMensaje;


  public static void main(String[] args) {
      try {
          RealizarSolicitud dialog = new RealizarSolicitud();
          dialog.setDefaultCloseOperation(JDialog.DISPOSE_ON_CLOSE);
          dialog.setVisible(true);
      } catch (Exception e) {
          e.printStackTrace();
      }
  }

  
  public RealizarSolicitud() {
    setDefaultCloseOperation(JDialog.DISPOSE_ON_CLOSE);
    setBounds(100, 100, 600, 243);
    getContentPane().setLayout(new BorderLayout());
    contentPanel.setBorder(new EmptyBorder(5, 5, 5, 5));
    getContentPane().add(contentPanel, BorderLayout.CENTER);
    contentPanel.setLayout(null);

    // Panel de solicitud
    JPanel panelSolicitud = new JPanel();
    panelSolicitud.setBorder(BorderFactory.createTitledBorder("Solicitud de Donación"));
    panelSolicitud.setBounds(12, 10, 562, 98);
    contentPanel.add(panelSolicitud);
    panelSolicitud.setLayout(null);

    JLabel lblNombreArticulo = new JLabel("Nombre Artículo:");
    lblNombreArticulo.setFont(new Font("Dialog", Font.BOLD, 14));
    lblNombreArticulo.setBounds(10, 22, 120, 14);
    panelSolicitud.add(lblNombreArticulo);

    txtNombreArticulo = new JTextField();
    txtNombreArticulo.setBounds(140, 19, 200, 25);
    panelSolicitud.add(txtNombreArticulo);
    txtNombreArticulo.setColumns(10);

    JLabel lblCantidad = new JLabel("Cantidad:");
    lblCantidad.setFont(new Font("Dialog", Font.BOLD, 14));
    lblCantidad.setBounds(350, 22, 80, 14);
    panelSolicitud.add(lblCantidad);

    txtCantidad = new JTextField();
    txtCantidad.setBounds(427, 19, 50, 25);
    panelSolicitud.add(txtCantidad);
    txtCantidad.setColumns(10);

    btnAgregarArticulo = new JButton("Agregar Artículo");
    btnAgregarArticulo.setFont(new Font("Dialog", Font.BOLD, 14));
    btnAgregarArticulo.setBounds(10, 60, 542, 25);
    btnAgregarArticulo.addActionListener(this);
    panelSolicitud.add(btnAgregarArticulo);

    // Tabla de artículos solicitados
    JScrollPane scrollPane = new JScrollPane();
    scrollPane.setBounds(12, 119, 562, 80);
    contentPanel.add(scrollPane);

    tableModel = new DefaultTableModel();
    tableModel.addColumn("Nombre Artículo");
    tableModel.addColumn("Cantidad");
    tableArticulos = new JTable(tableModel);
    scrollPane.setViewportView(tableArticulos);

    // Panel de botones
    JPanel panelBotones = new JPanel();
    panelBotones.setBounds(200, 360, 200, 40);
    contentPanel.add(panelBotones);

    btnRealizarSolicitud = new JButton("Realizar Solicitud");
    btnRealizarSolicitud.setFont(new Font("Dialog", Font.BOLD, 14));
    btnRealizarSolicitud.setEnabled(false); // Initially disabled
    btnRealizarSolicitud.addActionListener(this);
    panelBotones.add(btnRealizarSolicitud);

    // Mensaje
    lblMensaje = new JLabel();
    lblMensaje.setBounds(12, 360, 188, 23);
    contentPanel.add(lblMensaje);
  }

  @Override
  public void actionPerformed(ActionEvent e) {
    Object source = e.getSource();

    if (source == btnAgregarArticulo) {
      // Implement logic to add article and quantity to tableModel
      // Enable "Realizar Solicitud" button if there are entries
    } else if (source == btnRealizarSolicitud) {
      // Implement logic to submit donation request
      // Clear table and disable button after submission
    }
  }
}

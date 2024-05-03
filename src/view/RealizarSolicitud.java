package view;

import javax.swing.*;
import javax.swing.border.EmptyBorder;
import javax.swing.table.*;

import java.awt.*;
import java.awt.event.*;

public class RealizarSolicitud extends JDialog {

  private final JPanel contentPanel = new JPanel();
  private JButton btnRealizarSolicitud;
  private JTable tableArticulos;
  private DefaultTableModel tableModel;
  private JLabel lblMensaje;
  private JTextField textField;


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
    setBounds(100, 100, 600, 400);
    getContentPane().setLayout(new BorderLayout());
    contentPanel.setBorder(new EmptyBorder(5, 5, 5, 5));
    getContentPane().add(contentPanel, BorderLayout.CENTER);
    contentPanel.setLayout(null);

    // Tabla de artículos solicitados
    JScrollPane scrollPane = new JScrollPane();
    scrollPane.setBounds(12, 92, 562, 258);
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
    panelBotones.add(btnRealizarSolicitud);

    // Mensaje
    lblMensaje = new JLabel();
    lblMensaje.setBounds(12, 360, 188, 23);
    contentPanel.add(lblMensaje);
    
    JButton btnAgregarArticulo = new JButton("Agregar Artículo");
    btnAgregarArticulo.setFont(new Font("Dialog", Font.BOLD, 14));
    btnAgregarArticulo.setBounds(10, 52, 220, 25);
    contentPanel.add(btnAgregarArticulo);
    
    JLabel lblNombreArticulo = new JLabel("Nombre Artículo:");
    lblNombreArticulo.setFont(new Font("Dialog", Font.BOLD, 14));
    lblNombreArticulo.setBounds(10, 14, 120, 14);
    contentPanel.add(lblNombreArticulo);
    
    textField = new JTextField();
    textField.setColumns(10);
    textField.setBounds(140, 11, 200, 25);
    contentPanel.add(textField);
    
    JLabel lblCantidad = new JLabel("Cantidad:");
    lblCantidad.setFont(new Font("Dialog", Font.BOLD, 14));
    lblCantidad.setBounds(350, 14, 80, 14);
    contentPanel.add(lblCantidad);
    
    JSpinner spnCantidad = new JSpinner();
    spnCantidad.setBounds(440, 11, 135, 25);
    contentPanel.add(spnCantidad);
  }


}

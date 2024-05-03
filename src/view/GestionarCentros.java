package view;

import javax.swing.*;
import javax.swing.border.EmptyBorder;
import javax.swing.table.*;

import java.awt.*;
import java.awt.event.*;

public class GestionarCentros extends JDialog {

	private static final long serialVersionUID = 1L;
private final JPanel contentPanel = new JPanel();
  private JTextField txtIdBuscar;
  private JButton btnBuscar;
  private JTable tableCentros;
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


  public GestionarCentros() {
    setDefaultCloseOperation(JDialog.DISPOSE_ON_CLOSE);
    setBounds(100, 100, 600, 373);
    getContentPane().setLayout(new BorderLayout());
    contentPanel.setBackground(new Color(255, 255, 255));
    contentPanel.setBorder(new EmptyBorder(5, 5, 5, 5));
    getContentPane().add(contentPanel, BorderLayout.CENTER);
    contentPanel.setLayout(null);

    // Panel de búsqueda
    JPanel panelBuscar = new JPanel();
    panelBuscar.setBorder(BorderFactory.createTitledBorder("Buscar Centro"));
    panelBuscar.setBounds(12, 12, 562, 56);
    contentPanel.add(panelBuscar);
    panelBuscar.setLayout(null);

    JLabel lblId = new JLabel("ID Centro:");
    lblId.setFont(new Font("Dialog", Font.BOLD, 14));
    lblId.setBounds(10, 20, 89, 14);
    panelBuscar.add(lblId);

    txtIdBuscar = new JTextField();
    txtIdBuscar.setBounds(109, 17, 350, 25);
    panelBuscar.add(txtIdBuscar);
    txtIdBuscar.setColumns(10);

    btnBuscar = new JButton("Buscar");
    btnBuscar.setFont(new Font("Dialog", Font.BOLD, 14));
    btnBuscar.setBounds(469, 15, 83, 25);
    panelBuscar.add(btnBuscar);

    // Tabla de centros
    JScrollPane scrollPane = new JScrollPane();
    scrollPane.setBounds(12, 79, 562, 244);
    contentPanel.add(scrollPane);

    tableModel = new DefaultTableModel();
    tableModel.addColumn("ID");
    tableModel.addColumn("Nombre");
    tableModel.addColumn("Contraseña");
    tableCentros = new JTable(tableModel);
    scrollPane.setViewportView(tableCentros);

    // Mensaje
    lblMensaje = new JLabel();
    lblMensaje.setBounds(12, 330, 188, 23);
    contentPanel.add(lblMensaje);
  }

 
}

package view;

import javax.swing.*;
import javax.swing.border.EmptyBorder;
import javax.swing.table.*;

import java.awt.*;
import java.awt.event.*;

public class GestionarCentros extends JDialog implements ActionListener {

  private final JPanel contentPanel = new JPanel();
  private JTextField txtIdBuscar;
  private JButton btnBuscar, btnModificar, btnEliminar;
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
    setBounds(100, 100, 600, 400);
    getContentPane().setLayout(new BorderLayout());
    contentPanel.setBackground(new Color(255, 255, 255));
    contentPanel.setBorder(new EmptyBorder(5, 5, 5, 5));
    getContentPane().add(contentPanel, BorderLayout.CENTER);
    contentPanel.setLayout(null);

    // Panel de búsqueda
    JPanel panelBuscar = new JPanel();
    panelBuscar.setBorder(BorderFactory.createTitledBorder("Buscar Centro"));
    panelBuscar.setBounds(12, 12, 450, 80);
    contentPanel.add(panelBuscar);
    panelBuscar.setLayout(null);

    JLabel lblId = new JLabel("ID Centro:");
    lblId.setFont(new Font("Dialog", Font.BOLD, 14));
    lblId.setBounds(10, 20, 89, 14);
    panelBuscar.add(lblId);

    txtIdBuscar = new JTextField();
    txtIdBuscar.setBounds(109, 17, 193, 25);
    panelBuscar.add(txtIdBuscar);
    txtIdBuscar.setColumns(10);

    btnBuscar = new JButton("Buscar");
    btnBuscar.setFont(new Font("Dialog", Font.BOLD, 14));
    btnBuscar.setBounds(320, 15, 83, 25);
    btnBuscar.addActionListener(this);
    panelBuscar.add(btnBuscar);

    // Tabla de centros
    JScrollPane scrollPane = new JScrollPane();
    scrollPane.setBounds(12, 103, 562, 220);
    contentPanel.add(scrollPane);

    tableModel = new DefaultTableModel();
    tableModel.addColumn("ID");
    tableModel.addColumn("Nombre");
    tableModel.addColumn("Contraseña");
    tableCentros = new JTable(tableModel);
    scrollPane.setViewportView(tableCentros);

    // Panel de botones
    JPanel panelBotones = new JPanel();
    panelBotones.setBounds(200, 330, 200, 40);
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
    lblMensaje.setBounds(12, 330, 188, 23);
    contentPanel.add(lblMensaje);
  }

  @Override
  public void actionPerformed(ActionEvent e) {
    Object source = e.getSource();

    if (source == btnBuscar) {
      // Implement search logic based on txtIdBuscar.getText()
      // Update tableModel with search results
      // Enable buttons if centers are found, disable otherwise
    } else if (source == btnModificar) {
      // Implement logic to get selected center data from table
      // Open a new window or dialog to modify center details
    } else if (source == btnEliminar) {
      // Implement logic to get selected center ID
      // Confirm deletion with user
      // If confirmed, remove center from tableModel
    }
  }
}

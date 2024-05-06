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
	    setBounds(100, 100, 600, 400);
	    getContentPane().setLayout(new BorderLayout());
	    contentPanel.setBorder(new EmptyBorder(5, 5, 5, 5));
	    getContentPane().add(contentPanel, BorderLayout.CENTER);
	    contentPanel.setLayout(null);

	    JScrollPane scrollPane = new JScrollPane();
	    scrollPane.setBounds(11, 52, 562, 258);
	    contentPanel.add(scrollPane);

	    tableModel = new DefaultTableModel();
	    tableModel.addColumn("Nombre Artículo");
	    tableModel.addColumn("Cantidad");
	    tableArticulos = new JTable(tableModel);
	    scrollPane.setViewportView(tableArticulos);

	    lblMensaje = new JLabel();
	    lblMensaje.setBounds(12, 360, 188, 23);
	    contentPanel.add(lblMensaje);
	    
	    JLabel lblNombreArticulo = new JLabel("Nombre Artículo:");
	    lblNombreArticulo.setFont(new Font("Dialog", Font.BOLD, 14));
	    lblNombreArticulo.setBounds(12, 17, 120, 14);
	    contentPanel.add(lblNombreArticulo);
	    
	    textField = new JTextField();
	    textField.setColumns(10);
	    textField.setBounds(140, 11, 200, 30);
	    contentPanel.add(textField);
	    
	    JLabel lblCantidad = new JLabel("Cantidad:");
	    lblCantidad.setFont(new Font("Dialog", Font.BOLD, 14));
	    lblCantidad.setBounds(350, 17, 80, 14);
	    contentPanel.add(lblCantidad);
	    
	    JSpinner spnCantidad = new JSpinner();
	    spnCantidad.setBounds(440, 11, 135, 30);
	    contentPanel.add(spnCantidad);
	    
	    JButton btnAgregarArticulo = new JButton("Agregar Artículo");
	    btnAgregarArticulo.addActionListener(new ActionListener() {
	    	public void actionPerformed(ActionEvent e) {
	    	}
	    });
	    btnAgregarArticulo.setFont(new Font("Dialog", Font.BOLD, 14));
	    btnAgregarArticulo.setBounds(15, 321, 269, 38);
	    contentPanel.add(btnAgregarArticulo);
	    
	    JButton btnFinalizarSolicitud = new JButton("Finalizar solicitud");
	    btnFinalizarSolicitud.addActionListener(new ActionListener() {
	    	public void actionPerformed(ActionEvent e) {
	    	}
	    });
	    btnFinalizarSolicitud.setFont(new Font("Dialog", Font.BOLD, 14));
	    btnFinalizarSolicitud.setBounds(299, 321, 269, 38);
	    contentPanel.add(btnFinalizarSolicitud);
	  }



}

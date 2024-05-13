package view;

import java.awt.BorderLayout;
import java.awt.EventQueue;
import java.awt.Font;

import javax.swing.JButton;
import javax.swing.JDialog;
import javax.swing.JInternalFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.border.EmptyBorder;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class Sesion extends JInternalFrame {

	private final JPanel contentPanel = new JPanel();
	private JTextField txtUsr;
	private final JTextField textField = new JTextField();
	private final JLabel lblContrasena = new JLabel("Contraseña");

	
	private static final long serialVersionUID = 1L;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Sesion frame = new Sesion();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public Sesion() {
		setTitle("Inicio Sesion");
		setDefaultCloseOperation(JDialog.DISPOSE_ON_CLOSE);
		setBounds(100, 100, 450, 277);
		getContentPane().setLayout(new BorderLayout());
		contentPanel.setBorder(new EmptyBorder(5, 5, 5, 5));
		getContentPane().add(contentPanel, BorderLayout.CENTER);
		contentPanel.setLayout(null);

		txtUsr = new JTextField();
		txtUsr.setBounds(12, 36, 409, 44);
		contentPanel.add(txtUsr);
		txtUsr.setColumns(10);

		JLabel lblUsr = new JLabel("Usuario");
		lblUsr.setFont(new Font("Dialog", Font.BOLD, 17));
		lblUsr.setBounds(12, 12, 91, 23);
		contentPanel.add(lblUsr);
		textField.setColumns(10);
		textField.setBounds(12, 116, 409, 44);

		contentPanel.add(textField);
		lblContrasena.setFont(new Font("Dialog", Font.BOLD, 17));
		lblContrasena.setBounds(12, 92, 91, 23);

		contentPanel.add(lblContrasena);

		JButton btnIniciar = new JButton("Iniciar Sesion");
		btnIniciar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				dispose();
			}
			
		});
		btnIniciar.setFont(new Font("Dialog", Font.BOLD, 17));
		btnIniciar.setBounds(12, 181, 186, 44);
		contentPanel.add(btnIniciar);

		JButton btnRegistrarse = new JButton("Registrarse");
		btnRegistrarse.setFont(new Font("Dialog", Font.BOLD, 17));
		btnRegistrarse.setBounds(235, 181, 186, 44);
		contentPanel.add(btnRegistrarse);
	}

}

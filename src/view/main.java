package view;

import java.awt.BorderLayout;
import java.awt.FlowLayout;

import javax.swing.JButton;
import javax.swing.JDialog;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JTextField;
import javax.swing.JLabel;
import java.awt.Font;

public class main extends JDialog {

	private static final long serialVersionUID = 1L;
	private final JPanel contentPanel = new JPanel();
	private JTextField txtUsr;
	private final JTextField textField = new JTextField();
	private final JLabel lblContrasena = new JLabel("Contraseña");

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		try {
			main dialog = new main();
			dialog.setDefaultCloseOperation(JDialog.DISPOSE_ON_CLOSE);
			dialog.setVisible(true);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	/**
	 * Create the dialog.
	 */
	public main() {
		setDefaultCloseOperation(JDialog.DISPOSE_ON_CLOSE);
		setBounds(100, 100, 521, 294);
		getContentPane().setLayout(new BorderLayout());
		contentPanel.setBorder(new EmptyBorder(5, 5, 5, 5));
		getContentPane().add(contentPanel, BorderLayout.CENTER);
		contentPanel.setLayout(null);
		
		txtUsr = new JTextField();
		txtUsr.setBounds(48, 43, 409, 44);
		contentPanel.add(txtUsr);
		txtUsr.setColumns(10);
		
		JLabel lblUsr = new JLabel("Usuario");
		lblUsr.setFont(new Font("Dialog", Font.BOLD, 17));
		lblUsr.setBounds(48, 19, 91, 23);
		contentPanel.add(lblUsr);
		textField.setColumns(10);
		textField.setBounds(48, 123, 409, 44);
		
		contentPanel.add(textField);
		lblContrasena.setFont(new Font("Dialog", Font.BOLD, 17));
		lblContrasena.setBounds(48, 99, 91, 23);
		
		contentPanel.add(lblContrasena);
		
		JButton btnIniciar = new JButton("Iniciar Sesion");
		btnIniciar.setFont(new Font("Dialog", Font.BOLD, 17));
		btnIniciar.setBounds(48, 188, 186, 44);
		contentPanel.add(btnIniciar);
		
		JButton btnRegistrarse = new JButton("Registrarse");
		btnRegistrarse.setFont(new Font("Dialog", Font.BOLD, 17));
		btnRegistrarse.setBounds(271, 188, 186, 44);
		contentPanel.add(btnRegistrarse);
	}
}

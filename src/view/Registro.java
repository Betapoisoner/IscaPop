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
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class Registro extends JDialog {

	private static final long serialVersionUID = 1L;
	private final JPanel contentPanel = new JPanel();
	private JTextField txtUsr;
	private final JTextField txtContra = new JTextField();
	private final JLabel lblContrasena = new JLabel("Contraseña");
	private JTextField txtNombre;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		try {
			Registro dialog = new Registro();
			dialog.setDefaultCloseOperation(JDialog.DISPOSE_ON_CLOSE);
			dialog.setVisible(true);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	/**
	 * Create the dialog.
	 */
	public Registro() {
		setDefaultCloseOperation(JDialog.DISPOSE_ON_CLOSE);
		setBounds(100, 100, 450, 346);
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
		txtContra.setColumns(10);
		txtContra.setBounds(12, 116, 409, 44);

		contentPanel.add(txtContra);
		lblContrasena.setFont(new Font("Dialog", Font.BOLD, 17));
		lblContrasena.setBounds(12, 92, 91, 23);

		contentPanel.add(lblContrasena);

		JButton btnIniciar = new JButton("Iniciar Sesion");
		btnIniciar.setFont(new Font("Dialog", Font.BOLD, 17));
		btnIniciar.setBounds(12, 250, 186, 44);
		contentPanel.add(btnIniciar);

		JButton btnRegistrarse = new JButton("Registrarse");
		btnRegistrarse.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		btnRegistrarse.setFont(new Font("Dialog", Font.BOLD, 17));
		btnRegistrarse.setBounds(235, 250, 186, 44);
		contentPanel.add(btnRegistrarse);

		JLabel lblNombre = new JLabel("Nombre");
		lblNombre.setFont(new Font("Dialog", Font.BOLD, 17));
		lblNombre.setBounds(12, 171, 91, 23);
		contentPanel.add(lblNombre);

		txtNombre = new JTextField();
		txtNombre.setColumns(10);
		txtNombre.setBounds(12, 195, 409, 44);
		contentPanel.add(txtNombre);
	}
}

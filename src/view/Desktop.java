package view;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JDesktopPane;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.awt.event.HierarchyListener;
import java.awt.event.HierarchyEvent;
import javax.swing.JMenuBar;
import javax.swing.JMenu;
import javax.swing.JPopupMenu;
import java.awt.Component;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import javax.swing.JMenuItem;
import javax.swing.Box;
import javax.swing.JPanel;
import java.awt.FlowLayout;
import java.awt.GridLayout;
import javax.swing.BoxLayout;
import java.awt.CardLayout;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JButton;
import javax.swing.JTextPane;

public class Desktop {

	private JFrame frame;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Desktop window = new Desktop();
					window.frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public Desktop() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 1189, 852);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);

		JDesktopPane escritorio = new JDesktopPane();
		escritorio.setBounds(0, 39, 1173, 774);
		frame.getContentPane().add(escritorio);

		JPanel panel = new JPanel();
		panel.setBounds(0, 0, 1015, 41);
		frame.getContentPane().add(panel);
		panel.setLayout(null);

		JMenuBar menuBar = new JMenuBar();
		menuBar.setBounds(0, 0, 1100, 41);
		panel.add(menuBar);

		JMenu mnSesion = new JMenu("Sesion");
		menuBar.add(mnSesion);

		JMenuItem mntminicio = new JMenuItem("Inicio");
		mntminicio.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Sesion inicio = new Sesion();
				escritorio.add(inicio);
				inicio.setLocation(((escritorio.getWidth() - inicio.getWidth()) / 2),
						((escritorio.getHeight() - inicio.getHeight()) / 2));
				inicio.show();
			}
		});
		mnSesion.add(mntminicio);

		JMenuItem mntmRegistro = new JMenuItem("Registro");
		mntmRegistro.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Registro regis = new Registro();
				escritorio.add(regis);
				regis.setLocation(((escritorio.getWidth() - regis.getWidth()) / 2),
						((escritorio.getHeight() - regis.getHeight()) / 2));
				regis.show();
			}
		});
		mnSesion.add(mntmRegistro);

		JMenu mnArticulos = new JMenu("Articulos");
		menuBar.add(mnArticulos);

		JMenuItem mntmMisArticulos = new JMenuItem("Mis Articulos");
		mnArticulos.add(mntmMisArticulos);

		JMenuItem mntmVerArticulos = new JMenuItem("Ver articulos");
		mnArticulos.add(mntmVerArticulos);

		JMenu mnDonaciones = new JMenu("Donaciones");
		menuBar.add(mnDonaciones);

		JMenuItem mntmMisDonaciones = new JMenuItem("Mis Donaciones");
		mnDonaciones.add(mntmMisDonaciones);

		JMenuItem mntmVerDonaciones = new JMenuItem("Ver Donaciones");
		mnDonaciones.add(mntmVerDonaciones);

		JMenu mnSolicitudes = new JMenu("Solicitudes");
		menuBar.add(mnSolicitudes);

		JMenuItem mntmMisSolicitudes = new JMenuItem("Mis Solicitudes");
		mnSolicitudes.add(mntmMisSolicitudes);

		JMenuItem mntmVerSolicitudes = new JMenuItem("Ver solicitudes");
		mnSolicitudes.add(mntmVerSolicitudes);
		
		JButton btnNewButton = new JButton("Cerrar sesion");
		btnNewButton.setBounds(1025, 0, 148, 41);
		frame.getContentPane().add(btnNewButton);
		Connection conn = model.Conexion.getConnection();
		Statement stmt;
		try {
			stmt = conn.createStatement(ResultSet.TYPE_SCROLL_SENSITIVE, ResultSet.CONCUR_UPDATABLE);

			// Hacer insert/seleccion
			String sql = "SELECT * FROM centros";
			ResultSet rs = stmt.executeQuery(sql);

			// Mostrar result set
			// while(rs.next()) {

			// Primetra entrada
			rs.first();
			String nombre = rs.getString(1);
			String autor = rs.getString(2);
			String editorial = rs.getString(3);
			System.out.println("|  " + nombre + "  |  " + autor + "  |  " + editorial + "  |");
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	private static void addPopup(Component component, final JPopupMenu popup) {
		component.addMouseListener(new MouseAdapter() {
			public void mousePressed(MouseEvent e) {
				if (e.isPopupTrigger()) {
					showMenu(e);
				}
			}

			public void mouseReleased(MouseEvent e) {
				if (e.isPopupTrigger()) {
					showMenu(e);
				}
			}

			private void showMenu(MouseEvent e) {
				popup.show(e.getComponent(), e.getX(), e.getY());
			}
		});
	}
}

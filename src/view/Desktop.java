package view;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JDesktopPane;
import javax.swing.JMenuBar;
import javax.swing.JMenu;
import javax.swing.JPopupMenu;
import java.awt.Component;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import javax.swing.JMenuItem;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JButton;
import controller.Controller;
import exceptions.ExcepcionCentro;
import model.Centro;

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
		menuBar.setBounds(0, 0, 863, 41);
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

		JButton btn_sesion = new JButton("Ver sesion");
		btn_sesion.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				try {
					Centro c = Controller.getSesion();
					if (c != null && c.getId_Centro() != null) {
						btn_sesion.setText(c.getId_Centro());
						JOptionPane.showMessageDialog(null,
								"La sesion es del centro " + c.getNombre() + " con usuario " + c.getId_Centro(),
								"Sesion", JOptionPane.INFORMATION_MESSAGE);
					} else
						throw new ExcepcionCentro("No hay sesion iniciada");
				} catch (Exception e2) {
					JOptionPane.showMessageDialog(null, e2, "Error", JOptionPane.ERROR_MESSAGE);
				}

			}
		});
		btn_sesion.setBounds(875, 0, 148, 41);
		panel.add(btn_sesion);

		JButton btnNewButton = new JButton("Cerrar sesion");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Controller.setSesion(null);
				btn_sesion.setText("Ver Sesion");
			}
		});
		btnNewButton.setBounds(1025, 0, 148, 41);
		frame.getContentPane().add(btnNewButton);

		Controller.rellenar_arraylists();
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

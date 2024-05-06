package view;

import java.awt.EventQueue;

import javax.swing.JInternalFrame;

public class MenuSolicitudes extends JInternalFrame {

	private static final long serialVersionUID = 1L;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					MenuSolicitudes frame = new MenuSolicitudes();
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
	public MenuSolicitudes() {
		setBounds(100, 100, 450, 300);

	}

}

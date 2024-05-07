package view;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JDesktopPane;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

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
		escritorio.setBounds(0, 0, 1173, 813);
		frame.getContentPane().add(escritorio);
		
		
				Sesion inicio = new Sesion();
				escritorio.add(inicio);
				inicio.setLocation(((escritorio.getWidth()-inicio.getWidth())/2),((escritorio.getHeight() -inicio.getHeight())/2));
				inicio.show();
		
	
	}
}

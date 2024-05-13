package model;

import java.io.FileNotFoundException;
import java.sql.*;
import java.io.FileReader;
import java.util.Properties;

import javax.swing.JOptionPane;

public class Conexion {
	// URL = jdbc:mysql://localhost:3306/empresa
	private static String driver;
	private static String url;
	private static String user;
	private static String passwd;
	private static Connection conexion = null;

	public Conexion() {

	}

	public static Connection getConnection() {
		try {
			// SI ESTÁ ABIERTA, LA DEVUELVE
			if (conexion != null) {
				return conexion;
			} else {
				try {
					Properties p = new Properties();
					p.load(new FileReader("./src/controller/config.properties"));

					driver = p.getProperty("Driver");
					url = p.getProperty("Url") + p.getProperty("Bda");
					user = p.getProperty("User");
					passwd = p.getProperty("Password");

					Class.forName(driver);
					conexion = DriverManager.getConnection(url, user, passwd);
				} catch (FileNotFoundException noe) {
					JOptionPane.showMessageDialog(null, "No hay archivo");
				} catch (SQLTimeoutException e1) {
					JOptionPane.showMessageDialog(null, "Mucho tiempo");
				} catch (SQLException e) {
					JOptionPane.showMessageDialog(null, e);
				} catch (Exception Z) {
					JOptionPane.showMessageDialog(null, Z);
				}
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
		return conexion;
	}

	public static void closeConnection() {
		try {
			if (conexion != null) {
				conexion.close();
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}
}
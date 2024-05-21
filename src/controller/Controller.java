package controller;

import java.sql.Connection;
import java.sql.Date;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.time.LocalDate;
import java.util.ArrayList;

import java.util.List;

import exceptions.*;
import model.*;
import view.ArticuloAdd;

public class Controller {

	private static List<Donacion> donaciones = new ArrayList<>();
	private static List<Centro> centros = new ArrayList<>();
	private static List<Solicitud> solicitudes = new ArrayList<>();
	private static Centro sesion = new Centro();

	public static Centro getSesion() {
		return sesion;
	}

	public static void setSesion(Centro c) {
		sesion = c;
	}

	public Controller() {

	}

	public static Donacion buscar_don(String idDonacion) throws ExcepcionDonacion {
		for (Donacion donacion : donaciones)
			if (donacion.getId_Donacion().equals(idDonacion))
				return donacion;
		throw new ExcepcionDonacion("La doncion no se encuentra");
	}

	public static Centro buscar_centro(String idCentro) throws ExcepcionCentro {
		for (Centro centro : centros)
			if (centro.getId_Centro().equals(idCentro))
				return centro;
		throw new ExcepcionCentro("No se ha encontrado el centro");
	}

	public static Solicitud buscar_soli(String idSoli) throws ExcepcionSolicitud {
		for (Solicitud soli : solicitudes)
			if (soli.getIdSolicitud().equals(idSoli))
				return soli;
		throw new ExcepcionSolicitud("No se ha enconrtado la solicitud");
	}

	public static void iniciar_sesion(String usuario, String contrasena) throws ExcepcionCentro {
		Centro c;
		try {
			c = buscar_centro(usuario);

			setSesion(c);
		} catch (ExcepcionCentro e) {
			throw new ExcepcionCentro("La contraseña/Usuario es incorrecta");
		}

	}

	public static void registro(String usuario, String contra, String nombre) throws ExcepcionCentro {

		try {
			buscar_centro(usuario);
			throw new ExcepcionCentro("El centro ya esta registrado");
		} catch (ExcepcionCentro e) {
			Centro c = new Centro(usuario, nombre, contra);
			centros.add(c);
			setSesion(c);
		}
	}

	public static void añadirArticulo(String idCentro, String estado, String nombre, int cantidad, String descripcion)
			throws ExcepcionArticulo {
		try {
			buscar_centro(idCentro);

		} catch (ExcepcionCentro e) {
			throw new ExcepcionArticulo("No se puede agregar el artículo. El centro no existe.");
		}
	}

	public static String crearCodigoArticulo() {

		int numAleatorio = (int) (Math.random() * 900000) + 100000;

		return String.valueOf(numAleatorio);
	}

	public static void rellenar_arraylists() {
		Connection conn = model.Conexion.getConnection();
		Statement stmt;
		try {
			stmt = conn.createStatement(ResultSet.TYPE_SCROLL_SENSITIVE, ResultSet.CONCUR_UPDATABLE);

			// Hacer insert/seleccion
			String sql = "SELECT * FROM centros";
			ResultSet rsCentro = stmt.executeQuery(sql);
			while (rsCentro.next()) {
				String contra = rsCentro.getString(1);
				String id = rsCentro.getString(2);
				String nombre = rsCentro.getString(3);
				Centro c = new Centro(id, nombre, contra);

				centros.add(c);
			}

			String sqlSoli = "SELECT * FROM solicitudes JOIN detalles_solicitud on detalles_solicitud.id = solicitudes.idSolicitud";
			ResultSet rsSoli = stmt.executeQuery(sqlSoli);

			while (rsSoli.next()) {
				try {
					Centro centro = new Centro();
					String idSolicitud = rsSoli.getString("idSolicitud");
					Date fecha = rsSoli.getDate("fecha");

					EstadosSoli estado = EstadosSoli.valueOf(rsSoli.getString("estado"));
					for (Centro c : centros) {
						if (c.equals(rsSoli.getString("idCentro"))) {
							centro = c;
						}
					}
					Solicitud s = new Solicitud(idSolicitud, fecha, centro, estado);
					solicitudes.add(s);
				} catch (Exception e) {
					// TODO: handle exception
				}
			}
			String sqlDon = "SELECT * FROM donaciones JOIN detalles_donacion on detalles_donacion.idDonacion = donaciones.idDonacion";
			ResultSet rsDon = stmt.executeQuery(sqlDon);
			// Mostrar result set

			for (Centro c : centros)
				System.out.println(c.getContrasena());

			String sqlArt = "SELECT * FROM articulos JOIN articulos_centro on articulos.id = articulos_centro.id";
			ResultSet rsArticulo = stmt.executeQuery(sqlArt);

			while (rsArticulo.next()) {
				for (Centro c : centros) {
					if (rsArticulo.getString("idCentro").equals(c.getId_Centro())) {
						String idArt = rsArticulo.getString("id");
						String estado = rsArticulo.getString("estado");
						int cantidad = rsArticulo.getInt("cantidad");
						String descripcion = rsArticulo.getString("descripcion");
						String nombreArt = rsArticulo.getString("nombre");
						c.add_Articulo(idArt, estado, nombreArt, cantidad, descripcion);
					}
				}

			}
			rsArticulo.close();
			rsCentro.close();
			rsDon.close();
			rsSoli.close();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
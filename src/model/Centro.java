package model;

import java.util.ArrayList;

public class Centro {
	private String id_Centro;
	private String nombre;
	private String contrasena;
	private ArrayList<Articulo> articulos;
	
	public Centro(String id_Centro, String nombre, String contrasena) {
		super();
		this.id_Centro = id_Centro;
		this.nombre = nombre;
		this.contrasena = contrasena;
		articulos = new ArrayList<Articulo>();
	}
	
	public String getId_Centro() {
		return id_Centro;
	}

	public String getNombre() {
		return nombre;
	}

	public String getContrasena() {
		return contrasena;
	}

	public void setContrasena(String contrasena) {
		this.contrasena = contrasena;
	}

	public ArrayList<Articulo> getArticulos() {
		return articulos;
	}


	public void add_Articulo(String id,String estado,String nombre,int cantidad,String descripcion) {
		Articulo a = new Articulo(id, estado, nombre, descripcion, descripcion, cantidad);
		try {
			articulos.add(a);
		} catch (Exception e) {
			// TODO: handle exception
		}
	}
}




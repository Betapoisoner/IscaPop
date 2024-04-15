package model;

import java.util.ArrayList;

public class Centro {
	private String id_Centro;
	private String nombre;
	private String contrasena;
	ArrayList<articulo> articulos;
	
	public Centro(String id_Centro, String nombre, String contrasena) {
		super();
		this.id_Centro = id_Centro;
		this.nombre = nombre;
		this.contrasena = contrasena;
	}
	
	public static void add_Articulo(String id,String estado,String nombre,int cantidad,String descripcion) {
		
	}
}

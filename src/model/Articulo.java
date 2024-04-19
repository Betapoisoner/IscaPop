package model;

public class Articulo {
	private String id;
	private String estado;
	private int cantidad;
	private String descripcion;
	private String nombre;

	public Articulo(String id, String estado, String nombre, String descripcion, int cantidad) {

		this.id = id;
		this.estado = estado;
		this.nombre = nombre;
		this.descripcion = descripcion;
		this.cantidad = cantidad;
	}

	public void imprimirInformacionArticulo() {

	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

}

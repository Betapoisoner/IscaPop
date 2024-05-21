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
		// Método para imprimir la información del artículo
	}

	public String getId() {
		return id;
	}

	public String getEstado() {
		return estado;
	}

	public int getCantidad() {
		return cantidad;
	}

	public String getDescripcion() {
		return descripcion;
	}

	public String getNombre() {
		return nombre;
	}
}
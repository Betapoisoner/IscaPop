package model;

public class Detalles {

	private Articulo articulo;
	private Donacion donacion;
	private int cantidadDonacion;

	public Detalles(Articulo articulo,Donacion donacion, int cantidad) {
		this.articulo = articulo;
		this.donacion = donacion;
		this.cantidadDonacion = cantidad;
	}

	public String getIdArticulo() {
		return articulo.getId();
	}

	public String getIdDonacion() {
		return donacion.getId_Donacion();
	}

	public int getCantidadDonacion() {
		return cantidadDonacion;
	}

}

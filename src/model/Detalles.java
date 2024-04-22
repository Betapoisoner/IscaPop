package model;

public class Detalles {

	private String idArticulo;
	private String idDonacion;
	private int cantidadDonacion;

	public Detalles(String idArticulo, String idDonacion, int cantidad) {
		this.idArticulo = idArticulo;
		this.idDonacion = idDonacion;
		this.cantidadDonacion = cantidad;
	}

	public String getIdArticulo() {
		return idArticulo;
	}

	public String getIdDonacion() {
		return idDonacion;
	}

	public int getCantidadDonacion() {
		return cantidadDonacion;
	}

}

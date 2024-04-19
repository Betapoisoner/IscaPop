package model;

public class Detalles {

	private String idArticulo;
	private String idDonacion;
	private String idProducto;
	private int cantidadDonacion;

	public Detalles(String idArticulo, String idDonacion, String idProducto, int cantidad) {
		this.idArticulo = idArticulo;
		this.idDonacion = idDonacion;
		this.idProducto = idProducto;
		this.cantidadDonacion = cantidadDonacion;
	}

}

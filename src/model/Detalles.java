package model;

public class Detalles {
	 private String idArticulo;
	    private String idDonacion;
	    private int cantidad;

	    public Detalles(String idArticulo, String idDonacion, int cantidad) {
	        this.idArticulo = idArticulo;
	        this.idDonacion = idDonacion;
	        this.cantidad = cantidad;
	    }
}
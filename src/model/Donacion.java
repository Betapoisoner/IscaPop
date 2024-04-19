package model;

public class Donacion {

	private String id_Donacion;
	private String centro_Donante;
	private String centro_Receptor;
	private String fecha_don;

	public Donacion(String id_Donacion, String centro_Donante, String centro_Receptor, String fecha_don) {
		this.id_Donacion = id_Donacion;
		this.centro_Donante = centro_Donante;
		this.centro_Receptor = centro_Receptor;
		this.fecha_don = fecha_don;
	}

	public String getId_Donacion() {
		return id_Donacion;
	}

	public String getCentro_Donante() {
		return centro_Donante;
	}

	public String getCentro_Receptor() {
		return centro_Receptor;
	}

	public String getFecha_don() {
		return fecha_don;
	}
}

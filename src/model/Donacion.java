package model;

import java.util.ArrayList;
import java.util.List;

public class Donacion {

	private String id_Donacion;
	private String centro_Donante;
	private String centro_Receptor;
	private String fecha_don;
	private EstadosSoli estado;
	private List<Articulo> articulos = new ArrayList<>();

	public Donacion(String id_Donacion, String centro_Donante, String centro_Receptor, String fecha_don,
			ArrayList<Articulo> articulos) {
		this.id_Donacion = id_Donacion;
		this.centro_Donante = centro_Donante;
		this.centro_Receptor = centro_Receptor;
		this.estado = EstadosSoli.PENDIENTE;
		this.fecha_don = fecha_don;
		this.articulos.addAll(articulos);
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

	public String getEstado() {
		return estado.toString();
	}

	public void canviarEstadoAceptada() {
		this.estado = EstadosSoli.ACEPTADA;
	}

	public void canviarEstadoEspera() {
		this.estado = EstadosSoli.ESPERANDO;
	}
}

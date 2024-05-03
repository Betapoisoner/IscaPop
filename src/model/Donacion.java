package model;

import java.util.ArrayList;
import java.util.List;

public class Donacion {

	private String id_Donacion;
	private Centro centro_Donante;
	private Centro centro_Receptor;
	private String fecha_don;
	private EstadosSoli estado;
	private List<Articulo> articulos = new ArrayList<>();

	public Donacion(String id_Donacion, Centro centro_Donante, Centro centro_Receptor, String fecha_don,
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

	public Centro getCentro_Donante() {
		return centro_Donante;
	}

	public Centro getCentro_Receptor() {
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
	
	public void add_Articulo(String id, String estado, String nombre, int cantidad, String descripcion) {
		Articulo a = new Articulo(id, estado, nombre, descripcion, cantidad);
		try {
			articulos.add(a);
		} catch (Exception e) {
			// TODO handle Exception
		}
	}

	public void quitar_Articulo(String id, String estado, String nombre, int cantidad, String descripcion) {
		Articulo a = new Articulo(id, estado, nombre, descripcion, cantidad);
		try {
			articulos.remove(a);
		} catch (Exception e) {
			// TODO handle Exception
		}
	}
}

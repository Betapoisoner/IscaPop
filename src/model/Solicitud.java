package model;

import java.util.ArrayList;
import java.util.List;

public class Solicitud {
	private String idSolicitud;
	private String fecha;
	private EstadosSoli estado;
	private List<Articulo> articulos = new ArrayList<>();

	public Solicitud(String idSolicitud, String fecha, ArrayList<Articulo> articulos) {
		this.idSolicitud = idSolicitud;
		this.fecha = fecha;
		this.estado = EstadosSoli.PENDIENTE;
		this.articulos.addAll(articulos);
	}

	public String getIdSolicitud() {
		return idSolicitud;
	}

	public String getFecha() {
		return fecha;
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

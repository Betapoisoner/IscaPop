package model;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import javax.swing.Spring;
import javax.xml.crypto.Data;

public class Solicitud {
	private String idSolicitud;
	private Centro centro;
	private Date fecha;
	private EstadosSoli estado;
	private List<Articulo> articulos = new ArrayList<>();

	public Solicitud(String idSolicitud, Date fecha, Centro centro, EstadosSoli estado) {
		this.idSolicitud = idSolicitud;
		this.fecha = fecha;
		this.centro = centro;
		this.estado = estado;
	}

	public String getIdSolicitud() {
		return idSolicitud;
	}

	public Date getFecha() {
		return fecha;
	}

	public String getEstado() {
		return estado.toString();
	}

	public Centro getCentro() {
		return centro;
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
}

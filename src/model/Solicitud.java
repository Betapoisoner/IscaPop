package model;

public class Solicitud {
	private String idSolicitud;
	private String fecha;
	private String estado;

	public Solicitud(String idSolicitud, String estado, String fecha) {
		this.idSolicitud = idSolicitud;
		this.fecha = fecha;
		this.estado = estado;
	}

}
